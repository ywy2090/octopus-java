package sharding.sphere.demo.sql.parser;

import com.alibaba.druid.DbType;
import com.alibaba.druid.sql.SQLUtils;
import com.alibaba.druid.sql.ast.SQLStatement;
import com.alibaba.druid.sql.ast.statement.SQLExprTableSource;
import com.alibaba.druid.sql.ast.statement.SQLTableSource;
import com.alibaba.druid.sql.dialect.mysql.visitor.MySqlASTVisitorAdapter;
import com.alibaba.druid.util.JdbcConstants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ExportTableAliasVisitor extends MySqlASTVisitorAdapter {
    private Map<String, SQLTableSource> aliasMap = new HashMap<String, SQLTableSource>();

    public boolean visit(SQLExprTableSource x) {
        String alias = x.getAlias();
        aliasMap.put(alias, x);
        return true;
    }

    public Map<String, SQLTableSource> getAliasMap() {
        return aliasMap;
    }
}

public class TEst {
    public static void main(String[] args) {
        DbType dbType = JdbcConstants.MYSQL; // JdbcConstants.MYSQL或者JdbcConstants.POSTGRESQL
        String sql = "select * from mytable a where a.id = 3";
        String sql1 = "DELETE a1, a2 FROM t1 AS a1 INNER JOIN t2 AS a2 WHERE a1.id=a2.id;";
        String sql2 =
                "DELETE FROM a1, a2 USING t1 AS a1 INNER JOIN t2 AS a2\n" + "WHERE a1.id=a2.id;";
        String sql3 = "REPLACE INTO test2 VALUES (1, 'Old', '2014-08-20 18:47:00');";

        List<SQLStatement> stmtList = SQLUtils.parseStatements(sql, dbType);

        ExportTableAliasVisitor visitor = new ExportTableAliasVisitor();
        for (SQLStatement stmt : stmtList) {
            stmt.accept(visitor);
        }

        SQLTableSource tableSource = visitor.getAliasMap().get("a");
        System.out.println(tableSource);
    }
}
