package octopus.sql.engine;

import octopus.antlr.codegen.hive.v2_3_3.HplsqlBaseVisitor;
import octopus.antlr.codegen.hive.v2_3_3.HplsqlLexer;
import octopus.antlr.codegen.hive.v2_3_3.HplsqlParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.apache.hadoop.hive.ql.parse.HiveParser;

public class HiveSQLRewriterVisitor extends HplsqlBaseVisitor<String> {


    /*
    @Override
    public String visitTerminal(TerminalNode node) {
        String text = node.getText();
        // System.out.println("visitTerminal :  " + text);
        return super.visitTerminal(node);
    }

    @Override
    public String visitTable_name(HplsqlParser.Table_nameContext ctx) {

        String text = ctx.getText();
        System.out.println("visitTable_name :  " + text);
        return super.visitTable_name(ctx);
    }

    @Override
    public String visitInsert_stmt_cols(HplsqlParser.Insert_stmt_colsContext ctx) {
        String text = ctx.getText();

        System.out.println("visitInsert_stmt_cols :  " + text);

        return super.visitInsert_stmt_cols(ctx);
    }


    @Override
    public String visitValues_into_stmt(HplsqlParser.Values_into_stmtContext ctx) {

        String text = ctx.getText();
        System.out.println("visitValues_into_stmt :  " + text);

        return super.visitValues_into_stmt(ctx);
    }


    // 子查询
    @Override
    public String visitFrom_table_name_clause(HplsqlParser.From_table_name_clauseContext ctx) {
        String text = ctx.getText();
        HplsqlParser.Table_nameContext tableNameContext = ctx.table_name();

        System.out.println("visitFrom_table_name_clause :  " + text);
        System.out.println("tableNameContext :  " + tableNameContext.getText());

        return visitChildren(ctx);
    }

    // 子查询
    @Override
    public String visitFrom_subselect_clause(HplsqlParser.From_subselect_clauseContext ctx) {
        String text = ctx.getText();
        //HplsqlParser.Table_nameContext tableNameContext = ctx.table_name();

        System.out.println("visitFrom_subselect_clauseContext :  " + text);
        //System.out.println("tableNameContext :  " + tableNameContext.getText());

        return visitChildren(ctx);
    }
    */

    public static void main(String[] args) {
        String query =
                "INSERT INTO app.table_c PARTITION(dt = '20231221')\n"
                        + "SELECT a.id,\n"
                        + "       table_a.col1,\n"
                        + "       c.col2\n"
                        + "FROM app.table_a a\n"
                        + "         LEFT JOIN bdm.table_b c\n"
                        + "                   ON a.id=c.id";

        String query1 = "INSERT INTO insert_test (col1, col2) VALUES (1, 'ABC');";

        String query2 = "INSERT OVERWRITE TABLE exampledb.exampletable\n" +
                "(key_1, key_2, col_1, col_2, my_part)\n" +
                "SELECT \n" +
                "    key_1,\n" +
                "    key_2,\n" +
                "    col_1,\n" +
                "    col_2,\n" +
                "    SUBSTR(key_2, -3)\n" +
                "FROM exampledb.exampletable_temp;";

        String query3 = "select a.*,b.* from \n" +
                "tb1 a join tb2 b \n" +
                "on a.id = b.id \n" +
                "where a.c1 > 20 and b.c2< 100\n";

        CodePointCharStream charStream = CharStreams.fromString(query3);
        HplsqlLexer lexer = new HplsqlLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        HplsqlParser parser = new HplsqlParser(tokens);
        HiveSQLRewriterVisitor visitor = new HiveSQLRewriterVisitor();
        HplsqlParser.Select_stmtContext selectStmtContext = parser.select_stmt();

        visitor.visit(selectStmtContext);
        System.out.println();

    }
}
