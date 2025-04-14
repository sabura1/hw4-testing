package engine

import ast.*
import java.util.Collections.emptyList

class Interpreter {
    fun step(execState: ExecutionState): List<ExecutionState> {
        val nextNode = execState.nextStates.firstOrNull() ?: return emptyList()
        execState.nextStates =
            if (execState.nextStates.isNotEmpty()) execState.nextStates.drop(1) else execState.nextStates

        return when (nextNode) {
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
                listOf(thenState, elseState)
            }

            is AssignStmt -> {
                val expr = ExprEvaluator(execState.memory).evalExpr(nextNode.value)
                val simplified = ExprSimplifier().simplify(expr)
                execState.memory.put(nextNode.name, simplified)
                listOf(execState)
            }

            is FuncReturnStmt -> {
                val expr = ExprEvaluator(execState.memory).evalExpr(nextNode.returnExpr)
                val simplified = ExprSimplifier().simplify(expr)
                execState.outResult = simplified
                listOf(execState)
            }

            else -> emptyList()
        }

    }

    private class ExprEvaluator(val memory: DataStore) {
        private val visited = mutableSetOf<String>()

        fun evalExpr(expr: ExprNode): ExprNode {
            return when (expr) {
                is BinaryOp -> {
                    val lhs = evalExpr(expr.lhs)
                    val rhs = evalExpr(expr.rhs)
                    val resultType = inferBinaryType(expr.kind, lhs, rhs)
                    BinaryOp(expr.kind, lhs, rhs, resultType)
                }

                is UnaryOp -> {
                    val sub = evalExpr(expr.subExpr)
                    val resultType = when (expr.kind) {
                        UnaryKind.NEGATE -> ValueType.BOOL_VAL
                    }
                    UnaryOp(expr.kind, sub, resultType)
                }

                is VariableRef -> {
                    if (visited.contains(expr.identifier)) {
                        return expr
                    }
                    visited.add(expr.identifier)
                    val resolved = memory.get(expr.identifier)
                    return evalExpr(resolved)
                }

                is InvalidExpr -> throw RuntimeException("InvalidExpr encountered")

                else -> expr
            }
        }

        private fun inferBinaryType(kind: BinaryKind, lhs: ExprNode, rhs: ExprNode): ValueType {
            return when (kind) {
                BinaryKind.ADD, BinaryKind.SUB, BinaryKind.MUL, BinaryKind.DIV -> ValueType.INT_VAL
                BinaryKind.LESS, BinaryKind.GREATER, BinaryKind.LAND, BinaryKind.LOR -> ValueType.BOOL_VAL
            }
        }
    }
}