package sharding.sphere.demo.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 1、导入驱动jar包
        // 2、注册驱动
        String driverClassName = "sharding.sphere.demo.jdbc.MyDriver";
        // String driverClassName = "com.mysql.jdbc.Driver";
        Class.forName(driverClassName);

        Properties properties = new Properties();
        properties.put("user", "root");
        properties.put("password", "123456");
        properties.put("extra", "xxx");

        // 3、获取连接对象
        Connection con =
                DriverManager.getConnection(
                        "jdbc:mysql://127.0.0.1:3306/sharding_sphere?serverTimezone=UTC&useSSL=false&useUnicode=true&characterEncoding=UTF-8",
                        properties);

        // 4、定义sql语句
        {
            // 插入
            String sql = "insert into t_user(user_name, id_number, phone_number) values (?,?,?)";

            try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
                preparedStatement.setString(1, "octo");
                preparedStatement.setString(2, "123458");
                preparedStatement.setString(3, "157...");

                int count = preparedStatement.executeUpdate();
                System.out.println("插入结果: " + count);
            }
        }

        {
            // 查询
            String sql = "select user_name, id_number, phone_number from t_user";
            try (PreparedStatement preparedStatement = con.prepareStatement(sql); ) {
                ResultSet resultSet = preparedStatement.executeQuery();
                System.out.println(" userName   idNumber   phoneNumber ");
                while (resultSet.next()) {
                    String userName = resultSet.getString(1);
                    String idNumber = resultSet.getString(2);
                    String phoneNumber = resultSet.getString(3);
                    System.out.print(userName);
                    System.out.print("\t");
                    System.out.print(idNumber);
                    System.out.print("\t");
                    System.out.print(phoneNumber);
                    System.out.println();
                }

                // 结果元信息
                ResultSetMetaData metaData = preparedStatement.getMetaData();
                int columnCount = metaData.getColumnCount();
                for (int i = 1; i <= columnCount; i++) {
                    String tableName = metaData.getTableName(i);
                    String columnClassName = metaData.getColumnClassName(i);
                    String catalogName = metaData.getCatalogName(i);
                    String columnName = metaData.getColumnName(i);
                    String schemaName = metaData.getSchemaName(i);
                    String columnLabel = metaData.getColumnLabel(i);
                    int scale = metaData.getScale(i);
                    int columnType = metaData.getColumnType(i);
                    String columnTypeName = metaData.getColumnTypeName(i);
                    System.out.println(" " + i + ". tableName: " + tableName);
                    System.out.println(" " + i + ". columnName: " + columnName);
                    System.out.println(" " + i + ". schemaName: " + schemaName);
                    System.out.println(" " + i + ". columnClassName: " + columnClassName);
                    System.out.println(" " + i + ". catalogName: " + catalogName);
                    System.out.println(" " + i + ". columnLabel: " + columnLabel);
                    System.out.println(" " + i + ". scale: " + scale);
                    System.out.println(" " + i + ". columnType: " + columnType);
                    System.out.println(" " + i + ". columnTypeName: " + columnTypeName);
                }
            }
        }

        // 8、释放资源
        con.close();
    }
}
