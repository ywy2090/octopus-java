package sharding.sphere.demo.sql.parser;

import com.alibaba.druid.DbType;
import com.alibaba.druid.sql.SQLUtils;
import java.util.List;
import net.sf.jsqlparser.JSQLParserException;
import net.sf.jsqlparser.parser.CCJSqlParserUtil;
import net.sf.jsqlparser.statement.Statement;
import org.apache.shardingsphere.infra.parser.sql.SQLStatementParserExecutor;
import org.apache.shardingsphere.sql.parser.api.CacheOption;
import org.apache.shardingsphere.sql.parser.sql.common.statement.SQLStatement;
import sharding.sphere.demo.sql.ConstSQLs;

public class Main {

    public static void jsqlParser(String sql) throws JSQLParserException {
        Statement stmt =
                CCJSqlParserUtil.parse(
                        sql,
                        ccjSqlParser ->
                                ccjSqlParser
                                        .withSquareBracketQuotation(true)
                                        .withAllowComplexParsing(true));
        // System.out.println(stmt);
        /*
        Map<String, Expression> map = new HashMap<>();
        for (SelectItem selectItem : ((PlainSelect) stmt.getSelectBody()).getSelectItems()) {
            selectItem.accept(
                    new SelectItemVisitorAdapter() {
                        @Override
                        public void visit(SelectExpressionItem item) {
                            if (Objects.isNull(item)) {
                                return;
                            }

                            if (Objects.isNull(item.getAlias())) {
                                return;
                            }

                            map.put(item.getAlias().getName(), item.getExpression());
                        }
                    });
        }

        System.out.println("map " + map);
        */
    }

    public static void druidParser(String sql) {
        List<com.alibaba.druid.sql.ast.SQLStatement> sqlStatements =
                SQLUtils.parseStatements(sql, DbType.mysql);
        // System.out.println(sqlStatements);
    }

    public static void sqlParser(String sql) {
        String databaseType = "MYSQL";
        SQLStatementParserExecutor sqlStatementParserExecutor =
                new SQLStatementParserExecutor(
                        databaseType, new CacheOption(1024 * 1024, 1024 * 1024), true);
        SQLStatement sqlStatement = sqlStatementParserExecutor.parse(sql);
        // System.out.println(sqlStatement);
    }

    public static void main(String[] args) throws JSQLParserException {
        List<String> sqlList = ConstSQLs.sqlList;
        for (String sql : sqlList) {
            System.out.println(" sql=> " + sql);
            jsqlParser(sql);
            druidParser(sql);
            // sqlParser(sql);
        }
    }
}
