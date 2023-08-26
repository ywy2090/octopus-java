package sharding.sphere.demo.interceptor;

import com.alibaba.druid.sql.ast.SQLExpr;
import com.alibaba.druid.sql.ast.statement.SQLUpdateSetItem;
import com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlInsertStatement;
import com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlUpdateStatement;
import com.alibaba.druid.sql.dialect.mysql.visitor.MySqlASTVisitorAdapter;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class SQLRewriterVisitorAdapter extends MySqlASTVisitorAdapter {

    private static final Logger logger = LoggerFactory.getLogger(SQLRewriterVisitorAdapter.class);

    @Override
    public boolean visit(MySqlInsertStatement x) {
        String simpleName = x.getTableName().getSimpleName();
        List<SQLExpr> columns = x.getColumns();
        String columnsString = x.getColumnsString();
        logger.info(" tableName: {}, columns: {}", simpleName, columns);
        return true;
    }

    @Override
    public boolean visit(MySqlUpdateStatement x) {
        String simpleName = x.getTableName().getSimpleName();
        List<SQLUpdateSetItem> items = x.getItems();
        // logger.info(" tableName: {}, columns: {}", tableName, columns);
        return true;
    }
}
