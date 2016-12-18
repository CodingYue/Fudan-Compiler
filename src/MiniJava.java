import org.antlr.v4.parse.ANTLRLexer;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class MiniJava {

    public static void main(String[] args) throws Exception {
        ANTLRInputStream inputStream = new ANTLRInputStream(System.in);
        MiniJavaLexer lexer = new MiniJavaLexer(inputStream);
        for (String tokenName : lexer.getTokenNames()) {
            System.out.print(tokenName + ", ");
        }
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        MiniJavaParser parser = new MiniJavaParser(tokens);
        ParseTree tree = parser.goal();



    }
}