import Definition.Class;
import Definition.Method;
import Definition.Program;
import Definition.Variable;

/**
 * Created by yue on 12/18/16.
 */
public class DefinitionListener extends MiniJavaBaseListener {

    private Program program;
    private String currentClassName;
    private String currentMethodName;
    private String currentDepth;

    @Override
    public void enterProgram(MiniJavaParser.ProgramContext ctx) {
        program = new Program();
        currentClassName = null;
        currentMethodName = null;
        currentDepth = "program";
    }

    @Override
    public void exitProgram(MiniJavaParser.ProgramContext ctx) {

    }

    @Override
    public void enterMainClass(MiniJavaParser.MainClassContext ctx) {
        currentDepth = "mainClass";
        program.setMainClassName(ctx.name.getText());
        program.addClass(new Class(program.getMainClassName()));
    }

    @Override
    public void exitMainClass(MiniJavaParser.MainClassContext ctx) {
        currentDepth = "program";
    }

    @Override
    public void enterClassDeclaration(MiniJavaParser.ClassDeclarationContext ctx) {
        currentDepth = "class";
        currentClassName = ctx.name.getText();
        if (program.getClassByName(currentClassName) != null) {
            MiniJava.printError(ctx.name, "class already exists!");
        } else {
            program.addClass(new Class(ctx.name.getText(),
                    ctx.ext == null ? null : program.getClassByName(ctx.ext.getText())));
        }
    }

    @Override
    public void exitClassDeclaration(MiniJavaParser.ClassDeclarationContext ctx) {
        currentDepth = "program";
    }

    @Override
    public void enterVarDeclaration(MiniJavaParser.VarDeclarationContext ctx) {
        String variableName = ctx.name.getText();
        if (currentDepth.equals("class")) {
            Class currentClass = program.getClassByName(currentClassName);
            if (currentClass.getVariableByName(variableName) == null) {
                currentClass.addVariables(new Variable(variableName, ctx.type().getText()));
            } else {
                MiniJava.printError(ctx.name, "Variable was already defined in this class or extended class.");
            }
        } else {
            Method currentMethod = program.getClassByName(currentClassName)
                    .getMethodByName(currentMethodName);
            if (currentMethod.getVariableByName(variableName) == null) {
                currentMethod.addVariables(new Variable(variableName, ctx.type().getText()));
            } else {
                MiniJava.printError(ctx.name, "Variable was already defined in this method.");
            }
        }
    }

    @Override
    public void exitVarDeclaration(MiniJavaParser.VarDeclarationContext ctx) {

    }
    @Override
    public void enterMethodDeclaration(MiniJavaParser.MethodDeclarationContext ctx) {
        currentDepth = "method";
        currentMethodName = ctx.name.getText();
        Class currentClass = program.getClassByName(currentClassName);
        if (currentClass.getMethodByName(currentMethodName) != null) {
            MiniJava.printError(ctx.name, "Method was already defined in this class or extended class.");
        } else {
            currentClass.addMethod(new Method(currentMethodName, ctx.returnType.getText()));
        }
        Method currentMethod = currentClass.getMethodByName(currentMethodName);

        for (MiniJavaParser.ParameterContext parametersContext = ctx.parameter(); parametersContext != null;
             parametersContext = parametersContext.parameter()) {
            String name = parametersContext.name.getText();
            if (currentMethod.getVariableByName(name) != null) {
                MiniJava.printError(parametersContext.name, "Parameter's name was already defined previously");
            } else {
                currentMethod.addVariables(new Variable(parametersContext.name.getText(),
                        parametersContext.parameterType.getText()));
            }
            currentMethod.addParameter(parametersContext.parameterType.getText());
        }
    }

    @Override
    public void exitMethodDeclaration(MiniJavaParser.MethodDeclarationContext ctx) {
        currentDepth = "class";
    }

    /*
    @Override
    public void enterExpression(MiniJavaParser.ExpressionContext ctx) {
        String type = "";
        if (ctx.atom() != null) {
            type = "Atom";
        } else if (ctx.address() != null) {
            type = "Array";
        } else if (ctx.Operator() != null) {
            type = "Operator";
        } else if (ctx.length() != null) {
            type = "Length";
        } else if (ctx.call() != null) {
            type = "Call";
        } else if (ctx.newClass() != null) {
            type = "newClass";
        } else if (ctx.newIntArray() != null) {
            type = "newIntArray";
        }
        System.out.printf("Type : %s, %s\n", type, ctx.getText());
    }*/

    public Program getProgram() {
        return this.program;
    }
}
