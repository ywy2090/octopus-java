package sharding.sphere.demo.sql.engine.expr;

import com.alibaba.druid.sql.ast.SQLExpr;
import com.alibaba.druid.sql.ast.expr.SQLAggregateExpr;
import com.alibaba.druid.sql.ast.expr.SQLAllColumnExpr;
import com.alibaba.druid.sql.ast.expr.SQLAllExpr;
import com.alibaba.druid.sql.ast.expr.SQLAnyExpr;
import com.alibaba.druid.sql.ast.expr.SQLArrayExpr;
import com.alibaba.druid.sql.ast.expr.SQLBetweenExpr;
import com.alibaba.druid.sql.ast.expr.SQLBigIntExpr;
import com.alibaba.druid.sql.ast.expr.SQLBinaryOpExpr;
import com.alibaba.druid.sql.ast.expr.SQLBinaryOpExprGroup;
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

/** 解析SQL表达式 */
public interface WeFecExprVisitor {

    // --------------------------------值类型表达式 开始--------------------------------

    /** bool */
    void visit(SQLBooleanExpr x);

    /** char */
    void visit(SQLCharExpr x);

    /** tinyint */
    void visit(SQLTinyIntExpr x);

    /** smallint */
    void visit(SQLSmallIntExpr x);

    /** integer */
    void visit(SQLIntegerExpr x);

    /** bigint */
    void visit(SQLBigIntExpr x);

    /** number */
    void visit(SQLNumberExpr x);

    /** Number */
    void visit(SQLNumericLiteralExpr x);

    /** real */
    void visit(SQLRealExpr x);

    /** float */
    void visit(SQLFloatExpr x);

    /** double */
    void visit(SQLDoubleExpr x);

    /** decimal */
    void visit(SQLDecimalExpr x);

    /** null */
    void visit(SQLNullExpr x);

    /** hex */
    void visit(SQLHexExpr x);

    /** text */
    void visit(SQLTextLiteralExpr x);

    /** blob */
    void visit(SQLNCharExpr x);

    /** json */
    void visit(SQLJSONExpr x);

    /** date */
    void visit(SQLDateExpr x);

    /** time */
    void visit(SQLTimeExpr x);

    /** datetime */
    void visit(SQLDateTimeExpr x);

    /** timestamp */
    void visit(SQLTimestampExpr x);

    // --------------------------------值类型表达式 结束--------------------------------

    /** 占位符参数表达式 */
    void visit(SQLVariantRefExpr x);

    /** 函数调用表达式 */
    void visit(SQLMethodInvokeExpr x);

    /** 默认值表达式 */
    void visit(SQLDefaultExpr x);

    /** 表达式 */
    void visit(SQLIdentifierExpr x);

    void visit(SQLPropertyExpr x);

    void visit(SQLExpr x);

    void visit(SQLAggregateExpr x);

    void visit(SQLAllColumnExpr x);

    void visit(SQLAllExpr x);

    void visit(SQLAnyExpr x);

    void visit(SQLArrayExpr x);

    void visit(SQLBetweenExpr x);

    void visit(SQLBinaryOpExpr x);

    void visit(SQLBinaryOpExprGroup x);

    void visit(SQLCaseExpr x);

    void visit(SQLCastExpr x);

    void visit(SQLContainsExpr x);

    void visit(SQLCurrentOfCursorExpr x);

    void visit(SQLDbLinkExpr x);

    void visit(SQLExistsExpr x);

    void visit(SQLExtractExpr x);

    void visit(SQLFlashbackExpr x);

    void visit(SQLGroupingSetExpr x);

    void visit(SQLInListExpr x);

    void visit(SQLInSubQueryExpr x);

    void visit(SQLIntervalExpr x);

    void visit(SQLListExpr x);

    void visit(SQLLiteralExpr x);

    void visit(SQLMatchAgainstExpr x);

    void visit(SQLNotExpr x);

    void visit(SQLQueryExpr x);

    void visit(SQLSequenceExpr x);

    void visit(SQLSizeExpr x);

    void visit(SQLSomeExpr x);

    void visit(SQLUnaryExpr x);

    void visit(SQLValuableExpr x);

    void visit(SQLValuesExpr x);
}
