package octopus.sql.engine;

import octopus.antlr.codegen.hive.v2.HiveLexer;
import octopus.antlr.codegen.hive.v2.HiveParser;
import octopus.antlr.codegen.hive.v2.HiveParserBaseVisitor;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

public class HiveSQLRewriterVisitor extends HiveParserBaseVisitor<String> {

    private TokenStreamRewriter tokenStreamRewriter;

    public HiveSQLRewriterVisitor(TokenStreamRewriter tokenStreamRewriter) {
        this.tokenStreamRewriter = tokenStreamRewriter;
    }

    @Override
    public String visit(ParseTree tree) {
        System.out.println(" visit: " + tree.toString());
        return super.visit(tree);
    }

    @Override
    public String visitTerminal(TerminalNode node) {
        // System.out.println(" visitTerminal: " + node.getText());
        return super.visitTerminal(node);
    }

    @Override
    public String visitIdentifier(HiveParser.IdentifierContext ctx) {

        // System.out.println(" visitIdentifier: " + ctx.getText());

        String text = ctx.getText();
        // this.tokenStreamRewriter.replace(ctx.getStart(), "f_" + text);
        return super.visitIdentifier(ctx);
    }

    @Override
    public String visitColumnName(HiveParser.ColumnNameContext ctx) {

        System.out.println(" visitColumnName: " + ctx.getText());

        return super.visitColumnName(ctx);
    }

    /*
    @Override
    public String visitTableOrPartition(HiveParser.TableOrPartitionContext ctx) {

        String text = ctx.getText();
        System.out.println(" visitTableOrPartition: " + ctx.getText());

        return super.visitTableOrPartition(ctx);
    }
    */

    @Override
    public String visitTableName(HiveParser.TableNameContext ctx) {

        System.out.println(" ==>> visitTableName: " + ctx.getText());

        // format: tableName
        // format: dbName.tableName
        int childCount = ctx.getChildCount();
        // System.out.println(" ==>> childCount : " + childCount);

        if (childCount == 1) {
            // tableName
            String tableName = ctx.getText();
        } else {
            String dbName = ctx.getChild(0).getText();
            String tableName = ctx.getChild(2).getText();
            System.out.println();
        }

        return null;
        // return super.visitTableName(ctx);
    }

    @Override
    public String visitConstant(HiveParser.ConstantContext ctx) {

        System.out.println(" ======>> visitConstant: " + ctx.getText());

        return super.visitConstant(ctx);
    }

    @Override
    public String visitColumnAssignmentClause(HiveParser.ColumnAssignmentClauseContext ctx) {

        System.out.println(" ======>> visitColumnAssignmentClause: " + ctx.getText());

        return super.visitColumnAssignmentClause(ctx);
    }

    public static void main(String[] args) {
        String query0 =
                "INSERT INTO app.table_c PARTITION(dt = '20231221')\n"
                        + "SELECT a.id,\n"
                        + "       table_a.col1,\n"
                        + "       c.col2\n"
                        + "FROM app.table_a a\n"
                        + "         LEFT JOIN bdm.table_b c\n"
                        + "                   ON a.id=c.id";

        String query1 = "INSERT INTO insert_test (col1, col2) VALUES (1, 'ABC');";

        String query2 =
                "INSERT OVERWRITE TABLE exampledb.exampletable\n"
                        + "(key_1, key_2, col_1, col_2, my_part)\n"
                        + "SELECT \n"
                        + "    key_1,\n"
                        + "    key_2,\n"
                        + "    col_1,\n"
                        + "    col_2,\n"
                        + "    SUBSTR(key_2, -3)\n"
                        + "FROM exampledb.exampletable_temp;";

        String query4 =
                "insert overwrite table AFS_ALL_PRODUCT_WDD_QUOTA_DAY partition(ds='202010')\n"
                        + "select id_no\n"
                        + "       ,count(distinct product_cd)\n"
                        + "       ,count(distinct if(biz_type = 'APPLY',afs_biz_no,null))\n"
                        + "       ,count(distinct if(biz_type = 'LOAN',afs_biz_no,null))\n"
                        + "       ,max(if(biz_type = 'LOAN',nvl(trans_amt,0),null))\n"
                        + "       ,min(if(biz_type = 'LOAN',nvl(trans_amt,0),null))\n"
                        + "       ,sum(if(biz_type = 'LOAN',nvl(trans_amt,0),null))\n"
                        + "       ,avg(if(biz_type = 'LOAN',nvl(trans_amt,0),null))\n"
                        + "from dwd_risk_ty_midafs_applicant_info_day_zh tabA\n"
                        + "where ds between '202009' and '202011'\n"
                        + "group by id_no";

        String query5 =
                "create temporary table tmp_wzyd_dcp_data as \n"
                        + "select a.afs_biz_no             as afs_biz_no\n"
                        + "      ,a.product_cd             as product_cd\n"
                        + "      ,a.biz_type               as biz_type\n"
                        + "      ,b.ecif_no                as ecif_no\n"
                        + "      ,b.id_no                  as id_no\n"
                        + "      ,b.phone_no               as phone_no\n"
                        + "      ,b.union_id               as union_id\n"
                        + "      ,c.gps_b                  as gps_b\n"
                        + "      ,c.gps_l                  as gps_l\n"
                        + "      ,d.gps_city_code          as gps_city_code\n"
                        + "      ,c.ip_address             as ip_address\n"
                        + "      ,d.ip_city_code           as ip_city_code\n"
                        + "      ,c.wx_device_id           as wx_device_id\n"
                        + "      ,e.trans_amt              as trans_amt\n"
                        + "      ,a.action_type            as action_type\n"
                        + "      ,a.created_datetime       as created_datetime\n"
                        + "      ,a.last_modified_datetime as last_modified_datetime\n"
                        + "from (\n"
                        + "    select afs_biz_no,product_cd,biz_type,ecif_no,id_no,phone_no,created_datetime,last_modified_datetime\n"
                        + "    from ccpd_zrisk_dw_safe.dwd_risk_ty_midafs_case_info_day\n"
                        + "    where product_cd in ('298001','290601','230085','238006')\n"
                        + "    and ds = '202001'\n"
                        + ") a\n"
                        + "left join (\n"
                        + "    select ecif_no,id_no,phone_no,union_id,afs_biz_no\n"
                        + "    from ccpd_zrisk_dw_safe.DWD_RISK_TY_MIDAFS_APPLICANT_INFO_DAY\n"
                        + "    where ds = '202010'\n"
                        + ") b\n"
                        + "on a.afs_biz_no =b.afs_biz_no\n"
                        + "left join (\n"
                        + "    select gps_b,gps_l,ip_address,wx_device_id,afs_biz_no\n"
                        + "    from ccpd_zrisk_dw_safe.DWD_RISK_TY_MIDAFS_DEVICE_INFO_DAY\n"
                        + "    where ds = '202010'\n"
                        + ") c\n"
                        + "on a.afs_biz_no =c.afs_biz_no\n"
                        + "left join (\n"
                        + "    select gps_city,gps_city_code,ip_city,ip_city_code,afs_biz_no\n"
                        + "    from ccpd_zrisk_dw_safe.DWD_RISK_TY_MIDAFS_INPUT_CITY_INFO_MONTH\n"
                        + "    where ds = '202010'\n"
                        + ") d\n"
                        + "on a.afs_biz_no=d.afs_biz_no\n"
                        + "left join (\n"
                        + "    select afs_biz_no,trans_amt\n"
                        + "    from ccpd_zrisk_dw_safe.DWD_RISK_TY_MIDAFS_CASH_TRADE_INFO_DAY\n"
                        + "    where ds = '202010'\n"
                        + "    --DWD_RISK_TY_MIDAFS_PAY_TRADE_INFO_DAY#DCP ok 易贷 no\n"
                        + ") e\n"
                        + "on a.afs_biz_no=e.afs_biz_no\n"
                        + "left join (\n"
                        + "    select afs_biz_no,action_type\n"
                        + "    from dwd_risk_ty_midafs_eng_output_info_day\n"
                        + ") f\n"
                        + "on a.afs_biz_no=f.afs_biz_no\n"
                        + ";\n";

        String query6 =
                "create temporary table tmp_ds_data as \n"
                        + "select a.afs_biz_no               as afs_biz_no\n"
                        + "      ,a.product_cd               as product_cd\n"
                        + "      ,a.biz_type                 as biz_type\n"
                        + "      ,a.ecif_no                  as ecif_no\n"
                        + "      ,a.id_no                    as id_no\n"
                        + "      ,a.phone_no                 as phone_no\n"
                        + "      ,a.union_id                 as union_id\n"
                        + "      ,a.gps_b                    as gps_b\n"
                        + "      ,a.gps_l                    as gps_l\n"
                        + "      ,b.gps_city_code            as gps_city_code\n"
                        + "      ,a.ip_address               as ip_address\n"
                        + "      ,b.ip_city_code             as ip_city_code\n"
                        + "      ,a.wx_device_id             as wx_device_id\n"
                        + "      ,c.trans_amt                as trans_amt\n"
                        + "      ,d.action_type              as action_type\n"
                        + "      ,a.created_datetime         as created_datetime\n"
                        + "      ,a.last_modified_datetime   as last_modified_datetime\n"
                        + "from (\n"
                        + "    select afs_biz_no,product_cd,biz_type,ecif_no,id_no,phone_no,union_id,gps_b,gps_l,ip_address,wx_device_id,created_datetime,last_modified_datetime\n"
                        + "    from ccpd_dsrisk_f_dw_safe.dws_antifraud_ty_base_applicant_apply_info_inc_day\n"
                        + "    where ds = '202010'\n"
                        + ") a\n"
                        + "left join (\n"
                        + "    select address as ip_city_code,city as gps_city_code,afs_biz_no\n"
                        + "    from TM_RAS_CITY_INFO\n"
                        + "    where ds = '202010'\n"
                        + ") b\n"
                        + "on a.afs_biz_no =b.afs_biz_no\n"
                        + "left join (\n"
                        + "    select cus_txn_amt as trans_amt,afs_biz_no\n"
                        + "    from TM_JY_DATA_TRADE_INFO \n"
                        + "    where ds = '202010'\n"
                        + "\n"
                        + " --from TM_DATA_TRADE_INFO\n"
                        + ") c\n"
                        + "on a.afs_biz_no =c.afs_biz_no\n"
                        + "left join (\n"
                        + "    SELECT action_type,afs_biz_no\n"
                        + "    FROM DWD_RISK_TY_AFS_ENG_OUTPUT_INFO_INC_DAY\n"
                        + "    where ds = '202010'\n"
                        + "/*\n"
                        + "SELECT fr_is_open_acct\n"
                        + "from DWD_RISK_DS_AFS_STRA_APPLY_OUTPUT_UNION_INC_DAY\n"
                        + "\n"
                        + "SELECT distinct lr_is_approve_loan\n"
                        + "from DWD_RISK_DS_AFS_STRA_LOAN_OUTPUT_UNION_INC_DAY\n"
                        + "\n"
                        + "SELECT distinct approve_result\n"
                        + "from DWD_RISK_JYD_AFS_LOAN_NF_ENG_OUTPUT_INFO_UNION_INC_DAY\n"
                        + "*/\n"
                        + ") d\n"
                        + "on a.afs_biz_no =c.afs_biz_no\n"
                        + ";\n"
                        + "\n"
                        + "insert into table mid_all_product_summerize_day partition(ds = '202010') \n"
                        + "select * \n"
                        + "from tmp_ds_data;\n"
                        + "\n"
                        + "insert into table mid_all_product_summerize_day partition(ds = '202010') \n"
                        + "select b.afs_biz_no            \n"
                        + "      ,b.product_cd            \n"
                        + "      ,b.biz_type              \n"
                        + "      ,b.ecif_no               \n"
                        + "      ,b.id_no                 \n"
                        + "      ,b.phone_no              \n"
                        + "      ,b.union_id              \n"
                        + "      ,b.gps_b                 \n"
                        + "      ,b.gps_l                 \n"
                        + "      ,b.gps_city_code         \n"
                        + "      ,b.ip_address            \n"
                        + "      ,b.ip_city_code          \n"
                        + "      ,b.wx_device_id          \n"
                        + "      ,b.trans_amt             \n"
                        + "      ,b.action_type\n"
                        + "      ,b.created_datetime      \n"
                        + "      ,b.last_modified_datetime\n"
                        + "from (select id_no from tmp_ds_data group by id_no) a\n"
                        + "left join tmp_wzyd_dcp_data b\n"
                        + "on a.id_no =b.id_no\n"
                        + "where b.id_no is not null;\n";

        String query7 = "select *,a,b,c,d,e,f from t_table.a where g = 'a'";

        String query8 =
                "select a.*,b.* from \n"
                        + "tb1 a join tb2 b \n"
                        + "on a.id = b.id \n"
                        + "where a.c1 > 20 and b.c2< 100 and c.c3 = '202010'\n";

        String querySQL = query6;

        // System.out.println(querySQL);

        CodePointCharStream charStream = CharStreams.fromString(querySQL);
        HiveLexer lexer = new HiveLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        HiveParser parser = new HiveParser(tokens);
        TokenStreamRewriter tokenStreamRewriter = new TokenStreamRewriter(tokens);
        HiveSQLRewriterVisitor visitor = new HiveSQLRewriterVisitor(tokenStreamRewriter);
        HiveParser.StatementContext statement = parser.statement();
        visitor.visit(statement);

        //        String text = tokenStreamRewriter.getText();
        //        System.out.println(text);

        String stringTree = statement.toStringTree(parser);
        System.out.println(" ===>> " + stringTree);

        //                ParseDriver pd = new ParseDriver();
        //
        //                try {
        //                    ASTNode node = pd.parse(querySQL);
        //                    System.out.println(node.dump());
        //                } catch (ParseException e) {
        //                    e.printStackTrace();
        //                }

        // System.out.println("sql = " + querySQL);

    }

    // 1. 解析表名、列名
    // 2. 解析列名 = 列值
    // 3. 记录血缘关系
}
