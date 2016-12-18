package Defination;

import java.util.TreeMap;

/**
 * Created by yue on 12/18/16.
 */
public class Program {
    private TreeMap<String, Class> classes;
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
}
