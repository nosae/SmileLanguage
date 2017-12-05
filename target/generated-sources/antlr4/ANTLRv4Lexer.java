// Generated from ANTLRv4Lexer.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ANTLRv4Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TOKEN_REF=1, RULE_REF=2, LEXER_CHAR_SET=3, DOC_COMMENT=4, BLOCK_COMMENT=5, 
		LINE_COMMENT=6, BEGIN_ARG_ACTION=7, OPTIONS=8, TOKENS=9, IMPORT=10, FRAGMENT=11, 
		LEXER=12, PARSER=13, GRAMMAR=14, PROTECTED=15, PUBLIC=16, PRIVATE=17, 
		RETURNS=18, LOCALS=19, THROWS=20, CATCH=21, FINALLY=22, MODE=23, COLON=24, 
		COLONCOLON=25, COMMA=26, SEMI=27, LPAREN=28, RPAREN=29, RARROW=30, LT=31, 
		GT=32, ASSIGN=33, QUESTION=34, STAR=35, PLUS=36, PLUS_ASSIGN=37, OR=38, 
		DOLLAR=39, DOT=40, RANGE=41, AT=42, POUND=43, NOT=44, RBRACE=45, ID=46, 
		INT=47, STRING_LITERAL=48, UNTERMINATED_STRING_LITERAL=49, WS=50, ERRCHAR=51, 
		ARG_ACTION=52, UNTERMINATED_ARG_ACTION=53, ACTION=54, UNTERMINATED_ACTION=55, 
		UNTERMINATED_CHAR_SET=56, BEGIN_ACTION=57;
	public static final int
		ArgAction=1, Action=2, LexerCharSet=3;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "ArgAction", "Action", "LexerCharSet"
	};

	public static final String[] ruleNames = {
		"DOC_COMMENT", "BLOCK_COMMENT", "LINE_COMMENT", "BEGIN_ARG_ACTION", "BEGIN_ACTION", 
		"OPTIONS", "TOKENS", "IMPORT", "FRAGMENT", "LEXER", "PARSER", "GRAMMAR", 
		"PROTECTED", "PUBLIC", "PRIVATE", "RETURNS", "LOCALS", "THROWS", "CATCH", 
		"FINALLY", "MODE", "COLON", "COLONCOLON", "COMMA", "SEMI", "LPAREN", "RPAREN", 
		"RARROW", "LT", "GT", "ASSIGN", "QUESTION", "STAR", "PLUS", "PLUS_ASSIGN", 
		"OR", "DOLLAR", "DOT", "RANGE", "AT", "POUND", "NOT", "RBRACE", "ID", 
		"NameChar", "NameStartChar", "INT", "STRING_LITERAL", "UNTERMINATED_STRING_LITERAL", 
		"ESC_SEQ", "UNICODE_ESC", "HEX_DIGIT", "WS", "ERRCHAR", "NESTED_ARG_ACTION", 
		"ARG_ACTION_ESCAPE", "ARG_ACTION_STRING_LITERAL", "ARG_ACTION_CHAR_LITERAL", 
		"ARG_ACTION", "UNTERMINATED_ARG_ACTION", "ARG_ACTION_CHAR", "NESTED_ACTION", 
		"ACTION_ESCAPE", "ACTION_STRING_LITERAL", "ACTION_CHAR_LITERAL", "ACTION_COMMENT", 
		"ACTION", "UNTERMINATED_ACTION", "ACTION_CHAR", "LEXER_CHAR_SET_BODY", 
		"LEXER_CHAR_SET", "UNTERMINATED_CHAR_SET"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "'import'", 
		"'fragment'", "'lexer'", "'parser'", "'grammar'", "'protected'", "'public'", 
		"'private'", "'returns'", "'locals'", "'throws'", "'catch'", "'finally'", 
		"'mode'", "':'", "'::'", "','", "';'", "'('", "')'", "'->'", "'<'", "'>'", 
		"'='", "'?'", "'*'", "'+'", "'+='", "'|'", "'$'", "'.'", "'..'", "'@'", 
		"'#'", "'~'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TOKEN_REF", "RULE_REF", "LEXER_CHAR_SET", "DOC_COMMENT", "BLOCK_COMMENT", 
		"LINE_COMMENT", "BEGIN_ARG_ACTION", "OPTIONS", "TOKENS", "IMPORT", "FRAGMENT", 
		"LEXER", "PARSER", "GRAMMAR", "PROTECTED", "PUBLIC", "PRIVATE", "RETURNS", 
		"LOCALS", "THROWS", "CATCH", "FINALLY", "MODE", "COLON", "COLONCOLON", 
		"COMMA", "SEMI", "LPAREN", "RPAREN", "RARROW", "LT", "GT", "ASSIGN", "QUESTION", 
		"STAR", "PLUS", "PLUS_ASSIGN", "OR", "DOLLAR", "DOT", "RANGE", "AT", "POUND", 
		"NOT", "RBRACE", "ID", "INT", "STRING_LITERAL", "UNTERMINATED_STRING_LITERAL", 
		"WS", "ERRCHAR", "ARG_ACTION", "UNTERMINATED_ARG_ACTION", "ACTION", "UNTERMINATED_ACTION", 
		"UNTERMINATED_CHAR_SET", "BEGIN_ACTION"
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


		/** Track whether we are inside of a rule and whether it is lexical parser.
		 *  _currentRuleType==Token.INVALID_TYPE means that we are outside of a rule.
		 *  At the first sign of a rule name reference and _currentRuleType==invalid,
		 *  we can assume that we are starting a parser rule. Similarly, seeing
		 *  a token reference when not already in rule means starting a token
		 *  rule. The terminating ';' of a rule, flips this back to invalid type.
		 *
		 *  This is not perfect logic but works. For example, "grammar T;" means
		 *  that we start and stop a lexical rule for the "T;". Dangerous but works.
		 *
		 *  The whole point of this state information is to distinguish
		 *  between [..arg actions..] and [charsets]. Char sets can only occur in
		 *  lexical rules and arg actions cannot occur.
		 */
		private int _currentRuleType = Token.INVALID_TYPE;

		public int getCurrentRuleType() {
			return _currentRuleType;
		}

		public void setCurrentRuleType(int ruleType) {
			this._currentRuleType = ruleType;
		}

		protected void handleBeginArgAction() {
			if (inLexerRule()) {
				pushMode(LexerCharSet);
				more();
			}
			else {
				pushMode(ArgAction);
				more();
			}
		}

		@Override
		public Token emit() {
			if (_type == ID) {
				String firstChar = _input.getText(Interval.of(_tokenStartCharIndex, _tokenStartCharIndex));
				if (Character.isUpperCase(firstChar.charAt(0))) {
					_type = TOKEN_REF;
				} else {
					_type = RULE_REF;
				}

				if (_currentRuleType == Token.INVALID_TYPE) { // if outside of rule def
					_currentRuleType = _type;                 // set to inside lexer or parser rule
				}
			}
			else if (_type == SEMI) {                  // exit rule def
				_currentRuleType = Token.INVALID_TYPE;
			}

			return super.emit();
		}

		private boolean inLexerRule() {
			return _currentRuleType == TOKEN_REF;
		}
		private boolean inParserRule() { // not used, but added for clarity
			return _currentRuleType == RULE_REF;
		}


	public ANTLRv4Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ANTLRv4Lexer.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 3:
			BEGIN_ARG_ACTION_action((RuleContext)_localctx, actionIndex);
			break;
		case 66:
			ACTION_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void BEGIN_ARG_ACTION_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			handleBeginArgAction();
			break;
		}
	}
	private void ACTION_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:

			            popMode();
			        	if ( _modeStack.size()>0 ) more(); // keep scarfing until outermost }
			            
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2;\u0231\b\1\b\1\b"+
		"\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t"+
		"\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
		"\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30"+
		"\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37"+
		"\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)"+
		"\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63"+
		"\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;"+
		"\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G"+
		"\tG\4H\tH\4I\tI\3\2\3\2\3\2\3\2\3\2\7\2\u009c\n\2\f\2\16\2\u009f\13\2"+
		"\3\2\3\2\3\2\5\2\u00a4\n\2\3\3\3\3\3\3\3\3\7\3\u00aa\n\3\f\3\16\3\u00ad"+
		"\13\3\3\3\3\3\3\3\5\3\u00b2\n\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4\u00ba\n\4"+
		"\f\4\16\4\u00bd\13\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00d2\n\7\f\7\16\7\u00d5\13\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00e1\n\b\f\b\16\b\u00e4\13\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3&"+
		"\3&\3\'\3\'\3(\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\7-\u0181\n-\f-\16-"+
		"\u0184\13-\3.\3.\5.\u0188\n.\3/\3/\3\60\6\60\u018d\n\60\r\60\16\60\u018e"+
		"\3\61\3\61\3\61\7\61\u0194\n\61\f\61\16\61\u0197\13\61\3\61\3\61\3\62"+
		"\3\62\3\62\7\62\u019e\n\62\f\62\16\62\u01a1\13\62\3\63\3\63\3\63\3\63"+
		"\3\63\5\63\u01a8\n\63\3\64\3\64\3\64\3\64\3\64\5\64\u01af\n\64\5\64\u01b1"+
		"\n\64\5\64\u01b3\n\64\5\64\u01b5\n\64\3\65\3\65\3\66\6\66\u01ba\n\66\r"+
		"\66\16\66\u01bb\3\66\3\66\3\67\3\67\3\67\3\67\38\38\38\38\38\39\39\39"+
		"\39\39\3:\3:\3:\3:\7:\u01d2\n:\f:\16:\u01d5\13:\3:\3:\3:\3:\3;\3;\3;\3"+
		";\3;\5;\u01e0\n;\3;\3;\3<\3<\3<\3<\3=\3=\3=\3=\3>\3>\3>\3>\3?\3?\3?\3"+
		"?\3?\3@\3@\3@\3@\3@\3A\3A\3A\3A\7A\u01fe\nA\fA\16A\u0201\13A\3A\3A\3A"+
		"\3A\3B\3B\3B\3B\3B\5B\u020c\nB\3B\3B\3C\3C\5C\u0212\nC\3C\3C\3D\3D\3D"+
		"\3E\3E\3E\3E\3F\3F\3F\3F\3G\3G\3G\6G\u0224\nG\rG\16G\u0225\3G\3G\3H\3"+
		"H\3H\3H\3I\3I\3I\3I\4\u009d\u00ab\2J\6\6\b\7\n\b\f\t\16;\20\n\22\13\24"+
		"\f\26\r\30\16\32\17\34\20\36\21 \22\"\23$\24&\25(\26*\27,\30.\31\60\32"+
		"\62\33\64\34\66\358\36:\37< >!@\"B#D$F%H&J\'L(N)P*R+T,V-X.Z/\\\60^\2`"+
		"\2b\61d\62f\63h\2j\2l\2n\64p\65r\2t\2v\2x\2z\66|\67~\2\u0080\2\u0082\2"+
		"\u0084\2\u0086\2\u0088\2\u008a8\u008c9\u008e\2\u0090\2\u0092\5\u0094:"+
		"\6\2\3\4\5\f\4\2\f\f\17\17\5\2\13\f\16\17\"\"\7\2\62;aa\u00b9\u00b9\u0302"+
		"\u0371\u2041\u2042\17\2C\\c|\u00c2\u00d8\u00da\u00f8\u00fa\u0301\u0372"+
		"\u037f\u0381\u2001\u200e\u200f\u2072\u2191\u2c02\u2ff1\u3003\ud801\uf902"+
		"\ufdd1\ufdf2\uffff\3\2\62;\6\2\f\f\17\17))^^\n\2$$))^^ddhhppttvv\5\2\62"+
		";CHch\4\2$$^^\3\2^_\2\u0247\2\6\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2\2\2\f\3"+
		"\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2\24\3\2\2\2\2\26\3\2\2"+
		"\2\2\30\3\2\2\2\2\32\3\2\2\2\2\34\3\2\2\2\2\36\3\2\2\2\2 \3\2\2\2\2\""+
		"\3\2\2\2\2$\3\2\2\2\2&\3\2\2\2\2(\3\2\2\2\2*\3\2\2\2\2,\3\2\2\2\2.\3\2"+
		"\2\2\2\60\3\2\2\2\2\62\3\2\2\2\2\64\3\2\2\2\2\66\3\2\2\2\28\3\2\2\2\2"+
		":\3\2\2\2\2<\3\2\2\2\2>\3\2\2\2\2@\3\2\2\2\2B\3\2\2\2\2D\3\2\2\2\2F\3"+
		"\2\2\2\2H\3\2\2\2\2J\3\2\2\2\2L\3\2\2\2\2N\3\2\2\2\2P\3\2\2\2\2R\3\2\2"+
		"\2\2T\3\2\2\2\2V\3\2\2\2\2X\3\2\2\2\2Z\3\2\2\2\2\\\3\2\2\2\2b\3\2\2\2"+
		"\2d\3\2\2\2\2f\3\2\2\2\2n\3\2\2\2\2p\3\2\2\2\3r\3\2\2\2\3t\3\2\2\2\3v"+
		"\3\2\2\2\3x\3\2\2\2\3z\3\2\2\2\3|\3\2\2\2\3~\3\2\2\2\4\u0080\3\2\2\2\4"+
		"\u0082\3\2\2\2\4\u0084\3\2\2\2\4\u0086\3\2\2\2\4\u0088\3\2\2\2\4\u008a"+
		"\3\2\2\2\4\u008c\3\2\2\2\4\u008e\3\2\2\2\5\u0090\3\2\2\2\5\u0092\3\2\2"+
		"\2\5\u0094\3\2\2\2\6\u0096\3\2\2\2\b\u00a5\3\2\2\2\n\u00b5\3\2\2\2\f\u00c0"+
		"\3\2\2\2\16\u00c3\3\2\2\2\20\u00c8\3\2\2\2\22\u00d8\3\2\2\2\24\u00e7\3"+
		"\2\2\2\26\u00ee\3\2\2\2\30\u00f7\3\2\2\2\32\u00fd\3\2\2\2\34\u0104\3\2"+
		"\2\2\36\u010c\3\2\2\2 \u0116\3\2\2\2\"\u011d\3\2\2\2$\u0125\3\2\2\2&\u012d"+
		"\3\2\2\2(\u0134\3\2\2\2*\u013b\3\2\2\2,\u0141\3\2\2\2.\u0149\3\2\2\2\60"+
		"\u014e\3\2\2\2\62\u0150\3\2\2\2\64\u0153\3\2\2\2\66\u0155\3\2\2\28\u0157"+
		"\3\2\2\2:\u0159\3\2\2\2<\u015b\3\2\2\2>\u015e\3\2\2\2@\u0160\3\2\2\2B"+
		"\u0162\3\2\2\2D\u0164\3\2\2\2F\u0166\3\2\2\2H\u0168\3\2\2\2J\u016a\3\2"+
		"\2\2L\u016d\3\2\2\2N\u016f\3\2\2\2P\u0171\3\2\2\2R\u0173\3\2\2\2T\u0176"+
		"\3\2\2\2V\u0178\3\2\2\2X\u017a\3\2\2\2Z\u017c\3\2\2\2\\\u017e\3\2\2\2"+
		"^\u0187\3\2\2\2`\u0189\3\2\2\2b\u018c\3\2\2\2d\u0190\3\2\2\2f\u019a\3"+
		"\2\2\2h\u01a2\3\2\2\2j\u01a9\3\2\2\2l\u01b6\3\2\2\2n\u01b9\3\2\2\2p\u01bf"+
		"\3\2\2\2r\u01c3\3\2\2\2t\u01c8\3\2\2\2v\u01cd\3\2\2\2x\u01df\3\2\2\2z"+
		"\u01e3\3\2\2\2|\u01e7\3\2\2\2~\u01eb\3\2\2\2\u0080\u01ef\3\2\2\2\u0082"+
		"\u01f4\3\2\2\2\u0084\u01f9\3\2\2\2\u0086\u020b\3\2\2\2\u0088\u0211\3\2"+
		"\2\2\u008a\u0215\3\2\2\2\u008c\u0218\3\2\2\2\u008e\u021c\3\2\2\2\u0090"+
		"\u0223\3\2\2\2\u0092\u0229\3\2\2\2\u0094\u022d\3\2\2\2\u0096\u0097\7\61"+
		"\2\2\u0097\u0098\7,\2\2\u0098\u0099\7,\2\2\u0099\u009d\3\2\2\2\u009a\u009c"+
		"\13\2\2\2\u009b\u009a\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009e\3\2\2\2"+
		"\u009d\u009b\3\2\2\2\u009e\u00a3\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a1"+
		"\7,\2\2\u00a1\u00a4\7\61\2\2\u00a2\u00a4\7\2\2\3\u00a3\u00a0\3\2\2\2\u00a3"+
		"\u00a2\3\2\2\2\u00a4\7\3\2\2\2\u00a5\u00a6\7\61\2\2\u00a6\u00a7\7,\2\2"+
		"\u00a7\u00ab\3\2\2\2\u00a8\u00aa\13\2\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ad"+
		"\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00b1\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ae\u00af\7,\2\2\u00af\u00b2\7\61\2\2\u00b0\u00b2\7\2"+
		"\2\3\u00b1\u00ae\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		"\u00b4\b\3\2\2\u00b4\t\3\2\2\2\u00b5\u00b6\7\61\2\2\u00b6\u00b7\7\61\2"+
		"\2\u00b7\u00bb\3\2\2\2\u00b8\u00ba\n\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bd"+
		"\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd"+
		"\u00bb\3\2\2\2\u00be\u00bf\b\4\2\2\u00bf\13\3\2\2\2\u00c0\u00c1\7]\2\2"+
		"\u00c1\u00c2\b\5\3\2\u00c2\r\3\2\2\2\u00c3\u00c4\7}\2\2\u00c4\u00c5\3"+
		"\2\2\2\u00c5\u00c6\b\6\4\2\u00c6\u00c7\b\6\5\2\u00c7\17\3\2\2\2\u00c8"+
		"\u00c9\7q\2\2\u00c9\u00ca\7r\2\2\u00ca\u00cb\7v\2\2\u00cb\u00cc\7k\2\2"+
		"\u00cc\u00cd\7q\2\2\u00cd\u00ce\7p\2\2\u00ce\u00cf\7u\2\2\u00cf\u00d3"+
		"\3\2\2\2\u00d0\u00d2\t\3\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3"+
		"\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00d3\3\2"+
		"\2\2\u00d6\u00d7\7}\2\2\u00d7\21\3\2\2\2\u00d8\u00d9\7v\2\2\u00d9\u00da"+
		"\7q\2\2\u00da\u00db\7m\2\2\u00db\u00dc\7g\2\2\u00dc\u00dd\7p\2\2\u00dd"+
		"\u00de\7u\2\2\u00de\u00e2\3\2\2\2\u00df\u00e1\t\3\2\2\u00e0\u00df\3\2"+
		"\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3"+
		"\u00e5\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e6\7}\2\2\u00e6\23\3\2\2\2"+
		"\u00e7\u00e8\7k\2\2\u00e8\u00e9\7o\2\2\u00e9\u00ea\7r\2\2\u00ea\u00eb"+
		"\7q\2\2\u00eb\u00ec\7t\2\2\u00ec\u00ed\7v\2\2\u00ed\25\3\2\2\2\u00ee\u00ef"+
		"\7h\2\2\u00ef\u00f0\7t\2\2\u00f0\u00f1\7c\2\2\u00f1\u00f2\7i\2\2\u00f2"+
		"\u00f3\7o\2\2\u00f3\u00f4\7g\2\2\u00f4\u00f5\7p\2\2\u00f5\u00f6\7v\2\2"+
		"\u00f6\27\3\2\2\2\u00f7\u00f8\7n\2\2\u00f8\u00f9\7g\2\2\u00f9\u00fa\7"+
		"z\2\2\u00fa\u00fb\7g\2\2\u00fb\u00fc\7t\2\2\u00fc\31\3\2\2\2\u00fd\u00fe"+
		"\7r\2\2\u00fe\u00ff\7c\2\2\u00ff\u0100\7t\2\2\u0100\u0101\7u\2\2\u0101"+
		"\u0102\7g\2\2\u0102\u0103\7t\2\2\u0103\33\3\2\2\2\u0104\u0105\7i\2\2\u0105"+
		"\u0106\7t\2\2\u0106\u0107\7c\2\2\u0107\u0108\7o\2\2\u0108\u0109\7o\2\2"+
		"\u0109\u010a\7c\2\2\u010a\u010b\7t\2\2\u010b\35\3\2\2\2\u010c\u010d\7"+
		"r\2\2\u010d\u010e\7t\2\2\u010e\u010f\7q\2\2\u010f\u0110\7v\2\2\u0110\u0111"+
		"\7g\2\2\u0111\u0112\7e\2\2\u0112\u0113\7v\2\2\u0113\u0114\7g\2\2\u0114"+
		"\u0115\7f\2\2\u0115\37\3\2\2\2\u0116\u0117\7r\2\2\u0117\u0118\7w\2\2\u0118"+
		"\u0119\7d\2\2\u0119\u011a\7n\2\2\u011a\u011b\7k\2\2\u011b\u011c\7e\2\2"+
		"\u011c!\3\2\2\2\u011d\u011e\7r\2\2\u011e\u011f\7t\2\2\u011f\u0120\7k\2"+
		"\2\u0120\u0121\7x\2\2\u0121\u0122\7c\2\2\u0122\u0123\7v\2\2\u0123\u0124"+
		"\7g\2\2\u0124#\3\2\2\2\u0125\u0126\7t\2\2\u0126\u0127\7g\2\2\u0127\u0128"+
		"\7v\2\2\u0128\u0129\7w\2\2\u0129\u012a\7t\2\2\u012a\u012b\7p\2\2\u012b"+
		"\u012c\7u\2\2\u012c%\3\2\2\2\u012d\u012e\7n\2\2\u012e\u012f\7q\2\2\u012f"+
		"\u0130\7e\2\2\u0130\u0131\7c\2\2\u0131\u0132\7n\2\2\u0132\u0133\7u\2\2"+
		"\u0133\'\3\2\2\2\u0134\u0135\7v\2\2\u0135\u0136\7j\2\2\u0136\u0137\7t"+
		"\2\2\u0137\u0138\7q\2\2\u0138\u0139\7y\2\2\u0139\u013a\7u\2\2\u013a)\3"+
		"\2\2\2\u013b\u013c\7e\2\2\u013c\u013d\7c\2\2\u013d\u013e\7v\2\2\u013e"+
		"\u013f\7e\2\2\u013f\u0140\7j\2\2\u0140+\3\2\2\2\u0141\u0142\7h\2\2\u0142"+
		"\u0143\7k\2\2\u0143\u0144\7p\2\2\u0144\u0145\7c\2\2\u0145\u0146\7n\2\2"+
		"\u0146\u0147\7n\2\2\u0147\u0148\7{\2\2\u0148-\3\2\2\2\u0149\u014a\7o\2"+
		"\2\u014a\u014b\7q\2\2\u014b\u014c\7f\2\2\u014c\u014d\7g\2\2\u014d/\3\2"+
		"\2\2\u014e\u014f\7<\2\2\u014f\61\3\2\2\2\u0150\u0151\7<\2\2\u0151\u0152"+
		"\7<\2\2\u0152\63\3\2\2\2\u0153\u0154\7.\2\2\u0154\65\3\2\2\2\u0155\u0156"+
		"\7=\2\2\u0156\67\3\2\2\2\u0157\u0158\7*\2\2\u01589\3\2\2\2\u0159\u015a"+
		"\7+\2\2\u015a;\3\2\2\2\u015b\u015c\7/\2\2\u015c\u015d\7@\2\2\u015d=\3"+
		"\2\2\2\u015e\u015f\7>\2\2\u015f?\3\2\2\2\u0160\u0161\7@\2\2\u0161A\3\2"+
		"\2\2\u0162\u0163\7?\2\2\u0163C\3\2\2\2\u0164\u0165\7A\2\2\u0165E\3\2\2"+
		"\2\u0166\u0167\7,\2\2\u0167G\3\2\2\2\u0168\u0169\7-\2\2\u0169I\3\2\2\2"+
		"\u016a\u016b\7-\2\2\u016b\u016c\7?\2\2\u016cK\3\2\2\2\u016d\u016e\7~\2"+
		"\2\u016eM\3\2\2\2\u016f\u0170\7&\2\2\u0170O\3\2\2\2\u0171\u0172\7\60\2"+
		"\2\u0172Q\3\2\2\2\u0173\u0174\7\60\2\2\u0174\u0175\7\60\2\2\u0175S\3\2"+
		"\2\2\u0176\u0177\7B\2\2\u0177U\3\2\2\2\u0178\u0179\7%\2\2\u0179W\3\2\2"+
		"\2\u017a\u017b\7\u0080\2\2\u017bY\3\2\2\2\u017c\u017d\7\177\2\2\u017d"+
		"[\3\2\2\2\u017e\u0182\5`/\2\u017f\u0181\5^.\2\u0180\u017f\3\2\2\2\u0181"+
		"\u0184\3\2\2\2\u0182\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183]\3\2\2\2"+
		"\u0184\u0182\3\2\2\2\u0185\u0188\5`/\2\u0186\u0188\t\4\2\2\u0187\u0185"+
		"\3\2\2\2\u0187\u0186\3\2\2\2\u0188_\3\2\2\2\u0189\u018a\t\5\2\2\u018a"+
		"a\3\2\2\2\u018b\u018d\t\6\2\2\u018c\u018b\3\2\2\2\u018d\u018e\3\2\2\2"+
		"\u018e\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018fc\3\2\2\2\u0190\u0195\7"+
		")\2\2\u0191\u0194\5h\63\2\u0192\u0194\n\7\2\2\u0193\u0191\3\2\2\2\u0193"+
		"\u0192\3\2\2\2\u0194\u0197\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2"+
		"\2\2\u0196\u0198\3\2\2\2\u0197\u0195\3\2\2\2\u0198\u0199\7)\2\2\u0199"+
		"e\3\2\2\2\u019a\u019f\7)\2\2\u019b\u019e\5h\63\2\u019c\u019e\n\7\2\2\u019d"+
		"\u019b\3\2\2\2\u019d\u019c\3\2\2\2\u019e\u01a1\3\2\2\2\u019f\u019d\3\2"+
		"\2\2\u019f\u01a0\3\2\2\2\u01a0g\3\2\2\2\u01a1\u019f\3\2\2\2\u01a2\u01a7"+
		"\7^\2\2\u01a3\u01a8\t\b\2\2\u01a4\u01a8\5j\64\2\u01a5\u01a8\13\2\2\2\u01a6"+
		"\u01a8\7\2\2\3\u01a7\u01a3\3\2\2\2\u01a7\u01a4\3\2\2\2\u01a7\u01a5\3\2"+
		"\2\2\u01a7\u01a6\3\2\2\2\u01a8i\3\2\2\2\u01a9\u01b4\7w\2\2\u01aa\u01b2"+
		"\5l\65\2\u01ab\u01b0\5l\65\2\u01ac\u01ae\5l\65\2\u01ad\u01af\5l\65\2\u01ae"+
		"\u01ad\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b1\3\2\2\2\u01b0\u01ac\3\2"+
		"\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b3\3\2\2\2\u01b2\u01ab\3\2\2\2\u01b2"+
		"\u01b3\3\2\2\2\u01b3\u01b5\3\2\2\2\u01b4\u01aa\3\2\2\2\u01b4\u01b5\3\2"+
		"\2\2\u01b5k\3\2\2\2\u01b6\u01b7\t\t\2\2\u01b7m\3\2\2\2\u01b8\u01ba\t\3"+
		"\2\2\u01b9\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bb"+
		"\u01bc\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01be\b\66\2\2\u01beo\3\2\2\2"+
		"\u01bf\u01c0\13\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c2\b\67\2\2\u01c2q"+
		"\3\2\2\2\u01c3\u01c4\7]\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c6\b8\4\2\u01c6"+
		"\u01c7\b8\6\2\u01c7s\3\2\2\2\u01c8\u01c9\7^\2\2\u01c9\u01ca\13\2\2\2\u01ca"+
		"\u01cb\3\2\2\2\u01cb\u01cc\b9\4\2\u01ccu\3\2\2\2\u01cd\u01d3\7$\2\2\u01ce"+
		"\u01cf\7^\2\2\u01cf\u01d2\13\2\2\2\u01d0\u01d2\n\n\2\2\u01d1\u01ce\3\2"+
		"\2\2\u01d1\u01d0\3\2\2\2\u01d2\u01d5\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d3"+
		"\u01d4\3\2\2\2\u01d4\u01d6\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d6\u01d7\7$"+
		"\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01d9\b:\4\2\u01d9w\3\2\2\2\u01da\u01db"+
		"\7$\2\2\u01db\u01dc\7^\2\2\u01dc\u01e0\13\2\2\2\u01dd\u01de\n\n\2\2\u01de"+
		"\u01e0\7$\2\2\u01df\u01da\3\2\2\2\u01df\u01dd\3\2\2\2\u01e0\u01e1\3\2"+
		"\2\2\u01e1\u01e2\b;\4\2\u01e2y\3\2\2\2\u01e3\u01e4\7_\2\2\u01e4\u01e5"+
		"\3\2\2\2\u01e5\u01e6\b<\7\2\u01e6{\3\2\2\2\u01e7\u01e8\7\2\2\3\u01e8\u01e9"+
		"\3\2\2\2\u01e9\u01ea\b=\7\2\u01ea}\3\2\2\2\u01eb\u01ec\13\2\2\2\u01ec"+
		"\u01ed\3\2\2\2\u01ed\u01ee\b>\4\2\u01ee\177\3\2\2\2\u01ef\u01f0\7}\2\2"+
		"\u01f0\u01f1\3\2\2\2\u01f1\u01f2\b?\4\2\u01f2\u01f3\b?\5\2\u01f3\u0081"+
		"\3\2\2\2\u01f4\u01f5\7^\2\2\u01f5\u01f6\13\2\2\2\u01f6\u01f7\3\2\2\2\u01f7"+
		"\u01f8\b@\4\2\u01f8\u0083\3\2\2\2\u01f9\u01ff\7$\2\2\u01fa\u01fb\7^\2"+
		"\2\u01fb\u01fe\13\2\2\2\u01fc\u01fe\n\n\2\2\u01fd\u01fa\3\2\2\2\u01fd"+
		"\u01fc\3\2\2\2\u01fe\u0201\3\2\2\2\u01ff\u01fd\3\2\2\2\u01ff\u0200\3\2"+
		"\2\2\u0200\u0202\3\2\2\2\u0201\u01ff\3\2\2\2\u0202\u0203\7$\2\2\u0203"+
		"\u0204\3\2\2\2\u0204\u0205\bA\4\2\u0205\u0085\3\2\2\2\u0206\u0207\7$\2"+
		"\2\u0207\u0208\7^\2\2\u0208\u020c\13\2\2\2\u0209\u020a\n\n\2\2\u020a\u020c"+
		"\7$\2\2\u020b\u0206\3\2\2\2\u020b\u0209\3\2\2\2\u020c\u020d\3\2\2\2\u020d"+
		"\u020e\bB\4\2\u020e\u0087\3\2\2\2\u020f\u0212\5\b\3\2\u0210\u0212\5\n"+
		"\4\2\u0211\u020f\3\2\2\2\u0211\u0210\3\2\2\2\u0212\u0213\3\2\2\2\u0213"+
		"\u0214\bC\4\2\u0214\u0089\3\2\2\2\u0215\u0216\7\177\2\2\u0216\u0217\b"+
		"D\b\2\u0217\u008b\3\2\2\2\u0218\u0219\7\2\2\3\u0219\u021a\3\2\2\2\u021a"+
		"\u021b\bE\7\2\u021b\u008d\3\2\2\2\u021c\u021d\13\2\2\2\u021d\u021e\3\2"+
		"\2\2\u021e\u021f\bF\4\2\u021f\u008f\3\2\2\2\u0220\u0224\n\13\2\2\u0221"+
		"\u0222\7^\2\2\u0222\u0224\13\2\2\2\u0223\u0220\3\2\2\2\u0223\u0221\3\2"+
		"\2\2\u0224\u0225\3\2\2\2\u0225\u0223\3\2\2\2\u0225\u0226\3\2\2\2\u0226"+
		"\u0227\3\2\2\2\u0227\u0228\bG\4\2\u0228\u0091\3\2\2\2\u0229\u022a\7_\2"+
		"\2\u022a\u022b\3\2\2\2\u022b\u022c\bH\7\2\u022c\u0093\3\2\2\2\u022d\u022e"+
		"\7\2\2\3\u022e\u022f\3\2\2\2\u022f\u0230\bI\7\2\u0230\u0095\3\2\2\2#\2"+
		"\3\4\5\u009d\u00a3\u00ab\u00b1\u00bb\u00d3\u00e2\u0182\u0187\u018e\u0193"+
		"\u0195\u019d\u019f\u01a7\u01ae\u01b0\u01b2\u01b4\u01bb\u01d1\u01d3\u01df"+
		"\u01fd\u01ff\u020b\u0211\u0223\u0225\t\2\3\2\3\5\2\5\2\2\7\4\2\7\3\2\6"+
		"\2\2\3D\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}