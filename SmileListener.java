// Generated from Smile.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SmileParser}.
 */
public interface SmileListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SmileParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(SmileParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmileParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(SmileParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmileParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SmileParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmileParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SmileParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmileParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SmileParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmileParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SmileParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmileParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(SmileParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmileParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(SmileParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmileParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(SmileParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmileParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(SmileParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmileParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void enterIfStat(SmileParser.IfStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmileParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void exitIfStat(SmileParser.IfStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmileParser#elseIfStat}.
	 * @param ctx the parse tree
	 */
	void enterElseIfStat(SmileParser.ElseIfStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmileParser#elseIfStat}.
	 * @param ctx the parse tree
	 */
	void exitElseIfStat(SmileParser.ElseIfStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmileParser#elseStat}.
	 * @param ctx the parse tree
	 */
	void enterElseStat(SmileParser.ElseStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmileParser#elseStat}.
	 * @param ctx the parse tree
	 */
	void exitElseStat(SmileParser.ElseStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmileParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(SmileParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmileParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(SmileParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmileParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(SmileParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmileParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(SmileParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gtExpression}
	 * labeled alternative in {@link SmileParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGtExpression(SmileParser.GtExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gtExpression}
	 * labeled alternative in {@link SmileParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGtExpression(SmileParser.GtExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link SmileParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumberExpression(SmileParser.NumberExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link SmileParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumberExpression(SmileParser.NumberExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link SmileParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpression(SmileParser.IdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link SmileParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpression(SmileParser.IdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code modulusExpression}
	 * labeled alternative in {@link SmileParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterModulusExpression(SmileParser.ModulusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code modulusExpression}
	 * labeled alternative in {@link SmileParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitModulusExpression(SmileParser.ModulusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link SmileParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(SmileParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link SmileParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(SmileParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplyExpression}
	 * labeled alternative in {@link SmileParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyExpression(SmileParser.MultiplyExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplyExpression}
	 * labeled alternative in {@link SmileParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyExpression(SmileParser.MultiplyExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gtEqExpression}
	 * labeled alternative in {@link SmileParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGtEqExpression(SmileParser.GtEqExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gtEqExpression}
	 * labeled alternative in {@link SmileParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGtEqExpression(SmileParser.GtEqExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link SmileParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(SmileParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link SmileParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(SmileParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link SmileParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStringExpression(SmileParser.StringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link SmileParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStringExpression(SmileParser.StringExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionExpression}
	 * labeled alternative in {@link SmileParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionExpression(SmileParser.ExpressionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionExpression}
	 * labeled alternative in {@link SmileParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionExpression(SmileParser.ExpressionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullExpression}
	 * labeled alternative in {@link SmileParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNullExpression(SmileParser.NullExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullExpression}
	 * labeled alternative in {@link SmileParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNullExpression(SmileParser.NullExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ltEqExpression}
	 * labeled alternative in {@link SmileParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLtEqExpression(SmileParser.LtEqExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ltEqExpression}
	 * labeled alternative in {@link SmileParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLtEqExpression(SmileParser.LtEqExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ltExpression}
	 * labeled alternative in {@link SmileParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLtExpression(SmileParser.LtExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ltExpression}
	 * labeled alternative in {@link SmileParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLtExpression(SmileParser.LtExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolExpression}
	 * labeled alternative in {@link SmileParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpression(SmileParser.BoolExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolExpression}
	 * labeled alternative in {@link SmileParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpression(SmileParser.BoolExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notEqExpression}
	 * labeled alternative in {@link SmileParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotEqExpression(SmileParser.NotEqExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notEqExpression}
	 * labeled alternative in {@link SmileParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotEqExpression(SmileParser.NotEqExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divideExpression}
	 * labeled alternative in {@link SmileParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDivideExpression(SmileParser.DivideExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divideExpression}
	 * labeled alternative in {@link SmileParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDivideExpression(SmileParser.DivideExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpression}
	 * labeled alternative in {@link SmileParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpression(SmileParser.OrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpression}
	 * labeled alternative in {@link SmileParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpression(SmileParser.OrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryMinusExpression}
	 * labeled alternative in {@link SmileParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinusExpression(SmileParser.UnaryMinusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryMinusExpression}
	 * labeled alternative in {@link SmileParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinusExpression(SmileParser.UnaryMinusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powerExpression}
	 * labeled alternative in {@link SmileParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPowerExpression(SmileParser.PowerExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powerExpression}
	 * labeled alternative in {@link SmileParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPowerExpression(SmileParser.PowerExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqExpression}
	 * labeled alternative in {@link SmileParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqExpression(SmileParser.EqExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqExpression}
	 * labeled alternative in {@link SmileParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqExpression(SmileParser.EqExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inExpression}
	 * labeled alternative in {@link SmileParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInExpression(SmileParser.InExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inExpression}
	 * labeled alternative in {@link SmileParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInExpression(SmileParser.InExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addExpression}
	 * labeled alternative in {@link SmileParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddExpression(SmileParser.AddExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addExpression}
	 * labeled alternative in {@link SmileParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddExpression(SmileParser.AddExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subtractExpression}
	 * labeled alternative in {@link SmileParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSubtractExpression(SmileParser.SubtractExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subtractExpression}
	 * labeled alternative in {@link SmileParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSubtractExpression(SmileParser.SubtractExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ternaryExpression}
	 * labeled alternative in {@link SmileParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTernaryExpression(SmileParser.TernaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ternaryExpression}
	 * labeled alternative in {@link SmileParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTernaryExpression(SmileParser.TernaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inputExpression}
	 * labeled alternative in {@link SmileParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInputExpression(SmileParser.InputExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inputExpression}
	 * labeled alternative in {@link SmileParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInputExpression(SmileParser.InputExpressionContext ctx);
}