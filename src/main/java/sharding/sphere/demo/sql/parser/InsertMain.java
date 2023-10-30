package sharding.sphere.demo.sql.parser;

import com.alibaba.druid.DbType;
import com.alibaba.druid.sql.SQLUtils;
import com.alibaba.druid.sql.ast.SQLStatement;
import com.alibaba.druid.sql.dialect.mysql.visitor.MySqlSchemaStatVisitor;
import com.alibaba.druid.util.JdbcConstants;
import java.util.ArrayList;
import java.util.List;

public class InsertMain {
    public static void main(String[] args) {
        String sql0 =
                "insert into `test_user`(`account`, `user_name`, `age`, `sex`, `create_time`) values ('test1', 'test_user_1', 1, 0, now()) on duplicate key update `user_name` = 'test_user_1', `age` = 1, `sex` = 0";
        String sql1 =
                "INSERT INTO Customers (CustomerName, City, Country) SELECT SupplierName, City, Country FROM Suppliers";
        String sql2 = "insert  into tab01(a,b,c) values('a1','b1',5)";
        String sql3 =
                "INSERT INTO Customers (CustomerName, ContactName, Address, City, PostalCode, Country)\n"
                        + "VALUES ('Cardinal', 'Tom B. Erichsen', 'Skagen 21', 'Stavanger', '4006', 'Norway');";
        String sql4 =
                "INSERT INTO Customers (CustomerName, ContactName, Address, City, PostalCode, Country)\n"
                        + "VALUES\n"
                        + "('Cardinal', 'Tom B. Erichsen', 'Skagen 21', 'Stavanger', '4006', 'Norway'),\n"
                        + "('Greasy Burger', 'Per Olsen', 'Gateveien 15', 'Sandnes', '4306', 'Norway'),\n"
                        + "('Tasty Tee', 'Finn Egan', 'Streetroad 19B', 'Liverpool', 'L1 0AA', 'UK');";
        String sql5 =
                "INSERT INTO Customers (CustomerName, ContactName, Address, City, PostalCode, Country)\n"
                        + "SELECT SupplierName, ContactName, Address, City, PostalCode, Country FROM Suppliers;\n";
        String sql6 =
                "INSERT INTO Customers (CustomerName, City, Country)\n"
                        + "SELECT SupplierName, City, Country FROM Suppliers\n"
                        + "WHERE Country='Germany';";

        String sql7 =
                "INSERT INTO Customers (CustomerName, ContactName, Address, City, PostalCode, Country)\n"
                        + "VALUES (?, ?, ?, ?, ?, ?),(?, ?, ?, ?, ?, ?),(?, ?, ?, ?, ?, ？);";

        // 1. 解析插入表名
        // 2. 解析插入字段列表
        // 3. 解析插入字段值列表
        // 4. 解析占位符参数

        String sql8 =
                "INSERT INTO tbl (columnA,columnB,columnC) VALUES (1,2,3) ON DUPLICATE KEY UPDATE columnA=IF(columnB>0,1,columnA)";

        String sql9 =
                "delete student,studentquery from student,studentquery  where student.studentid = studentquery.studentid AND student.studentid=1813004;";

        DbType dbType = JdbcConstants.MYSQL;
        List<Object> params = new ArrayList<>();

        //        String psql = ParameterizedOutputVisitorUtils.parameterize(sql9, dbType, params);
        //        System.out.println(psql);

        List<SQLStatement> sqlStatements = SQLUtils.parseStatements(sql9, dbType);
        MySqlSchemaStatVisitor visitor = new MySqlSchemaStatVisitor();
        sqlStatements.get(0).accept(visitor);
        System.out.println(visitor);
    }
}
