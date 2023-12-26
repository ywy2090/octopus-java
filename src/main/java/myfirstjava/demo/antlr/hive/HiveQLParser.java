package myfirstjava.demo.antlr.hive;

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

        ParseDriver pd = new ParseDriver();

        try {
            ASTNode node = pd.parse(sql1);
            System.out.println(node.dump());
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
