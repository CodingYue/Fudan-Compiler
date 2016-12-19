import Definition.Class;
import Definition.Method;
import Definition.Program;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by yue on 12/19/16.
 */
public class ExpressionTypeEvaluator {

    private Program program;

    public ExpressionTypeEvaluator(Program program) {
        this.program = program;
    }

    public String visitExpression(MiniJavaParser.ExpressionContext ctx, Class currentClass, Method currentMethod) {
        if (ctx.atom() != null) {
            if (ctx.atom().Integer() != null) {
                return "int";
            }
            if (ctx.atom().Boolean() != null) {
                return "boolean";
            }
            if (ctx.atom().This() != null) {
                return currentClass.getClassName();
            }
            if (ctx.atom().Identifier() != null) {
                String variableName = ctx.atom().Identifier().getText();
                if (currentMethod.getVariableByName(variableName) != null) {
                    return currentMethod.getVariableByName(variableName).getVariableType();
                }
                return currentClass.getVariableByName(variableName).getVariableType();
            }
            return null;
        }
        if (ctx.newClass() != null) {
            return ctx.newClass().Identifier().getText();
        }
        if (ctx.newIntArray() != null) {
            String addressType = visitExpression(ctx.newIntArray().expression(), currentClass, currentMethod);
            if (!Objects.equals(addressType, "int")) {
                MiniJava.printError(ctx.newIntArray().expression().getStart(),
                        "Invalid address, is not int");
                return null;
            }
            return "int[]";
        }
        if (ctx.Operator() != null) {
            String type1 = visitExpression(ctx.exp1, currentClass, currentMethod);
            String type2 = visitExpression(ctx.exp2, currentClass, currentMethod);
            if (!Objects.equals("int", type1) && !Objects.equals("boolean", type1)) {
                MiniJava.printError(ctx.exp1.getStart(), "binary operation must be int or boolean");
                return null;
            }
            if (!Objects.equals("int", type2) && !Objects.equals("boolean", type2)) {
                MiniJava.printError(ctx.exp2.getStart(), "binary operation must be int or boolean");
                return null;
            }
            if (!Objects.equals(type1, type2)) {
                MiniJava.printError(ctx.getStart(), "Incompatible type: " + type1 + ", " + type2);
                return null;
            }
            return type1;
        }
        if (ctx.address() != null) {
            String expressionType = visitExpression(ctx.exp, currentClass, currentMethod);
            if (!Objects.equals(expressionType, "int")) {
                MiniJava.printError(ctx.exp.getStart(), "Array value must be int[]");
                return null;
            }
            String addressType = visitExpression(ctx.address().expression(), currentClass, currentMethod);
            if (!Objects.equals(addressType, "int")) {
                MiniJava.printError(ctx.address().getStart(), "Address must be int");
                return null;
            }
            return "int";
        }
        if (ctx.length() != null) {
            String expressionType = visitExpression(ctx.exp, currentClass, currentMethod);
            if (!Objects.equals(expressionType, "int")) {
                MiniJava.printError(ctx.exp.getStart(), "Array value must be int[]");
                return null;
            }
            return "int";
        }
        if (ctx.call() != null) {
            String className = visitExpression(ctx.exp, currentClass, currentMethod);
            if (Objects.equals(className, "int") ||
                    Objects.equals(className, "int[]") ||
                    Objects.equals(className, "boolean")) {
                MiniJava.printError(ctx.exp.getStart(), "Cannot apply calling method to " +
                    className);
                return null;
            }
            Class callingClass = program.getClassByName(className);
            if (callingClass.getMethodByName(ctx.call().Identifier().getText()) == null) {
                MiniJava.printError(ctx.call().Identifier().getSymbol(),
                        "Method not found in class " + className);
            }
            Method callingMethod = callingClass.getMethodByName(ctx.call().Identifier().getText());
            ArrayList<String> expressionTypes = new ArrayList<>();
            for (int i = 0; i < ctx.expression().size(); ++i) {
                expressionTypes.add(visitExpression(ctx.expression(i), currentClass, currentMethod));
            }
            if (expressionTypes.size() != callingMethod.getParameters().size()) {
                MiniJava.printError(ctx.call().getStart(), "The parameters number is not matched");
                return null;
            }
            for (int i = 0; i < expressionTypes.size(); ++i) {
                if (!Objects.equals(expressionTypes.get(i), callingMethod.getParameters().get(i))) {
                    MiniJava.printError(ctx.expression(i).getStart(), "The " + String.valueOf(i)
                        + "th parameter type is not matched, defined method type : " +
                        callingMethod.getParameters().get(i) + ", while current is : " + expressionTypes.get(i));
                    return null;
                }
            }
            return callingMethod.getReturnType();
        }
        if (ctx.not() != null) {
            String expressionType = visitExpression(ctx.exp, currentClass, currentMethod);
            if (!Objects.equals(expressionType, "boolean")) {
                MiniJava.printError(ctx.not().getStart(), "Not function must be applied to boolean," +
                        " while it's " + expressionType);
            }
            return expressionType;
        }
        return visitExpression(ctx.exp, currentClass, currentMethod);
    }
}
