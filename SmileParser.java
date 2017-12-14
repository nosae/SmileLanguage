// Generated from Smile.g4 by ANTLR 4.7

    import wci.intermediate.*;
    import wci.intermediate.symtabimpl.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SmileParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, PROGRAM=11, VAR=12, START=13, STOP=14, IF=15, WHILE=16, DO=17, 
		THEN=18, ELSE=19, PRINT=20, IDENTIFIER=21, INTEGER=22, FLOAT=23, STRING=24, 
		MUL_OP=25, DIV_OP=26, ADD_OP=27, SUB_OP=28, EQ=29, NE=30, LT=31, GT=32, 
		NEWLINE=33, WS=34;
	public static final int
		RULE_program = 0, RULE_header = 1, RULE_mainBlock = 2, RULE_block = 3, 
		RULE_declarations = 4, RULE_declList = 5, RULE_decl = 6, RULE_varList = 7, 
		RULE_varId = 8, RULE_typeId = 9, RULE_compoundStmt = 10, RULE_stmt = 11, 
		RULE_stmtList = 12, RULE_assignmentStmt = 13, RULE_ifStatement = 14, RULE_whileStatement = 15, 
		RULE_printStmt = 16, RULE_parenthesis = 17, RULE_literal = 18, RULE_stringLiteral = 19, 
		RULE_exprLiteral = 20, RULE_variable = 21, RULE_expr = 22, RULE_mulDivOp = 23, 
		RULE_addSubOp = 24, RULE_relOp = 25, RULE_signedNumber = 26, RULE_sign = 27, 
		RULE_number = 28;
	public static final String[] ruleNames = {
		"program", "header", "mainBlock", "block", "declarations", "declList", 
		"decl", "varList", "varId", "typeId", "compoundStmt", "stmt", "stmtList", 
		"assignmentStmt", "ifStatement", "whileStatement", "printStmt", "parenthesis", 
		"literal", "stringLiteral", "exprLiteral", "variable", "expr", "mulDivOp", 
		"addSubOp", "relOp", "signedNumber", "sign", "number"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", "';'", "';)'", "':)'", "','", "'=)'", "'print'", "'_'", "'('", 
		"')'", "'PROGRAM'", "'VAR'", "'START'", "'STOP'", "'IF'", "'WHILE'", "'DO'", 
		"'THEN'", "'ELSE'", "'PRINT'", null, null, null, null, "'*'", "'/'", "'+'", 
		"'-'", "'=='", "'!='", "'<'", "'>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "PROGRAM", 
		"VAR", "START", "STOP", "IF", "WHILE", "DO", "THEN", "ELSE", "PRINT", 
		"IDENTIFIER", "INTEGER", "FLOAT", "STRING", "MUL_OP", "DIV_OP", "ADD_OP", 
		"SUB_OP", "EQ", "NE", "LT", "GT", "NEWLINE", "WS"
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

	@Override
	public String getGrammarFileName() { return "Smile.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SmileParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public MainBlockContext mainBlock() {
			return getRuleContext(MainBlockContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmileListener ) ((SmileListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmileListener ) ((SmileListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			header();
			setState(59);
			mainBlock();
			setState(60);
			match(T__0);
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

	public static class HeaderContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(SmileParser.PROGRAM, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SmileParser.IDENTIFIER, 0); }
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmileListener ) ((SmileListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmileListener ) ((SmileListener)listener).exitHeader(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(PROGRAM);
			setState(63);
			match(IDENTIFIER);
			setState(64);
			match(T__1);
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

	public static class MainBlockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MainBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmileListener ) ((SmileListener)listener).enterMainBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmileListener ) ((SmileListener)listener).exitMainBlock(this);
		}
	}

	public final MainBlockContext mainBlock() throws RecognitionException {
		MainBlockContext _localctx = new MainBlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mainBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			block();
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

	public static class BlockContext extends ParserRuleContext {
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public CompoundStmtContext compoundStmt() {
			return getRuleContext(CompoundStmtContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmileListener ) ((SmileListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmileListener ) ((SmileListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			declarations();
			setState(69);
			compoundStmt();
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

	public static class DeclarationsContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(SmileParser.VAR, 0); }
		public DeclListContext declList() {
			return getRuleContext(DeclListContext.class,0);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmileListener ) ((SmileListener)listener).enterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmileListener ) ((SmileListener)listener).exitDeclarations(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declarations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(VAR);
			setState(72);
			declList();
			setState(73);
			match(T__2);
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

	public static class DeclListContext extends ParserRuleContext {
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public DeclListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmileListener ) ((SmileListener)listener).enterDeclList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmileListener ) ((SmileListener)listener).exitDeclList(this);
		}
	}

	public final DeclListContext declList() throws RecognitionException {
		DeclListContext _localctx = new DeclListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			decl();
			setState(80);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(76);
					match(T__2);
					setState(77);
					decl();
					}
					} 
				}
				setState(82);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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

	public static class DeclContext extends ParserRuleContext {
		public VarListContext varList() {
			return getRuleContext(VarListContext.class,0);
		}
		public TypeIdContext typeId() {
			return getRuleContext(TypeIdContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmileListener ) ((SmileListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmileListener ) ((SmileListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			varList();
			setState(84);
			match(T__3);
			setState(85);
			typeId();
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

	public static class VarListContext extends ParserRuleContext {
		public List<VarIdContext> varId() {
			return getRuleContexts(VarIdContext.class);
		}
		public VarIdContext varId(int i) {
			return getRuleContext(VarIdContext.class,i);
		}
		public VarListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmileListener ) ((SmileListener)listener).enterVarList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmileListener ) ((SmileListener)listener).exitVarList(this);
		}
	}

	public final VarListContext varList() throws RecognitionException {
		VarListContext _localctx = new VarListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_varList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			varId();
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(88);
				match(T__4);
				setState(89);
				varId();
				}
				}
				setState(94);
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

	public static class VarIdContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SmileParser.IDENTIFIER, 0); }
		public VarIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmileListener ) ((SmileListener)listener).enterVarId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmileListener ) ((SmileListener)listener).exitVarId(this);
		}
	}

	public final VarIdContext varId() throws RecognitionException {
		VarIdContext _localctx = new VarIdContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_varId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(IDENTIFIER);
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

	public static class TypeIdContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SmileParser.IDENTIFIER, 0); }
		public TypeIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmileListener ) ((SmileListener)listener).enterTypeId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmileListener ) ((SmileListener)listener).exitTypeId(this);
		}
	}

	public final TypeIdContext typeId() throws RecognitionException {
		TypeIdContext _localctx = new TypeIdContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_typeId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(IDENTIFIER);
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

	public static class CompoundStmtContext extends ParserRuleContext {
		public TerminalNode START() { return getToken(SmileParser.START, 0); }
		public StmtListContext stmtList() {
			return getRuleContext(StmtListContext.class,0);
		}
		public TerminalNode STOP() { return getToken(SmileParser.STOP, 0); }
		public CompoundStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmileListener ) ((SmileListener)listener).enterCompoundStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmileListener ) ((SmileListener)listener).exitCompoundStmt(this);
		}
	}

	public final CompoundStmtContext compoundStmt() throws RecognitionException {
		CompoundStmtContext _localctx = new CompoundStmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_compoundStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(START);
			setState(100);
			stmtList();
			setState(101);
			match(T__2);
			setState(102);
			match(STOP);
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

	public static class StmtContext extends ParserRuleContext {
		public CompoundStmtContext compoundStmt() {
			return getRuleContext(CompoundStmtContext.class,0);
		}
		public AssignmentStmtContext assignmentStmt() {
			return getRuleContext(AssignmentStmtContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public PrintStmtContext printStmt() {
			return getRuleContext(PrintStmtContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmileListener ) ((SmileListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmileListener ) ((SmileListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_stmt);
		try {
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case START:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				compoundStmt();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				assignmentStmt();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				ifStatement();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 4);
				{
				setState(107);
				printStmt();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 5);
				{
				setState(108);
				whileStatement();
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

	public static class StmtListContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public StmtListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmileListener ) ((SmileListener)listener).enterStmtList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmileListener ) ((SmileListener)listener).exitStmtList(this);
		}
	}

	public final StmtListContext stmtList() throws RecognitionException {
		StmtListContext _localctx = new StmtListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_stmtList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			stmt();
			setState(116);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(112);
					match(T__2);
					setState(113);
					stmt();
					}
					} 
				}
				setState(118);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class AssignmentStmtContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmileListener ) ((SmileListener)listener).enterAssignmentStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmileListener ) ((SmileListener)listener).exitAssignmentStmt(this);
		}
	}

	public final AssignmentStmtContext assignmentStmt() throws RecognitionException {
		AssignmentStmtContext _localctx = new AssignmentStmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignmentStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			variable();
			setState(120);
			match(T__5);
			setState(121);
			expr(0);
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

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(SmileParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode THEN() { return getToken(SmileParser.THEN, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SmileParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmileListener ) ((SmileListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmileListener ) ((SmileListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(IF);
			setState(124);
			expr(0);
			setState(125);
			match(THEN);
			setState(126);
			stmt();
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(127);
				match(ELSE);
				setState(128);
				stmt();
				}
				break;
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

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(SmileParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DO() { return getToken(SmileParser.DO, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmileListener ) ((SmileListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmileListener ) ((SmileListener)listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(WHILE);
			setState(132);
			expr(0);
			setState(133);
			match(DO);
			setState(134);
			stmt();
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

	public static class PrintStmtContext extends ParserRuleContext {
		public ParenthesisContext parenthesis() {
			return getRuleContext(ParenthesisContext.class,0);
		}
		public PrintStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmileListener ) ((SmileListener)listener).enterPrintStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmileListener ) ((SmileListener)listener).exitPrintStmt(this);
		}
	}

	public final PrintStmtContext printStmt() throws RecognitionException {
		PrintStmtContext _localctx = new PrintStmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_printStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(T__6);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(137);
				match(T__7);
				}
			}

			setState(140);
			parenthesis();
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

	public static class ParenthesisContext extends ParserRuleContext {
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public ParenthesisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmileListener ) ((SmileListener)listener).enterParenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmileListener ) ((SmileListener)listener).exitParenthesis(this);
		}
	}

	public final ParenthesisContext parenthesis() throws RecognitionException {
		ParenthesisContext _localctx = new ParenthesisContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_parenthesis);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(T__8);
			setState(146);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(143);
					literal();
					}
					} 
				}
				setState(148);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__8) | (1L << IDENTIFIER) | (1L << INTEGER) | (1L << FLOAT) | (1L << STRING) | (1L << ADD_OP) | (1L << SUB_OP))) != 0)) {
				{
				{
				setState(150);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(149);
					_la = _input.LA(1);
					if ( !(_la==T__4 || _la==ADD_OP) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(152);
				literal();
				}
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(158);
			match(T__9);
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

	public static class LiteralContext extends ParserRuleContext {
		public ExprLiteralContext exprLiteral() {
			return getRuleContext(ExprLiteralContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmileListener ) ((SmileListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmileListener ) ((SmileListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_literal);
		try {
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case IDENTIFIER:
			case INTEGER:
			case FLOAT:
			case ADD_OP:
			case SUB_OP:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				exprLiteral();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				stringLiteral();
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

	public static class StringLiteralContext extends ParserRuleContext {
		public TypeSpec type = null;
		public TerminalNode STRING() { return getToken(SmileParser.STRING, 0); }
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmileListener ) ((SmileListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmileListener ) ((SmileListener)listener).exitStringLiteral(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(STRING);
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

	public static class ExprLiteralContext extends ParserRuleContext {
		public TypeSpec type = null;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmileListener ) ((SmileListener)listener).enterExprLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmileListener ) ((SmileListener)listener).exitExprLiteral(this);
		}
	}

	public final ExprLiteralContext exprLiteral() throws RecognitionException {
		ExprLiteralContext _localctx = new ExprLiteralContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_exprLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			expr(0);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SmileParser.IDENTIFIER, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmileListener ) ((SmileListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmileListener ) ((SmileListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(IDENTIFIER);
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

	public static class ExprContext extends ParserRuleContext {
		public TypeSpec type = null;
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
			this.type = ctx.type;
		}
	}
	public static class VariableExprContext extends ExprContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public VariableExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmileListener ) ((SmileListener)listener).enterVariableExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmileListener ) ((SmileListener)listener).exitVariableExpr(this);
		}
	}
	public static class AddSubExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AddSubOpContext addSubOp() {
			return getRuleContext(AddSubOpContext.class,0);
		}
		public AddSubExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmileListener ) ((SmileListener)listener).enterAddSubExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmileListener ) ((SmileListener)listener).exitAddSubExpr(this);
		}
	}
	public static class RelOpExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public RelOpContext relOp() {
			return getRuleContext(RelOpContext.class,0);
		}
		public RelOpExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmileListener ) ((SmileListener)listener).enterRelOpExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmileListener ) ((SmileListener)listener).exitRelOpExpr(this);
		}
	}
	public static class UnsignedNumberExprContext extends ExprContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public UnsignedNumberExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmileListener ) ((SmileListener)listener).enterUnsignedNumberExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmileListener ) ((SmileListener)listener).exitUnsignedNumberExpr(this);
		}
	}
	public static class MulDivExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MulDivOpContext mulDivOp() {
			return getRuleContext(MulDivOpContext.class,0);
		}
		public MulDivExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmileListener ) ((SmileListener)listener).enterMulDivExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmileListener ) ((SmileListener)listener).exitMulDivExpr(this);
		}
	}
	public static class ParenExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmileListener ) ((SmileListener)listener).enterParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmileListener ) ((SmileListener)listener).exitParenExpr(this);
		}
	}
	public static class SignedNumberExprContext extends ExprContext {
		public SignedNumberContext signedNumber() {
			return getRuleContext(SignedNumberContext.class,0);
		}
		public SignedNumberExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmileListener ) ((SmileListener)listener).enterSignedNumberExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmileListener ) ((SmileListener)listener).exitSignedNumberExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
			case FLOAT:
				{
				_localctx = new UnsignedNumberExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(171);
				number();
				}
				break;
			case ADD_OP:
			case SUB_OP:
				{
				_localctx = new SignedNumberExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(172);
				signedNumber();
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new VariableExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(173);
				variable();
				}
				break;
			case T__8:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(174);
				match(T__8);
				setState(175);
				expr(0);
				setState(176);
				match(T__9);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(194);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(192);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(180);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(181);
						mulDivOp();
						setState(182);
						expr(8);
						}
						break;
					case 2:
						{
						_localctx = new AddSubExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(184);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(185);
						addSubOp();
						setState(186);
						expr(7);
						}
						break;
					case 3:
						{
						_localctx = new RelOpExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(188);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(189);
						relOp();
						setState(190);
						expr(6);
						}
						break;
					}
					} 
				}
				setState(196);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MulDivOpContext extends ParserRuleContext {
		public TerminalNode MUL_OP() { return getToken(SmileParser.MUL_OP, 0); }
		public TerminalNode DIV_OP() { return getToken(SmileParser.DIV_OP, 0); }
		public MulDivOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulDivOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmileListener ) ((SmileListener)listener).enterMulDivOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmileListener ) ((SmileListener)listener).exitMulDivOp(this);
		}
	}

	public final MulDivOpContext mulDivOp() throws RecognitionException {
		MulDivOpContext _localctx = new MulDivOpContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_mulDivOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_la = _input.LA(1);
			if ( !(_la==MUL_OP || _la==DIV_OP) ) {
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

	public static class AddSubOpContext extends ParserRuleContext {
		public TerminalNode ADD_OP() { return getToken(SmileParser.ADD_OP, 0); }
		public TerminalNode SUB_OP() { return getToken(SmileParser.SUB_OP, 0); }
		public AddSubOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addSubOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmileListener ) ((SmileListener)listener).enterAddSubOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmileListener ) ((SmileListener)listener).exitAddSubOp(this);
		}
	}

	public final AddSubOpContext addSubOp() throws RecognitionException {
		AddSubOpContext _localctx = new AddSubOpContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_addSubOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_la = _input.LA(1);
			if ( !(_la==ADD_OP || _la==SUB_OP) ) {
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

	public static class RelOpContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(SmileParser.EQ, 0); }
		public TerminalNode NE() { return getToken(SmileParser.NE, 0); }
		public TerminalNode LT() { return getToken(SmileParser.LT, 0); }
		public TerminalNode GT() { return getToken(SmileParser.GT, 0); }
		public RelOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmileListener ) ((SmileListener)listener).enterRelOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmileListener ) ((SmileListener)listener).exitRelOp(this);
		}
	}

	public final RelOpContext relOp() throws RecognitionException {
		RelOpContext _localctx = new RelOpContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_relOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NE) | (1L << LT) | (1L << GT))) != 0)) ) {
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

	public static class SignedNumberContext extends ParserRuleContext {
		public TypeSpec type = null;
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public SignedNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmileListener ) ((SmileListener)listener).enterSignedNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmileListener ) ((SmileListener)listener).exitSignedNumber(this);
		}
	}

	public final SignedNumberContext signedNumber() throws RecognitionException {
		SignedNumberContext _localctx = new SignedNumberContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_signedNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			sign();
			setState(204);
			number();
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

	public static class SignContext extends ParserRuleContext {
		public TerminalNode ADD_OP() { return getToken(SmileParser.ADD_OP, 0); }
		public TerminalNode SUB_OP() { return getToken(SmileParser.SUB_OP, 0); }
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmileListener ) ((SmileListener)listener).enterSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmileListener ) ((SmileListener)listener).exitSign(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			_la = _input.LA(1);
			if ( !(_la==ADD_OP || _la==SUB_OP) ) {
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

	public static class NumberContext extends ParserRuleContext {
		public TypeSpec type = null;
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
			this.type = ctx.type;
		}
	}
	public static class FloatConstContext extends NumberContext {
		public TerminalNode FLOAT() { return getToken(SmileParser.FLOAT, 0); }
		public FloatConstContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmileListener ) ((SmileListener)listener).enterFloatConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmileListener ) ((SmileListener)listener).exitFloatConst(this);
		}
	}
	public static class IntegerConstContext extends NumberContext {
		public TerminalNode INTEGER() { return getToken(SmileParser.INTEGER, 0); }
		public IntegerConstContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmileListener ) ((SmileListener)listener).enterIntegerConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmileListener ) ((SmileListener)listener).exitIntegerConst(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_number);
		try {
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				_localctx = new IntegerConstContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				match(INTEGER);
				}
				break;
			case FLOAT:
				_localctx = new FloatConstContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				match(FLOAT);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 22:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u00d7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\7\7Q\n\7"+
		"\f\7\16\7T\13\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\7\t]\n\t\f\t\16\t`\13\t\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\5\rp\n\r\3\16"+
		"\3\16\3\16\7\16u\n\16\f\16\16\16x\13\16\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u0084\n\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\5\22\u008d\n\22\3\22\3\22\3\23\3\23\7\23\u0093\n\23\f\23\16\23\u0096"+
		"\13\23\3\23\5\23\u0099\n\23\3\23\7\23\u009c\n\23\f\23\16\23\u009f\13\23"+
		"\3\23\3\23\3\24\3\24\5\24\u00a5\n\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00b5\n\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u00c3\n\30\f\30\16\30\u00c6"+
		"\13\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\5\36\u00d5\n\36\3\36\2\3.\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 "+
		"\"$&(*,.\60\62\64\668:\2\6\4\2\7\7\35\35\3\2\33\34\3\2\35\36\3\2\37\""+
		"\2\u00cd\2<\3\2\2\2\4@\3\2\2\2\6D\3\2\2\2\bF\3\2\2\2\nI\3\2\2\2\fM\3\2"+
		"\2\2\16U\3\2\2\2\20Y\3\2\2\2\22a\3\2\2\2\24c\3\2\2\2\26e\3\2\2\2\30o\3"+
		"\2\2\2\32q\3\2\2\2\34y\3\2\2\2\36}\3\2\2\2 \u0085\3\2\2\2\"\u008a\3\2"+
		"\2\2$\u0090\3\2\2\2&\u00a4\3\2\2\2(\u00a6\3\2\2\2*\u00a8\3\2\2\2,\u00aa"+
		"\3\2\2\2.\u00b4\3\2\2\2\60\u00c7\3\2\2\2\62\u00c9\3\2\2\2\64\u00cb\3\2"+
		"\2\2\66\u00cd\3\2\2\28\u00d0\3\2\2\2:\u00d4\3\2\2\2<=\5\4\3\2=>\5\6\4"+
		"\2>?\7\3\2\2?\3\3\2\2\2@A\7\r\2\2AB\7\27\2\2BC\7\4\2\2C\5\3\2\2\2DE\5"+
		"\b\5\2E\7\3\2\2\2FG\5\n\6\2GH\5\26\f\2H\t\3\2\2\2IJ\7\16\2\2JK\5\f\7\2"+
		"KL\7\5\2\2L\13\3\2\2\2MR\5\16\b\2NO\7\5\2\2OQ\5\16\b\2PN\3\2\2\2QT\3\2"+
		"\2\2RP\3\2\2\2RS\3\2\2\2S\r\3\2\2\2TR\3\2\2\2UV\5\20\t\2VW\7\6\2\2WX\5"+
		"\24\13\2X\17\3\2\2\2Y^\5\22\n\2Z[\7\7\2\2[]\5\22\n\2\\Z\3\2\2\2]`\3\2"+
		"\2\2^\\\3\2\2\2^_\3\2\2\2_\21\3\2\2\2`^\3\2\2\2ab\7\27\2\2b\23\3\2\2\2"+
		"cd\7\27\2\2d\25\3\2\2\2ef\7\17\2\2fg\5\32\16\2gh\7\5\2\2hi\7\20\2\2i\27"+
		"\3\2\2\2jp\5\26\f\2kp\5\34\17\2lp\5\36\20\2mp\5\"\22\2np\5 \21\2oj\3\2"+
		"\2\2ok\3\2\2\2ol\3\2\2\2om\3\2\2\2on\3\2\2\2p\31\3\2\2\2qv\5\30\r\2rs"+
		"\7\5\2\2su\5\30\r\2tr\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\33\3\2\2"+
		"\2xv\3\2\2\2yz\5,\27\2z{\7\b\2\2{|\5.\30\2|\35\3\2\2\2}~\7\21\2\2~\177"+
		"\5.\30\2\177\u0080\7\24\2\2\u0080\u0083\5\30\r\2\u0081\u0082\7\25\2\2"+
		"\u0082\u0084\5\30\r\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\37"+
		"\3\2\2\2\u0085\u0086\7\22\2\2\u0086\u0087\5.\30\2\u0087\u0088\7\23\2\2"+
		"\u0088\u0089\5\30\r\2\u0089!\3\2\2\2\u008a\u008c\7\t\2\2\u008b\u008d\7"+
		"\n\2\2\u008c\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\u008f\5$\23\2\u008f#\3\2\2\2\u0090\u0094\7\13\2\2\u0091\u0093\5&\24\2"+
		"\u0092\u0091\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095"+
		"\3\2\2\2\u0095\u009d\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0099\t\2\2\2\u0098"+
		"\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c\5&"+
		"\24\2\u009b\u0098\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u00a0\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a1\7\f"+
		"\2\2\u00a1%\3\2\2\2\u00a2\u00a5\5*\26\2\u00a3\u00a5\5(\25\2\u00a4\u00a2"+
		"\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\'\3\2\2\2\u00a6\u00a7\7\32\2\2\u00a7"+
		")\3\2\2\2\u00a8\u00a9\5.\30\2\u00a9+\3\2\2\2\u00aa\u00ab\7\27\2\2\u00ab"+
		"-\3\2\2\2\u00ac\u00ad\b\30\1\2\u00ad\u00b5\5:\36\2\u00ae\u00b5\5\66\34"+
		"\2\u00af\u00b5\5,\27\2\u00b0\u00b1\7\13\2\2\u00b1\u00b2\5.\30\2\u00b2"+
		"\u00b3\7\f\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00ac\3\2\2\2\u00b4\u00ae\3\2"+
		"\2\2\u00b4\u00af\3\2\2\2\u00b4\u00b0\3\2\2\2\u00b5\u00c4\3\2\2\2\u00b6"+
		"\u00b7\f\t\2\2\u00b7\u00b8\5\60\31\2\u00b8\u00b9\5.\30\n\u00b9\u00c3\3"+
		"\2\2\2\u00ba\u00bb\f\b\2\2\u00bb\u00bc\5\62\32\2\u00bc\u00bd\5.\30\t\u00bd"+
		"\u00c3\3\2\2\2\u00be\u00bf\f\7\2\2\u00bf\u00c0\5\64\33\2\u00c0\u00c1\5"+
		".\30\b\u00c1\u00c3\3\2\2\2\u00c2\u00b6\3\2\2\2\u00c2\u00ba\3\2\2\2\u00c2"+
		"\u00be\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2"+
		"\2\2\u00c5/\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8\t\3\2\2\u00c8\61\3"+
		"\2\2\2\u00c9\u00ca\t\4\2\2\u00ca\63\3\2\2\2\u00cb\u00cc\t\5\2\2\u00cc"+
		"\65\3\2\2\2\u00cd\u00ce\58\35\2\u00ce\u00cf\5:\36\2\u00cf\67\3\2\2\2\u00d0"+
		"\u00d1\t\4\2\2\u00d19\3\2\2\2\u00d2\u00d5\7\30\2\2\u00d3\u00d5\7\31\2"+
		"\2\u00d4\u00d2\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5;\3\2\2\2\20R^ov\u0083"+
		"\u008c\u0094\u0098\u009d\u00a4\u00b4\u00c2\u00c4\u00d4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}