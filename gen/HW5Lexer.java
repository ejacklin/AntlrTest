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
		NUM=1, ID=2, LB=3, RB=4, LPAREN=5, RPAREN=6, SEMICOLON=7, COMMA=8, LCB=9, 
		RCB=10, LTE=11, LT=12, GT=13, GTE=14, EQ=15, EQUALS=16, NOTEQ=17, ADD=18, 
		SUB=19, MULT=20, DIV=21, IF=22, ELSE=23, WHILE=24, RETURN=25, INT=26, 
		VOID=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"DIGIT", "LOWERCASE", "UPPERCASE", "NUM", "ID", "LB", "RB", "LPAREN", 
		"RPAREN", "SEMICOLON", "COMMA", "LCB", "RCB", "LTE", "LT", "GT", "GTE", 
		"EQ", "EQUALS", "NOTEQ", "ADD", "SUB", "MULT", "DIV", "IF", "ELSE", "WHILE", 
		"RETURN", "INT", "VOID"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'['", "']'", "'('", "')'", "';'", "','", "'{'", "'}'", 
		"'<='", "'<'", "'>'", "'>='", "'=='", "'='", "'!='", "'+'", "'-'", "'*'", 
		"'/'", "'if'", "'else'", "'while'", "'return'", "'int'", "'void'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NUM", "ID", "LB", "RB", "LPAREN", "RPAREN", "SEMICOLON", "COMMA", 
		"LCB", "RCB", "LTE", "LT", "GT", "GTE", "EQ", "EQUALS", "NOTEQ", "ADD", 
		"SUB", "MULT", "DIV", "IF", "ELSE", "WHILE", "RETURN", "INT", "VOID"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\35\u00a4\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\5\5H\n\5\3\5\6\5K\n\5\r\5\16\5L\3\5\3\5\6"+
		"\5Q\n\5\r\5\16\5R\5\5U\n\5\3\6\3\6\6\6Y\n\6\r\6\16\6Z\3\7\3\7\3\b\3\b"+
		"\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3"+
		"\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3"+
		"\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3"+
		"\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\2\2 \3\2\5\2\7\2"+
		"\t\3\13\4\r\5\17\6\21\7\23\b\25\t\27\n\31\13\33\f\35\r\37\16!\17#\20%"+
		"\21\'\22)\23+\24-\25/\26\61\27\63\30\65\31\67\329\33;\34=\35\3\2\6\5\2"+
		"\62\62;;aa\5\2aacc||\5\2CC\\\\aa\4\2..\60\60\2\u00a7\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\3?\3\2\2\2\5A\3\2\2\2\7C\3\2\2\2\tG"+
		"\3\2\2\2\13X\3\2\2\2\r\\\3\2\2\2\17^\3\2\2\2\21`\3\2\2\2\23b\3\2\2\2\25"+
		"d\3\2\2\2\27f\3\2\2\2\31h\3\2\2\2\33j\3\2\2\2\35l\3\2\2\2\37o\3\2\2\2"+
		"!q\3\2\2\2#s\3\2\2\2%v\3\2\2\2\'y\3\2\2\2){\3\2\2\2+~\3\2\2\2-\u0080\3"+
		"\2\2\2/\u0082\3\2\2\2\61\u0084\3\2\2\2\63\u0086\3\2\2\2\65\u0089\3\2\2"+
		"\2\67\u008e\3\2\2\29\u0094\3\2\2\2;\u009b\3\2\2\2=\u009f\3\2\2\2?@\t\2"+
		"\2\2@\4\3\2\2\2AB\t\3\2\2B\6\3\2\2\2CD\t\4\2\2D\b\3\2\2\2EH\5+\26\2FH"+
		"\5-\27\2GE\3\2\2\2GF\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IK\5\3\2\2JI\3\2\2\2K"+
		"L\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MT\3\2\2\2NP\t\5\2\2OQ\5\3\2\2PO\3\2\2\2"+
		"QR\3\2\2\2RP\3\2\2\2RS\3\2\2\2SU\3\2\2\2TN\3\2\2\2TU\3\2\2\2U\n\3\2\2"+
		"\2VY\5\5\3\2WY\5\7\4\2XV\3\2\2\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2"+
		"\2[\f\3\2\2\2\\]\7]\2\2]\16\3\2\2\2^_\7_\2\2_\20\3\2\2\2`a\7*\2\2a\22"+
		"\3\2\2\2bc\7+\2\2c\24\3\2\2\2de\7=\2\2e\26\3\2\2\2fg\7.\2\2g\30\3\2\2"+
		"\2hi\7}\2\2i\32\3\2\2\2jk\7\177\2\2k\34\3\2\2\2lm\7>\2\2mn\7?\2\2n\36"+
		"\3\2\2\2op\7>\2\2p \3\2\2\2qr\7@\2\2r\"\3\2\2\2st\7@\2\2tu\7?\2\2u$\3"+
		"\2\2\2vw\7?\2\2wx\7?\2\2x&\3\2\2\2yz\7?\2\2z(\3\2\2\2{|\7#\2\2|}\7?\2"+
		"\2}*\3\2\2\2~\177\7-\2\2\177,\3\2\2\2\u0080\u0081\7/\2\2\u0081.\3\2\2"+
		"\2\u0082\u0083\7,\2\2\u0083\60\3\2\2\2\u0084\u0085\7\61\2\2\u0085\62\3"+
		"\2\2\2\u0086\u0087\7k\2\2\u0087\u0088\7h\2\2\u0088\64\3\2\2\2\u0089\u008a"+
		"\7g\2\2\u008a\u008b\7n\2\2\u008b\u008c\7u\2\2\u008c\u008d\7g\2\2\u008d"+
		"\66\3\2\2\2\u008e\u008f\7y\2\2\u008f\u0090\7j\2\2\u0090\u0091\7k\2\2\u0091"+
		"\u0092\7n\2\2\u0092\u0093\7g\2\2\u00938\3\2\2\2\u0094\u0095\7t\2\2\u0095"+
		"\u0096\7g\2\2\u0096\u0097\7v\2\2\u0097\u0098\7w\2\2\u0098\u0099\7t\2\2"+
		"\u0099\u009a\7p\2\2\u009a:\3\2\2\2\u009b\u009c\7k\2\2\u009c\u009d\7p\2"+
		"\2\u009d\u009e\7v\2\2\u009e<\3\2\2\2\u009f\u00a0\7x\2\2\u00a0\u00a1\7"+
		"q\2\2\u00a1\u00a2\7k\2\2\u00a2\u00a3\7f\2\2\u00a3>\3\2\2\2\t\2GLRTXZ\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}