package myfirstjava.demo.antlr.hive;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.hadoop.hive.ql.lib.Node;
import org.apache.hadoop.hive.ql.parse.ASTNode;
import org.apache.hadoop.hive.ql.parse.HiveParser;
import org.apache.hadoop.hive.ql.parse.ParseDriver;
import org.apache.hadoop.hive.ql.parse.ParseException;

public class TestParseHiveSql {

    // Declaring the static map for Hive Data Type
    private static Map<Integer, String> dataTypeMap;

    static {
        dataTypeMap = new HashMap<>();
        dataTypeMap.put(HiveParser.TOK_INT, "int");
        dataTypeMap.put(HiveParser.TOK_STRING, "string");
        dataTypeMap.put(HiveParser.TOK_DATE, "date");
    }

    public static void main(String[] args) {

        // Input Create Table Statement
        String input = "CREATE TABLE Test_Cust (Cust_id int,Name string)";

        // Create a ParseDriver object
        ParseDriver pd = new ParseDriver();

        try {

            // Get Abstract Syntax Tree(AST) by parsing the input Hive Sql
            ASTNode tree = pd.parse(input);

            System.out.println("Input Hive Sql : " + input);
            // Printing AST tree
            System.out.println(tree.dump());

            // Start traverse the AST tree if it has children AST node
            if (tree.getChildren() != null) {
                for (Node eachNode : tree.getChildren()) {
                    ASTNode astNode = (ASTNode) eachNode;
                    // Calling the traverseEachNode function to loop through the child nodes
                    if (astNode.getChildren() != null) traverseASTNode(astNode.getChildren());
                }
            }

        } catch (ParseException e) {
            throw new RuntimeException(e);
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
