package octopus.antlr;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import octopus.antlr.codegen.hive.v2.HiveLexer;
import octopus.antlr.codegen.hive.v2.HiveParser;
import octopus.antlr.codegen.hive.v2.HiveParserBaseListener;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.misc.Pair;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class HiveSQLListener extends HiveParserBaseListener {
    List<String> inputTables = new ArrayList<>();
    List<Pair<String, String>> outputTables = new ArrayList<>();

    @Override
    public void enterSelectStatement(HiveParser.SelectStatementContext ctx) {
        super.enterSelectStatement(ctx);
    }

    @Override
    public void enterTableSource(HiveParser.TableSourceContext ctx) {
        inputTables.add(ctx.tableName().getText());
        super.enterTableSource(ctx);
    }

    @Override
    public void enterTableOrPartition(HiveParser.TableOrPartitionContext ctx) {
        String table = ctx.tableName() != null ? ctx.tableName().getText() : "UNKNOWN";
        String partition = ctx.partitionSpec() != null ? ctx.partitionSpec().getText() : "UNKNOWN";

        outputTables.add(new Pair<>(table, partition));
        super.enterTableOrPartition(ctx);
    }

    public void show() {
        System.out.println(
                inputTables.stream().collect(Collectors.joining(",", "[", "]"))
                        + " -> "
                        + outputTables.stream()
                                .map(pair -> pair.a + "@" + pair.b)
                                .collect(Collectors.joining(",", "[", "]")));
    }

    public static void main(String[] args) {

        String sql =
                "insert into app.table_c partition(dt = '20231221') select a.id,table_a.col1, c.col2 from app.table_a a left join bdm.table_b c on a.id=c.id";

        ANTLRInputStream input = new HiveSQLRewriter.ANTLRNoCaseStringStream(sql);
        Lexer lexer = new HiveLexer(input);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);

        HiveParser parser = new HiveParser(commonTokenStream);
        ParseTree parseTree = parser.statements();

        System.out.println("LISP:\n" + parseTree.toStringTree(parser));

        ParseTreeWalker walker = new ParseTreeWalker();
        HiveSQLListener hiveSQLListener = new HiveSQLListener();
        walker.walk(hiveSQLListener, parseTree);

        hiveSQLListener.show();
    }
}
