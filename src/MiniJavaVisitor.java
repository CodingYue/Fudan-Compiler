// Generated from ./src/MiniJava.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MiniJavaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MiniJavaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#goal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoal(MiniJavaParser.GoalContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MiniJavaParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#mainClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainClass(MiniJavaParser.MainClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(MiniJavaParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(MiniJavaParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(MiniJavaParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(MiniJavaParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(MiniJavaParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MiniJavaParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(MiniJavaParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(MiniJavaParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(MiniJavaParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#assignStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStatement(MiniJavaParser.AssignStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#arrayAssignStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAssignStatement(MiniJavaParser.ArrayAssignStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(MiniJavaParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#address}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddress(MiniJavaParser.AddressContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(MiniJavaParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#length}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLength(MiniJavaParser.LengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#not}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(MiniJavaParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(MiniJavaParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#newClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewClass(MiniJavaParser.NewClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#newIntArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewIntArray(MiniJavaParser.NewIntArrayContext ctx);
}