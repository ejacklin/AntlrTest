// Generated from C:/Users/Erin/IdeaProjects/AntlrTest\HW5.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HW5Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HW5Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HW5Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(HW5Parser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link HW5Parser#declaration_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration_list(HW5Parser.Declaration_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link HW5Parser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(HW5Parser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HW5Parser#var_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_declaration(HW5Parser.Var_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HW5Parser#type_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_specifier(HW5Parser.Type_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link HW5Parser#fun_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFun_declaration(HW5Parser.Fun_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HW5Parser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(HW5Parser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HW5Parser#param_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_list(HW5Parser.Param_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link HW5Parser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(HW5Parser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link HW5Parser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_stmt(HW5Parser.Compound_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HW5Parser#local_declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal_declarations(HW5Parser.Local_declarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HW5Parser#statement_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_list(HW5Parser.Statement_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link HW5Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(HW5Parser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HW5Parser#expression_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_stmt(HW5Parser.Expression_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HW5Parser#selection_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelection_stmt(HW5Parser.Selection_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HW5Parser#iteration_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteration_stmt(HW5Parser.Iteration_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HW5Parser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(HW5Parser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HW5Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(HW5Parser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HW5Parser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(HW5Parser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link HW5Parser#simple_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_expression(HW5Parser.Simple_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HW5Parser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelop(HW5Parser.RelopContext ctx);
	/**
	 * Visit a parse tree produced by {@link HW5Parser#additive_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditive_expression(HW5Parser.Additive_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HW5Parser#addop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddop(HW5Parser.AddopContext ctx);
	/**
	 * Visit a parse tree produced by {@link HW5Parser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(HW5Parser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link HW5Parser#mulop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulop(HW5Parser.MulopContext ctx);
	/**
	 * Visit a parse tree produced by {@link HW5Parser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(HW5Parser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HW5Parser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(HW5Parser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link HW5Parser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(HW5Parser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HW5Parser#arg_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg_list(HW5Parser.Arg_listContext ctx);
}