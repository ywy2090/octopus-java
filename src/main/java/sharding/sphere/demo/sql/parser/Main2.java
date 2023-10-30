package sharding.sphere.demo.sql.parser;

import com.alibaba.druid.DbType;
import com.alibaba.druid.sql.SQLUtils;
import com.alibaba.druid.sql.ast.SQLStatement;
import com.alibaba.druid.sql.ast.statement.SQLSelect;
import com.alibaba.druid.sql.ast.statement.SQLSelectQueryBlock;
import com.alibaba.druid.sql.ast.statement.SQLSelectStatement;
import com.alibaba.druid.sql.dialect.mysql.parser.MySqlStatementParser;
import com.alibaba.druid.sql.dialect.mysql.visitor.MySqlSchemaStatVisitor;
import com.alibaba.druid.sql.parser.SQLParserUtils;
import com.alibaba.druid.sql.parser.SQLStatementParser;
import com.alibaba.druid.sql.visitor.ExportParameterVisitor;
import com.alibaba.druid.sql.visitor.ExportParameterVisitorUtils;
import com.alibaba.druid.sql.visitor.ParameterizedVisitor;
import com.alibaba.druid.stat.TableStat;
import com.alibaba.druid.util.JdbcConstants;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/** Created by ixyzero on 2019/5/10. */
public class Main2 {

    public static void main1(String[] args) {
        Object[][] sqlAndExpectedCases = {
            {"insert  into tab01(a,b,c) values('a1','b1',5)", 3, "a1"},
            {"select * from tab01 where a=1 and b='b1'", 2, 1},
            {"update tab01 set d='d1' where a=1 and b='b1'", 3, "d1"},
            {"delete from tab01 where a=1 and b='b1'", 2, 1.0}
        };

        String[] dbTypes = {
            "mysql", "oracle", "db2", DbType.postgresql.name(), DbType.jtds.name(), "not-found"
        };
        // String[]  dbTypes = { JdbcUtils.JTDS};
        for (String dbType : dbTypes) {
            System.out.println("dbType:" + dbType);
            for (Object[] arr : sqlAndExpectedCases) {
                final String sql = (String) arr[0];
                StringBuilder out = new StringBuilder();

                final SQLStatementParser parser =
                        SQLParserUtils.createSQLStatementParser(sql, DbType.of(dbType));
                final ParameterizedVisitor pVisitor =
                        (ParameterizedVisitor)
                                ExportParameterVisitorUtils.createExportParameterVisitor(
                                        out, DbType.of(dbType));
                final SQLStatement parseStatement = parser.parseStatement();
                parseStatement.accept(pVisitor);
                // final ExportParameterVisitor vistor2 = new MySqlExportParameterVisitor();
                // parseStatement.accept(vistor2);
                final ExportParameterVisitor vistor2 = (ExportParameterVisitor) pVisitor;
                System.out.println("before:" + sql);
                System.out.println("after:" + out);
                System.out.println("size:" + vistor2.getParameters());
                final int expectedSize = (Integer) arr[1];
            }
        }
    }

    public static void main(String[] args) {
        String sql =
                "SELECT\n"
                        + "  a.id,\n"
                        + "  username,\n"
                        + "  b.workflow_name,\n"
                        + "  reviewok_time\n"
                        + "FROM archer.sql_users a\n"
                        + "  JOIN sql_workflow b ON a.username = b.engineer;\n";
        // String sql = "select * from mytable a where a.id = 3";
        String sql1 = "DELETE a1, a2 FROM t1 AS a1 INNER JOIN t2 AS a2 WHERE a1.id=a2.id;";
        String sql2 =
                "DELETE FROM a1, a2 USING t1 AS a1 INNER JOIN t2 AS a2\n" + "WHERE a1.id=a2.id;";

        // 新建 MySQL Parser
        MySqlStatementParser parser = new MySqlStatementParser(sql1);

        // 使用Parser解析生成AST，这里SQLStatement就是AST
        SQLStatement statement = parser.parseStatement();

        // 使用visitor来访问AST
        MySqlSchemaStatVisitor visitor = new MySqlSchemaStatVisitor();
        statement.accept(visitor);

        // System.out.println(sql);

        System.out.println(visitor.getTables());
        System.out.println();

        // 从visitor中拿出你所关注的信息
        // System.out.println(visitor.getTables());
        // System.out.println();
        // System.out.println(visitor.getColumns());
        // System.out.println();

        // 使用mysql解析
        MySqlStatementParser mySqlStatementParser = new MySqlStatementParser(sql);

        // 解析select查询
        SQLSelectStatement sqlSelectStatement =
                (SQLSelectStatement) mySqlStatementParser.parseSelect();
        SQLSelect sqlSelect = sqlSelectStatement.getSelect();

        // 获取sql查询块
        SQLSelectQueryBlock sqlSelectQueryBlock = (SQLSelectQueryBlock) sqlSelect.getQuery();
        System.out.println(sqlSelectQueryBlock.getSelectList());

        // 格式化输出
        String result = SQLUtils.format(sql, JdbcConstants.MYSQL);
        System.out.println("\n");
        System.out.println(result); // 缺省大写格式
        List<SQLStatement> stmtList = SQLUtils.parseStatements(sql, JdbcConstants.MYSQL);

        // 解析出的独立语句的个数
        System.out.println("\nsize is:" + stmtList.size() + "\n");
        for (int i = 0; i < stmtList.size(); i++) {

            SQLStatement stmt = stmtList.get(i);

            MySqlSchemaStatVisitor visitorX = new MySqlSchemaStatVisitor();
            stmt.accept(visitorX);

            // Map<String, String> aliasmap = visitorX.getAliasMap();
            // for (Iterator iterator = aliasmap.keySet().iterator(); iterator.hasNext();) {
            //     String key = iterator.next().toString();
            //     System.out.println("[ALIAS]" + key + " - " + aliasmap.get(key));
            // }
            // //
            // Set<TableStat.Column> groupby_col = visitorX.getGroupByColumns();
            // for (Iterator iterator = groupby_col.iterator(); iterator.hasNext();) {
            //     TableStat.Column column = (TableStat.Column) iterator.next();
            //     System.out.println("[GROUP]" + column.toString());
            // }

            // 获取表名称
            System.out.println("table names:");
            Map<TableStat.Name, TableStat> tabmap = visitorX.getTables();
            for (Iterator iterator = tabmap.keySet().iterator(); iterator.hasNext(); ) {
                TableStat.Name name = (TableStat.Name) iterator.next();
                System.out.println(name.toString() + " - " + tabmap.get(name).toString());
            }
            // System.out.println("Tables : " + visitorX.getCurrentTable());
            // 获取操作方法名称,依赖于表名称
            System.out.println("Manipulation : " + visitorX.getTables());
            // 获取字段名称
            System.out.println("fields : " + visitorX.getColumns());
            System.out.println("");
        }
    }
}
