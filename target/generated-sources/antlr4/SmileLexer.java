// Generated from Smile.g4 by ANTLR 4.7

    import wci.intermediate.*;
    import wci.intermediate.symtabimpl.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SmileLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, PROGRAM=12, VAR=13, START=14, STOP=15, IF=16, THEN=17, 
		ELSE=18, PRINT=19, IDENTIFIER=20, INTEGER=21, FLOAT=22, MUL_OP=23, DIV_OP=24, 
		ADD_OP=25, SUB_OP=26, EQUALS=27, NEWLINE=28, WS=29;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "PROGRAM", "VAR", "START", "STOP", "IF", "THEN", "ELSE", 
		"PRINT", "IDENTIFIER", "INTEGER", "FLOAT", "MUL_OP", "DIV_OP", "ADD_OP", 
		"SUB_OP", "EQUALS", "NEWLINE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", "';'", "';)'", "':)'", "','", "'=)'", "'('", "')'", "'!='", 
		"'<'", "'>'", "'PROGRAM'", "'VAR'", "'START'", "'STOP'", "'IF'", "'THEN'", 
		"'ELSE'", "'PRINT'", null, null, null, "'*'", "'/'", "'+'", "'-'", "'=='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"PROGRAM", "VAR", "START", "STOP", "IF", "THEN", "ELSE", "PRINT", "IDENTIFIER", 
		"INTEGER", "FLOAT", "MUL_OP", "DIV_OP", "ADD_OP", "SUB_OP", "EQUALS", 
		"NEWLINE", "WS"
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


	public SmileLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Smile.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\37\u00b1\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n"+
		"\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\7\25\u0084\n\25\f\25\16\25\u0087\13\25\3\26"+
		"\6\26\u008a\n\26\r\26\16\26\u008b\3\27\6\27\u008f\n\27\r\27\16\27\u0090"+
		"\3\27\3\27\6\27\u0095\n\27\r\27\16\27\u0096\3\30\3\30\3\31\3\31\3\32\3"+
		"\32\3\33\3\33\3\34\3\34\3\34\3\35\5\35\u00a5\n\35\3\35\3\35\3\35\3\35"+
		"\3\36\6\36\u00ac\n\36\r\36\16\36\u00ad\3\36\3\36\2\2\37\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37\3\2\6\4\2C\\"+
		"c|\5\2\62;C\\c|\3\2\62;\4\2\13\13\"\"\2\u00b6\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\3=\3\2\2\2\5?\3\2"+
		"\2\2\7A\3\2\2\2\tD\3\2\2\2\13G\3\2\2\2\rI\3\2\2\2\17L\3\2\2\2\21N\3\2"+
		"\2\2\23P\3\2\2\2\25S\3\2\2\2\27U\3\2\2\2\31W\3\2\2\2\33_\3\2\2\2\35c\3"+
		"\2\2\2\37i\3\2\2\2!n\3\2\2\2#q\3\2\2\2%v\3\2\2\2\'{\3\2\2\2)\u0081\3\2"+
		"\2\2+\u0089\3\2\2\2-\u008e\3\2\2\2/\u0098\3\2\2\2\61\u009a\3\2\2\2\63"+
		"\u009c\3\2\2\2\65\u009e\3\2\2\2\67\u00a0\3\2\2\29\u00a4\3\2\2\2;\u00ab"+
		"\3\2\2\2=>\7\60\2\2>\4\3\2\2\2?@\7=\2\2@\6\3\2\2\2AB\7=\2\2BC\7+\2\2C"+
		"\b\3\2\2\2DE\7<\2\2EF\7+\2\2F\n\3\2\2\2GH\7.\2\2H\f\3\2\2\2IJ\7?\2\2J"+
		"K\7+\2\2K\16\3\2\2\2LM\7*\2\2M\20\3\2\2\2NO\7+\2\2O\22\3\2\2\2PQ\7#\2"+
		"\2QR\7?\2\2R\24\3\2\2\2ST\7>\2\2T\26\3\2\2\2UV\7@\2\2V\30\3\2\2\2WX\7"+
		"R\2\2XY\7T\2\2YZ\7Q\2\2Z[\7I\2\2[\\\7T\2\2\\]\7C\2\2]^\7O\2\2^\32\3\2"+
		"\2\2_`\7X\2\2`a\7C\2\2ab\7T\2\2b\34\3\2\2\2cd\7U\2\2de\7V\2\2ef\7C\2\2"+
		"fg\7T\2\2gh\7V\2\2h\36\3\2\2\2ij\7U\2\2jk\7V\2\2kl\7Q\2\2lm\7R\2\2m \3"+
		"\2\2\2no\7K\2\2op\7H\2\2p\"\3\2\2\2qr\7V\2\2rs\7J\2\2st\7G\2\2tu\7P\2"+
		"\2u$\3\2\2\2vw\7G\2\2wx\7N\2\2xy\7U\2\2yz\7G\2\2z&\3\2\2\2{|\7R\2\2|}"+
		"\7T\2\2}~\7K\2\2~\177\7P\2\2\177\u0080\7V\2\2\u0080(\3\2\2\2\u0081\u0085"+
		"\t\2\2\2\u0082\u0084\t\3\2\2\u0083\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086*\3\2\2\2\u0087\u0085\3\2\2\2"+
		"\u0088\u008a\t\4\2\2\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0089"+
		"\3\2\2\2\u008b\u008c\3\2\2\2\u008c,\3\2\2\2\u008d\u008f\t\4\2\2\u008e"+
		"\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2"+
		"\2\2\u0091\u0092\3\2\2\2\u0092\u0094\7\60\2\2\u0093\u0095\t\4\2\2\u0094"+
		"\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2"+
		"\2\2\u0097.\3\2\2\2\u0098\u0099\7,\2\2\u0099\60\3\2\2\2\u009a\u009b\7"+
		"\61\2\2\u009b\62\3\2\2\2\u009c\u009d\7-\2\2\u009d\64\3\2\2\2\u009e\u009f"+
		"\7/\2\2\u009f\66\3\2\2\2\u00a0\u00a1\7?\2\2\u00a1\u00a2\7?\2\2\u00a28"+
		"\3\2\2\2\u00a3\u00a5\7\17\2\2\u00a4\u00a3\3\2\2\2\u00a4\u00a5\3\2\2\2"+
		"\u00a5\u00a6\3\2\2\2\u00a6\u00a7\7\f\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9"+
		"\b\35\2\2\u00a9:\3\2\2\2\u00aa\u00ac\t\5\2\2\u00ab\u00aa\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\3\2"+
		"\2\2\u00af\u00b0\b\36\2\2\u00b0<\3\2\2\2\t\2\u0085\u008b\u0090\u0096\u00a4"+
		"\u00ad\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}