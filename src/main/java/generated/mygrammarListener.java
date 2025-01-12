package generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link mygrammarParser}.
 */
public interface mygrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(mygrammarParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(mygrammarParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(mygrammarParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(mygrammarParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#paramdecl}.
	 * @param ctx the parse tree
	 */
	void enterParamdecl(mygrammarParser.ParamdeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#paramdecl}.
	 * @param ctx the parse tree
	 */
	void exitParamdecl(mygrammarParser.ParamdeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(mygrammarParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(mygrammarParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#returnstmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnstmt(mygrammarParser.ReturnstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#returnstmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnstmt(mygrammarParser.ReturnstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(mygrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(mygrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void enterIfstmt(mygrammarParser.IfstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void exitIfstmt(mygrammarParser.IfstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#thenbody}.
	 * @param ctx the parse tree
	 */
	void enterThenbody(mygrammarParser.ThenbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#thenbody}.
	 * @param ctx the parse tree
	 */
	void exitThenbody(mygrammarParser.ThenbodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#elsebody}.
	 * @param ctx the parse tree
	 */
	void enterElsebody(mygrammarParser.ElsebodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#elsebody}.
	 * @param ctx the parse tree
	 */
	void exitElsebody(mygrammarParser.ElsebodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(mygrammarParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(mygrammarParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(mygrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(mygrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#boolexpr5}.
	 * @param ctx the parse tree
	 */
	void enterBoolexpr5(mygrammarParser.Boolexpr5Context ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#boolexpr5}.
	 * @param ctx the parse tree
	 */
	void exitBoolexpr5(mygrammarParser.Boolexpr5Context ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#binoplorexpr}.
	 * @param ctx the parse tree
	 */
	void enterBinoplorexpr(mygrammarParser.BinoplorexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#binoplorexpr}.
	 * @param ctx the parse tree
	 */
	void exitBinoplorexpr(mygrammarParser.BinoplorexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#boolexpr4}.
	 * @param ctx the parse tree
	 */
	void enterBoolexpr4(mygrammarParser.Boolexpr4Context ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#boolexpr4}.
	 * @param ctx the parse tree
	 */
	void exitBoolexpr4(mygrammarParser.Boolexpr4Context ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#binoplandexpr}.
	 * @param ctx the parse tree
	 */
	void enterBinoplandexpr(mygrammarParser.BinoplandexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#binoplandexpr}.
	 * @param ctx the parse tree
	 */
	void exitBinoplandexpr(mygrammarParser.BinoplandexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#boolexpr3}.
	 * @param ctx the parse tree
	 */
	void enterBoolexpr3(mygrammarParser.Boolexpr3Context ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#boolexpr3}.
	 * @param ctx the parse tree
	 */
	void exitBoolexpr3(mygrammarParser.Boolexpr3Context ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#intcompareexpr}.
	 * @param ctx the parse tree
	 */
	void enterIntcompareexpr(mygrammarParser.IntcompareexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#intcompareexpr}.
	 * @param ctx the parse tree
	 */
	void exitIntcompareexpr(mygrammarParser.IntcompareexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#boolexpr2}.
	 * @param ctx the parse tree
	 */
	void enterBoolexpr2(mygrammarParser.Boolexpr2Context ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#boolexpr2}.
	 * @param ctx the parse tree
	 */
	void exitBoolexpr2(mygrammarParser.Boolexpr2Context ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#unopnegateexpr}.
	 * @param ctx the parse tree
	 */
	void enterUnopnegateexpr(mygrammarParser.UnopnegateexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#unopnegateexpr}.
	 * @param ctx the parse tree
	 */
	void exitUnopnegateexpr(mygrammarParser.UnopnegateexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#boolexpr1}.
	 * @param ctx the parse tree
	 */
	void enterBoolexpr1(mygrammarParser.Boolexpr1Context ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#boolexpr1}.
	 * @param ctx the parse tree
	 */
	void exitBoolexpr1(mygrammarParser.Boolexpr1Context ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#boolliteral}.
	 * @param ctx the parse tree
	 */
	void enterBoolliteral(mygrammarParser.BoolliteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#boolliteral}.
	 * @param ctx the parse tree
	 */
	void exitBoolliteral(mygrammarParser.BoolliteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#intexpr}.
	 * @param ctx the parse tree
	 */
	void enterIntexpr(mygrammarParser.IntexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#intexpr}.
	 * @param ctx the parse tree
	 */
	void exitIntexpr(mygrammarParser.IntexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#binopintexpr}.
	 * @param ctx the parse tree
	 */
	void enterBinopintexpr(mygrammarParser.BinopintexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#binopintexpr}.
	 * @param ctx the parse tree
	 */
	void exitBinopintexpr(mygrammarParser.BinopintexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#atomintexpr}.
	 * @param ctx the parse tree
	 */
	void enterAtomintexpr(mygrammarParser.AtomintexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#atomintexpr}.
	 * @param ctx the parse tree
	 */
	void exitAtomintexpr(mygrammarParser.AtomintexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#intliteral}.
	 * @param ctx the parse tree
	 */
	void enterIntliteral(mygrammarParser.IntliteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#intliteral}.
	 * @param ctx the parse tree
	 */
	void exitIntliteral(mygrammarParser.IntliteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#varrefexpr}.
	 * @param ctx the parse tree
	 */
	void enterVarrefexpr(mygrammarParser.VarrefexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#varrefexpr}.
	 * @param ctx the parse tree
	 */
	void exitVarrefexpr(mygrammarParser.VarrefexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(mygrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(mygrammarParser.TypeContext ctx);
}