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

        String mySqlString = SQLUtils.toMySqlString(sqlStatements.get(0));
        System.out.println(mySqlString);

        // SQLUtils.

        System.out.println(sqlStatements);
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
        // String sql = "select enc_user_name as user_name,enc_phone_number as
        // phone_number,enc_id_number as id_number from t_user where id_number=a AND phone_number >
        // b AND id_number like 'a%'";
        // String sql = "SELECT * FROM( SELECT * FROM biz_fund_info WHERE tenant_code = ? AND
        // ((ta_code, manager_code) IN ((?,?)) OR department_type IN (?) ))";
        // String sql = "SELECT col1 AS a, col2 AS b, col3 AS c FROM my_table WHERE col_1 = 10 AND
        // col_2 = 20 OR col_3 = 30";
        // String sql = "insert into `test_user`(`account`, `user_name`, `age`, `sex`,
        // `create_time`)values ('test1', 'test_user_1', 1, 0, now())on duplicate key update
        // `user_name` = 'test_user_1', `age` = 1, `sex` = 0";
        // String sql = "SELECT /*+ PARALLEL */ cfe.id_collateral_ref.nextval, id_collateral FROM
        // (SELECT DISTINCT a.id_collateral FROM cfe.collateral a LEFT JOIN cfe.collateral_ref b ON
        // a.id_collateral = b.id_collateral WHERE b.id_collateral_ref IS NULL )";
        String sql =
                "SELECT Persons.LastName, Persons.FirstName, Orders.OrderNo\n"
                        + "FROM Persons\n"
                        + "INNER JOIN Orders\n"
                        + "ON Persons.Id_P=Orders.Id_P\n"
                        + "ORDER BY Persons.LastName";
        druidParser(sql);
    }
}
