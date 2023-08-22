package sharding.sphere.demo.interceptor;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Properties;
import org.apache.ibatis.binding.MapperMethod;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.ParameterMapping;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sharding.sphere.demo.sql.rewriter.SQLRewriter;

@Component
@Intercepts({
    @Signature(
            type = Executor.class,
            method = "update",
            args = {MappedStatement.class, Object.class}),
    @Signature(
            type = Executor.class,
            method = "query",
            args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class})
})
public class SQLInterceptor implements Interceptor {

    private static final Logger logger = LoggerFactory.getLogger(SQLInterceptor.class);

    @Autowired private SQLRewriter sqlRewriter;

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        Method method = invocation.getMethod();
        Object[] args = invocation.getArgs();
        MappedStatement statement = (MappedStatement) args[0];
        BoundSql boundSql = statement.getSqlSource().getBoundSql(args[1]);
        String sql = boundSql.getSql();
        logger.info(" => method: {}, raw sql: {}", method, sql);

        // rewriteSQL2Invocation(invocation, sql);

        return invocation.proceed();
    }

    /**
     * 重写SQL，修改SQL参数
     *
     * @param invocation
     * @param rawSql
     */
    public void rewriteSQL2Invocation(Invocation invocation, String rawSql) {
        final Object[] args = invocation.getArgs();
        MappedStatement statement = (MappedStatement) args[0];
        MapperMethod.ParamMap parameterObject = (MapperMethod.ParamMap) args[1];
        final BoundSql boundSql = statement.getBoundSql(parameterObject);
        List<ParameterMapping> parameterMappings = boundSql.getParameterMappings();

        // 1. 参数修改
        // 2. SQL修改

        //         if (rawSql.contains("SUM")) {
        //             rawSql.replace("SUM", "UDF_SUM");
        //         } else if (rawSql.contains("sum")) {
        //             rawSql.replace("sum", "udf_sum");
        //         }

        /*
         示例代码
        Object obj = boundSql.getParameterObject();
        String sql = boundSql.getSql();
        if (sql.trim().toUpperCase().startsWith("INSERT")) {
            ReflectUtil.setFieldValue(obj, "rev", 0);
            ReflectUtil.setFieldValue(obj, "createTime", new Date());
            ReflectUtil.setFieldValue(obj, "operateTime", new Date());
            ReflectUtil.setFieldValue(boundSql,"parameterObject", obj);

        } else if (sql.trim().toUpperCase().startsWith("UPDATE")) {
            sql = sql.replaceAll(" set ", " SET ")
                    .replaceAll(" Set ", " SET ")
                    .replaceAll(" SET ", " SET rev = rev+1, operate_time = NOW(), ");
            ReflectUtil.setFieldValue(boundSql,"sql", sql);
        }
        */

        // String newSql = "";
        switch (statement.getSqlCommandType()) {
            case INSERT:
                break;
            case UPDATE:
                break;
            case DELETE:
                break;
            case SELECT:
                break;
            default:
                break;
        }
    }

    @Override
    public Object plugin(Object target) {
        return Interceptor.super.plugin(target);
    }

    @Override
    public void setProperties(Properties properties) {
        Interceptor.super.setProperties(properties);
    }
}
