package Definition;

import java.util.TreeMap;

/**
 * Created by yue on 12/18/16.
 */
public class Program {
    private final TreeMap<String, Class> classes;
    private String mainClassName;

    public Program() {
        mainClassName = null;
        classes = new TreeMap<>();
    }

    public String getMainClassName() {
        return mainClassName;
    }

    public void setMainClassName(String mainClassName) {
        this.mainClassName = mainClassName;
    }

    public void addClass(Class newClass) {
        classes.put(newClass.getClassName(), newClass);
    }

    public Class getClassByName(String className) {
        return classes.get(className);
    }

    public Class getExtendsRingName() {
        for (Class definedClass : classes.values()) {
            for (Class extendsClass = definedClass.getParentClass(); extendsClass != null;
                    extendsClass = extendsClass.getParentClass()) {
                if (extendsClass == definedClass) {
                    return definedClass;
                }
            }
        }
        return null;
    }

    public void debug(String indents) {
        System.out.printf("%sMain class name : %s\n", indents, mainClassName);
        for (Class miniJavaClass : classes.values()) {
            miniJavaClass.debug(indents + "  ");
        }
    }
}
