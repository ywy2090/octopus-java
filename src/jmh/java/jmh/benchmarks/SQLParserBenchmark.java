package jmh.benchmarks;

import com.alibaba.druid.sql.SQLUtils;
import com.alibaba.druid.sql.ast.SQLStatement;
import com.alibaba.druid.util.JdbcConstants;
import java.util.List;
import java.util.concurrent.TimeUnit;
import net.sf.jsqlparser.JSQLParserException;
import net.sf.jsqlparser.parser.CCJSqlParserUtil;
import net.sf.jsqlparser.statement.Statement;
import org.apache.shardingsphere.sql.parser.api.CacheOption;
import org.apache.shardingsphere.sql.parser.api.SQLParserEngine;
import org.apache.shardingsphere.sql.parser.core.ParseASTNode;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.results.format.ResultFormatType;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.openjdk.jmh.runner.options.TimeValue;
import sharding.sphere.demo.sql.ConstSQLs;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
@State(Scope.Thread) // Thread: 该状态为每个线程独享。
public class SQLParserBenchmark {

    @Param({
        ConstSQLs.selectSql0,
        ConstSQLs.selectSql1,
        ConstSQLs.selectSql2,
        ConstSQLs.selectSql3,
        ConstSQLs.selectSql4,
        ConstSQLs.insertSql0,
        ConstSQLs.insertSql1
    })
    String sql;

    @Setup
    public void setup() {
        // Set up resources if needed
    }

    @TearDown
    public void tearDown() {
        // Clean up resources if needed
    }

    @Benchmark
    public void jSqlParser() throws JSQLParserException {
        Statement statement = (Statement) CCJSqlParserUtil.parse(sql);
    }

    @Benchmark
    public void druidParser() {
        List<SQLStatement> sqlStatements = SQLUtils.parseStatements(sql, JdbcConstants.MYSQL);
    }

    @Benchmark
    public void shardingSphereParser() {
        SQLParserEngine sqlParserEngine = new SQLParserEngine("MYSQL", new CacheOption(128, 1024));
        ParseASTNode parseASTNode = sqlParserEngine.parse(sql, false);
    }

    public static void main(String[] args) throws RunnerException {
        Options opt =
                new OptionsBuilder()
                        .include(
                                SQLParserBenchmark.class
                                        .getSimpleName()) // benchmark 所在的类的名字，注意这里是使用正则表达式对所有类进行匹配的
                        .forks(1) // 进行 fork 的次数。如果 fork 数是2的话，则 JMH 会 fork 出两个进程来进行测试
                        .warmupIterations(5) // 预热的迭代次数
                        .warmupTime(TimeValue.valueOf("1s"))
                        .measurementIterations(10) // 实际测量的迭代次数
                        .measurementTime(TimeValue.valueOf("1s"))
                        .resultFormat(ResultFormatType.JSON)
                        .build();

        new Runner(opt).run();
    }
}
