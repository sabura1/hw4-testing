package engine

import ast.ExprNode

class DataStore {
    private val store = mutableMapOf<String, ExprNode>()

    fun put(paramName: String, expr: ExprNode) {
        store[paramName] = expr
    }

    fun get(paramName: String): ExprNode {
        return store[paramName] ?: throw RuntimeException("$paramName not in memory")
    }

    fun copy(): DataStore {
        return DataStore().also { newStore ->
            for ((k, v) in store) {
                newStore.put(k, v)
            }
        }
    }

    override fun toString(): String =
        store.map { (key, value) -> "$key = $value" }.joinToString("\n")
}