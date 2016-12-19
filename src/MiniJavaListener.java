// Generated from ./src/MiniJava.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniJavaParser}.
 */
public interface MiniJavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#goal}.
	 * @param ctx the parse tree
	 */
	void enterGoal(MiniJavaParser.GoalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#goal}.
	 * @param ctx the parse tree
	 */
	void exitGoal(MiniJavaParser.GoalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MiniJavaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MiniJavaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void enterMainClass(MiniJavaParser.MainClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void exitMainClass(MiniJavaParser.MainClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(MiniJavaParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(MiniJavaParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(MiniJavaParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(MiniJavaParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(MiniJavaParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(MiniJavaParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(MiniJavaParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(MiniJavaParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MiniJavaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MiniJavaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MiniJavaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MiniJavaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(MiniJavaParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(MiniJavaParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(MiniJavaParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(MiniJavaParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(MiniJavaParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(MiniJavaParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStatement(MiniJavaParser.AssignStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStatement(MiniJavaParser.AssignStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#arrayAssignStatement}.
	 * @param ctx the parse tree
	 */
	void enterArrayAssignStatement(MiniJavaParser.ArrayAssignStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#arrayAssignStatement}.
	 * @param ctx the parse tree
	 */
	void exitArrayAssignStatement(MiniJavaParser.ArrayAssignStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(MiniJavaParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(MiniJavaParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#address}.
	 * @param ctx the parse tree
	 */
	void enterAddress(MiniJavaParser.AddressContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#address}.
	 * @param ctx the parse tree
	 */
	void exitAddress(MiniJavaParser.AddressContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MiniJavaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MiniJavaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#length}.
	 * @param ctx the parse tree
	 */
	void enterLength(MiniJavaParser.LengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#length}.
	 * @param ctx the parse tree
	 */
	void exitLength(MiniJavaParser.LengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#not}.
	 * @param ctx the parse tree
	 */
	void enterNot(MiniJavaParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#not}.
	 * @param ctx the parse tree
	 */
	void exitNot(MiniJavaParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(MiniJavaParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(MiniJavaParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#newClass}.
	 * @param ctx the parse tree
	 */
	void enterNewClass(MiniJavaParser.NewClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#newClass}.
	 * @param ctx the parse tree
	 */
	void exitNewClass(MiniJavaParser.NewClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#newIntArray}.
	 * @param ctx the parse tree
	 */
	void enterNewIntArray(MiniJavaParser.NewIntArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#newIntArray}.
	 * @param ctx the parse tree
	 */
	void exitNewIntArray(MiniJavaParser.NewIntArrayContext ctx);
}