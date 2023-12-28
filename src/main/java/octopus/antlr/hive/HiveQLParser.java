package octopus.antlr.hive;

import org.apache.hadoop.hive.ql.parse.ASTNode;
import org.apache.hadoop.hive.ql.parse.ParseDriver;
import org.apache.hadoop.hive.ql.parse.ParseException;

/** HiveQL Parser Input: HiveQL Output: | success -> AST JSON */
public class HiveQLParser {
    public static void main(String[] args) {

        String sql = "select a as a0,b as b0,c as c0 from t_table";
        String sql1 =
                "INSERT INTO app.table_c PARTITION(dt = '20231221')\n"
                        + "SELECT a.id,\n"
                        + "       table_a.col1,\n"
                        + "       c.col2\n"
                        + "FROM app.table_a a\n"
                        + "         LEFT JOIN bdm.table_b c\n"
                        + "                   ON a.id=c.id";

        String sql2 = "INSERT INTO exampledb.exampletable\n" +
                "PARTITION(my_part)(key_1, key_2, col_1, col_2, my_part)\n" +
                "SELECT\n" +
                "    key_1,\n" +
                "    key_2,\n" +
                "    col_1,\n" +
                "    col_2,\n" +
                "    SUBSTR(key_2, -3)\n" +
                "FROM exampledb.exampletable_temp";

        String sql3 = "select a.*,b.* from \n" +
                "tb1 a join tb2 b \n" +
                "on a.id = b.id \n" +
                "where a.c1 > 20 and b.c2< 100\n";

        ParseDriver pd = new ParseDriver();

        try {
            ASTNode node = pd.parse(sql3);
            System.out.println(node.dump());
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
