package engine

import ast.*
import java.util.Collections.emptyList

class Interpreter {
    fun step(execState: ExecutionState): List<ExecutionState> {
        val nextNode = execState.nextStates.firstOrNull() ?: return emptyList()
        execState.nextStates = if (execState.nextStates.isNotEmpty()) execState.nextStates.drop(1) else execState.nextStates
        when (nextNode) {
            is ConditionalStmt -> {
                val condition = ExprEvaluator(execState.memory).evalExpr(nextNode.condition)
                val thenState = ExecutionState(
                    execState.memory.copy(),
                    nextNode.thenBlock + execState.nextStates,
                    execState.pc + listOf(condition),
                    null
                )
                val elseState = ExecutionState(
                    execState.memory.copy(),
                    nextNode.elseBlock + execState.nextStates,
                    execState.pc + listOf(
                        UnaryOp(
                            UnaryKind.NEGATE,
                            condition,
                            ValueType.BOOL_VAL
                        )
                    ),
                    null
                )
                return listOf(thenState, elseState)
            }
            is AssignStmt -> {
                val expr = ExprEvaluator(execState.memory).evalExpr(nextNode.value)
                execState.memory.put(nextNode.name, expr)
                return listOf(execState)
            }
            is FuncReturnStmt -> {
                val expr = ExprEvaluator(execState.memory).evalExpr(nextNode.returnExpr)
                execState.outResult = expr
                return listOf(execState)
            }
            else -> return emptyList()
        }
    }

    private class ExprEvaluator(val memory: DataStore) {
        fun evalExpr(expr: ExprNode): ExprNode {
            return when (expr) {
                is BinaryOp -> BinaryOp(
                    expr.kind,
                    evalExpr(expr.lhs),
                    evalExpr(expr.rhs),
                    expr.exprType
                )
                is UnaryOp -> UnaryOp(
                    expr.kind,
                    evalExpr(expr.subExpr),
                    expr.exprType
                )
                is VariableRef -> memory.get(expr.identifier)
                is InvalidExpr -> throw RuntimeException("InvalidExpr encountered")
                else -> expr
            }
        }
    }
}