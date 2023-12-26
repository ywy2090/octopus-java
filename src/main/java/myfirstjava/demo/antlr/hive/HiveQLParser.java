package myfirstjava.demo.antlr.hive;

import org.apache.hadoop.hive.ql.parse.ASTNode;
import org.apache.hadoop.hive.ql.parse.ParseDriver;
import org.apache.hadoop.hive.ql.parse.ParseException;

/** HiveQL Parser Input: HiveQL Output: | success -> AST JSON */
public class HiveQLParser {
    public static void main(String[] args) {

        String sql = "select a as a0,b as b0,c as c0 from t_table";

        ParseDriver pd = new ParseDriver();

        try {
            ASTNode node = pd.parse(sql);
            System.out.println(node.dump());
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
