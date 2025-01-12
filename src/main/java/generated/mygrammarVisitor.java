package generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link mygrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface mygrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link mygrammarParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(mygrammarParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link mygrammarParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(mygrammarParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link mygrammarParser#paramdecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamdecl(mygrammarParser.ParamdeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link mygrammarParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(mygrammarParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link mygrammarParser#returnstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnstmt(mygrammarParser.ReturnstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link mygrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(mygrammarParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link mygrammarParser#ifstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfstmt(mygrammarParser.IfstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link mygrammarParser#thenbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThenbody(mygrammarParser.ThenbodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link mygrammarParser#elsebody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElsebody(mygrammarParser.ElsebodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link mygrammarParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(mygrammarParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link mygrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(mygrammarParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link mygrammarParser#boolexpr5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolexpr5(mygrammarParser.Boolexpr5Context ctx);
	/**
	 * Visit a parse tree produced by {@link mygrammarParser#binoplorexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinoplorexpr(mygrammarParser.BinoplorexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link mygrammarParser#boolexpr4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolexpr4(mygrammarParser.Boolexpr4Context ctx);
	/**
	 * Visit a parse tree produced by {@link mygrammarParser#binoplandexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinoplandexpr(mygrammarParser.BinoplandexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link mygrammarParser#boolexpr3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolexpr3(mygrammarParser.Boolexpr3Context ctx);
	/**
	 * Visit a parse tree produced by {@link mygrammarParser#intcompareexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntcompareexpr(mygrammarParser.IntcompareexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link mygrammarParser#boolexpr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolexpr2(mygrammarParser.Boolexpr2Context ctx);
	/**
	 * Visit a parse tree produced by {@link mygrammarParser#unopnegateexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnopnegateexpr(mygrammarParser.UnopnegateexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link mygrammarParser#boolexpr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolexpr1(mygrammarParser.Boolexpr1Context ctx);
	/**
	 * Visit a parse tree produced by {@link mygrammarParser#boolliteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolliteral(mygrammarParser.BoolliteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link mygrammarParser#intexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntexpr(mygrammarParser.IntexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link mygrammarParser#binopintexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinopintexpr(mygrammarParser.BinopintexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link mygrammarParser#atomintexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomintexpr(mygrammarParser.AtomintexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link mygrammarParser#intliteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntliteral(mygrammarParser.IntliteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link mygrammarParser#varrefexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarrefexpr(mygrammarParser.VarrefexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link mygrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(mygrammarParser.TypeContext ctx);
}