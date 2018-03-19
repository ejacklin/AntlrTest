// Generated from C:/Users/Erin/IdeaProjects/AntlrTest\HW5.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HW5Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUM=1, ID=2, WS=3, LCOMM=4, RCOMM=5, COMMENT=6, LB=7, RB=8, LPAREN=9, 
		RPAREN=10, SEMICOLON=11, COMMA=12, LCB=13, RCB=14, LTE=15, LT=16, GT=17, 
		GTE=18, EQ=19, ASSIGN=20, NOTEQ=21, ADD=22, SUB=23, MULT=24, DIV=25, IF=26, 
		ELSE=27, WHILE=28, RETURN=29, INT=30, VOID=31;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"DIGIT", "LETTER", "NUM", "ID", "WS", "LCOMM", "RCOMM", "COMMENT", "LB", 
		"RB", "LPAREN", "RPAREN", "SEMICOLON", "COMMA", "LCB", "RCB", "LTE", "LT", 
		"GT", "GTE", "EQ", "ASSIGN", "NOTEQ", "ADD", "SUB", "MULT", "DIV", "IF", 
		"ELSE", "WHILE", "RETURN", "INT", "VOID"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'/*'", "'*/'", null, "'['", "']'", "'('", "')'", 
		"';'", "','", "'{'", "'}'", "'<='", "'<'", "'>'", "'>='", "'=='", "'='", 
		"'!='", "'+'", "'-'", "'*'", "'/'", "'if'", "'else'", "'while'", "'return'", 
		"'int'", "'void'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NUM", "ID", "WS", "LCOMM", "RCOMM", "COMMENT", "LB", "RB", "LPAREN", 
		"RPAREN", "SEMICOLON", "COMMA", "LCB", "RCB", "LTE", "LT", "GT", "GTE", 
		"EQ", "ASSIGN", "NOTEQ", "ADD", "SUB", "MULT", "DIV", "IF", "ELSE", "WHILE", 
		"RETURN", "INT", "VOID"
	};
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


	public HW5Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "HW5.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2!\u00b6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\3\3\3\3\4\3\4\7\4L\n\4\f\4\16\4O\13\4\3\5\3\5\7"+
		"\5S\n\5\f\5\16\5V\13\5\3\6\6\6Y\n\6\r\6\16\6Z\3\6\3\6\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\t\3\t\6\tg\n\t\r\t\16\th\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!"+
		"\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3h\2#\3\2\5\2\7\3\t\4\13\5\r\6\17\7\21\b"+
		"\23\t\25\n\27\13\31\f\33\r\35\16\37\17!\20#\21%\22\'\23)\24+\25-\26/\27"+
		"\61\30\63\31\65\32\67\339\34;\35=\36?\37A C!\3\2\5\3\2\62;\4\2C\\c|\5"+
		"\2\13\f\17\17\"\"\2\u00b7\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\3E\3\2\2\2\5G\3\2\2"+
		"\2\7I\3\2\2\2\tP\3\2\2\2\13X\3\2\2\2\r^\3\2\2\2\17a\3\2\2\2\21d\3\2\2"+
		"\2\23n\3\2\2\2\25p\3\2\2\2\27r\3\2\2\2\31t\3\2\2\2\33v\3\2\2\2\35x\3\2"+
		"\2\2\37z\3\2\2\2!|\3\2\2\2#~\3\2\2\2%\u0081\3\2\2\2\'\u0083\3\2\2\2)\u0085"+
		"\3\2\2\2+\u0088\3\2\2\2-\u008b\3\2\2\2/\u008d\3\2\2\2\61\u0090\3\2\2\2"+
		"\63\u0092\3\2\2\2\65\u0094\3\2\2\2\67\u0096\3\2\2\29\u0098\3\2\2\2;\u009b"+
		"\3\2\2\2=\u00a0\3\2\2\2?\u00a6\3\2\2\2A\u00ad\3\2\2\2C\u00b1\3\2\2\2E"+
		"F\t\2\2\2F\4\3\2\2\2GH\t\3\2\2H\6\3\2\2\2IM\5\3\2\2JL\5\3\2\2KJ\3\2\2"+
		"\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\b\3\2\2\2OM\3\2\2\2PT\5\5\3\2QS\5\5"+
		"\3\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\n\3\2\2\2VT\3\2\2\2WY\t"+
		"\4\2\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\]\b\6\2\2]"+
		"\f\3\2\2\2^_\7\61\2\2_`\7,\2\2`\16\3\2\2\2ab\7,\2\2bc\7\61\2\2c\20\3\2"+
		"\2\2df\5\r\7\2eg\13\2\2\2fe\3\2\2\2gh\3\2\2\2hi\3\2\2\2hf\3\2\2\2ij\3"+
		"\2\2\2jk\5\17\b\2kl\3\2\2\2lm\b\t\2\2m\22\3\2\2\2no\7]\2\2o\24\3\2\2\2"+
		"pq\7_\2\2q\26\3\2\2\2rs\7*\2\2s\30\3\2\2\2tu\7+\2\2u\32\3\2\2\2vw\7=\2"+
		"\2w\34\3\2\2\2xy\7.\2\2y\36\3\2\2\2z{\7}\2\2{ \3\2\2\2|}\7\177\2\2}\""+
		"\3\2\2\2~\177\7>\2\2\177\u0080\7?\2\2\u0080$\3\2\2\2\u0081\u0082\7>\2"+
		"\2\u0082&\3\2\2\2\u0083\u0084\7@\2\2\u0084(\3\2\2\2\u0085\u0086\7@\2\2"+
		"\u0086\u0087\7?\2\2\u0087*\3\2\2\2\u0088\u0089\7?\2\2\u0089\u008a\7?\2"+
		"\2\u008a,\3\2\2\2\u008b\u008c\7?\2\2\u008c.\3\2\2\2\u008d\u008e\7#\2\2"+
		"\u008e\u008f\7?\2\2\u008f\60\3\2\2\2\u0090\u0091\7-\2\2\u0091\62\3\2\2"+
		"\2\u0092\u0093\7/\2\2\u0093\64\3\2\2\2\u0094\u0095\7,\2\2\u0095\66\3\2"+
		"\2\2\u0096\u0097\7\61\2\2\u00978\3\2\2\2\u0098\u0099\7k\2\2\u0099\u009a"+
		"\7h\2\2\u009a:\3\2\2\2\u009b\u009c\7g\2\2\u009c\u009d\7n\2\2\u009d\u009e"+
		"\7u\2\2\u009e\u009f\7g\2\2\u009f<\3\2\2\2\u00a0\u00a1\7y\2\2\u00a1\u00a2"+
		"\7j\2\2\u00a2\u00a3\7k\2\2\u00a3\u00a4\7n\2\2\u00a4\u00a5\7g\2\2\u00a5"+
		">\3\2\2\2\u00a6\u00a7\7t\2\2\u00a7\u00a8\7g\2\2\u00a8\u00a9\7v\2\2\u00a9"+
		"\u00aa\7w\2\2\u00aa\u00ab\7t\2\2\u00ab\u00ac\7p\2\2\u00ac@\3\2\2\2\u00ad"+
		"\u00ae\7k\2\2\u00ae\u00af\7p\2\2\u00af\u00b0\7v\2\2\u00b0B\3\2\2\2\u00b1"+
		"\u00b2\7x\2\2\u00b2\u00b3\7q\2\2\u00b3\u00b4\7k\2\2\u00b4\u00b5\7f\2\2"+
		"\u00b5D\3\2\2\2\7\2MTZh\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}