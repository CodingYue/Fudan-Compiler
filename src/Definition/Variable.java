package Definition;

/**
 * Created by yue on 12/18/16.
 */
public class Variable {

    private String variableName;
    private String variableType;
    private String variableReference;

    public Variable(String variableName, String variableType, String variableReference) {
        this.variableName = variableName;
        this.variableType = variableType;
        this.variableReference = variableReference;
    }

    public Variable(String variableName, String variableType) {
        this(variableName, variableType, null);
    }

    public String getVariableReference() {
        return variableReference;
    }

    public String getVariableName() {
        return variableName;
    }

    public String getVariableType() {
        return variableType;
    }

    public void debug(String indents) {
        System.out.printf("%sVariable name = %s, type = %s\n", indents, variableName, variableType);
    }
}