package sharding.sphere.demo.sql.engine.expr;

import com.alibaba.druid.sql.SQLUtils;
import com.alibaba.druid.sql.ast.SQLExpr;
import com.alibaba.druid.sql.dialect.mysql.ast.expr.MySqlCharExpr;
import com.alibaba.druid.sql.dialect.mysql.ast.expr.MySqlExpr;
import com.alibaba.druid.sql.dialect.mysql.ast.expr.MySqlJSONTableExpr;
import com.alibaba.druid.sql.dialect.mysql.ast.expr.MySqlOrderingExpr;
import com.alibaba.druid.sql.dialect.mysql.ast.expr.MySqlOutFileExpr;
import com.alibaba.druid.sql.dialect.mysql.ast.expr.MySqlUserName;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WeFecMysqlExprVisitorImpl extends WeFecExprVisitorImpl
        implements WeFecMysqlExprVisitor {
    private static final Logger logger = LoggerFactory.getLogger(WeFecMysqlExprVisitorImpl.class);

    private Map<String, List<Object>> columnName2Value = new HashMap<>();
    private Map<Integer, String> variantRefIndex2ColumnName = new HashMap<>();

    @Override
    public void visit(SQLExpr x) {

        if (x instanceof MySqlExpr) {
            visit((MySqlExpr) (x));
            return;
        }

        if (x instanceof MySqlCharExpr) {
            visit((MySqlCharExpr) (x));
            return;
        }

        if (x instanceof MySqlJSONTableExpr) {
            visit((MySqlJSONTableExpr) (x));
            return;
        }

        if (x instanceof MySqlOrderingExpr) {
            visit((MySqlOrderingExpr) (x));
            return;
        }

        if (x instanceof MySqlOutFileExpr) {
            visit((MySqlOutFileExpr) (x));
            return;
        }

        if (x instanceof MySqlUserName) {
            visit((MySqlUserName) (x));
            return;
        }

        // 访问基类
        super.visit(x);
    }

    @Override
    public void visit(MySqlExpr x) {}

    @Override
    public void visit(MySqlCharExpr x) {
        String type = x.getType();
        String charset = x.getCharset();
        String collate = x.getCollate();
        String text = x.getText();
        tryResolveColumnNameAndStoreValue(x, text);
    }

    @Override
    public void visit(MySqlJSONTableExpr x) {}

    @Override
    public void visit(MySqlOrderingExpr x) {}

    @Override
    public void visit(MySqlOutFileExpr x) {}

    @Override
    public void visit(MySqlUserName x) {
        String userName = x.getUserName();
        String host = x.getHost();
        String identifiedBy = x.getIdentifiedBy();
        // throw new UnsupportedOperationException("不支持SQL表达式: " + x.getClass().getName());
    }

    @Override
    public void onResolveColumn(String tableName, String columnName, Object value) {
        List<Object> objects = columnName2Value.get(columnName);
        if (null == objects) {
            objects = new ArrayList<>();
            columnName2Value.put(columnName, objects);
        }
        objects.add(value);
        logger.info("解析列名: {}, 值: {}", columnName, value);
    }

    @Override
    public void onResolveVariantRefColumn(
            String tableName, String columnName, int variantRefIndex) {
        variantRefIndex2ColumnName.put(variantRefIndex, columnName);
        logger.info("解析占位符参数，索引: {}, 列名: {}", variantRefIndex, columnName);
    }

    public static void main(String[] args) {
        String sql =
                "t.a = ? and b = ? and c = ? and d = ? and t.e = 2 and f = 3 and g = ? and h = ? and t.i = 11";
        String sql1 = "t.a in (1,2,3,4,5)";
        String sql2 = "columnA=IF(columnB>0,1,columnA)";
        // SQLExpr sqlExpr = SQLUtils.toSQLExpr(sql + "and" + sql1);
        SQLExpr sqlExpr = SQLUtils.toSQLExpr(sql2);
        System.out.println(sqlExpr);

        WeFecMysqlExprVisitorImpl mysqlExprVisitor = new WeFecMysqlExprVisitorImpl();
        mysqlExprVisitor.visit(sqlExpr);
        System.out.println(mysqlExprVisitor);
    }
}
