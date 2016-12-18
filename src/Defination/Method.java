package Defination;

import org.antlr.v4.runtime.misc.Pair;

import java.util.ArrayList;
import java.util.TreeMap;

/**
 * Created by yue on 12/18/16.
 */
public class Method {
    private String methodName;
    private String returnType;
    private TreeMap<String, Variable> variables;
    private ArrayList<String> parameters;

    public Method(String methodName, String returnType) {
        this.methodName = methodName;
        this.returnType = returnType;
        this.variables = new TreeMap<>();
        this.parameters = new ArrayList<>();
    }

    public String getMethodName() {
        return methodName;
    }

    public String getReturnType() {
        return returnType;
    }

    public Variable getVariableByName(String variableName) {
        return variables.get(variableName);
    }

    public void addVariables(Variable variable) {
        variables.put(variable.getVariableName(), variable);
    }

    public void addParameter(String parameter) {
        parameters.add(parameter);
    }
}
