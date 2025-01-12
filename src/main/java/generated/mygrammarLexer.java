package generated;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class mygrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, TRUE=11, FALSE=12, BOOL=13, INT=14, NUMBER=15, BINOP_ADD=16, 
		BINOP_SUB=17, BINOP_LT=18, BINOP_GT=19, BINOP_LAND=20, BINOP_LOR=21, UNOP_NEGATION=22, 
		NAME=23, WHITESPACE=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "TRUE", "FALSE", "BOOL", "INT", "NUMBER", "BINOP_ADD", "BINOP_SUB", 
			"BINOP_LT", "BINOP_GT", "BINOP_LAND", "BINOP_LOR", "UNOP_NEGATION", "NAME", 
			"WHITESPACE"
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


	public mygrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "mygrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0018\u0081\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0004\u000ed\b\u000e\u000b\u000e\f\u000ee\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0004\u0016w\b\u0016\u000b\u0016\f\u0016x\u0001\u0017"+
		"\u0004\u0017|\b\u0017\u000b\u0017\f\u0017}\u0001\u0017\u0001\u0017\u0000"+
		"\u0000\u0018\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016"+
		"-\u0017/\u0018\u0001\u0000\u0003\u0001\u000009\u0001\u0000az\u0003\u0000"+
		"\t\n\r\r  \u0083\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000"+
		"%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0000/\u0001\u0000\u0000\u0000\u00011\u0001\u0000\u0000\u0000\u0003"+
		"3\u0001\u0000\u0000\u0000\u00055\u0001\u0000\u0000\u0000\u00077\u0001"+
		"\u0000\u0000\u0000\t9\u0001\u0000\u0000\u0000\u000b;\u0001\u0000\u0000"+
		"\u0000\r=\u0001\u0000\u0000\u0000\u000fD\u0001\u0000\u0000\u0000\u0011"+
		"G\u0001\u0000\u0000\u0000\u0013L\u0001\u0000\u0000\u0000\u0015N\u0001"+
		"\u0000\u0000\u0000\u0017S\u0001\u0000\u0000\u0000\u0019Y\u0001\u0000\u0000"+
		"\u0000\u001b^\u0001\u0000\u0000\u0000\u001dc\u0001\u0000\u0000\u0000\u001f"+
		"g\u0001\u0000\u0000\u0000!i\u0001\u0000\u0000\u0000#k\u0001\u0000\u0000"+
		"\u0000%m\u0001\u0000\u0000\u0000\'o\u0001\u0000\u0000\u0000)q\u0001\u0000"+
		"\u0000\u0000+s\u0001\u0000\u0000\u0000-v\u0001\u0000\u0000\u0000/{\u0001"+
		"\u0000\u0000\u000012\u0005(\u0000\u00002\u0002\u0001\u0000\u0000\u0000"+
		"34\u0005)\u0000\u00004\u0004\u0001\u0000\u0000\u000056\u0005:\u0000\u0000"+
		"6\u0006\u0001\u0000\u0000\u000078\u0005{\u0000\u00008\b\u0001\u0000\u0000"+
		"\u00009:\u0005}\u0000\u0000:\n\u0001\u0000\u0000\u0000;<\u0005,\u0000"+
		"\u0000<\f\u0001\u0000\u0000\u0000=>\u0005r\u0000\u0000>?\u0005e\u0000"+
		"\u0000?@\u0005t\u0000\u0000@A\u0005u\u0000\u0000AB\u0005r\u0000\u0000"+
		"BC\u0005n\u0000\u0000C\u000e\u0001\u0000\u0000\u0000DE\u0005i\u0000\u0000"+
		"EF\u0005f\u0000\u0000F\u0010\u0001\u0000\u0000\u0000GH\u0005e\u0000\u0000"+
		"HI\u0005l\u0000\u0000IJ\u0005s\u0000\u0000JK\u0005e\u0000\u0000K\u0012"+
		"\u0001\u0000\u0000\u0000LM\u0005=\u0000\u0000M\u0014\u0001\u0000\u0000"+
		"\u0000NO\u0005t\u0000\u0000OP\u0005r\u0000\u0000PQ\u0005u\u0000\u0000"+
		"QR\u0005e\u0000\u0000R\u0016\u0001\u0000\u0000\u0000ST\u0005f\u0000\u0000"+
		"TU\u0005a\u0000\u0000UV\u0005l\u0000\u0000VW\u0005s\u0000\u0000WX\u0005"+
		"e\u0000\u0000X\u0018\u0001\u0000\u0000\u0000YZ\u0005b\u0000\u0000Z[\u0005"+
		"o\u0000\u0000[\\\u0005o\u0000\u0000\\]\u0005l\u0000\u0000]\u001a\u0001"+
		"\u0000\u0000\u0000^_\u0005i\u0000\u0000_`\u0005n\u0000\u0000`a\u0005t"+
		"\u0000\u0000a\u001c\u0001\u0000\u0000\u0000bd\u0007\u0000\u0000\u0000"+
		"cb\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000"+
		"\u0000ef\u0001\u0000\u0000\u0000f\u001e\u0001\u0000\u0000\u0000gh\u0005"+
		"+\u0000\u0000h \u0001\u0000\u0000\u0000ij\u0005-\u0000\u0000j\"\u0001"+
		"\u0000\u0000\u0000kl\u0005<\u0000\u0000l$\u0001\u0000\u0000\u0000mn\u0005"+
		">\u0000\u0000n&\u0001\u0000\u0000\u0000op\u0005&\u0000\u0000p(\u0001\u0000"+
		"\u0000\u0000qr\u0005|\u0000\u0000r*\u0001\u0000\u0000\u0000st\u0005!\u0000"+
		"\u0000t,\u0001\u0000\u0000\u0000uw\u0007\u0001\u0000\u0000vu\u0001\u0000"+
		"\u0000\u0000wx\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000xy\u0001"+
		"\u0000\u0000\u0000y.\u0001\u0000\u0000\u0000z|\u0007\u0002\u0000\u0000"+
		"{z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000"+
		"\u0000}~\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f"+
		"\u0080\u0006\u0017\u0000\u0000\u00800\u0001\u0000\u0000\u0000\u0004\u0000"+
		"ex}\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}