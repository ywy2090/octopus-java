package octopus.antlr.example.spark;

import java.util.List;
import octopus.antlr.codegen.spark.v2_4_3.SqlBaseLexer;
import octopus.antlr.codegen.spark.v2_4_3.SqlBaseParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.apache.spark.sql.catalyst.parser.UpperCaseCharStream;

public class SparkSqlHelper {
    public static void main(String[] args) {
        String sql =
                "SELECT T1.COL1,T2.COL2 \n"
                        + "FROM TAB1 T1 \n"
                        + "LEFT JOIN TAB2 T2 ON T1.ID=T2.ID WHERE T1.ID = 1";
        System.out.println(SparkSqlHelper.parse(sql));
    }

    public static List<String> parse(String sql) {
        UpperCaseCharStream charStream = new UpperCaseCharStream(CharStreams.fromString(sql));
        // 新建一个词法分析器，解析创建的流
        SqlBaseLexer lexer = new SqlBaseLexer(charStream);
        // 新建一个词法符号的缓冲器，存储词法分析器生成的词法符号
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        // 新建语法解析器，处理词法符号缓冲器中的内容
        SqlBaseParser parser = new SqlBaseParser(tokenStream);
        // 指定预测模式(1)
        parser.getInterpreter().setPredictionMode(PredictionMode.SLL);
        // 创建解析器访问对应的方法
        SparkSqlAst visitor = new SparkSqlAst();
        return (List<String>) visitor.visit(parser.singleStatement());
    }
}
