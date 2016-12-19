import Definition.Class;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class MiniJava {

    public static void printError(Token token, String message) {
        System.err.printf("Error, line %d:%d %s\n", token.getLine(), token.getCharPositionInLine(), message);
    }

    public static void main(String[] args) throws Exception {

        ANTLRInputStream inputStream = new ANTLRInputStream(System.in);
        MiniJavaLexer lexer = new MiniJavaLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MiniJavaParser parser = new MiniJavaParser(tokens);
        ParseTree tree = parser.program();

        ParseTreeWalker treeWalker = new ParseTreeWalker();
        DefinitionListener definitionListener = new DefinitionListener();
        treeWalker.walk(definitionListener, tree);

        Class extendsRingClass = definitionListener.getProgram().getExtendsRingName();
        if (extendsRingClass != null) {
            System.err.printf("Extends ring exists! class name %s\n", extendsRingClass.getClassName());
            return;
        }
        //definitionListener.getProgram().debug("");

        

        if (args.length > 0 && args[0].equals("-tree")) {
            Trees.inspect(tree, parser);
        }
        System.err.printf("Successfully compiled\n");
    }

}