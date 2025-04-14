import ast.ASTMaker
import engine.Executor
import generated.mygrammarLexer
import generated.mygrammarParser
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTreeWalker
import java.io.FileInputStream
import java.io.PrintWriter
import java.nio.file.Files
import java.nio.file.Paths

fun main(args: Array<String>) {
    val inputPath = Paths.get("/Users/romajan4/Desktop/учеба/Тестирование ПО/kroos/hw4-testing/src/main/kotlin/input6")
    val outputPath = Paths.get("/Users/romajan4/Desktop/учеба/Тестирование ПО/kroos/hw4-testing/src/main/kotlin/output6")
    if (!Files.exists(inputPath)) {
        throw RuntimeException("File not found: $inputPath")
    }

    val inputText = CharStreams.fromStream(FileInputStream(inputPath.toFile()))
    val parser = mygrammarParser(
        CommonTokenStream(
            mygrammarLexer(inputText)
        )
    )
    if (parser.numberOfSyntaxErrors > 0) {
        throw RuntimeException("detected syntax error in $inputPath")
    }

    val astMaker = ASTMaker.create()
    ParseTreeWalker().walk(astMaker, parser.function())

    val allStates = Executor().execute(astMaker.getFuncDefn())

    PrintWriter(outputPath.toFile()).use { writer ->
        allStates.forEach {
            writer.println(it)
        }
    }
}