package sharding.sphere.demo.sql.rewriter;

public interface SQLRewriter {
    /**
     * 重写SQL
     *
     * @param rawSQL
     * @return
     */
    public String rewriteSQL(String rawSQL) throws SQLRewriterException;
}
