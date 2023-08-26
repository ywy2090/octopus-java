package sharding.sphere.demo.sql.rewriter;

import net.sf.jsqlparser.JSQLParserException;
import net.sf.jsqlparser.parser.CCJSqlParserUtil;
import net.sf.jsqlparser.statement.Statement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JSqlRewriter implements SQLRewriter {
    private static final Logger logger = LoggerFactory.getLogger(JSqlRewriter.class);

    @Override
    public String rewriteSQL(String rawSQL) throws SQLRewriterException {
        try {
            Statement statement = CCJSqlParserUtil.parse(rawSQL);
        } catch (JSQLParserException e) {
            // throw new SQLRewriterException(e.getMessage());
            e.printStackTrace();
        }
        return rawSQL;
    }
}
