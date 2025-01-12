package ast

import generated.mygrammarBaseListener
import generated.mygrammarParser
import org.antlr.v4.runtime.tree.TerminalNode
import java.util.*

abstract class ASTMaker : mygrammarBaseListener() {
    abstract fun getFuncDefn(): FuncDefn

    abstract fun hasErrors(): Boolean

    companion object {
        fun create(): ASTMaker {
            return ASTMakerImpl()
        }
    }
}

private class ASTMakerImpl : ASTMaker() {
    private val funcDefn: FuncDefn = FuncDefn(mutableListOf(), mutableListOf(), null, null)
    private val exprStack: MutableList<ExprNode> = mutableListOf()
    private val stmtStack: MutableList<StmtNode> = mutableListOf()
    private val paramIndices: MutableMap<String, Int> = mutableMapOf()
    private var errorCount: Int = 0

    override fun getFuncDefn(): FuncDefn {
        return funcDefn
    }

    override fun hasErrors(): Boolean {
        return errorCount > 0
    }

    override fun enterFunction(ctx: mygrammarParser.FunctionContext) {
        funcDefn.retValueType = getValueType(ctx.type())
    }

    override fun enterParamdecl(ctx: mygrammarParser.ParamdeclContext) {
        val parameter = ParamDefn(
            name = ctx.NAME().text,
            type = getValueType(ctx.type())
        )
        funcDefn.parameters.add(parameter)
        val index = funcDefn.parameters.size - 1
        val newParam = paramIndices.putIfAbsent(parameter.name, index) == null
        if (!newParam) {
            reportError("parameter ${parameter.name} redeclared")
        }
    }

    override fun exitBody(ctx: mygrammarParser.BodyContext) {
        val bodySize = ctx.statement().size
        if (stmtStack.size != bodySize) {
            throw RuntimeException(
                "expected function body of $bodySize statements, but found ${stmtStack.size} " +
                        "statements in the statement stack"
            )
        }
        for (i in 0 until bodySize) {
            funcDefn.body.add(popStmt())
        }
        funcDefn.body.reverse()
    }

    override fun exitReturnstmt(ctx: mygrammarParser.ReturnstmtContext) {
        if (exprStack.isEmpty()) {
            throw RuntimeException("expression stack is empty at the return statement")
        }
        val returnExpr = popExpr()
        funcDefn.retExpr = returnExpr
        if (funcDefn.retExpr?.exprType != funcDefn.retValueType) {
            reportError(
                "return value of type ${funcDefn.retExpr?.exprType} does not match with " +
                        "expected return type ${funcDefn.retValueType}"
            )
        }
        if (exprStack.isNotEmpty()) {
            throw RuntimeException("unexpected leftover expressions in the stack after return statement")
        }
    }

    override fun exitIfstmt(ctx: mygrammarParser.IfstmtContext) {
        val thenBodySize = ctx.thenbody().statement().size
        val elseBodySize = ctx.elsebody().statement().size
        if (stmtStack.size < thenBodySize + elseBodySize) {
            throw RuntimeException("statement stack size is not enough to assemble a ConditionalStmt, expected at least ${thenBodySize + elseBodySize}")
        }
        if (exprStack.isEmpty()) {
            throw RuntimeException("expected a condition expression in the expression stack for ConditionalStmt, but expression stack is empty")
        }
        val condition = popExpr()
        val thenBody = mutableListOf<StmtNode>()
        val elseBody = mutableListOf<StmtNode>()
        for (i in 0 until elseBodySize) {
            elseBody.add(popStmt())
        }
        elseBody.reverse()
        for (i in 0 until thenBodySize) {
            thenBody.add(popStmt())
        }
        thenBody.reverse()
        if (condition.exprType != ValueType.BOOL_VAL) {
            reportError("expected bool for if condition expression, but found ${condition.exprType}")
            return pushStmt(InvalidStmt)
        }
        pushStmt(ConditionalStmt(condition, thenBody, elseBody))
    }

    override fun exitAssign(ctx: mygrammarParser.AssignContext) {
        if (exprStack.isEmpty()) {
            throw RuntimeException("expression stack is empty at assign")
        }
        val rhs = popExpr()
        val varName = ctx.NAME().text
        val parameterIndex = paramIndices[varName]
        if (parameterIndex == null) {
            reportError("unresolved reference to $varName in assignment lhs")
            return pushStmt(InvalidStmt)
        }
        val parameterType = funcDefn.parameters[parameterIndex].type
        if (parameterType != rhs.exprType) {
            reportError("expected type $parameterType of assignment rhs, found ${rhs.exprType}")
            return pushStmt(InvalidStmt)
        }
        pushStmt(AssignStmt(varName, rhs))
    }

    private fun handleBinaryOp(
        binOpKind: BinaryKind,
        argType: ValueType,
        retType: ValueType
    ) {
        if (exprStack.size < 2) {
            reportError("Not enough operands on the stack for binary operation")
            return pushErrorExpr(retType)
        }
        val rhs = popExpr()
        val lhs = popExpr()
        if (lhs.exprType != argType) {
            reportError("expected $argType type for lhs of $binOpKind binary operator, found ${lhs.exprType}")
            pushExpr(lhs)
            pushExpr(rhs)
            return pushErrorExpr(retType)
        }
        if (rhs.exprType != argType) {
            reportError("expected $argType type for rhs of $binOpKind binary operator, found ${rhs.exprType}")
            pushExpr(lhs)
            pushExpr(rhs)
            return pushErrorExpr(retType)
        }
        pushExpr(BinaryOp(binOpKind, lhs, rhs, retType))
    }

    override fun exitBinoplorexpr(ctx: mygrammarParser.BinoplorexprContext) {
        checkExpressionStackForBinop()
        handleBinaryOp(BinaryKind.LOR, ValueType.BOOL_VAL, ValueType.BOOL_VAL)
    }

    override fun exitBinoplandexpr(ctx: mygrammarParser.BinoplandexprContext) {
        checkExpressionStackForBinop()
        handleBinaryOp(BinaryKind.LAND, ValueType.BOOL_VAL, ValueType.BOOL_VAL)
    }

    override fun exitIntcompareexpr(ctx: mygrammarParser.IntcompareexprContext) {
        checkExpressionStackForBinop()
        if (ctx.BINOP_LT() != null) {
            handleBinaryOp(BinaryKind.LESS, ValueType.INT_VAL, ValueType.BOOL_VAL)
        } else if (ctx.BINOP_GT() != null) {
            handleBinaryOp(BinaryKind.GREATER, ValueType.INT_VAL, ValueType.BOOL_VAL)
        }
    }

    override fun exitUnopnegateexpr(ctx: mygrammarParser.UnopnegateexprContext) {
        if (exprStack.isEmpty()) {
            throw RuntimeException("an empty expression stack for unary negation operator")
        }
        val subExpr = popExpr()
        if (subExpr.exprType != ValueType.BOOL_VAL) {
            reportError("expected bool for unary ! operator, but found ${subExpr.exprType}")
            return pushErrorExpr(ValueType.BOOL_VAL)
        }
        pushExpr(UnaryOp(UnaryKind.NEGATE, subExpr, ValueType.BOOL_VAL))
    }

    override fun enterBoolliteral(ctx: mygrammarParser.BoolliteralContext) {
        when {
            ctx.FALSE() != null -> pushExpr(BoolConst(false))
            ctx.TRUE() != null -> pushExpr(BoolConst(true))
            else -> error("invalid bool literal produced by ANTLR")
        }
    }

    override fun exitBinopintexpr(ctx: mygrammarParser.BinopintexprContext) {
        checkExpressionStackForBinop()
        if (ctx.BINOP_ADD() != null) {
            handleBinaryOp(BinaryKind.ADD, ValueType.INT_VAL, ValueType.INT_VAL)
        } else if (ctx.BINOP_SUB() != null) {
            handleBinaryOp(BinaryKind.SUB, ValueType.INT_VAL, ValueType.INT_VAL)
        }
    }

    override fun enterIntliteral(ctx: mygrammarParser.IntliteralContext) {
        val value = parseInt(ctx.NUMBER())
        if (value.isPresent) {
            pushExpr(IntConst(value.get()))
        } else {
            pushErrorExpr(ValueType.INT_VAL)
        }
    }

    override fun enterVarrefexpr(ctx: mygrammarParser.VarrefexprContext) {
        val name = ctx.text
        val parameterIndex = paramIndices[name]
        if (parameterIndex == null) {
            reportError("unresolved reference to $name")
            return pushErrorExpr(ValueType.INT_VAL)
        }
        pushExpr(VariableRef(name, funcDefn.parameters[parameterIndex].type))
    }

    private fun getValueType(typeCtx: mygrammarParser.TypeContext): ValueType {
        return if (typeCtx.BOOL() != null) ValueType.BOOL_VAL else ValueType.INT_VAL
    }

    private fun reportError(details: String) {
        errorCount++
        System.err.println("semantics error: $details")
    }

    private fun parseInt(node: TerminalNode): Optional<Long> {
        return try {
            Optional.of(node.text.toLong())
        } catch (e: NumberFormatException) {
            Optional.empty()
        }
    }

    private fun pushExpr(expression: ExprNode) {
        exprStack.add(expression)
    }

    private fun popExpr(): ExprNode {
        if (exprStack.isEmpty()) {
            errorCount++
            System.err.println("Expression stack underflow")
            return InvalidExpr(ValueType.INT_VAL)
        }
        return exprStack.removeLast()
    }

    private fun pushErrorExpr(type: ValueType) {
        pushExpr(InvalidExpr(type))
    }

    private fun pushStmt(statement: StmtNode) {
        stmtStack.add(statement)
    }

    private fun popStmt(): StmtNode {
        if (stmtStack.isEmpty()) {
            errorCount++
            System.err.println("Statement stack underflow")
            return InvalidStmt
        }
        return stmtStack.removeLast()
    }

    private fun checkExpressionStackForBinop() {
        if (exprStack.size < 2) {
            throw RuntimeException(
                "need at least two expressions in the stack for a binary operator"
            )
        }
    }
}