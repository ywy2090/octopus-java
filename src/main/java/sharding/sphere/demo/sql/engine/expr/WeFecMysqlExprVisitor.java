package sharding.sphere.demo.sql.engine.expr;

import com.alibaba.druid.sql.dialect.mysql.ast.expr.MySqlCharExpr;
import com.alibaba.druid.sql.dialect.mysql.ast.expr.MySqlExpr;
import com.alibaba.druid.sql.dialect.mysql.ast.expr.MySqlJSONTableExpr;
import com.alibaba.druid.sql.dialect.mysql.ast.expr.MySqlOrderingExpr;
import com.alibaba.druid.sql.dialect.mysql.ast.expr.MySqlOutFileExpr;
import com.alibaba.druid.sql.dialect.mysql.ast.expr.MySqlUserName;

/** 解析Mysql表达式 */
public interface WeFecMysqlExprVisitor extends WeFecExprVisitor {
    void visit(MySqlExpr x);

    void visit(MySqlCharExpr x);

    void visit(MySqlJSONTableExpr x);

    void visit(MySqlOrderingExpr x);

    void visit(MySqlOutFileExpr x);

    void visit(MySqlUserName x);
}
