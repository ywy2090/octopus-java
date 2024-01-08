package octopus.antlr.example.spark;

import java.util.ArrayList;
import java.util.List;
import octopus.antlr.codegen.spark.v2_4_3.SqlBaseBaseVisitor;
import octopus.antlr.codegen.spark.v2_4_3.SqlBaseParser;

public class SparkSqlAst extends SqlBaseBaseVisitor {
    private List<String> tableList = new ArrayList<>();

    @Override
    public List<String> visitSingleStatement(SqlBaseParser.SingleStatementContext ctx) {
        super.visitSingleStatement(ctx);
        return tableList;
    }

    //    @Override
    //    public List<String> visitConstantContext(SqlBaseParser.ConstantContext ctx) {
    //        return null;
    //    }

    @Override
    public List<String> visitTableIdentifier(SqlBaseParser.TableIdentifierContext ctx) {
        String db = ctx.db == null ? "" : ctx.db.getText();
        String tableName = ctx.table == null ? "" : ctx.table.getText();

        //        SqlBaseParser.BooleanValueContext;
        //        SqlBaseParser.NumberContext;
        //        SqlBaseParser.StringLiteralContext;

        tableList.add("".equals(db) ? tableName : (db + "." + tableName));
        return null;
    }
}
