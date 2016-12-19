import Definition.Class;
import Definition.Method;
import Definition.Program;

import java.util.Objects;

/**
 * Created by yue on 12/19/16.
 */
public class StatementListener extends MiniJavaBaseListener {
    private Program program;
    private ExpressionTypeEvaluator typeEvaluator;
    private Method currentMethod;
    private Class currentClass;

    public StatementListener(Program program, ExpressionTypeEvaluator typeEvaluator) {
        this.program = program;
        this.typeEvaluator = typeEvaluator;
    }

    @Override
    public void enterIfStatement(MiniJavaParser.IfStatementContext ctx) {
        String type = typeEvaluator.visitExpression(ctx.expression(), currentClass, currentMethod);
        if (type != null && !type.equals("boolean")) {
            MiniJava.printError(ctx.expression().getStart(),
                    "Must be boolean in in if statement");
        }
    }

    @Override
    public void enterClassDeclaration(MiniJavaParser.ClassDeclarationContext ctx) {
        currentClass = program.getClassByName(ctx.name.getText());
    }

    @Override public void enterMethodDeclaration(MiniJavaParser.MethodDeclarationContext ctx) {
        currentMethod = currentClass.getMethodByName(ctx.name.getText());
    }

    @Override
    public void enterWhileStatement(MiniJavaParser.WhileStatementContext ctx) {
        String type = typeEvaluator.visitExpression(ctx.expression(), currentClass, currentMethod);
        if (type != null && !type.equals("boolean")) {
            MiniJava.printError(ctx.expression().getStart(),
                    "Must be boolean in while statement");
        }
    }

    @Override
    public void enterPrintStatement(MiniJavaParser.PrintStatementContext ctx) {
        String type = typeEvaluator.visitExpression(ctx.expression(), currentClass, currentMethod);
        if (type != null && !Objects.equals("int", type)) {
            MiniJava.printError(ctx.expression().getStart(),
                    "System.out.print must be applied to `int`");
        }
    }

    @Override
    public void enterAssignStatement(MiniJavaParser.AssignStatementContext ctx) {
        String variableType = getVariableTypeByName(ctx.Identifier().getText());
        if (variableType == null) {
            MiniJava.printError(ctx.Identifier().getSymbol(), "Variable not defined yet");
        }
        String expressionType = typeEvaluator.visitExpression(ctx.expression(), currentClass, currentMethod);
        if (expressionType != null && !Objects.equals(expressionType, variableType)) {
            MiniJava.printError(ctx.expression().getStart(), "Incompatible type " +
                    "variable is " + variableType + " expression is " + expressionType);
        }
    }

    @Override
    public void enterArrayAssignStatement(MiniJavaParser.ArrayAssignStatementContext ctx) {
        String variableType = getVariableTypeByName(ctx.Identifier().getText());
        if (variableType == null) {
            MiniJava.printError(ctx.Identifier().getSymbol(), "Variable not defined yet");
        }
        String addressType = typeEvaluator.visitExpression(ctx.address().expression(), currentClass, currentMethod);
        if (addressType != null && !addressType.equals("int")) {
            MiniJava.printError(ctx.address().getStart(), "Invalid array, address is not int");
        }
        String expressionType = typeEvaluator.visitExpression(ctx.expression(), currentClass, currentMethod);
        if (expressionType != null && (!variableType.equals("int[]") || !expressionType.equals("int"))) {
            MiniJava.printError(ctx.expression().getStart(), "Incompatible type " +
                    "variable is " + variableType + " expression is " + expressionType);
        }
    }

    private String getVariableTypeByName(String variableName) {
        if (currentMethod.getVariableByName(variableName) != null) {
            return currentMethod.getVariableByName(variableName).getVariableType();
        } else if (currentClass.getVariableByName(variableName) != null) {
            return currentClass.getVariableByName(variableName).getVariableType();
        } else {
            return null;
        }
    }

}
