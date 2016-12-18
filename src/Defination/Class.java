package Defination;

import java.util.TreeMap;

/**
 * Created by yue on 12/18/16.
 */
public class Class {
    private String className;
    private String parentClass;
    private TreeMap<String, Variable> variables;
    private TreeMap<String, Method> methods;

    public Class(String className, String parentClass) {
        this.className = className;
        this.parentClass = parentClass;
        this.variables = new TreeMap<>();
        this.methods = new TreeMap<>();
    }

    public Class(String className) {
        this(className, "");
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

    public String getParentClass() {
        return parentClass;
    }

    public void addVariables(Variable variable) {
        variables.put(variable.getVariableName(), variable);
    }

    public void addMethod(Method method) {
        methods.put(method.getMethodName(), method);
    }
}
