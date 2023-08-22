package sharding.sphere.demo.sql.rewriter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DruidSQLRewriter implements SQLRewriter {
    private static final Logger logger = LoggerFactory.getLogger(DruidSQLRewriter.class);

    @Override
    public String rewriteSQL(String rawSQL) {
        return rawSQL;
    }
}
