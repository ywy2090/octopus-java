package sharding.sphere.demo.sql.engine.expr;

import com.alibaba.druid.sql.ast.SQLExpr;
import com.alibaba.druid.sql.ast.SQLObject;
import com.alibaba.druid.sql.ast.expr.SQLAggregateExpr;
import com.alibaba.druid.sql.ast.expr.SQLAllColumnExpr;
import com.alibaba.druid.sql.ast.expr.SQLAllExpr;
import com.alibaba.druid.sql.ast.expr.SQLAnyExpr;
import com.alibaba.druid.sql.ast.expr.SQLArrayExpr;
import com.alibaba.druid.sql.ast.expr.SQLBetweenExpr;
import com.alibaba.druid.sql.ast.expr.SQLBigIntExpr;
import com.alibaba.druid.sql.ast.expr.SQLBinaryOpExpr;
import com.alibaba.druid.sql.ast.expr.SQLBinaryOpExprGroup;
import com.alibaba.druid.sql.ast.expr.SQLBinaryOperator;
import com.alibaba.druid.sql.ast.expr.SQLBooleanExpr;
import com.alibaba.druid.sql.ast.expr.SQLCaseExpr;
import com.alibaba.druid.sql.ast.expr.SQLCastExpr;
import com.alibaba.druid.sql.ast.expr.SQLCharExpr;
import com.alibaba.druid.sql.ast.expr.SQLContainsExpr;
import com.alibaba.druid.sql.ast.expr.SQLCurrentOfCursorExpr;
import com.alibaba.druid.sql.ast.expr.SQLDateExpr;
import com.alibaba.druid.sql.ast.expr.SQLDateTimeExpr;
import com.alibaba.druid.sql.ast.expr.SQLDbLinkExpr;
import com.alibaba.druid.sql.ast.expr.SQLDecimalExpr;
import com.alibaba.druid.sql.ast.expr.SQLDefaultExpr;
import com.alibaba.druid.sql.ast.expr.SQLDoubleExpr;
import com.alibaba.druid.sql.ast.expr.SQLExistsExpr;
import com.alibaba.druid.sql.ast.expr.SQLExtractExpr;
import com.alibaba.druid.sql.ast.expr.SQLFlashbackExpr;
import com.alibaba.druid.sql.ast.expr.SQLFloatExpr;
import com.alibaba.druid.sql.ast.expr.SQLGroupingSetExpr;
import com.alibaba.druid.sql.ast.expr.SQLHexExpr;
import com.alibaba.druid.sql.ast.expr.SQLIdentifierExpr;
import com.alibaba.druid.sql.ast.expr.SQLInListExpr;
import com.alibaba.druid.sql.ast.expr.SQLInSubQueryExpr;
import com.alibaba.druid.sql.ast.expr.SQLIntegerExpr;
import com.alibaba.druid.sql.ast.expr.SQLIntervalExpr;
import com.alibaba.druid.sql.ast.expr.SQLJSONExpr;
import com.alibaba.druid.sql.ast.expr.SQLListExpr;
import com.alibaba.druid.sql.ast.expr.SQLLiteralExpr;
import com.alibaba.druid.sql.ast.expr.SQLMatchAgainstExpr;
import com.alibaba.druid.sql.ast.expr.SQLMethodInvokeExpr;
import com.alibaba.druid.sql.ast.expr.SQLNCharExpr;
import com.alibaba.druid.sql.ast.expr.SQLNotExpr;
import com.alibaba.druid.sql.ast.expr.SQLNullExpr;
import com.alibaba.druid.sql.ast.expr.SQLNumberExpr;
import com.alibaba.druid.sql.ast.expr.SQLNumericLiteralExpr;
import com.alibaba.druid.sql.ast.expr.SQLPropertyExpr;
import com.alibaba.druid.sql.ast.expr.SQLQueryExpr;
import com.alibaba.druid.sql.ast.expr.SQLRealExpr;
import com.alibaba.druid.sql.ast.expr.SQLSequenceExpr;
import com.alibaba.druid.sql.ast.expr.SQLSizeExpr;
import com.alibaba.druid.sql.ast.expr.SQLSmallIntExpr;
import com.alibaba.druid.sql.ast.expr.SQLSomeExpr;
import com.alibaba.druid.sql.ast.expr.SQLTextLiteralExpr;
import com.alibaba.druid.sql.ast.expr.SQLTimeExpr;
import com.alibaba.druid.sql.ast.expr.SQLTimestampExpr;
import com.alibaba.druid.sql.ast.expr.SQLTinyIntExpr;
import com.alibaba.druid.sql.ast.expr.SQLUnaryExpr;
import com.alibaba.druid.sql.ast.expr.SQLValuableExpr;
import com.alibaba.druid.sql.ast.expr.SQLValuesExpr;
import com.alibaba.druid.sql.ast.expr.SQLVariantRefExpr;
import com.alibaba.druid.sql.ast.statement.SQLSelect;
import com.alibaba.druid.sql.dialect.mysql.ast.expr.MySqlCharExpr;
import com.alibaba.druid.sql.dialect.mysql.ast.expr.MySqlExpr;
import com.alibaba.druid.sql.dialect.mysql.ast.expr.MySqlJSONTableExpr;
import com.alibaba.druid.sql.dialect.mysql.ast.expr.MySqlOrderingExpr;
import com.alibaba.druid.sql.dialect.mysql.ast.expr.MySqlOutFileExpr;
import com.alibaba.druid.sql.dialect.mysql.ast.expr.MySqlUserName;
import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sharding.sphere.demo.sql.engine.utils.Utils;

public abstract class WeFecExprVisitorImpl implements WeFecExprVisitor {
    private static final Logger logger = LoggerFactory.getLogger(WeFecExprVisitorImpl.class);

    // ----------------------------------------------------------------
    public abstract void onResolveColumn(String tableName, String columnName, Object value);

    public abstract void onResolveVariantRefColumn(
            String tableName, String columnName, int variantRefIndex);
    // ----------------------------------------------------------------

    @Override
    public void visit(SQLExpr x) {
        if (x instanceof SQLAggregateExpr) {
            visit((SQLAggregateExpr) (x));
            return;
        }

        if (x instanceof SQLAllColumnExpr) {
            visit((SQLAllColumnExpr) (x));
            return;
        }

        if (x instanceof SQLAllExpr) {
            visit((SQLAllExpr) (x));
            return;
        }

        if (x instanceof SQLAnyExpr) {
            visit((SQLAnyExpr) (x));
            return;
        }

        if (x instanceof SQLArrayExpr) {
            visit((SQLArrayExpr) (x));
            return;
        }

        if (x instanceof SQLBetweenExpr) {
            visit((SQLBetweenExpr) (x));
            return;
        }

        if (x instanceof SQLBigIntExpr) {
            visit((SQLBigIntExpr) (x));
            return;
        }

        if (x instanceof SQLBinaryOpExpr) {
            visit((SQLBinaryOpExpr) (x));
            return;
        }

        if (x instanceof SQLBinaryOpExprGroup) {
            visit((SQLBinaryOpExprGroup) (x));
            return;
        }

        if (x instanceof SQLBooleanExpr) {
            visit((SQLBooleanExpr) (x));
            return;
        }

        if (x instanceof SQLCaseExpr) {
            visit((SQLCaseExpr) (x));
            return;
        }

        if (x instanceof SQLCastExpr) {
            visit((SQLCastExpr) (x));
            return;
        }

        if (x instanceof SQLCharExpr) {
            visit((SQLCharExpr) (x));
            return;
        }

        if (x instanceof SQLContainsExpr) {
            visit((SQLContainsExpr) (x));
            return;
        }

        if (x instanceof SQLCurrentOfCursorExpr) {
            visit((SQLCurrentOfCursorExpr) (x));
            return;
        }

        if (x instanceof SQLDateExpr) {
            visit((SQLDateExpr) (x));
            return;
        }

        if (x instanceof SQLDateTimeExpr) {
            visit((SQLDateTimeExpr) (x));
            return;
        }

        if (x instanceof SQLDbLinkExpr) {
            visit((SQLDbLinkExpr) (x));
            return;
        }

        if (x instanceof SQLDecimalExpr) {
            visit((SQLDecimalExpr) (x));
            return;
        }

        if (x instanceof SQLDefaultExpr) {
            visit((SQLDefaultExpr) (x));
            return;
        }

        if (x instanceof SQLDoubleExpr) {
            visit((SQLDoubleExpr) (x));
            return;
        }

        if (x instanceof SQLExistsExpr) {
            visit((SQLExistsExpr) (x));
            return;
        }

        if (x instanceof SQLExtractExpr) {
            visit((SQLExtractExpr) (x));
            return;
        }

        if (x instanceof SQLFlashbackExpr) {
            visit((SQLFlashbackExpr) (x));
            return;
        }

        if (x instanceof SQLFloatExpr) {
            visit((SQLFloatExpr) (x));
            return;
        }

        if (x instanceof SQLGroupingSetExpr) {
            visit((SQLGroupingSetExpr) (x));
            return;
        }

        if (x instanceof SQLHexExpr) {
            visit((SQLHexExpr) (x));
            return;
        }

        if (x instanceof SQLIdentifierExpr) {
            visit((SQLIdentifierExpr) (x));
            return;
        }

        if (x instanceof SQLInListExpr) {
            visit((SQLInListExpr) (x));
            return;
        }

        if (x instanceof SQLInSubQueryExpr) {
            visit((SQLInSubQueryExpr) (x));
            return;
        }

        if (x instanceof SQLIntegerExpr) {
            visit((SQLIntegerExpr) (x));
            return;
        }

        if (x instanceof SQLIntervalExpr) {
            visit((SQLIntervalExpr) (x));
            return;
        }

        if (x instanceof SQLJSONExpr) {
            visit((SQLJSONExpr) (x));
            return;
        }

        if (x instanceof SQLListExpr) {
            visit((SQLListExpr) (x));
            return;
        }

        if (x instanceof SQLLiteralExpr) {
            visit((SQLLiteralExpr) (x));
            return;
        }

        if (x instanceof SQLMatchAgainstExpr) {
            visit((SQLMatchAgainstExpr) (x));
            return;
        }

        if (x instanceof SQLMethodInvokeExpr) {
            visit((SQLMethodInvokeExpr) (x));
            return;
        }

        if (x instanceof SQLNCharExpr) {
            visit((SQLNCharExpr) (x));
            return;
        }

        if (x instanceof SQLNotExpr) {
            visit((SQLNotExpr) (x));
            return;
        }

        if (x instanceof SQLNullExpr) {
            visit((SQLNullExpr) (x));
            return;
        }

        if (x instanceof SQLNumberExpr) {
            visit((SQLNumberExpr) (x));
            return;
        }

        if (x instanceof SQLNumericLiteralExpr) {
            visit((SQLNumericLiteralExpr) (x));
            return;
        }

        if (x instanceof SQLPropertyExpr) {
            visit((SQLPropertyExpr) (x));
            return;
        }

        if (x instanceof SQLQueryExpr) {
            visit((SQLQueryExpr) (x));
            return;
        }

        if (x instanceof SQLRealExpr) {
            visit((SQLRealExpr) (x));
            return;
        }

        if (x instanceof SQLSequenceExpr) {
            visit((SQLSequenceExpr) (x));
            return;
        }

        if (x instanceof SQLSizeExpr) {
            visit((SQLSizeExpr) (x));
            return;
        }

        if (x instanceof SQLSmallIntExpr) {
            visit((SQLSmallIntExpr) (x));
            return;
        }

        if (x instanceof SQLSomeExpr) {
            visit((SQLSomeExpr) (x));
            return;
        }

        if (x instanceof SQLTextLiteralExpr) {
            visit((SQLTextLiteralExpr) (x));
            return;
        }

        if (x instanceof SQLTimeExpr) {
            visit((SQLTimeExpr) (x));
            return;
        }

        if (x instanceof SQLTimestampExpr) {
            visit((SQLTimestampExpr) (x));
            return;
        }

        if (x instanceof SQLTinyIntExpr) {
            visit((SQLTinyIntExpr) (x));
            return;
        }

        if (x instanceof SQLUnaryExpr) {
            visit((SQLUnaryExpr) (x));
            return;
        }

        if (x instanceof SQLValuableExpr) {
            visit((SQLValuableExpr) (x));
            return;
        }

        if (x instanceof SQLValuesExpr) {
            visit((SQLValuesExpr) (x));
            return;
        }

        if (x instanceof SQLVariantRefExpr) {
            visit((SQLVariantRefExpr) (x));
            return;
        }

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

        throw new UnsupportedOperationException("不支持SQL表达式: " + x.getClass().getName());
    }

    // --------------------------------值类型表达式 开始--------------------------------

    /** bool */
    @Override
    public void visit(SQLBooleanExpr x) {
        boolean value = x.getValue().booleanValue();
        tryResolveColumnNameAndStoreValue(x, value);
    }

    /** char */
    @Override
    public void visit(SQLCharExpr x) {
        String value = x.getText();
        tryResolveColumnNameAndStoreValue(x, value);
    }

    /** tinyint */
    @Override
    public void visit(SQLTinyIntExpr x) {
        Byte value = x.getValue();
        tryResolveColumnNameAndStoreValue(x, value);
    }

    /** smallint */
    @Override
    public void visit(SQLSmallIntExpr x) {
        Short value = x.getValue();
        tryResolveColumnNameAndStoreValue(x, value);
    }

    /** integer */
    @Override
    public void visit(SQLIntegerExpr x) {
        int value = x.getNumber().intValue();
        tryResolveColumnNameAndStoreValue(x, value);
    }

    /** bigint */
    @Override
    public void visit(SQLBigIntExpr x) {
        Long value = x.getValue();
        tryResolveColumnNameAndStoreValue(x, value);
    }

    /** number */
    @Override
    public void visit(SQLNumberExpr x) {
        Number value = x.getNumber();
        String literal = x.getLiteral();
        tryResolveColumnNameAndStoreValue(x, value);
    }

    /** Number */
    @Override
    public void visit(SQLNumericLiteralExpr x) {
        Number value = x.getNumber();
        tryResolveColumnNameAndStoreValue(x, value);
    }

    /** real */
    @Override
    public void visit(SQLRealExpr x) {
        Float value = x.getValue();
        tryResolveColumnNameAndStoreValue(x, value);
    }

    /** float */
    @Override
    public void visit(SQLFloatExpr x) {
        Float value = x.getNumber().floatValue();
        tryResolveColumnNameAndStoreValue(x, value);
    }

    /** double */
    @Override
    public void visit(SQLDoubleExpr x) {
        Double value = x.getNumber().doubleValue();
    }

    /** decimal */
    @Override
    public void visit(SQLDecimalExpr x) {
        BigDecimal value = x.getValue();
        tryResolveColumnNameAndStoreValue(x, value);
    }

    /** null */
    @Override
    public void visit(SQLNullExpr x) {
        Object value = x.getValue();
        tryResolveColumnNameAndStoreValue(x, value);
    }

    /** hex */
    @Override
    public void visit(SQLHexExpr x) {
        byte[] value = x.getValue();
        // String hex = x.getHex();
        tryResolveColumnNameAndStoreValue(x, value);
    }

    /** text */
    @Override
    public void visit(SQLTextLiteralExpr x) {
        String value = x.getText();
        tryResolveColumnNameAndStoreValue(x, value);
    }

    @Override
    public void visit(SQLJSONExpr x) {
        String value = x.getValue();
        tryResolveColumnNameAndStoreValue(x, value);
    }

    /** blob */
    @Override
    public void visit(SQLNCharExpr x) {
        String value = x.getText();
        tryResolveColumnNameAndStoreValue(x, value);
    }

    /** date */
    @Override
    public void visit(SQLDateExpr x) {
        String value = x.getValue();
        // String literal = x.getLiteral();
        tryResolveColumnNameAndStoreValue(x, value);
    }

    /** time */
    @Override
    public void visit(SQLTimeExpr x) {
        String value = x.getValue();
        // SQLExpr literal = x.getLiteral();
        tryResolveColumnNameAndStoreValue(x, value);
    }

    /** datetime */
    @Override
    public void visit(SQLDateTimeExpr x) {
        String value = x.getValue();
        // SQLExpr literal = x.getLiteral();
        tryResolveColumnNameAndStoreValue(x, value);
    }

    /** timestamp */
    @Override
    public void visit(SQLTimestampExpr x) {
        String value = x.getValue();
        // String literal = x.getLiteral();
        tryResolveColumnNameAndStoreValue(x, value);
    }

    // --------------------------------值类型表达式 结束--------------------------------

    /** 占位符参数表达式 */
    @Override
    public void visit(SQLVariantRefExpr x) {
        // String name = x.getName();
        tryResolveColumnAndStoreVariantRefIndex(x);
    }

    @Override
    public void visit(SQLMethodInvokeExpr x) {
        String methodName = x.getMethodName();
        SQLExpr owner = x.getOwner();
        SQLExpr using = x.getUsing();
        List<SQLExpr> arguments = x.getArguments();
        if (arguments != null && arguments.size() > 0) {
            for (SQLExpr argument : arguments) {
                visit(argument);
            }
        }

        // TODO: 函数调用
    }

    @Override
    public void visit(SQLPropertyExpr x) {
        String name = x.getName();
        if (logger.isDebugEnabled()) {
            logger.debug("SQLPropertyExpr name: {}", name);
        }
    }

    @Override
    public void visit(SQLBinaryOpExpr x) {
        SQLExpr right = x.getRight();
        SQLExpr left = x.getLeft();

        visit(right);
        visit(left);

        SQLBinaryOperator operator = x.getOperator();
        logger.debug("SQLBinaryOperator SQLBinaryOperator: {}", operator);
    }

    @Override
    public void visit(SQLIdentifierExpr x) {
        String name = x.getName();
        String simpleName = x.getSimpleName();
        // throw new UnsupportedOperationException("不支持SQL表达式: " + x.getClass().getName());
    }

    @Override
    public void visit(SQLDefaultExpr x) {
        // throw new UnsupportedOperationException("不支持SQL表达式: " + x.getClass().getName());
    }

    @Override
    public void visit(SQLAggregateExpr x) {
        throw new UnsupportedOperationException("不支持SQL表达式: " + x.getClass().getName());
    }

    @Override
    public void visit(SQLAllColumnExpr x) {
        throw new UnsupportedOperationException("不支持SQL表达式: " + x.getClass().getName());
    }

    @Override
    public void visit(SQLAllExpr x) {
        throw new UnsupportedOperationException("不支持SQL表达式: " + x.getClass().getName());
    }

    @Override
    public void visit(SQLAnyExpr x) {
        throw new UnsupportedOperationException("不支持SQL表达式: " + x.getClass().getName());
    }

    @Override
    public void visit(SQLArrayExpr x) {
        throw new UnsupportedOperationException("不支持SQL表达式: " + x.getClass().getName());
    }

    @Override
    public void visit(SQLBetweenExpr x) {
        throw new UnsupportedOperationException("不支持SQL表达式: " + x.getClass().getName());
    }

    @Override
    public void visit(SQLBinaryOpExprGroup x) {
        throw new UnsupportedOperationException("不支持SQL表达式: " + x.getClass().getName());
    }

    @Override
    public void visit(SQLCaseExpr x) {
        throw new UnsupportedOperationException("不支持SQL表达式: " + x.getClass().getName());
    }

    @Override
    public void visit(SQLCastExpr x) {
        throw new UnsupportedOperationException("不支持SQL表达式: " + x.getClass().getName());
    }

    @Override
    public void visit(SQLContainsExpr x) {
        throw new UnsupportedOperationException("不支持SQL表达式: " + x.getClass().getName());
    }

    @Override
    public void visit(SQLCurrentOfCursorExpr x) {
        throw new UnsupportedOperationException("不支持SQL表达式: " + x.getClass().getName());
    }

    @Override
    public void visit(SQLDbLinkExpr x) {
        throw new UnsupportedOperationException("不支持SQL表达式: " + x.getClass().getName());
    }

    @Override
    public void visit(SQLExistsExpr x) {
        throw new UnsupportedOperationException("不支持SQL表达式: " + x.getClass().getName());
    }

    @Override
    public void visit(SQLExtractExpr x) {
        throw new UnsupportedOperationException("不支持SQL表达式: " + x.getClass().getName());
    }

    @Override
    public void visit(SQLFlashbackExpr x) {
        throw new UnsupportedOperationException("不支持SQL表达式: " + x.getClass().getName());
    }

    @Override
    public void visit(SQLGroupingSetExpr x) {
        throw new UnsupportedOperationException("不支持SQL表达式: " + x.getClass().getName());
    }

    @Override
    public void visit(SQLInListExpr x) {
        SQLExpr expr = x.getExpr();
        if (expr != null) {
            visit(expr);
        }

        List<SQLExpr> targetList = x.getTargetList();
        for (SQLExpr target : targetList) {
            if (target != null) {
                visit(target);
            }
        }
    }

    @Override
    public void visit(SQLInSubQueryExpr x) {
        SQLExpr expr = x.getExpr();
        if (expr != null) {
            visit(expr);
        }

        SQLSelect subQuery = x.getSubQuery();
        // TODO:
    }

    @Override
    public void visit(SQLIntervalExpr x) {
        throw new UnsupportedOperationException("不支持SQL表达式: " + x.getClass().getName());
    }

    @Override
    public void visit(SQLListExpr x) {
        List<SQLExpr> items = x.getItems();
        if (items != null) {
            for (SQLExpr item : items) {
                visit(item);
            }
        }
    }

    @Override
    public void visit(SQLLiteralExpr x) {
        throw new UnsupportedOperationException("不支持SQL表达式: " + x.getClass().getName());
    }

    @Override
    public void visit(SQLMatchAgainstExpr x) {
        throw new UnsupportedOperationException("不支持SQL表达式: " + x.getClass().getName());
    }

    @Override
    public void visit(SQLNotExpr x) {
        SQLExpr expr = x.getExpr();
        visit(expr);
    }

    @Override
    public void visit(SQLQueryExpr x) {
        SQLSelect subQuery = x.getSubQuery();
        SQLObject parent = x.getParent();
        List<SQLObject> children = x.getChildren();
        // TODO:
    }

    @Override
    public void visit(SQLSequenceExpr x) {
        throw new UnsupportedOperationException("不支持SQL表达式: " + x.getClass().getName());
    }

    @Override
    public void visit(SQLSizeExpr x) {
        SQLExpr value = x.getValue();
        SQLSizeExpr.Unit unit = x.getUnit();
        visit(value);
        // throw new UnsupportedOperationException("不支持SQL表达式: " + x.getClass().getName());
    }

    @Override
    public void visit(SQLSomeExpr x) {
        SQLSelect subQuery = x.getSubQuery();
        // TODO:
    }

    @Override
    public void visit(SQLUnaryExpr x) {
        SQLExpr expr = x.getExpr();
        visit(expr);
    }

    @Override
    public void visit(SQLValuableExpr x) {
        Object value = x.getValue();
        // throw new UnsupportedOperationException("不支持SQL表达式: " + x.getClass().getName());
    }

    @Override
    public void visit(SQLValuesExpr x) {
        List<SQLListExpr> values = x.getValues();
        for (int i = 0; i < values.size(); i++) {
            SQLListExpr sqlListExpr = values.get(i);
            List<SQLExpr> items = sqlListExpr.getItems();
            for (SQLExpr sqlExpr : items) {
                visit(sqlExpr);
            }
        }
        throw new UnsupportedOperationException("不支持SQL表达式: " + x.getClass().getName());
    }

    /**
     * @param x
     * @return
     */
    public Optional<String> tryResolveColumnName(SQLExpr x) {
        SQLObject parent = x.getParent();
        if (parent == null) {
            return Optional.empty();
        }

        // 二元操作符
        if (parent instanceof SQLBinaryOpExpr) {
            SQLBinaryOpExpr binaryOpExpr = (SQLBinaryOpExpr) parent;
            // SQLExpr right = binaryOpExpr.getRight();
            SQLExpr left = binaryOpExpr.getLeft();

            // 列名
            if ((left instanceof SQLIdentifierExpr)) {
                // 列
                SQLIdentifierExpr identifierExpr = (SQLIdentifierExpr) left;
                String columnName = Utils.trimTableOrColumnName(identifierExpr.getName());

                logger.info("解析列名, 列名: {}", columnName);

                return Optional.of(columnName);
            }

            // 表名.列名
            if (left instanceof SQLPropertyExpr) {
                SQLPropertyExpr propertyExpr = (SQLPropertyExpr) left;
                SQLExpr owner = propertyExpr.getOwner();
                if (owner != null && (owner instanceof SQLIdentifierExpr)) {

                    SQLIdentifierExpr identifierExpr = (SQLIdentifierExpr) owner;
                    String tableName = Utils.trimTableOrColumnName(identifierExpr.getName());

                    logger.info("解析表名: {}", tableName);
                }

                String columnName = Utils.trimTableOrColumnName(propertyExpr.getName());

                logger.info("解析列名: {}", columnName);
                return Optional.of(columnName);
            }
        }

        // in 操作
        if (parent instanceof SQLInListExpr) {
            SQLInListExpr inListExpr = (SQLInListExpr) parent;
            SQLExpr expr = inListExpr.getExpr();

            // 列名
            if (expr instanceof SQLIdentifierExpr) {
                // 列
                SQLIdentifierExpr identifierExpr = (SQLIdentifierExpr) expr;
                String name = identifierExpr.getName();
                String columnName = Utils.trimTableOrColumnName(name);

                logger.info("解析列名, 列名: {}", columnName);
                return Optional.of(columnName);
            }

            // 表名.列名
            if (expr instanceof SQLPropertyExpr) {
                SQLPropertyExpr propertyExpr = (SQLPropertyExpr) expr;
                SQLExpr owner = propertyExpr.getOwner();
                if (owner != null && (owner instanceof SQLIdentifierExpr)) {

                    SQLIdentifierExpr identifierExpr = (SQLIdentifierExpr) owner;
                    String tableName = Utils.trimTableOrColumnName(identifierExpr.getName());

                    logger.info("解析表名: {}", tableName);
                }

                String columnName = Utils.trimTableOrColumnName(propertyExpr.getName());

                logger.info("解析列名: {}", columnName);
                return Optional.of(columnName);
            }
        }

        return Optional.empty();
    }

    /**
     * @param x
     * @param value
     * @return
     */
    public boolean tryResolveColumnNameAndStoreValue(SQLExpr x, Object value) {
        Optional<String> optionalColumnName = tryResolveColumnName(x);
        if (!optionalColumnName.isPresent()) {
            return false;
        }

        String columnName = optionalColumnName.get();
        onResolveColumn("", columnName, value);
        return true;
    }

    /**
     * @param x
     * @return
     */
    public boolean tryResolveColumnAndStoreVariantRefIndex(SQLVariantRefExpr x) {
        // 占位符参数
        Optional<String> optionalColumnName = tryResolveColumnName(x);
        if (!optionalColumnName.isPresent()) {
            return false;
        }

        String columnName = optionalColumnName.get();
        onResolveVariantRefColumn("", columnName, x.getIndex());
        return true;
    }
}
