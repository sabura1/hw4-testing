package engine

import ast.FuncDefn
import ast.FuncReturnStmt
import ast.VariableRef

class Executor {
    fun execute(defn: FuncDefn): List<ExecutionState> {
        val interpreter = Interpreter()
        val memory = DataStore()
        defn.parameters.forEach { param -> memory.put(param.name, VariableRef(param.name, param.type)) }

        var states = listOf(
            ExecutionState(
                memory,
                defn.body + listOfNotNull(defn.retExpr?.let { FuncReturnStmt(it) }),
                emptyList(),
                null
            )
        )
        val finalStates = mutableListOf<ExecutionState>()

        while (states.isNotEmpty()) {
            val current = states.first()
            states = states.drop(1)

            if (current.outResult != null) {
                finalStates.add(current)
            }

            val next = interpreter.step(current)
            states = next + states
        }
        return finalStates
    }
}