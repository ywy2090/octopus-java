package octopus.antlr.hive;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.hadoop.hive.ql.lib.Node;
import org.apache.hadoop.hive.ql.parse.ASTNode;
import org.apache.hadoop.hive.ql.parse.HiveParser;
import org.apache.hadoop.hive.ql.parse.ParseDriver;
import org.apache.hadoop.hive.ql.parse.ParseException;

/** HiveQL Parser Input: HiveQL Output: | success -> AST JSON */
public class HiveQLParser {

    private static Map<Integer, String> dataTypeMap;

    static {
        dataTypeMap = new HashMap<>();
        dataTypeMap.put(HiveParser.TOK_INT, "int");
        dataTypeMap.put(HiveParser.TOK_STRING, "string");
        dataTypeMap.put(HiveParser.TOK_DATE, "date");
    }

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

        String sql2 =
                "INSERT INTO exampledb.exampletable\n"
                        + "PARTITION(my_part)(key_1, key_2, col_1, col_2, my_part)\n"
                        + "SELECT\n"
                        + "    key_1,\n"
                        + "    key_2,\n"
                        + "    col_1,\n"
                        + "    col_2,\n"
                        + "    SUBSTR(key_2, -3)\n"
                        + "FROM exampledb.exampletable_temp";

        String sql3 =
                "select a.*,b.* from \n"
                        + "tb1 a join tb2 b \n"
                        + "on a.id = b.id \n"
                        + "where a.c1 > 20 and b.c2< 100\n";

        String sql4 =
                "insert overwrite tablename （year='2017', month='03'） select a, b from tablename2;\n";

        ParseDriver pd = new ParseDriver();

        try {

            String query = sql4;

            ASTNode tree = pd.parse(sql4);
            System.out.println(tree.dump());

            System.out.println("Input Hive Sql : " + query);
            // Printing AST tree
            // System.out.println(tree.dump());

            // Start traverse the AST tree if it has children AST node
            if (tree.getChildren() != null) {
                for (Node eachNode : tree.getChildren()) {
                    ASTNode astNode = (ASTNode) eachNode;
                    // Calling the traverseEachNode function to loop through the child nodes
                    if (astNode.getChildren() != null) traverseASTNode(astNode.getChildren());
                }
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public static void traverseASTNode(List<Node> astNodeList) {
        for (Node eachNode : astNodeList) {
            ASTNode astNode = (ASTNode) eachNode;
            // Get the node type of parent AST node
            int parentNodeType = astNode.getParent().getType();
            String tableName, columnText;
            int NodeType;

            // Validate the node type to get the SQL details
            switch (parentNodeType) {
                case HiveParser.KW_SELECT:

                case HiveParser.TOK_TABNAME:
                    tableName = astNode.getToken().getText();
                    System.out.println("Table Name : " + tableName);
                    break;
                case HiveParser.TOK_TABCOL:
                    // Get the current AST node type
                    NodeType = astNode.getType();

                    // Get the Token text of the AST node for the column Name
                    columnText = astNode.getText();

                    // Checking the parentNodeType which corresponds to DataType
                    if (NodeType == HiveParser.TOK_INT || NodeType == HiveParser.TOK_STRING)
                        System.out.println("Data Type : " + dataTypeMap.get(NodeType));
                    else {
                        System.out.println("Column Name : " + columnText);
                    }
                    break;
            }

            // Recursive function to traverse the child node of current AST node
            if (astNode.getChildren() != null) traverseASTNode(astNode.getChildren());
        }
    }
}
