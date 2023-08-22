package sharding.sphere.demo.sql;

import java.util.Arrays;
import java.util.List;
import org.apache.commons.collections4.ListUtils;

public class ConstSQLs {
    public static final String selectSql0 = "select a,b,c,d from test";
    public static final String selectSql1 =
            "SELECT col1 AS a, col2 AS b, col3 AS c FROM my_table WHERE col_1 = 10 AND col_2 = 20 AND col_3 = 30";
    public static final String selectSql2 =
            "SELECT SUM(salary) FROM emp WHERE salary BETWEEN 5000 AND 6000 AND joindate < date '2021-05-01' + interval 1 year";
    public static final String selectSql3 =
            "SELECT /*+ PARALLEL */ cfe.id_collateral_ref.nextval, id_collateral FROM (SELECT DISTINCT a.id_collateral FROM cfe.collateral a LEFT JOIN cfe.collateral_ref b ON a.id_collateral = b.id_collateral WHERE b.id_collateral_ref IS NULL )";

    public static final String selectSql4 =
            "SELECT * FROM( SELECT * FROM biz_fund_info WHERE tenant_code = ? AND ((ta_code, manager_code) IN ((?,?)) OR department_type IN (?) ))";

    public static final String selectSql5 =
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

    public static final String insertSql0 = "insert into mytable (col1) values (1)";

    public static final String insertSql1 =
            "insert into `test_user`(`account`, `user_name`, `age`, `sex`, `create_time`)values ('test1', 'test_user_1', 1, 0, now())on duplicate key update `user_name` = 'test_user_1', `age` = 1, `sex` = 0";

    public static final List<String> selectSqlList =
            Arrays.asList(selectSql0, selectSql1, selectSql2, selectSql3, selectSql4, selectSql5);
    public static final List<String> insertSqlList = Arrays.asList(insertSql0, insertSql1);
    public static final List<String> sqlList = ListUtils.sum(insertSqlList, selectSqlList);
}
