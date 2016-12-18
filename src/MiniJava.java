import org.antlr.v4.parse.ANTLRLexer;
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
        MiniJavaBaseListener miniJavaBaseListener = new MiniJavaBaseListener();
        treeWalker.walk(miniJavaBaseListener, tree);

        if (args.length > 0 && args[0].equals("-tree")) {
            Trees.inspect(tree, parser);
        }
    }
}