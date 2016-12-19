package Definition;

import java.util.TreeMap;

/**
 * Created by yue on 12/18/16.
 */
public class Class {
    private String className;
    private Class parentClass;
    private TreeMap<String, Variable> variables;
    private TreeMap<String, Method> methods;

    public Class(String className, Class parentClass) {
        this.className = className;
        this.parentClass = parentClass;
        this.variables = new TreeMap<>();
        this.methods = new TreeMap<>();

        for (Class extendsClass = parentClass; extendsClass != null; extendsClass = extendsClass.parentClass) {
            if (extendsClass == this) {
                break;
            }
            this.variables.putAll(extendsClass.variables);
            this.methods.putAll(extendsClass.methods);
        }
    }

    public Class(String className) {
        this(className, null);
    }

    public Variable getVariableByName(String variableName) {
        return variables.get(variableName);
    }

    public Method getMethodByName(String methodName) {
        return methods.get(methodName);
    }

    public String getClassName() {
        return className;
    }

    public Class getParentClass() {
        return parentClass;
    }

    public void addVariables(Variable variable) {
        variables.put(variable.getVariableName(), variable);
    }

    public void addMethod(Method method) {
        methods.put(method.getMethodName(), method);
    }

    public void debug(String indents) {
        System.out.printf("%sClass : %s, ", indents, this.getClassName());
        System.out.printf("Extends Class : %s\n", parentClass == null ? "null" : parentClass.getClassName());
        for (Variable variable : variables.values()) {
            variable.debug(indents + "  ");
        }
        for (Method method : methods.values()) {
            method.debug(indents + "  ");
        }
    }
}
