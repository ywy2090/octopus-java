package octopus.sql.engine;

import octopus.antlr.codegen.spark.v2_4_3.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.spark.sql.catalyst.parser.UpperCaseCharStream;

public class SparkSQLRewriterVisitor extends SqlBaseBaseVisitor<String> {

    @Override
    public String visit(ParseTree tree) {
        System.out.println(" visit: " + tree.toString());
        return super.visit(tree);
    }

    @Override
    public String visitTerminal(TerminalNode node) {
        ParseTree parent = node.getParent();
        // System.out.println(" parent visitTerminal: " + parent.getText());
        return super.visitTerminal(node);
    }

    @Override
    public String visitTableName(SqlBaseParser.TableNameContext ctx) {
        System.out.println(" visitTableName => " + ctx.getText());
        return visitChildren(ctx);
    }

    /*
    @Override
    public String visitTerminal(HplsqlParser node) {
        System.out.println(" visitTerminal: " + node.getText());
        return super.visitTerminal(node);
    }
    */

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
    */

    public static void main(String[] args) {
        String query0 =
                "insert overwrite table target_table partition(year,day) select name,age,sex,created_ts,updated_ts,year,day from temp_table_1";

        String query1 =
                "INSERT INTO students PARTITION (student_id = 444444)\n"
                        + "    SELECT name, address FROM persons WHERE name = \"Dora Williams\"";

        String query2 =
                "INSERT OVERWRITE TABLE exampledb.exampletable\n"
                        + "(key_1, key_2, col_1, col_2, my_part)\n"
                        + "SELECT \n"
                        + "    key_1,\n"
                        + "    key_2,\n"
                        + "    col_1,\n"
                        + "    col_2,\n"
                        + "    SUBSTR(key_2, -3)\n"
                        + "FROM exampledb.exampletable_temp;";

        String query3 =
                "select a.*,b.* from \n"
                        + "tb1 a join tb2 b \n"
                        + "on a.id = b.id \n"
                        + "where a.c1 > 20 and b.c2< 100\n";

        String query4 =
                "CREATE EXTERNAL TABLE hive_bigints(id bigint) STORED AS PARQUET LOCATION './dir'";

        String querySQL = query4;
        querySQL = querySQL.trim();

        System.out.println(querySQL);

        UpperCaseCharStream upperCaseCharStream =
                new UpperCaseCharStream(CharStreams.fromString(querySQL));
        SqlBaseLexer lexer = new SqlBaseLexer(upperCaseCharStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SqlBaseParser parser = new SqlBaseParser(tokens);
        // HplsqlParser.ProgramContext program = parser.program();
        SparkSQLRewriterVisitor visitor = new SparkSQLRewriterVisitor();
        SqlBaseParser.SingleStatementContext singleStatementContext = parser.singleStatement();
        // HplsqlParser.Insert_stmtContext insertStmtContext = parser.insert_stmt();

        visitor.visit(singleStatementContext);

        //        ParseDriver pd = new ParseDriver();

        //        try {
        //            ASTNode node = pd.parse(querySQL);
        //            System.out.println(node.dump());
        //        } catch (ParseException e) {
        //            e.printStackTrace();
        //        }

        System.out.println();
    }
}
