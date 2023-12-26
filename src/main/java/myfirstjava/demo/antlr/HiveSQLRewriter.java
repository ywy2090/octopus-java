package myfirstjava.demo.antlr;

import myfirstjava.demo.antlr.codegen.hive.v2.HiveLexer;
import myfirstjava.demo.antlr.codegen.hive.v2.HiveParser;
import myfirstjava.demo.antlr.codegen.hive.v2.HiveParserBaseListener;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.Optional;

public class HiveSQLRewriter extends HiveParserBaseListener {
    TokenStreamRewriter tokenStreamRewriter;

    public HiveSQLRewriter(CommonTokenStream commonTokenStream) {
        tokenStreamRewriter = new TokenStreamRewriter(commonTokenStream);
    }

    @Override
    public void enterFunction(HiveParser.FunctionContext ctx) {
        // size(...) to size[...]
        Optional.of(ctx)
                .map(HiveParser.FunctionContext::functionName)
                .map(HiveParser.FunctionNameContext::sql11ReservedKeywordsUsedAsFunctionName)
                .map(HiveParser.Sql11ReservedKeywordsUsedAsFunctionNameContext::KW_ARRAY)
                .ifPresent(
                        __ -> {
                            tokenStreamRewriter.replace(ctx.LPAREN().getSymbol(), "[");
                            tokenStreamRewriter.replace(ctx.RPAREN().getSymbol(), "]");
                        });
        super.enterFunction(ctx);
    }

    @Override
    public void enterIdentifier(HiveParser.IdentifierContext ctx) {
        if (ctx.Identifier().getText().equalsIgnoreCase("size")) {
            tokenStreamRewriter.replace(ctx.Identifier().getSymbol(), "CARDINALITY");
        }
        super.enterIdentifier(ctx);
    }

    public String toSQL() {
        return tokenStreamRewriter.getText();
    }

    public static class ANTLRNoCaseStringStream extends ANTLRInputStream {
        public ANTLRNoCaseStringStream(String input) {
            super(input);
        }

        @Override
        public int LA(int i) {

            int returnChar = super.LA(i);
            if (returnChar == CharStream.EOF) {
                return returnChar;
            } else if (returnChar == 0) {
                return returnChar;
            }

            return Character.toUpperCase((char) returnChar);
        }
    }

    public static void main(String[] args) {

        String sql = "CREATE TABLE Test_Cust (Cust_id int,Name string)";
        String sql1 = "SELECT size(ARRAY (1, 2))";
        String sql2 =
                "insert into app.table_c partition(dt = '20231221') select a.id,table_a.col1, c.col2 from app.table_a a left join bdm.table_b c on a.id=c.id";

        ANTLRInputStream input = new ANTLRNoCaseStringStream(sql);
        Lexer lexer = new HiveLexer(input);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);

        HiveParser parser = new HiveParser(commonTokenStream);
        ParseTree parseTree = parser.statements();

        // System.out.println("LISP:\n" + parseTree.toStringTree(parser));

        ParseTreeWalker walker = new ParseTreeWalker();
        HiveSQLRewriter hiveSQLRewriter = new HiveSQLRewriter(commonTokenStream);
        walker.walk(hiveSQLRewriter, parseTree);
        // hiveParserListener.show();

        // SELECT CAST(CARDINALITY(ARRAY[1, 2]) AS INTEGER)
        System.out.println(hiveSQLRewriter.toSQL());
    }
}
