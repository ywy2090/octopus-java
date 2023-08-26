package sharding.sphere.demo.sql.rewriter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ShardingSphereSQLRewriter implements SQLRewriter {
    private static final Logger logger = LoggerFactory.getLogger(DruidSQLRewriter.class);

    @Override
    public String rewriteSQL(String rawSQL) {
        logger.info(" => ");
        return rawSQL;
    }
}
