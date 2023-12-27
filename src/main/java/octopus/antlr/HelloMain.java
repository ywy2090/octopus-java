package octopus.antlr;

import octopus.antlr.codegen.hello.HelloLexer;
import octopus.antlr.codegen.hello.HelloParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class HelloMain {
    public static void main(String... args) {

        CharStream input = CharStreams.fromString("hello\tworld");

        // 构造词法分析器
        HelloLexer lexer = new HelloLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // 实例化解析器
        HelloParser parser = new HelloParser(tokens);

        ParseTree tree = parser.r();

        MyHelloVisitor myHelloVisitor = new MyHelloVisitor();

        myHelloVisitor.visit(tree);
    }
}
