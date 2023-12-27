package octopus.antlr;

import java.io.IOException;

import octopus.antlr.codegen.calc.CalcLexer;
import octopus.antlr.codegen.calc.CalcParser;
import octopus.antlr.codegen.calc.CalcVisitor;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class CaclMain {
    public static void main(String[] args) throws IOException {
        String query = "3.1 * (6.3 - 4.51) + 5 * 4";

        CalcLexer lexer = new CalcLexer(new ANTLRInputStream(query));
        CalcParser parser = new CalcParser(new CommonTokenStream(lexer));
        CalcVisitor visitor = new MyCalcVisitor();

        System.out.println(visitor.visit(parser.expr()));
    }
}
