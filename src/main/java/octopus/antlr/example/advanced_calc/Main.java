package octopus.antlr.example.advanced_calc;

import octopus.antlr.codegen.advanced_calc.AdvancedCalcLexer;
import octopus.antlr.codegen.advanced_calc.AdvancedCalcParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

// https://mp.weixin.qq.com/s/-UHDmOuSDpRssXA0mQpmiQ

public class Main {
    public static void main(String[] args) {
        String expr =
                "a=1 \n"
                        + "b=2 \n"
                        + "c=(a+b)/2 \n"
                        + "c\n"
                        + "d=a\n"
                        + "f=d\n"
                        + "f\n"
                        + "11\n"
                        + "f=a+b+c\n"
                        + "f\n"
                        + "CLEANMEM \n"
                        + "a=4\n"
                        + "a!+(2^2)+1\n";

        System.out.println(expr);

        CharStream stream = CharStreams.fromString(expr);
        AdvancedCalcLexer lexer = new AdvancedCalcLexer(stream);
        AdvancedCalcParser parser = new AdvancedCalcParser(new CommonTokenStream(lexer));

        ParseTree parseTree = parser.prog();
        MyCalcVistor<IType> parseTreeWalker = new MyCalcVistor();

        String res = parseTree.toStringTree(parser);
        System.out.println(res);

        IType value = parseTreeWalker.visit(parseTree);
        System.out.println(value.getValue());
    }
}
