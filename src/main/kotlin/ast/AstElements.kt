package ast

enum class ValueType {
    BOOL_VAL,
    INT_VAL;

    override fun toString(): String =
        when (this) {
            BOOL_VAL -> "BOOL_VAL"
            INT_VAL -> "INT_VAL"
        }
}

data class ParamDefn(val name: String, val type: ValueType) {
    override fun toString(): String = "$name: $type"
}

sealed class ExprNode(val exprType: ValueType)

class InvalidExpr(exprType: ValueType) : ExprNode(exprType)

class VariableRef(val identifier: String, exprType: ValueType) : ExprNode(exprType) {
    override fun toString(): String = "'$identifier'"
}

class IntConst(private val value: Long) : ExprNode(ValueType.INT_VAL) {
    override fun toString(): String = value.toString()
}

class BoolConst(private val value: Boolean) : ExprNode(ValueType.BOOL_VAL) {
    override fun toString(): String = value.toString()
}

enum class UnaryKind {
    NEGATE;

    override fun toString(): String =
        when (this) {
            NEGATE -> "!"
        }
}

class UnaryOp(val kind: UnaryKind, val subExpr: ExprNode, exprType: ValueType) : ExprNode(exprType) {
    override fun toString(): String = "!($subExpr)"
}

enum class BinaryKind {
    ADD,
    SUB,
    LESS,
    GREATER,
    LAND,
    LOR;

    override fun toString(): String =
        when (this) {
            ADD -> "+"
            SUB -> "-"
            LESS -> "<"
            GREATER -> ">"
            LAND -> "&"
            LOR -> "|"
        }
}

class BinaryOp(val kind: BinaryKind, val lhs: ExprNode, val rhs: ExprNode, exprType: ValueType) : ExprNode(exprType) {
    override fun toString(): String = "$lhs $kind $rhs"
}

sealed class StmtNode

object InvalidStmt : StmtNode()

data class AssignStmt(val name: String, val value: ExprNode) : StmtNode()

data class ConditionalStmt(
    val condition: ExprNode,
    val thenBlock: List<StmtNode>,
    val elseBlock: List<StmtNode>
) : StmtNode()

data class FuncReturnStmt(
    val returnExpr: ExprNode
) : StmtNode()

data class FuncDefn(
    val parameters: MutableList<ParamDefn>,
    val body: MutableList<StmtNode>,
    var retValueType: ValueType?,
    var retExpr: ExprNode?
)