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

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
@State(Scope.Thread) // Thread: 该状态为每个线程独享。
public class SQLParserBenchmark {
    public static final String selectSql0 = "select * from t_user";
    public static final String selectSql1 =
            "SELECT col1 AS a, col2 AS b, col3 AS c FROM t_table WHERE col1 = 10 AND col2 = 20 AND col3 = 30";

    public static final String selectSql2 =
            "SELECT SUM (salary) FROM emp WHERE salary BETWEEN 5000 AND 6000 AND joindate < date '2021-05-01' + interval 1 year";

    //    public static final String selectSql3 =
    //            "SELECT /*+ PARALLEL */ cfe.id_collateral_ref.nextval, id_collateral FROM (
    // SELECT DISTINCT a.id_collateral FROM cfe.collateral a LEFT JOIN cfe.collateral_ref b ON
    // a.id_collateral = b.id_collateral WHERE b.id_collateral_ref IS NULL )";
    public static final String selectSql3 =
            "SELECT cfe.id_collateral_ref.nextval, id_collateral FROM (  SELECT DISTINCT a.id_collateral FROM cfe.collateral a LEFT JOIN cfe.collateral_ref b ON a.id_collateral = b.id_collateral WHERE b.id_collateral_ref IS NULL )";

    public static final String insertSql0 = "insert into mytable (col1) values (1)";

    public static final String insertSql1 =
            "insert into `test_user`(`account`, `user_name`, `age`, `sex`, `create_time`)\n"
                    + "values ('test1', 'test_user_1', 1, 0, now())\n"
                    + "on duplicate key update \n"
                    + "`user_name` = 'test_user_1', `age` = 1, `sex` = 0";

    public static final String selectSql4 =
            "SELECT\n"
                    + "                b.date,\n"
                    + "                b.advertiser_company_id,\n"
                    + "                b.advertiser_id,\n"
                    + "                b.product_id,\n"
                    + "                b.company_id,\n"
                    + "                sum( impression ) AS impression,\n"
                    + "                sum( click ) AS click,\n"
                    + "                sum( target_work ) AS targetWork,\n"
                    + "                (\n"
                    + "                    SELECT\n"
                    + "                        sum( estimated_revenue ) AS estimatedRevenue\n"
                    + "                    FROM\n"
                    + "                        (\n"
                    + "                            SELECT\n"
                    + "                                ore.date,\n"
                    + "                                ore.advertiser_company_id,\n"
                    + "                                tir.advertiser_id,\n"
                    + "                                ore.product_id,\n"
                    + "                                ore.company_id\n"
                    + "                            FROM\n"
                    + "                                th_otherinfo ore\n"
                    + "                                    LEFT JOIN th_import_report tir ON ore.date = tir.date\n"
                    + "                                    AND ore.link_id = tir.link_id\n"
                    + "                            WHERE\n"
                    + "                                ore.date ='2021-6-7'\n"
                    + "                              AND ore.link_id = '440630'\n"
                    + "                            GROUP BY\n"
                    + "                                ore.advertiser_company_id,\n"
                    + "                                tir.advertiser_id,\n"
                    + "                                ore.product_id,\n"
                    + "                                ore.company_id\n"
                    + "                        ) b\n"
                    + "                            LEFT JOIN (\n"
                    + "                            SELECT\n"
                    + "                                ore.estimated_revenue,\n"
                    + "                                ore.advertiser_company_id,\n"
                    + "                                ore.company_id,\n"
                    + "                                tir.advertiser_id,\n"
                    + "                                tir.product_id,\n"
                    + "                                tir.date\n"
                    + "                            FROM\n"
                    + "                                th_otherinfo ore\n"
                    + "                                    LEFT JOIN th_import_report tir ON ore.date = tir.date\n"
                    + "                                    AND ore.link_id = tir.link_id\n"
                    + "                            GROUP BY\n"
                    + "                                tir.date,\n"
                    + "                                tir.link_id\n"
                    + "                        ) a ON a.date = b.date\n"
                    + "                            AND a.advertiser_company_id = b.advertiser_company_id\n"
                    + "                            AND a.advertiser_id = b.advertiser_id\n"
                    + "                            AND a.product_id = b.product_id\n"
                    + "                            AND a.company_id = b.company_id\n"
                    + "                    WHERE\n"
                    + "                        a.date ='2021-6-22'\n"
                    + "                ) AS estimatedRevenue\n"
                    + "            FROM\n"
                    + "                (\n"
                    + "                    SELECT\n"
                    + "                        ore.date,\n"
                    + "                        ore.advertiser_company_id,\n"
                    + "                        tir.advertiser_id,\n"
                    + "                        ore.product_id,\n"
                    + "                        ore.company_id\n"
                    + "                    FROM\n"
                    + "                        th_otherinfo ore\n"
                    + "                            LEFT JOIN th_import_report tir ON ore.date = tir.date\n"
                    + "                            AND ore.link_id = tir.link_id\n"
                    + "                    WHERE\n"
                    + "                        ore.date ='2021-6-7'\n"
                    + "                      AND ore.link_id = '440630'\n"
                    + "                    GROUP BY\n"
                    + "                        ore.advertiser_company_id,\n"
                    + "                        tir.advertiser_id,\n"
                    + "                        ore.product_id,\n"
                    + "                        ore.company_id\n"
                    + "                ) b\n"
                    + "                    LEFT JOIN (\n"
                    + "                    SELECT\n"
                    + "                        ore.target_work,\n"
                    + "                        ore.estimated_revenue,\n"
                    + "                        ore.advertiser_company_id,\n"
                    + "                        ore.company_id,\n"
                    + "                        tir.advertiser_id,\n"
                    + "                        tir.product_id,\n"
                    + "                        tir.date,\n"
                    + "                        tir.impression,\n"
                    + "                        tir.click\n"
                    + "                    FROM\n"
                    + "                        th_otherinfo ore\n"
                    + "                            LEFT JOIN th_import_report tir ON ore.date = tir.date\n"
                    + "                            AND ore.link_id = tir.link_id\n"
                    + "                ) a ON a.date = b.date\n"
                    + "                    AND a.advertiser_company_id = b.advertiser_company_id\n"
                    + "                    AND a.advertiser_id = b.advertiser_id\n"
                    + "                    AND a.product_id = b.product_id\n"
                    + "                    AND a.company_id = b.company_id\n"
                    + "            WHERE\n"
                    + "                a.date ='2021-6-22'";

    @Param({selectSql0, selectSql1, selectSql2, selectSql3, insertSql0, insertSql1})
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
    /*
    SELECT
                b.date,
                b.advertiser_company_id,
                b.advertiser_id,
                b.product_id,
                b.company_id,
                sum( impression ) AS impression,
                sum( click ) AS click,
                sum( target_work ) AS targetWork,
                (
                    SELECT
                        sum( estimated_revenue ) AS estimatedRevenue
                    FROM
                        (
                            SELECT
                                ore.date,
                                ore.advertiser_company_id,
                                tir.advertiser_id,
                                ore.product_id,
                                ore.company_id
                            FROM
                                th_otherinfo ore
                                    LEFT JOIN th_import_report tir ON ore.date = tir.date
                                    AND ore.link_id = tir.link_id
                            WHERE
                                ore.date ='2021-6-7'
                              AND ore.link_id = '440630'
                            GROUP BY
                                ore.advertiser_company_id,
                                tir.advertiser_id,
                                ore.product_id,
                                ore.company_id
                        ) b
                            LEFT JOIN (
                            SELECT
                                ore.estimated_revenue,
                                ore.advertiser_company_id,
                                ore.company_id,
                                tir.advertiser_id,
                                tir.product_id,
                                tir.date
                            FROM
                                th_otherinfo ore
                                    LEFT JOIN th_import_report tir ON ore.date = tir.date
                                    AND ore.link_id = tir.link_id
                            GROUP BY
                                tir.date,
                                tir.link_id
                        ) a ON a.date = b.date
                            AND a.advertiser_company_id = b.advertiser_company_id
                            AND a.advertiser_id = b.advertiser_id
                            AND a.product_id = b.product_id
                            AND a.company_id = b.company_id
                    WHERE
                        a.date ='2021-6-22'
                ) AS estimatedRevenue
            FROM
                (
                    SELECT
                        ore.date,
                        ore.advertiser_company_id,
                        tir.advertiser_id,
                        ore.product_id,
                        ore.company_id
                    FROM
                        th_otherinfo ore
                            LEFT JOIN th_import_report tir ON ore.date = tir.date
                            AND ore.link_id = tir.link_id
                    WHERE
                        ore.date ='2021-6-7'
                      AND ore.link_id = '440630'
                    GROUP BY
                        ore.advertiser_company_id,
                        tir.advertiser_id,
                        ore.product_id,
                        ore.company_id
                ) b
                    LEFT JOIN (
                    SELECT
                        ore.target_work,
                        ore.estimated_revenue,
                        ore.advertiser_company_id,
                        ore.company_id,
                        tir.advertiser_id,
                        tir.product_id,
                        tir.date,
                        tir.impression,
                        tir.click
                    FROM
                        th_otherinfo ore
                            LEFT JOIN th_import_report tir ON ore.date = tir.date
                            AND ore.link_id = tir.link_id
                ) a ON a.date = b.date
                    AND a.advertiser_company_id = b.advertiser_company_id
                    AND a.advertiser_id = b.advertiser_id
                    AND a.product_id = b.product_id
                    AND a.company_id = b.company_id
            WHERE
                a.date ='2021-6-22'
        */

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
