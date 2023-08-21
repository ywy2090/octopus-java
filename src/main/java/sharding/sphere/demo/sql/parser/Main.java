package sharding.sphere.demo.sql.parser;

import com.alibaba.druid.DbType;
import com.alibaba.druid.sql.SQLUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import net.sf.jsqlparser.JSQLParserException;
import net.sf.jsqlparser.expression.Expression;
import net.sf.jsqlparser.expression.ExpressionVisitorAdapter;
import net.sf.jsqlparser.expression.LongValue;
import net.sf.jsqlparser.expression.operators.relational.ExpressionList;
import net.sf.jsqlparser.expression.operators.relational.ItemsListVisitor;
import net.sf.jsqlparser.expression.operators.relational.MultiExpressionList;
import net.sf.jsqlparser.expression.operators.relational.NamedExpressionList;
import net.sf.jsqlparser.parser.CCJSqlParserUtil;
import net.sf.jsqlparser.schema.Column;
import net.sf.jsqlparser.statement.insert.Insert;
import net.sf.jsqlparser.statement.select.PlainSelect;
import net.sf.jsqlparser.statement.select.Select;
import net.sf.jsqlparser.statement.select.SelectExpressionItem;
import net.sf.jsqlparser.statement.select.SelectItem;
import net.sf.jsqlparser.statement.select.SelectItemVisitorAdapter;
import net.sf.jsqlparser.statement.select.SubSelect;
import net.sf.jsqlparser.util.AddAliasesVisitor;
import org.apache.shardingsphere.infra.parser.sql.SQLStatementParserExecutor;
import org.apache.shardingsphere.sql.parser.api.CacheOption;
import org.apache.shardingsphere.sql.parser.sql.common.statement.SQLStatement;

public class Main {

    public static void transSql4() throws JSQLParserException {
        Select select = (Select) CCJSqlParserUtil.parse("select a,b,c,d from test");
        final AddAliasesVisitor instance = new AddAliasesVisitor();
        select.getSelectBody().accept(instance);
        System.out.println(select);
    }

    public static void transSql3() throws JSQLParserException {
        String sql =
                "insert into `test_user`(`account`, `user_name`, `age`, `sex`, `create_time`)\n"
                        + "values ('test1', 'test_user_1', 1, 0, now())\n"
                        + "on duplicate key update \n"
                        + "`user_name` = 'test_user_1', `age` = 1, `sex` = 0;";
        Insert insert = (Insert) CCJSqlParserUtil.parse(sql);
        System.out.println(insert);
    }

    public static void transSql2() throws JSQLParserException {
        Select stmt =
                (Select)
                        CCJSqlParserUtil.parse(
                                "SELECT col1 AS a, col2 AS b, col3 AS c FROM table WHERE col_1 = 10 AND col_2 = 20 AND col_3 = 30");
        System.out.println("before " + stmt.toString());

        ((PlainSelect) stmt.getSelectBody())
                .getWhere()
                .accept(
                        new ExpressionVisitorAdapter() {
                            @Override
                            public void visit(Column column) {
                                column.setColumnName(column.getColumnName().replace("_", ""));
                            }
                        });

        System.out.println("after " + stmt.toString());
    }

    public static void transSql() throws JSQLParserException {
        Insert insert = (Insert) CCJSqlParserUtil.parse("insert into mytable (col1) values (1)");
        System.out.println(insert.toString());

        // adding a column
        insert.getColumns().add(new Column("col2"));

        // adding a value using a visitor
        insert.getItemsList()
                .accept(
                        new ItemsListVisitor() {

                            public void visit(SubSelect subSelect) {
                                throw new UnsupportedOperationException("Not supported yet.");
                            }

                            public void visit(ExpressionList expressionList) {
                                expressionList.getExpressions().add(new LongValue(5));
                            }

                            @Override
                            public void visit(NamedExpressionList namedExpressionList) {}

                            public void visit(MultiExpressionList multiExprList) {
                                throw new UnsupportedOperationException("Not supported yet.");
                            }
                        });
        System.out.println(insert.toString());

        // adding another column
        insert.getColumns().add(new Column("col3"));

        // adding another value (the easy way)
        ((ExpressionList) insert.getItemsList()).getExpressions().add(new LongValue(10));

        System.out.println(insert.toString());
    }

    public static void jsqlParser(String sql) throws JSQLParserException {
        Select stmt =
                (Select)
                        CCJSqlParserUtil.parse(
                                sql,
                                ccjSqlParser ->
                                        ccjSqlParser
                                                .withSquareBracketQuotation(true)
                                                .withAllowComplexParsing(true));
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
    }

    public static void druidParser(String sql) {
        List<com.alibaba.druid.sql.ast.SQLStatement> sqlStatements =
                SQLUtils.parseStatements(sql, DbType.mysql);
        System.out.println(sqlStatements);
    }

    public static void sqlParser(String sql) {
        String databaseType = "MYSQL";
        SQLStatementParserExecutor sqlStatementParserExecutor =
                new SQLStatementParserExecutor(
                        databaseType, new CacheOption(1024 * 1024, 1024 * 1024), true);
        SQLStatement sqlStatement = sqlStatementParserExecutor.parse(sql);
        System.out.println(sqlStatement);
    }

    public static void main(String[] args) throws JSQLParserException {

        String sql0 = "select * from t_user";

        String sql1 =
                "\"SELECT col1 AS a, col2 AS b, col3 AS c FROM table WHERE col1 = 10 AND col2 = 20 AND col3 = 30\"";

        String sql2 =
                "SELECT SUM (salary) FROM emp WHERE salary BETWEEN 5000 AND 6000 AND joindate < date '2021-05-01' + interval 1 year;";

        String sql3 =
                "SELECT /*+ PARALLEL */ cfe.id_collateral_ref.nextval, id_collateral FROM (  SELECT DISTINCT a.id_collateral FROM cfe.collateral a LEFT JOIN cfe.collateral_ref b ON a.id_collateral = b.id_collateral WHERE b.id_collateral_ref IS NULL );";

        String sql4 =
                "SELECT\n"
                        + "    *\n"
                        + "FROM\n"
                        + "    (\n"
                        + "        SELECT\n"
                        + "            *\n"
                        + "        FROM\n"
                        + "            biz_fund_info\n"
                        + "        WHERE\n"
                        + "            tenant_code = ?\n"
                        + "        AND (\n"
                        + "            (ta_code, manager_code) IN ((?,?))\n"
                        + "            OR department_type IN (?)\n"
                        + "        )\n"
                        + "    )";

        String sql5 =
                "SELECT\n"
                        + "                b.date,\n"
                        + "                b.advertiser_company_id,\n"
                        + "                b.advertiser_id,\n"
                        + "                b.product_id,\n"
                        + "                b.company_id,\n"
                        + "                sum( impression ) AS impression,\n"
                        + "                sum( click ) AS click,\n"
                        + "                sum( target_work ) AS targetWork,\n"
                        + "                (\n"
                        + "                    SELECT\n"
                        + "                        sum( estimated_revenue ) AS estimatedRevenue\n"
                        + "                    FROM\n"
                        + "                        (\n"
                        + "                            SELECT\n"
                        + "                                ore.date,\n"
                        + "                                ore.advertiser_company_id,\n"
                        + "                                tir.advertiser_id,\n"
                        + "                                ore.product_id,\n"
                        + "                                ore.company_id\n"
                        + "                            FROM\n"
                        + "                                th_otherinfo ore\n"
                        + "                                    LEFT JOIN th_import_report tir ON ore.date = tir.date\n"
                        + "                                    AND ore.link_id = tir.link_id\n"
                        + "                            WHERE\n"
                        + "                                ore.date ='2021-6-7'\n"
                        + "                              AND ore.link_id = '440630'\n"
                        + "                            GROUP BY\n"
                        + "                                ore.advertiser_company_id,\n"
                        + "                                tir.advertiser_id,\n"
                        + "                                ore.product_id,\n"
                        + "                                ore.company_id\n"
                        + "                        ) b\n"
                        + "                            LEFT JOIN (\n"
                        + "                            SELECT\n"
                        + "                                ore.estimated_revenue,\n"
                        + "                                ore.advertiser_company_id,\n"
                        + "                                ore.company_id,\n"
                        + "                                tir.advertiser_id,\n"
                        + "                                tir.product_id,\n"
                        + "                                tir.date\n"
                        + "                            FROM\n"
                        + "                                th_otherinfo ore\n"
                        + "                                    LEFT JOIN th_import_report tir ON ore.date = tir.date\n"
                        + "                                    AND ore.link_id = tir.link_id\n"
                        + "                            GROUP BY\n"
                        + "                                tir.date,\n"
                        + "                                tir.link_id\n"
                        + "                        ) a ON a.date = b.date\n"
                        + "                            AND a.advertiser_company_id = b.advertiser_company_id\n"
                        + "                            AND a.advertiser_id = b.advertiser_id\n"
                        + "                            AND a.product_id = b.product_id\n"
                        + "                            AND a.company_id = b.company_id\n"
                        + "                    WHERE\n"
                        + "                        a.date ='2021-6-22'\n"
                        + "                ) AS estimatedRevenue\n"
                        + "            FROM\n"
                        + "                (\n"
                        + "                    SELECT\n"
                        + "                        ore.date,\n"
                        + "                        ore.advertiser_company_id,\n"
                        + "                        tir.advertiser_id,\n"
                        + "                        ore.product_id,\n"
                        + "                        ore.company_id\n"
                        + "                    FROM\n"
                        + "                        th_otherinfo ore\n"
                        + "                            LEFT JOIN th_import_report tir ON ore.date = tir.date\n"
                        + "                            AND ore.link_id = tir.link_id\n"
                        + "                    WHERE\n"
                        + "                        ore.date ='2021-6-7'\n"
                        + "                      AND ore.link_id = '440630'\n"
                        + "                    GROUP BY\n"
                        + "                        ore.advertiser_company_id,\n"
                        + "                        tir.advertiser_id,\n"
                        + "                        ore.product_id,\n"
                        + "                        ore.company_id\n"
                        + "                ) b\n"
                        + "                    LEFT JOIN (\n"
                        + "                    SELECT\n"
                        + "                        ore.target_work,\n"
                        + "                        ore.estimated_revenue,\n"
                        + "                        ore.advertiser_company_id,\n"
                        + "                        ore.company_id,\n"
                        + "                        tir.advertiser_id,\n"
                        + "                        tir.product_id,\n"
                        + "                        tir.date,\n"
                        + "                        tir.impression,\n"
                        + "                        tir.click\n"
                        + "                    FROM\n"
                        + "                        th_otherinfo ore\n"
                        + "                            LEFT JOIN th_import_report tir ON ore.date = tir.date\n"
                        + "                            AND ore.link_id = tir.link_id\n"
                        + "                ) a ON a.date = b.date\n"
                        + "                    AND a.advertiser_company_id = b.advertiser_company_id\n"
                        + "                    AND a.advertiser_id = b.advertiser_id\n"
                        + "                    AND a.product_id = b.product_id\n"
                        + "                    AND a.company_id = b.company_id\n"
                        + "            WHERE\n"
                        + "                a.date ='2021-6-22'";

        //        jsqlParser(sql4);
        //        transSql2();
        // transSql3();
        // transSql4();

        // SQLUtils.addCondition("select * from t where id = 0", "name = 'aaa'", null);
        jsqlParser(sql5);
        druidParser(sql5);
    }
}
