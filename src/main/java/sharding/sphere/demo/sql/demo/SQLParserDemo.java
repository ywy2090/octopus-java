package sharding.sphere.demo.sql.demo;

import com.alibaba.druid.sql.SQLUtils;
import com.alibaba.druid.sql.ast.SQLStatement;
import com.alibaba.druid.sql.dialect.mysql.visitor.MySqlSchemaStatVisitor;
import com.alibaba.druid.stat.TableStat;
import com.alibaba.druid.util.JdbcConstants;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class SQLParserDemo {

    public static String insertSQL_0 =
            "insert into `test_user`(`account`, `user_name`, `age`, `sex`, `create_time`) values ('test1', 'test_user_1', 1, 0, now()) on duplicate key update `user_name` = 'test_user_1', `age` = 1, `sex` = 0";
    public static String insertSQL_1 =
            "INSERT INTO Customers (CustomerName, City, Country) SELECT SupplierName, City, Country FROM Suppliers";
    public static String insertSQL_2 = "insert into tab01(a,b,c) values('a1','b1',5)";
    public static String insertSQL_3 =
            "INSERT INTO Customers (CustomerName, ContactName, Address, City, PostalCode, Country)\n"
                    + "VALUES ('Cardinal', 'Tom B. Erichsen', 'Skagen 21', 'Stavanger', '4006', 'Norway');";
    public static String insertSQL_4 =
            "INSERT INTO Customers (CustomerName, ContactName, Address, City, PostalCode, Country)\n"
                    + "VALUES\n"
                    + "('Cardinal', 'Tom B. Erichsen', 'Skagen 21', 'Stavanger', '4006', 'Norway'),\n"
                    + "('Greasy Burger', 'Per Olsen', 'Gateveien 15', 'Sandnes', '4306', 'Norway'),\n"
                    + "('Tasty Tee', 'Finn Egan', 'Streetroad 19B', 'Liverpool', 'L1 0AA', 'UK');";
    public static String insertSQL_5 =
            "INSERT INTO Customers (CustomerName, ContactName, Address, City, PostalCode, Country)\n"
                    + "SELECT SupplierName, ContactName, Address, City, PostalCode, Country FROM Suppliers;\n";
    public static String insertSQL_6 =
            "INSERT INTO Customers (CustomerName, City, Country)\n"
                    + "SELECT SupplierName, City, Country FROM Suppliers\n"
                    + "WHERE Country='Germany';";
    public static String insertSQL_7 =
            "INSERT INTO Customers (CustomerName, ContactName, Address, City, PostalCode, Country)\n"
                    + "VALUES (?, ?, ?, ?, ?, ?),(?, ?, ?, ?, ?, ?),(?, ?, ?, ?, ?, ？);";
    public static String insertSQL_8 =
            "INSERT INTO tbl (columnA,columnB,columnC) VALUES (1,2,3) ON DUPLICATE KEY UPDATE columnA=IF(columnB>0,1,columnA)";
    public static String insertSQL_9 =
            "insert into `test_user`(`account`, `user_name`, `age`, `sex`, `create_time`)values ('test1', 'test_user_1', 1, 0, now())on duplicate key update `user_name` = 'test_user_1', `age` = 1, `sex` = 0";

    public static String deleteSQL_0 =
            "delete student,studentquery from student,studentquery  where student.studentid = studentquery.studentid AND student.studentid=1813004;";
    public static String deleteSQL_1 =
            "DELETE a1, a2 FROM t1 AS a1 INNER JOIN t2 AS a2 WHERE a1.id=a2.id;";
    public static String deleteSQL_2 =
            "DELETE FROM a1, a2 USING t1 AS a1 INNER JOIN t2 AS a2 WHERE a1.id=a2.id;";
    public static String deleteSQL_3 = "delete from tab01 where a=1 and b='b1'";

    public static String replaceSQL_0 =
            "REPLACE INTO test2 VALUES (1, 'Old', '2014-08-20 18:47:00');";

    public static String selectSQL_0 = "select * from mytable a where a.id = 3";
    public static String selectSQL_1 =
            "SELECT a.id, username, b.workflow_name, reviewok_time FROM archer.sql_users a JOIN sql_workflow b ON a.username = b.engineer;";
    public static String selectSQL_2 =
            "select enc_user_name as user_name,enc_phone_number as phone_number,enc_id_number as id_number from t_user where id_number=a AND phone_number > b AND id_number like 'a%'";
    public static String selectSQL_3 =
            "SELECT * FROM( SELECT * FROM biz_fund_info WHERE tenant_code = ? AND ((ta_code, manager_code) IN ((?,?)) OR department_type IN (?) ))";
    public static String selectSQL_4 =
            "SELECT col1 AS a, col2 AS b, col3 AS c FROM my_table WHERE col_1 = 10 AND col_2 = 20 OR col_3 = 30";
    public static String selectSQL_5 =
            "SELECT /*+ PARALLEL */ cfe.id_collateral_ref.nextval, id_collateral FROM (SELECT DISTINCT a.id_collateral FROM cfe.collateral a LEFT JOIN cfe.collateral_ref b ON a.id_collateral = b.id_collateral WHERE b.id_collateral_ref IS NULL )";
    public static String selectSQL_6 =
            "SELECT Persons.LastName, Persons.FirstName, Orders.OrderNo FROM Persons INNER JOIN Orders ON Persons.Id_P=Orders.Id_P ORDER BY Persons.LastName";

    public static String selectSQL_7 =
            "select ((0='x6') & 31) ^ (ROW(76, 4) NOT IN (ROW(1, 2 ),ROW(3, 4)) )";

    public static void main(String[] args) {

        String sql = selectSQL_6;

        // 新建 MySQL Parser
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
