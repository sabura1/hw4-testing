package engine

import ast.StmtNode
import ast.ExprNode

class ExecutionState(
    val memory: DataStore,
    var nextStates: List<StmtNode>,
    val pc: List<ExprNode>,
    var outResult: ExprNode?
) {
    override fun toString() = "{\n$memory\npc = (${pc.joinToString(") & (")})\nresult = $outResult\n}\n"
}