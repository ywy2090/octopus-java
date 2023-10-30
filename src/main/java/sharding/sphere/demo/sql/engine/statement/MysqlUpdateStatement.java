package sharding.sphere.demo.sql.engine.statement;

import com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlUpdateStatement;
import com.alibaba.druid.sql.dialect.mysql.visitor.MySqlASTVisitorAdapter;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
Single-table syntax:

UPDATE [LOW_PRIORITY] [IGNORE] table_reference
    SET assignment_list
    [WHERE where_condition]
    [ORDER BY ...]
    [LIMIT row_count]

value:
    {expr | DEFAULT}

assignment:
    col_name = value

assignment_list:
    assignment [, assignment] ...

Multiple-table syntax:

UPDATE [LOW_PRIORITY] [IGNORE] table_references
    SET assignment_list
    [WHERE where_condition]

https://dev.mysql.com/doc/refman/5.7/en/update.html
https://dev.mysql.com/doc/refman/5.7/en/expressions.html
*/

/** */
public class MysqlUpdateStatement extends MySqlASTVisitorAdapter {

    private static final Logger logger = LoggerFactory.getLogger(MysqlUpdateStatement.class);

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

    @Override
    public boolean visit(MySqlUpdateStatement x) {
        // TODO:
        return false;
    }
}
