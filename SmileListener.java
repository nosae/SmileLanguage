// Generated from Smile.g4 by ANTLR 4.7

    import wci.intermediate.*;
    import wci.intermediate.symtabimpl.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SmileParser}.
 */
public interface SmileListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SmileParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SmileParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmileParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SmileParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmileParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(SmileParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmileParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(SmileParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmileParser#mainBlock}.
	 * @param ctx the parse tree
	 */
	void enterMainBlock(SmileParser.MainBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmileParser#mainBlock}.
	 * @param ctx the parse tree
	 */
	void exitMainBlock(SmileParser.MainBlockContext ctx);
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
	 * Enter a parse tree produced by {@link SmileParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(SmileParser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmileParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(SmileParser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmileParser#declList}.
	 * @param ctx the parse tree
	 */
	void enterDeclList(SmileParser.DeclListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmileParser#declList}.
	 * @param ctx the parse tree
	 */
	void exitDeclList(SmileParser.DeclListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmileParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(SmileParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmileParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(SmileParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmileParser#varList}.
	 * @param ctx the parse tree
	 */
	void enterVarList(SmileParser.VarListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmileParser#varList}.
	 * @param ctx the parse tree
	 */
	void exitVarList(SmileParser.VarListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmileParser#varId}.
	 * @param ctx the parse tree
	 */
	void enterVarId(SmileParser.VarIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmileParser#varId}.
	 * @param ctx the parse tree
	 */
	void exitVarId(SmileParser.VarIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmileParser#typeId}.
	 * @param ctx the parse tree
	 */
	void enterTypeId(SmileParser.TypeIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmileParser#typeId}.
	 * @param ctx the parse tree
	 */
	void exitTypeId(SmileParser.TypeIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmileParser#compoundStmt}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStmt(SmileParser.CompoundStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmileParser#compoundStmt}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStmt(SmileParser.CompoundStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmileParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(SmileParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmileParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(SmileParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmileParser#stmtList}.
	 * @param ctx the parse tree
	 */
	void enterStmtList(SmileParser.StmtListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmileParser#stmtList}.
	 * @param ctx the parse tree
	 */
	void exitStmtList(SmileParser.StmtListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmileParser#assignmentStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStmt(SmileParser.AssignmentStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmileParser#assignmentStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStmt(SmileParser.AssignmentStmtContext ctx);
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
	 * Enter a parse tree produced by {@link SmileParser#print_stat}.
	 * @param ctx the parse tree
	 */
	void enterPrint_stat(SmileParser.Print_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmileParser#print_stat}.
	 * @param ctx the parse tree
	 */
	void exitPrint_stat(SmileParser.Print_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmileParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(SmileParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmileParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(SmileParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableExpr}
	 * labeled alternative in {@link SmileParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVariableExpr(SmileParser.VariableExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableExpr}
	 * labeled alternative in {@link SmileParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVariableExpr(SmileParser.VariableExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addSubExpr}
	 * labeled alternative in {@link SmileParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExpr(SmileParser.AddSubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addSubExpr}
	 * labeled alternative in {@link SmileParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExpr(SmileParser.AddSubExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relOpExpr}
	 * labeled alternative in {@link SmileParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRelOpExpr(SmileParser.RelOpExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relOpExpr}
	 * labeled alternative in {@link SmileParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRelOpExpr(SmileParser.RelOpExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unsignedNumberExpr}
	 * labeled alternative in {@link SmileParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedNumberExpr(SmileParser.UnsignedNumberExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unsignedNumberExpr}
	 * labeled alternative in {@link SmileParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedNumberExpr(SmileParser.UnsignedNumberExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulDivExpr}
	 * labeled alternative in {@link SmileParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDivExpr(SmileParser.MulDivExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulDivExpr}
	 * labeled alternative in {@link SmileParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDivExpr(SmileParser.MulDivExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link SmileParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(SmileParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link SmileParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(SmileParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code signedNumberExpr}
	 * labeled alternative in {@link SmileParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSignedNumberExpr(SmileParser.SignedNumberExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code signedNumberExpr}
	 * labeled alternative in {@link SmileParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSignedNumberExpr(SmileParser.SignedNumberExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmileParser#mulDivOp}.
	 * @param ctx the parse tree
	 */
	void enterMulDivOp(SmileParser.MulDivOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmileParser#mulDivOp}.
	 * @param ctx the parse tree
	 */
	void exitMulDivOp(SmileParser.MulDivOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmileParser#addSubOp}.
	 * @param ctx the parse tree
	 */
	void enterAddSubOp(SmileParser.AddSubOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmileParser#addSubOp}.
	 * @param ctx the parse tree
	 */
	void exitAddSubOp(SmileParser.AddSubOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmileParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(SmileParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmileParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(SmileParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmileParser#signedNumber}.
	 * @param ctx the parse tree
	 */
	void enterSignedNumber(SmileParser.SignedNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmileParser#signedNumber}.
	 * @param ctx the parse tree
	 */
	void exitSignedNumber(SmileParser.SignedNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmileParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(SmileParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmileParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(SmileParser.SignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerConst}
	 * labeled alternative in {@link SmileParser#number}.
	 * @param ctx the parse tree
	 */
	void enterIntegerConst(SmileParser.IntegerConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerConst}
	 * labeled alternative in {@link SmileParser#number}.
	 * @param ctx the parse tree
	 */
	void exitIntegerConst(SmileParser.IntegerConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code floatConst}
	 * labeled alternative in {@link SmileParser#number}.
	 * @param ctx the parse tree
	 */
	void enterFloatConst(SmileParser.FloatConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code floatConst}
	 * labeled alternative in {@link SmileParser#number}.
	 * @param ctx the parse tree
	 */
	void exitFloatConst(SmileParser.FloatConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmileParser#nEQUALS}.
	 * @param ctx the parse tree
	 */
	void enterNEQUALS(SmileParser.NEQUALSContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmileParser#nEQUALS}.
	 * @param ctx the parse tree
	 */
	void exitNEQUALS(SmileParser.NEQUALSContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmileParser#lTHAN}.
	 * @param ctx the parse tree
	 */
	void enterLTHAN(SmileParser.LTHANContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmileParser#lTHAN}.
	 * @param ctx the parse tree
	 */
	void exitLTHAN(SmileParser.LTHANContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmileParser#gThan}.
	 * @param ctx the parse tree
	 */
	void enterGThan(SmileParser.GThanContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmileParser#gThan}.
	 * @param ctx the parse tree
	 */
	void exitGThan(SmileParser.GThanContext ctx);
}