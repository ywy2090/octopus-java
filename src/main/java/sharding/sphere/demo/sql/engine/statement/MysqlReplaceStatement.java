package sharding.sphere.demo.sql.engine.statement;

import com.alibaba.druid.DbType;
import com.alibaba.druid.sql.SQLUtils;
import com.alibaba.druid.sql.ast.SQLExpr;
import com.alibaba.druid.sql.ast.SQLObject;
import com.alibaba.druid.sql.ast.SQLStatement;
import com.alibaba.druid.sql.ast.expr.SQLBinaryOpExpr;
import com.alibaba.druid.sql.ast.expr.SQLIdentifierExpr;
import com.alibaba.druid.sql.ast.expr.SQLQueryExpr;
import com.alibaba.druid.sql.ast.expr.SQLVariantRefExpr;
import com.alibaba.druid.sql.ast.statement.SQLExprTableSource;
import com.alibaba.druid.sql.ast.statement.SQLInsertStatement;
import com.alibaba.druid.sql.ast.statement.SQLReplaceStatement;
import com.alibaba.druid.sql.ast.statement.SQLSelect;
import com.alibaba.druid.sql.dialect.mysql.visitor.MySqlASTVisitorAdapter;
import com.alibaba.druid.util.JdbcConstants;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sharding.sphere.demo.sql.engine.expr.WeFecMysqlExprVisitor;
import sharding.sphere.demo.sql.engine.expr.WeFecMysqlExprVisitorImpl;
import sharding.sphere.demo.sql.engine.utils.Utils;

/*
REPLACE [LOW_PRIORITY | DELAYED]
    [INTO] tbl_name
    [PARTITION (partition_name [, partition_name] ...)]
    [(col_name [, col_name] ...)]
    {VALUES | VALUE} (value_list) [, (value_list)] ...

REPLACE [LOW_PRIORITY | DELAYED]
    [INTO] tbl_name
    [PARTITION (partition_name [, partition_name] ...)]
    SET assignment_list

REPLACE [LOW_PRIORITY | DELAYED]
    [INTO] tbl_name
    [PARTITION (partition_name [, partition_name] ...)]
    [(col_name [, col_name] ...)]
    SELECT ...

value:
    {expr | DEFAULT}

value_list:
    value [, value] ...

assignment:
    col_name = value

assignment_list:
    assignment [, assignment] ...

https://dev.mysql.com/doc/refman/5.7/en/replace.html
*/

/** */
public class MysqlReplaceStatement extends MySqlASTVisitorAdapter {

    private static final Logger logger = LoggerFactory.getLogger(MysqlReplaceStatement.class);

    private boolean insertFromInsert = false;

    private String tableName;
    private List<String> columnNames = new ArrayList<>();
    private List<List<Object>> columnValues;

    public boolean isInsertFromInsert() {
        return insertFromInsert;
    }

    public void setInsertFromInsert(boolean insertFromInsert) {
        this.insertFromInsert = insertFromInsert;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public List<String> getColumnNames() {
        return columnNames;
    }

    public void setColumnNames(List<String> columnNames) {
        this.columnNames = columnNames;
    }

    @Override
    public boolean visit(SQLExprTableSource x) {
        SQLExpr expr = x.getExpr();
        if (!(expr instanceof SQLIdentifierExpr)) {
            return true;
        }

        // 额外的表名，来自查询？
        SQLIdentifierExpr identifierExpr = (SQLIdentifierExpr) expr;
        String name = identifierExpr.getName();
        String tableName = Utils.trimTableOrColumnName(name);

        logger.info("额外的表名: " + tableName);

        return true;
    }

    @Override
    public boolean visit(SQLInsertStatement.ValuesClause x) {
        List<SQLExpr> values = x.getValues();
        System.out.println("ValuesClause:" + x);
        return false;
    }

    @Override
    public boolean visit(SQLVariantRefExpr x) {
        // 占位符参数
        SQLObject parent = x.getParent();
        if (parent == null) {
            return true;
        }

        // 二元操作符
        if (parent instanceof SQLBinaryOpExpr) {
            SQLBinaryOpExpr binaryOpExpr = (SQLBinaryOpExpr) parent;
            SQLExpr right = binaryOpExpr.getRight();
            SQLExpr left = binaryOpExpr.getLeft();

            if (x.equals(right) && (left instanceof SQLIdentifierExpr)) {
                // 列
                SQLIdentifierExpr identifierExpr = (SQLIdentifierExpr) left;
                String name = identifierExpr.getName();
                String columnName = Utils.trimTableOrColumnName(name);

                logger.info("占位符参数列名: {}, 占位符索引: {}", columnName, x.getIndex());
            }
        }

        // TODO: 其他操作，ie: in [a, b, c]

        return false;
    }

    /**
     * 解析插入表名
     *
     * @param x
     */
    public void visitTableSource(SQLExprTableSource x) {
        SQLExpr expr = x.getExpr();
        if (!(expr instanceof SQLIdentifierExpr)) {
            return;
        }

        //
        String alias = x.getAlias();

        // 表名
        SQLIdentifierExpr identifierExpr = (SQLIdentifierExpr) expr;
        String name = identifierExpr.getName();
        String tableName = Utils.trimTableOrColumnName(name);

        setTableName(tableName);
        logger.info("表名: {}", tableName);
    }

    /**
     * 解析插入列
     *
     * @param x
     */
    public void visitColumn(SQLExpr x) {
        if (x instanceof SQLIdentifierExpr) {
            SQLIdentifierExpr sqlIdentifierExpr = (SQLIdentifierExpr) x;
            String name = sqlIdentifierExpr.getName();
            String columnName = Utils.trimTableOrColumnName(name);
            columnNames.add(columnName);
            logger.info("列名: {}", columnName);
        }
    }

    /**
     * 查询
     *
     * @param sqlSelect
     */
    public void visitSelectQuery(SQLSelect sqlSelect) {
        setInsertFromInsert(true);
        // TODO: 子查询
        sqlSelect.accept(this);
    }

    /**
     * 解析插入值
     *
     * @param valuesClause
     */
    public void visitValuesClause(SQLInsertStatement.ValuesClause valuesClause) {
        List<SQLExpr> values = valuesClause.getValues();
    }

    /**
     * 解析 ON DUPLICATE KEY UPDATE
     *
     * @param x
     */
    public void visitDuplicateKeyUpdate(SQLExpr x) {
        // format: col_name = value
        //  right col_name
        //  left  value
        SQLBinaryOpExpr binaryOpExpr = (SQLBinaryOpExpr) x;
        SQLExpr right = binaryOpExpr.getRight();
        SQLExpr left = binaryOpExpr.getLeft();

        // col_name
        SQLIdentifierExpr columnExpr = (SQLIdentifierExpr) left;
        String rowColumnName = columnExpr.getName();
        String columnName = Utils.trimTableOrColumnName(rowColumnName);

        logger.info("ON DUPLICATE KEY UPDATE, 列名: {}", columnName);

        WeFecMysqlExprVisitor mysqlExprVisitor = new WeFecMysqlExprVisitorImpl();
        mysqlExprVisitor.visit(right);

        /*
        // value
        if (right instanceof SQLValuableExpr) { // 1. 值
            right.accept(this);
        } else if (right instanceof SQLVariantRefExpr) { // 2. ?
            right.accept(this);
        } else if (right instanceof SQLMethodInvokeExpr) { // 3. 函数调用表达式
            SQLMethodInvokeExpr sqlMethodInvokeExpr = (SQLMethodInvokeExpr) right;
            String methodName = sqlMethodInvokeExpr.getMethodName();
            List<SQLExpr> arguments = sqlMethodInvokeExpr.getArguments();
            List children = sqlMethodInvokeExpr.getChildren();
            SQLExpr aFor = sqlMethodInvokeExpr.getFor();
            SQLExpr from = sqlMethodInvokeExpr.getFrom();

            // TODO: Implement

        } else { // 4. 其他格式 ie: a + 1
            visitSQLExpr(right);
        }
        */
    }

    @Override
    public boolean visit(SQLReplaceStatement x) {

        // 表名解析
        SQLExprTableSource tableSource = x.getTableSource();
        visitTableSource(tableSource);

        // 列名
        List<SQLExpr> columns = x.getColumns();
        // TODO: columns 为空, desc查询表结构，填充所有字段
        if (columns != null) {
            for (SQLExpr sqlExpr : columns) {
                visitColumn(sqlExpr);
            }
        }

        // value值
        List<SQLInsertStatement.ValuesClause> valuesList = x.getValuesList();
        if (valuesList != null) {
            for (SQLInsertStatement.ValuesClause valuesClause : valuesList) {
                visitValuesClause(valuesClause);
            }
        }

        /*
        // 重复Key
        List<SQLExpr> duplicateKeyUpdate = x.getDuplicateKeyUpdate();
        if (duplicateKeyUpdate != null) {
            for (SQLExpr sqlExpr : duplicateKeyUpdate) {
                visitDuplicateKeyUpdate(sqlExpr);
            }
        }
        */

        // 查询
        SQLQueryExpr query = x.getQuery();
        if (query != null) {
            // visitSelectQuery(query);
        }

        return false;
    }

    public static void main(String[] args) {
        DbType dbType = JdbcConstants.MYSQL; // JdbcConstants.MYSQL或者JdbcConstants.POSTGRESQL
        String sql = "select * from mytable a where a.id = 3";

        String sql1 =
                "INSERT INTO Customers (CustomerName, ContactName, Address, City, PostalCode, Country)\n"
                        + "VALUES (?, ?, ?, ?, ?, ?),(?, ?, ?, ?, ?, ?),(?, ?, ?, ?, ?, ？);";
        String sql0 =
                "insert into `test_user`(`account`, `user_name`, `age`, `sex`, `create_time`) values ('test1', 'test_user_1', ?, ?, now()) on duplicate key update `user_name` = 'octo', `age`= IF(age>10,11,age), `sex` = 'male')";
        String sql2 =
                "INSERT INTO tbl (columnA,columnB,columnC) VALUES (1,2,3) ON DUPLICATE KEY UPDATE columnA=IF(columnB>0,1,columnA)";
        String sql3 = "INSERT INTO t(a,b,c) VALUES (1,2,3) ON DUPLICATE KEY UPDATE c=c+1;";

        String sql4 =
                "insert into camera_info( zone1Id,zone1Name,zone2Id,zone2Name,zone3Id,zone3Name,zone4Id,zone4Name, cameraId ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?) ON DUPLICATE KEY UPDATE zone1Id = VALUES(zone1Id),zone1Name = VALUES(zone1Name),zone2Id = VALUES(zone2Id), zone2Name = VALUES(zone2Name),zone3Id = VALUES(zone3Id),zone3Name = VALUES(zone3Name), zone4Id = VALUES(zone4Id),zone4Name = VALUES(zone4Name), cameraId = VALUES(cameraId)";

        String sql5 =
                "INSERT INTO Customers (CustomerName, ContactName, Address, City, PostalCode, Country)\n"
                        + "VALUES\n"
                        + "('Cardinal', 'Tom B. Erichsen', 'Skagen 21', 'Stavanger', '4006', 'Norway'),\n"
                        + "('Greasy Burger', 'Per Olsen', 'Gateveien 15', 'Sandnes', '4306', 'Norway'),\n"
                        + "('Tasty Tee', 'Finn Egan', 'Streetroad 19B', 'Liverpool', 'L1 0AA', 'UK');";

        List<SQLStatement> stmtList = SQLUtils.parseStatements(sql3, dbType);

        MysqlReplaceStatement visitor = new MysqlReplaceStatement();
        for (SQLStatement stmt : stmtList) {
            stmt.accept(visitor);
        }

        System.out.println(" => ");
    }
}
