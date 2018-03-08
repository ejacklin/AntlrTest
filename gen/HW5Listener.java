// Generated from C:/Users/Erin/IdeaProjects/AntlrTest\HW5.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HW5Parser}.
 */
public interface HW5Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HW5Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(HW5Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link HW5Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(HW5Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link HW5Parser#declaration_list}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_list(HW5Parser.Declaration_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link HW5Parser#declaration_list}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_list(HW5Parser.Declaration_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link HW5Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(HW5Parser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HW5Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(HW5Parser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HW5Parser#type_specifier}.
	 * @param ctx the parse tree
	 */
	void enterType_specifier(HW5Parser.Type_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link HW5Parser#type_specifier}.
	 * @param ctx the parse tree
	 */
	void exitType_specifier(HW5Parser.Type_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link HW5Parser#var_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVar_declaration(HW5Parser.Var_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HW5Parser#var_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVar_declaration(HW5Parser.Var_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HW5Parser#fun_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFun_declaration(HW5Parser.Fun_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HW5Parser#fun_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFun_declaration(HW5Parser.Fun_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HW5Parser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(HW5Parser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HW5Parser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(HW5Parser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HW5Parser#param_list}.
	 * @param ctx the parse tree
	 */
	void enterParam_list(HW5Parser.Param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link HW5Parser#param_list}.
	 * @param ctx the parse tree
	 */
	void exitParam_list(HW5Parser.Param_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link HW5Parser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(HW5Parser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link HW5Parser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(HW5Parser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link HW5Parser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompound_stmt(HW5Parser.Compound_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HW5Parser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompound_stmt(HW5Parser.Compound_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HW5Parser#local_declarations}.
	 * @param ctx the parse tree
	 */
	void enterLocal_declarations(HW5Parser.Local_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HW5Parser#local_declarations}.
	 * @param ctx the parse tree
	 */
	void exitLocal_declarations(HW5Parser.Local_declarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HW5Parser#statement_list}.
	 * @param ctx the parse tree
	 */
	void enterStatement_list(HW5Parser.Statement_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link HW5Parser#statement_list}.
	 * @param ctx the parse tree
	 */
	void exitStatement_list(HW5Parser.Statement_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link HW5Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(HW5Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HW5Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(HW5Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HW5Parser#expression_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExpression_stmt(HW5Parser.Expression_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HW5Parser#expression_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExpression_stmt(HW5Parser.Expression_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HW5Parser#selection_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelection_stmt(HW5Parser.Selection_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HW5Parser#selection_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelection_stmt(HW5Parser.Selection_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HW5Parser#iteration_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIteration_stmt(HW5Parser.Iteration_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HW5Parser#iteration_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIteration_stmt(HW5Parser.Iteration_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HW5Parser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(HW5Parser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HW5Parser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(HW5Parser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HW5Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(HW5Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HW5Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(HW5Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HW5Parser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(HW5Parser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link HW5Parser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(HW5Parser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link HW5Parser#simple_expression}.
	 * @param ctx the parse tree
	 */
	void enterSimple_expression(HW5Parser.Simple_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HW5Parser#simple_expression}.
	 * @param ctx the parse tree
	 */
	void exitSimple_expression(HW5Parser.Simple_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HW5Parser#relop}.
	 * @param ctx the parse tree
	 */
	void enterRelop(HW5Parser.RelopContext ctx);
	/**
	 * Exit a parse tree produced by {@link HW5Parser#relop}.
	 * @param ctx the parse tree
	 */
	void exitRelop(HW5Parser.RelopContext ctx);
	/**
	 * Enter a parse tree produced by {@link HW5Parser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditive_expression(HW5Parser.Additive_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HW5Parser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditive_expression(HW5Parser.Additive_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HW5Parser#addop}.
	 * @param ctx the parse tree
	 */
	void enterAddop(HW5Parser.AddopContext ctx);
	/**
	 * Exit a parse tree produced by {@link HW5Parser#addop}.
	 * @param ctx the parse tree
	 */
	void exitAddop(HW5Parser.AddopContext ctx);
	/**
	 * Enter a parse tree produced by {@link HW5Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(HW5Parser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link HW5Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(HW5Parser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link HW5Parser#mulop}.
	 * @param ctx the parse tree
	 */
	void enterMulop(HW5Parser.MulopContext ctx);
	/**
	 * Exit a parse tree produced by {@link HW5Parser#mulop}.
	 * @param ctx the parse tree
	 */
	void exitMulop(HW5Parser.MulopContext ctx);
	/**
	 * Enter a parse tree produced by {@link HW5Parser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(HW5Parser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HW5Parser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(HW5Parser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HW5Parser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(HW5Parser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link HW5Parser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(HW5Parser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link HW5Parser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(HW5Parser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HW5Parser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(HW5Parser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HW5Parser#arg_list}.
	 * @param ctx the parse tree
	 */
	void enterArg_list(HW5Parser.Arg_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link HW5Parser#arg_list}.
	 * @param ctx the parse tree
	 */
	void exitArg_list(HW5Parser.Arg_listContext ctx);
}