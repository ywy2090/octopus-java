package sharding.sphere.demo.sql.engine.statement;

import com.alibaba.druid.DbType;
import com.alibaba.druid.sql.SQLUtils;
import com.alibaba.druid.sql.ast.SQLExpr;
import com.alibaba.druid.sql.ast.SQLObject;
import com.alibaba.druid.sql.ast.SQLStatement;
import com.alibaba.druid.sql.ast.expr.SQLBinaryOpExpr;
import com.alibaba.druid.sql.ast.expr.SQLIdentifierExpr;
import com.alibaba.druid.sql.ast.expr.SQLVariantRefExpr;
import com.alibaba.druid.sql.ast.statement.SQLExprTableSource;
import com.alibaba.druid.sql.ast.statement.SQLInsertStatement;
import com.alibaba.druid.sql.ast.statement.SQLSelect;
import com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlInsertStatement;
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
DELETE [LOW_PRIORITY] [QUICK] [IGNORE] FROM tbl_name
    [PARTITION (partition_name [, partition_name] ...)]
    [WHERE where_condition]
    [ORDER BY ...]
    [LIMIT row_count]

DELETE [LOW_PRIORITY] [QUICK] [IGNORE]
    tbl_name[.*] [, tbl_name[.*]] ...
    FROM table_references
    [WHERE where_condition]

DELETE [LOW_PRIORITY] [QUICK] [IGNORE]
    FROM tbl_name[.*] [, tbl_name[.*]] ...
    USING table_references
    [WHERE where_condition]

table_references:
    escaped_table_reference [, escaped_table_reference] ...

escaped_table_reference: {
    table_reference
  | { OJ table_reference }
}

table_reference: {
    table_factor
  | joined_table
}

table_factor: {
    tbl_name [PARTITION (partition_names)]
        [[AS] alias] [index_hint_list]
  | table_subquery [AS] alias
  | ( table_references )
}

joined_table: {
    table_reference [INNER | CROSS] JOIN table_factor [join_specification]
  | table_reference STRAIGHT_JOIN table_factor
  | table_reference STRAIGHT_JOIN table_factor ON search_condition
  | table_reference {LEFT|RIGHT} [OUTER] JOIN table_reference join_specification
  | table_reference NATURAL [{LEFT|RIGHT} [OUTER]] JOIN table_factor
}

join_specification: {
    ON search_condition
  | USING (join_column_list)
}

join_column_list:
    column_name [, column_name] ...

index_hint_list:
    index_hint [, index_hint] ...

index_hint: {
    USE {INDEX|KEY}
      [FOR {JOIN|ORDER BY|GROUP BY}] ([index_list])
  | {IGNORE|FORCE} {INDEX|KEY}
      [FOR {JOIN|ORDER BY|GROUP BY}] (index_list)
}

index_list:
    index_name [, index_name] ...


expr:
    expr OR expr
  | expr || expr
  | expr XOR expr
  | expr AND expr
  | expr && expr
  | NOT expr
  | ! expr
  | boolean_primary IS [NOT] {TRUE | FALSE | UNKNOWN}
  | boolean_primary

boolean_primary:
    boolean_primary IS [NOT] NULL
  | boolean_primary <=> predicate
  | boolean_primary comparison_operator predicate
  | boolean_primary comparison_operator {ALL | ANY} (subquery)
  | predicate

comparison_operator: = | >= | > | <= | < | <> | !=

predicate:
    bit_expr [NOT] IN (subquery)
  | bit_expr [NOT] IN (expr [, expr] ...)
  | bit_expr [NOT] BETWEEN bit_expr AND predicate
  | bit_expr SOUNDS LIKE bit_expr
  | bit_expr [NOT] LIKE simple_expr [ESCAPE simple_expr]
  | bit_expr [NOT] REGEXP bit_expr
  | bit_expr

bit_expr:
    bit_expr | bit_expr
  | bit_expr & bit_expr
  | bit_expr << bit_expr
  | bit_expr >> bit_expr
  | bit_expr + bit_expr
  | bit_expr - bit_expr
  | bit_expr * bit_expr
  | bit_expr / bit_expr
  | bit_expr DIV bit_expr
  | bit_expr MOD bit_expr
  | bit_expr % bit_expr
  | bit_expr ^ bit_expr
  | bit_expr + interval_expr
  | bit_expr - interval_expr
  | simple_expr

simple_expr:
    literal
  | identifier
  | function_call
  | simple_expr COLLATE collation_name
  | param_marker
  | variable
  | simple_expr || simple_expr
  | + simple_expr
  | - simple_expr
  | ~ simple_expr
  | ! simple_expr
  | BINARY simple_expr
  | (expr [, expr] ...)
  | ROW (expr, expr [, expr] ...)
  | (subquery)
  | EXISTS (subquery)
  | {identifier expr}
  | match_expr
  | case_expr
  | interval_expr

https://dev.mysql.com/doc/refman/5.7/en/delete.html
https://dev.mysql.com/doc/refman/5.7/en/expressions.html
*/

/** */
public class MysqlDeleteStatement extends MySqlASTVisitorAdapter {

    private static final Logger logger = LoggerFactory.getLogger(MysqlDeleteStatement.class);

    private String tableName;
    private List<String> columnNames = new ArrayList<>();
    private List<List<Object>> columnValues;

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

    public void visitSQLExpr(SQLExpr x) {
        System.out.println(x);
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
        sqlSelect.accept(this);
    }

    /**
     * 解析插入值
     *
     * @param valuesClause
     */
    public void visitValuesClause(SQLInsertStatement.ValuesClause valuesClause) {
        List<SQLExpr> values = valuesClause.getValues();
        for (SQLExpr value : values) {
            value.accept(this);
        }
    }

    /**
     * 解析 ON DUPLICATE KEY UPDATE
     *
     * @param x
     */
    public void visitDuplicateKeyUpdate(SQLExpr x) {
        //        if (!(sqlExpr instanceof SQLBinaryOpExpr)) {
        //            return;
        //        }

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

        WeFecMysqlExprVisitor weFecMysqlExprVisitor = new WeFecMysqlExprVisitorImpl();

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
    public boolean visit(MySqlInsertStatement x) {

        // 表名解析
        SQLExprTableSource tableSource = x.getTableSource();
        visitTableSource(tableSource);

        // 列名
        List<SQLExpr> columns = x.getColumns();
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

        // 查询
        SQLSelect query = x.getQuery();
        if (query != null) {
            visitSelectQuery(query);
        }

        // 重复Key
        List<SQLExpr> duplicateKeyUpdate = x.getDuplicateKeyUpdate();
        if (duplicateKeyUpdate != null) {
            for (SQLExpr sqlExpr : duplicateKeyUpdate) {
                visitDuplicateKeyUpdate(sqlExpr);
            }
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
                "insert into camera_info( zone1Id,zone1Name,zone2Id,zone2Name,zone3Id,zone3Name,zone4Id,zone4Name, cameraId )VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?) ON DUPLICATE KEY UPDATE zone1Id = VALUES(zone1Id),zone1Name = VALUES(zone1Name),zone2Id = VALUES(zone2Id), zone2Name = VALUES(zone2Name),zone3Id = VALUES(zone3Id),zone3Name = VALUES(zone3Name), zone4Id = VALUES(zone4Id),zone4Name = VALUES(zone4Name), cameraId = VALUES(cameraId)";

        String sql5 =
                "INSERT INTO Customers (CustomerName, ContactName, Address, City, PostalCode, Country)\n"
                        + "VALUES\n"
                        + "('Cardinal', 'Tom B. Erichsen', 'Skagen 21', 'Stavanger', '4006', 'Norway'),\n"
                        + "('Greasy Burger', 'Per Olsen', 'Gateveien 15', 'Sandnes', '4306', 'Norway'),\n"
                        + "('Tasty Tee', 'Finn Egan', 'Streetroad 19B', 'Liverpool', 'L1 0AA', 'UK');";

        String sql6 =
                "INSERT INTO table1 ( column1, column2, someInt, someVarChar )\n"
                        + "SELECT  table2.column1, table2.column2, 8, 'some string etc.'\n"
                        + "FROM    table2\n"
                        + "WHERE   table2.ID = 7;";

        List<SQLStatement> stmtList = SQLUtils.parseStatements(sql6, dbType);

        MysqlDeleteStatement visitor = new MysqlDeleteStatement();
        for (SQLStatement stmt : stmtList) {
            stmt.accept(visitor);
        }

        // System.out.println(" => ");
    }
}
