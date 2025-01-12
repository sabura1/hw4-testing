package generated;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class mygrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, TRUE=11, FALSE=12, BOOL=13, INT=14, NUMBER=15, BINOP_ADD=16, 
		BINOP_SUB=17, BINOP_LT=18, BINOP_GT=19, BINOP_LAND=20, BINOP_LOR=21, UNOP_NEGATION=22, 
		NAME=23, WHITESPACE=24;
	public static final int
		RULE_function = 0, RULE_parameters = 1, RULE_paramdecl = 2, RULE_body = 3, 
		RULE_returnstmt = 4, RULE_statement = 5, RULE_ifstmt = 6, RULE_thenbody = 7, 
		RULE_elsebody = 8, RULE_assign = 9, RULE_expression = 10, RULE_boolexpr5 = 11, 
		RULE_binoplorexpr = 12, RULE_boolexpr4 = 13, RULE_binoplandexpr = 14, 
		RULE_boolexpr3 = 15, RULE_intcompareexpr = 16, RULE_boolexpr2 = 17, RULE_unopnegateexpr = 18, 
		RULE_boolexpr1 = 19, RULE_boolliteral = 20, RULE_intexpr = 21, RULE_binopintexpr = 22, 
		RULE_atomintexpr = 23, RULE_intliteral = 24, RULE_varrefexpr = 25, RULE_type = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"function", "parameters", "paramdecl", "body", "returnstmt", "statement", 
			"ifstmt", "thenbody", "elsebody", "assign", "expression", "boolexpr5", 
			"binoplorexpr", "boolexpr4", "binoplandexpr", "boolexpr3", "intcompareexpr", 
			"boolexpr2", "unopnegateexpr", "boolexpr1", "boolliteral", "intexpr", 
			"binopintexpr", "atomintexpr", "intliteral", "varrefexpr", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "':'", "'{'", "'}'", "','", "'return'", "'if'", "'else'", 
			"'='", "'true'", "'false'", "'bool'", "'int'", null, "'+'", "'-'", "'<'", 
			"'>'", "'&'", "'|'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "TRUE", 
			"FALSE", "BOOL", "INT", "NUMBER", "BINOP_ADD", "BINOP_SUB", "BINOP_LT", 
			"BINOP_GT", "BINOP_LAND", "BINOP_LOR", "UNOP_NEGATION", "NAME", "WHITESPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "mygrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public mygrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(mygrammarParser.NAME, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener) ((mygrammarListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener) ((mygrammarListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mygrammarVisitor) return ((mygrammarVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(NAME);
			setState(55);
			match(T__0);
			setState(56);
			parameters();
			setState(57);
			match(T__1);
			setState(58);
			match(T__2);
			setState(59);
			type();
			setState(60);
			match(T__3);
			setState(61);
			body();
			setState(62);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametersContext extends ParserRuleContext {
		public List<ParamdeclContext> paramdecl() {
			return getRuleContexts(ParamdeclContext.class);
		}
		public ParamdeclContext paramdecl(int i) {
			return getRuleContext(ParamdeclContext.class,i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener) ((mygrammarListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener) ((mygrammarListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mygrammarVisitor) return ((mygrammarVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_parameters);
		int _la;
		try {
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case BOOL:
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				paramdecl();
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(66);
					match(T__5);
					setState(67);
					paramdecl();
					}
					}
					setState(72);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamdeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode NAME() { return getToken(mygrammarParser.NAME, 0); }
		public ParamdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramdecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener) ((mygrammarListener)listener).enterParamdecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener) ((mygrammarListener)listener).exitParamdecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mygrammarVisitor) return ((mygrammarVisitor<? extends T>)visitor).visitParamdecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamdeclContext paramdecl() throws RecognitionException {
		ParamdeclContext _localctx = new ParamdeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_paramdecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			type();
			setState(76);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BodyContext extends ParserRuleContext {
		public ReturnstmtContext returnstmt() {
			return getRuleContext(ReturnstmtContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener) ((mygrammarListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener) ((mygrammarListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mygrammarVisitor) return ((mygrammarVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7 || _la==NAME) {
				{
				{
				setState(78);
				statement();
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(84);
			returnstmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnstmtContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener) ((mygrammarListener)listener).enterReturnstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener) ((mygrammarListener)listener).exitReturnstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mygrammarVisitor) return ((mygrammarVisitor<? extends T>)visitor).visitReturnstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnstmtContext returnstmt() throws RecognitionException {
		ReturnstmtContext _localctx = new ReturnstmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_returnstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(T__6);
			setState(87);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public IfstmtContext ifstmt() {
			return getRuleContext(IfstmtContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener) ((mygrammarListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener) ((mygrammarListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mygrammarVisitor) return ((mygrammarVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		try {
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				ifstmt();
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				assign();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfstmtContext extends ParserRuleContext {
		public Boolexpr5Context boolexpr5() {
			return getRuleContext(Boolexpr5Context.class,0);
		}
		public ThenbodyContext thenbody() {
			return getRuleContext(ThenbodyContext.class,0);
		}
		public ElsebodyContext elsebody() {
			return getRuleContext(ElsebodyContext.class,0);
		}
		public IfstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener) ((mygrammarListener)listener).enterIfstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener) ((mygrammarListener)listener).exitIfstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mygrammarVisitor) return ((mygrammarVisitor<? extends T>)visitor).visitIfstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfstmtContext ifstmt() throws RecognitionException {
		IfstmtContext _localctx = new IfstmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ifstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(T__7);
			setState(94);
			match(T__0);
			setState(95);
			boolexpr5();
			setState(96);
			match(T__1);
			setState(97);
			match(T__3);
			setState(98);
			thenbody();
			setState(99);
			match(T__4);
			setState(100);
			match(T__8);
			setState(101);
			match(T__3);
			setState(102);
			elsebody();
			setState(103);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ThenbodyContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ThenbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thenbody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener) ((mygrammarListener)listener).enterThenbody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener) ((mygrammarListener)listener).exitThenbody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mygrammarVisitor) return ((mygrammarVisitor<? extends T>)visitor).visitThenbody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThenbodyContext thenbody() throws RecognitionException {
		ThenbodyContext _localctx = new ThenbodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_thenbody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7 || _la==NAME) {
				{
				{
				setState(105);
				statement();
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElsebodyContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ElsebodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsebody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener) ((mygrammarListener)listener).enterElsebody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener) ((mygrammarListener)listener).exitElsebody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mygrammarVisitor) return ((mygrammarVisitor<? extends T>)visitor).visitElsebody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElsebodyContext elsebody() throws RecognitionException {
		ElsebodyContext _localctx = new ElsebodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_elsebody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7 || _la==NAME) {
				{
				{
				setState(111);
				statement();
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(mygrammarParser.NAME, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener) ((mygrammarListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener) ((mygrammarListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mygrammarVisitor) return ((mygrammarVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(NAME);
			setState(118);
			match(T__9);
			setState(119);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public IntexprContext intexpr() {
			return getRuleContext(IntexprContext.class,0);
		}
		public Boolexpr5Context boolexpr5() {
			return getRuleContext(Boolexpr5Context.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener) ((mygrammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener) ((mygrammarListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mygrammarVisitor) return ((mygrammarVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expression);
		try {
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				intexpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				boolexpr5();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Boolexpr5Context extends ParserRuleContext {
		public Boolexpr4Context boolexpr4() {
			return getRuleContext(Boolexpr4Context.class,0);
		}
		public BinoplorexprContext binoplorexpr() {
			return getRuleContext(BinoplorexprContext.class,0);
		}
		public Boolexpr5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolexpr5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener) ((mygrammarListener)listener).enterBoolexpr5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener) ((mygrammarListener)listener).exitBoolexpr5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mygrammarVisitor) return ((mygrammarVisitor<? extends T>)visitor).visitBoolexpr5(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolexpr5Context boolexpr5() throws RecognitionException {
		Boolexpr5Context _localctx = new Boolexpr5Context(_ctx, getState());
		enterRule(_localctx, 22, RULE_boolexpr5);
		try {
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				boolexpr4();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				binoplorexpr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BinoplorexprContext extends ParserRuleContext {
		public Boolexpr4Context boolexpr4() {
			return getRuleContext(Boolexpr4Context.class,0);
		}
		public TerminalNode BINOP_LOR() { return getToken(mygrammarParser.BINOP_LOR, 0); }
		public Boolexpr5Context boolexpr5() {
			return getRuleContext(Boolexpr5Context.class,0);
		}
		public BinoplorexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binoplorexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener) ((mygrammarListener)listener).enterBinoplorexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener) ((mygrammarListener)listener).exitBinoplorexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mygrammarVisitor) return ((mygrammarVisitor<? extends T>)visitor).visitBinoplorexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinoplorexprContext binoplorexpr() throws RecognitionException {
		BinoplorexprContext _localctx = new BinoplorexprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_binoplorexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			boolexpr4();
			setState(130);
			match(BINOP_LOR);
			setState(131);
			boolexpr5();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Boolexpr4Context extends ParserRuleContext {
		public Boolexpr3Context boolexpr3() {
			return getRuleContext(Boolexpr3Context.class,0);
		}
		public BinoplandexprContext binoplandexpr() {
			return getRuleContext(BinoplandexprContext.class,0);
		}
		public Boolexpr4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolexpr4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener) ((mygrammarListener)listener).enterBoolexpr4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener) ((mygrammarListener)listener).exitBoolexpr4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mygrammarVisitor) return ((mygrammarVisitor<? extends T>)visitor).visitBoolexpr4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolexpr4Context boolexpr4() throws RecognitionException {
		Boolexpr4Context _localctx = new Boolexpr4Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_boolexpr4);
		try {
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				boolexpr3();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				binoplandexpr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BinoplandexprContext extends ParserRuleContext {
		public Boolexpr3Context boolexpr3() {
			return getRuleContext(Boolexpr3Context.class,0);
		}
		public TerminalNode BINOP_LAND() { return getToken(mygrammarParser.BINOP_LAND, 0); }
		public Boolexpr4Context boolexpr4() {
			return getRuleContext(Boolexpr4Context.class,0);
		}
		public BinoplandexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binoplandexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener) ((mygrammarListener)listener).enterBinoplandexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener) ((mygrammarListener)listener).exitBinoplandexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mygrammarVisitor) return ((mygrammarVisitor<? extends T>)visitor).visitBinoplandexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinoplandexprContext binoplandexpr() throws RecognitionException {
		BinoplandexprContext _localctx = new BinoplandexprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_binoplandexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			boolexpr3();
			setState(138);
			match(BINOP_LAND);
			setState(139);
			boolexpr4();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Boolexpr3Context extends ParserRuleContext {
		public Boolexpr2Context boolexpr2() {
			return getRuleContext(Boolexpr2Context.class,0);
		}
		public IntcompareexprContext intcompareexpr() {
			return getRuleContext(IntcompareexprContext.class,0);
		}
		public Boolexpr3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolexpr3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener) ((mygrammarListener)listener).enterBoolexpr3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener) ((mygrammarListener)listener).exitBoolexpr3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mygrammarVisitor) return ((mygrammarVisitor<? extends T>)visitor).visitBoolexpr3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolexpr3Context boolexpr3() throws RecognitionException {
		Boolexpr3Context _localctx = new Boolexpr3Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_boolexpr3);
		try {
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				boolexpr2();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				intcompareexpr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IntcompareexprContext extends ParserRuleContext {
		public List<IntexprContext> intexpr() {
			return getRuleContexts(IntexprContext.class);
		}
		public IntexprContext intexpr(int i) {
			return getRuleContext(IntexprContext.class,i);
		}
		public TerminalNode BINOP_LT() { return getToken(mygrammarParser.BINOP_LT, 0); }
		public TerminalNode BINOP_GT() { return getToken(mygrammarParser.BINOP_GT, 0); }
		public IntcompareexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intcompareexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener) ((mygrammarListener)listener).enterIntcompareexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener) ((mygrammarListener)listener).exitIntcompareexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mygrammarVisitor) return ((mygrammarVisitor<? extends T>)visitor).visitIntcompareexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntcompareexprContext intcompareexpr() throws RecognitionException {
		IntcompareexprContext _localctx = new IntcompareexprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_intcompareexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			intexpr();
			setState(146);
			_la = _input.LA(1);
			if ( !(_la==BINOP_LT || _la==BINOP_GT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(147);
			intexpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Boolexpr2Context extends ParserRuleContext {
		public Boolexpr1Context boolexpr1() {
			return getRuleContext(Boolexpr1Context.class,0);
		}
		public UnopnegateexprContext unopnegateexpr() {
			return getRuleContext(UnopnegateexprContext.class,0);
		}
		public Boolexpr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolexpr2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener) ((mygrammarListener)listener).enterBoolexpr2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener) ((mygrammarListener)listener).exitBoolexpr2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mygrammarVisitor) return ((mygrammarVisitor<? extends T>)visitor).visitBoolexpr2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolexpr2Context boolexpr2() throws RecognitionException {
		Boolexpr2Context _localctx = new Boolexpr2Context(_ctx, getState());
		enterRule(_localctx, 34, RULE_boolexpr2);
		try {
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				boolexpr1();
				}
				break;
			case UNOP_NEGATION:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				unopnegateexpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnopnegateexprContext extends ParserRuleContext {
		public TerminalNode UNOP_NEGATION() { return getToken(mygrammarParser.UNOP_NEGATION, 0); }
		public Boolexpr2Context boolexpr2() {
			return getRuleContext(Boolexpr2Context.class,0);
		}
		public UnopnegateexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unopnegateexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener) ((mygrammarListener)listener).enterUnopnegateexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener) ((mygrammarListener)listener).exitUnopnegateexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mygrammarVisitor) return ((mygrammarVisitor<? extends T>)visitor).visitUnopnegateexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnopnegateexprContext unopnegateexpr() throws RecognitionException {
		UnopnegateexprContext _localctx = new UnopnegateexprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_unopnegateexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(UNOP_NEGATION);
			setState(154);
			boolexpr2();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Boolexpr1Context extends ParserRuleContext {
		public BoolliteralContext boolliteral() {
			return getRuleContext(BoolliteralContext.class,0);
		}
		public VarrefexprContext varrefexpr() {
			return getRuleContext(VarrefexprContext.class,0);
		}
		public Boolexpr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolexpr1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener) ((mygrammarListener)listener).enterBoolexpr1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener) ((mygrammarListener)listener).exitBoolexpr1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mygrammarVisitor) return ((mygrammarVisitor<? extends T>)visitor).visitBoolexpr1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolexpr1Context boolexpr1() throws RecognitionException {
		Boolexpr1Context _localctx = new Boolexpr1Context(_ctx, getState());
		enterRule(_localctx, 38, RULE_boolexpr1);
		try {
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				boolliteral();
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				varrefexpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BoolliteralContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(mygrammarParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(mygrammarParser.FALSE, 0); }
		public BoolliteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolliteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener) ((mygrammarListener)listener).enterBoolliteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener) ((mygrammarListener)listener).exitBoolliteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mygrammarVisitor) return ((mygrammarVisitor<? extends T>)visitor).visitBoolliteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolliteralContext boolliteral() throws RecognitionException {
		BoolliteralContext _localctx = new BoolliteralContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_boolliteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IntexprContext extends ParserRuleContext {
		public AtomintexprContext atomintexpr() {
			return getRuleContext(AtomintexprContext.class,0);
		}
		public BinopintexprContext binopintexpr() {
			return getRuleContext(BinopintexprContext.class,0);
		}
		public IntexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener) ((mygrammarListener)listener).enterIntexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener) ((mygrammarListener)listener).exitIntexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mygrammarVisitor) return ((mygrammarVisitor<? extends T>)visitor).visitIntexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntexprContext intexpr() throws RecognitionException {
		IntexprContext _localctx = new IntexprContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_intexpr);
		try {
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				atomintexpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				binopintexpr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BinopintexprContext extends ParserRuleContext {
		public AtomintexprContext atomintexpr() {
			return getRuleContext(AtomintexprContext.class,0);
		}
		public IntexprContext intexpr() {
			return getRuleContext(IntexprContext.class,0);
		}
		public TerminalNode BINOP_ADD() { return getToken(mygrammarParser.BINOP_ADD, 0); }
		public TerminalNode BINOP_SUB() { return getToken(mygrammarParser.BINOP_SUB, 0); }
		public BinopintexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binopintexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener) ((mygrammarListener)listener).enterBinopintexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener) ((mygrammarListener)listener).exitBinopintexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mygrammarVisitor) return ((mygrammarVisitor<? extends T>)visitor).visitBinopintexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinopintexprContext binopintexpr() throws RecognitionException {
		BinopintexprContext _localctx = new BinopintexprContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_binopintexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			atomintexpr();
			setState(167);
			_la = _input.LA(1);
			if ( !(_la==BINOP_ADD || _la==BINOP_SUB) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(168);
			intexpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtomintexprContext extends ParserRuleContext {
		public IntliteralContext intliteral() {
			return getRuleContext(IntliteralContext.class,0);
		}
		public VarrefexprContext varrefexpr() {
			return getRuleContext(VarrefexprContext.class,0);
		}
		public AtomintexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomintexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener) ((mygrammarListener)listener).enterAtomintexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener) ((mygrammarListener)listener).exitAtomintexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mygrammarVisitor) return ((mygrammarVisitor<? extends T>)visitor).visitAtomintexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomintexprContext atomintexpr() throws RecognitionException {
		AtomintexprContext _localctx = new AtomintexprContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_atomintexpr);
		try {
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				intliteral();
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				varrefexpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IntliteralContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(mygrammarParser.NUMBER, 0); }
		public IntliteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intliteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener) ((mygrammarListener)listener).enterIntliteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener) ((mygrammarListener)listener).exitIntliteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mygrammarVisitor) return ((mygrammarVisitor<? extends T>)visitor).visitIntliteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntliteralContext intliteral() throws RecognitionException {
		IntliteralContext _localctx = new IntliteralContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_intliteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarrefexprContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(mygrammarParser.NAME, 0); }
		public VarrefexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varrefexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener) ((mygrammarListener)listener).enterVarrefexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener) ((mygrammarListener)listener).exitVarrefexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mygrammarVisitor) return ((mygrammarVisitor<? extends T>)visitor).visitVarrefexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarrefexprContext varrefexpr() throws RecognitionException {
		VarrefexprContext _localctx = new VarrefexprContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_varrefexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(mygrammarParser.BOOL, 0); }
		public TerminalNode INT() { return getToken(mygrammarParser.INT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener) ((mygrammarListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mygrammarListener) ((mygrammarListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mygrammarVisitor) return ((mygrammarVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			_la = _input.LA(1);
			if ( !(_la==BOOL || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0018\u00b5\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0005\u0001E\b\u0001\n\u0001\f\u0001H\t\u0001\u0003\u0001J\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0005\u0003P\b\u0003"+
		"\n\u0003\f\u0003S\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0003\u0005\\\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0005\u0007k\b\u0007\n\u0007\f\u0007n\t\u0007\u0001\b\u0005\bq\b\b\n"+
		"\b\f\bt\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0003\n|\b"+
		"\n\u0001\u000b\u0001\u000b\u0003\u000b\u0080\b\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0003\r\u0088\b\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0003\u000f\u0090\b\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u0098\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u009f\b\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u00a5\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0003\u0017\u00ad\b\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0000"+
		"\u0000\u001b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.024\u0000\u0004\u0001\u0000\u0012\u0013"+
		"\u0001\u0000\u000b\f\u0001\u0000\u0010\u0011\u0001\u0000\r\u000e\u00a7"+
		"\u00006\u0001\u0000\u0000\u0000\u0002I\u0001\u0000\u0000\u0000\u0004K"+
		"\u0001\u0000\u0000\u0000\u0006Q\u0001\u0000\u0000\u0000\bV\u0001\u0000"+
		"\u0000\u0000\n[\u0001\u0000\u0000\u0000\f]\u0001\u0000\u0000\u0000\u000e"+
		"l\u0001\u0000\u0000\u0000\u0010r\u0001\u0000\u0000\u0000\u0012u\u0001"+
		"\u0000\u0000\u0000\u0014{\u0001\u0000\u0000\u0000\u0016\u007f\u0001\u0000"+
		"\u0000\u0000\u0018\u0081\u0001\u0000\u0000\u0000\u001a\u0087\u0001\u0000"+
		"\u0000\u0000\u001c\u0089\u0001\u0000\u0000\u0000\u001e\u008f\u0001\u0000"+
		"\u0000\u0000 \u0091\u0001\u0000\u0000\u0000\"\u0097\u0001\u0000\u0000"+
		"\u0000$\u0099\u0001\u0000\u0000\u0000&\u009e\u0001\u0000\u0000\u0000("+
		"\u00a0\u0001\u0000\u0000\u0000*\u00a4\u0001\u0000\u0000\u0000,\u00a6\u0001"+
		"\u0000\u0000\u0000.\u00ac\u0001\u0000\u0000\u00000\u00ae\u0001\u0000\u0000"+
		"\u00002\u00b0\u0001\u0000\u0000\u00004\u00b2\u0001\u0000\u0000\u00006"+
		"7\u0005\u0017\u0000\u000078\u0005\u0001\u0000\u000089\u0003\u0002\u0001"+
		"\u00009:\u0005\u0002\u0000\u0000:;\u0005\u0003\u0000\u0000;<\u00034\u001a"+
		"\u0000<=\u0005\u0004\u0000\u0000=>\u0003\u0006\u0003\u0000>?\u0005\u0005"+
		"\u0000\u0000?\u0001\u0001\u0000\u0000\u0000@J\u0001\u0000\u0000\u0000"+
		"AF\u0003\u0004\u0002\u0000BC\u0005\u0006\u0000\u0000CE\u0003\u0004\u0002"+
		"\u0000DB\u0001\u0000\u0000\u0000EH\u0001\u0000\u0000\u0000FD\u0001\u0000"+
		"\u0000\u0000FG\u0001\u0000\u0000\u0000GJ\u0001\u0000\u0000\u0000HF\u0001"+
		"\u0000\u0000\u0000I@\u0001\u0000\u0000\u0000IA\u0001\u0000\u0000\u0000"+
		"J\u0003\u0001\u0000\u0000\u0000KL\u00034\u001a\u0000LM\u0005\u0017\u0000"+
		"\u0000M\u0005\u0001\u0000\u0000\u0000NP\u0003\n\u0005\u0000ON\u0001\u0000"+
		"\u0000\u0000PS\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000QR\u0001"+
		"\u0000\u0000\u0000RT\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000"+
		"TU\u0003\b\u0004\u0000U\u0007\u0001\u0000\u0000\u0000VW\u0005\u0007\u0000"+
		"\u0000WX\u0003\u0014\n\u0000X\t\u0001\u0000\u0000\u0000Y\\\u0003\f\u0006"+
		"\u0000Z\\\u0003\u0012\t\u0000[Y\u0001\u0000\u0000\u0000[Z\u0001\u0000"+
		"\u0000\u0000\\\u000b\u0001\u0000\u0000\u0000]^\u0005\b\u0000\u0000^_\u0005"+
		"\u0001\u0000\u0000_`\u0003\u0016\u000b\u0000`a\u0005\u0002\u0000\u0000"+
		"ab\u0005\u0004\u0000\u0000bc\u0003\u000e\u0007\u0000cd\u0005\u0005\u0000"+
		"\u0000de\u0005\t\u0000\u0000ef\u0005\u0004\u0000\u0000fg\u0003\u0010\b"+
		"\u0000gh\u0005\u0005\u0000\u0000h\r\u0001\u0000\u0000\u0000ik\u0003\n"+
		"\u0005\u0000ji\u0001\u0000\u0000\u0000kn\u0001\u0000\u0000\u0000lj\u0001"+
		"\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000m\u000f\u0001\u0000\u0000"+
		"\u0000nl\u0001\u0000\u0000\u0000oq\u0003\n\u0005\u0000po\u0001\u0000\u0000"+
		"\u0000qt\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001\u0000"+
		"\u0000\u0000s\u0011\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000"+
		"uv\u0005\u0017\u0000\u0000vw\u0005\n\u0000\u0000wx\u0003\u0014\n\u0000"+
		"x\u0013\u0001\u0000\u0000\u0000y|\u0003*\u0015\u0000z|\u0003\u0016\u000b"+
		"\u0000{y\u0001\u0000\u0000\u0000{z\u0001\u0000\u0000\u0000|\u0015\u0001"+
		"\u0000\u0000\u0000}\u0080\u0003\u001a\r\u0000~\u0080\u0003\u0018\f\u0000"+
		"\u007f}\u0001\u0000\u0000\u0000\u007f~\u0001\u0000\u0000\u0000\u0080\u0017"+
		"\u0001\u0000\u0000\u0000\u0081\u0082\u0003\u001a\r\u0000\u0082\u0083\u0005"+
		"\u0015\u0000\u0000\u0083\u0084\u0003\u0016\u000b\u0000\u0084\u0019\u0001"+
		"\u0000\u0000\u0000\u0085\u0088\u0003\u001e\u000f\u0000\u0086\u0088\u0003"+
		"\u001c\u000e\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0086\u0001"+
		"\u0000\u0000\u0000\u0088\u001b\u0001\u0000\u0000\u0000\u0089\u008a\u0003"+
		"\u001e\u000f\u0000\u008a\u008b\u0005\u0014\u0000\u0000\u008b\u008c\u0003"+
		"\u001a\r\u0000\u008c\u001d\u0001\u0000\u0000\u0000\u008d\u0090\u0003\""+
		"\u0011\u0000\u008e\u0090\u0003 \u0010\u0000\u008f\u008d\u0001\u0000\u0000"+
		"\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u0090\u001f\u0001\u0000\u0000"+
		"\u0000\u0091\u0092\u0003*\u0015\u0000\u0092\u0093\u0007\u0000\u0000\u0000"+
		"\u0093\u0094\u0003*\u0015\u0000\u0094!\u0001\u0000\u0000\u0000\u0095\u0098"+
		"\u0003&\u0013\u0000\u0096\u0098\u0003$\u0012\u0000\u0097\u0095\u0001\u0000"+
		"\u0000\u0000\u0097\u0096\u0001\u0000\u0000\u0000\u0098#\u0001\u0000\u0000"+
		"\u0000\u0099\u009a\u0005\u0016\u0000\u0000\u009a\u009b\u0003\"\u0011\u0000"+
		"\u009b%\u0001\u0000\u0000\u0000\u009c\u009f\u0003(\u0014\u0000\u009d\u009f"+
		"\u00032\u0019\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e\u009d\u0001"+
		"\u0000\u0000\u0000\u009f\'\u0001\u0000\u0000\u0000\u00a0\u00a1\u0007\u0001"+
		"\u0000\u0000\u00a1)\u0001\u0000\u0000\u0000\u00a2\u00a5\u0003.\u0017\u0000"+
		"\u00a3\u00a5\u0003,\u0016\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a5+\u0001\u0000\u0000\u0000\u00a6\u00a7"+
		"\u0003.\u0017\u0000\u00a7\u00a8\u0007\u0002\u0000\u0000\u00a8\u00a9\u0003"+
		"*\u0015\u0000\u00a9-\u0001\u0000\u0000\u0000\u00aa\u00ad\u00030\u0018"+
		"\u0000\u00ab\u00ad\u00032\u0019\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000"+
		"\u00ac\u00ab\u0001\u0000\u0000\u0000\u00ad/\u0001\u0000\u0000\u0000\u00ae"+
		"\u00af\u0005\u000f\u0000\u0000\u00af1\u0001\u0000\u0000\u0000\u00b0\u00b1"+
		"\u0005\u0017\u0000\u0000\u00b13\u0001\u0000\u0000\u0000\u00b2\u00b3\u0007"+
		"\u0003\u0000\u0000\u00b35\u0001\u0000\u0000\u0000\u000eFIQ[lr{\u007f\u0087"+
		"\u008f\u0097\u009e\u00a4\u00ac";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}