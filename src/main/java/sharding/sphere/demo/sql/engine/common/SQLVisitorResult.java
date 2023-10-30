package sharding.sphere.demo.sql.engine.common;

import java.util.HashMap;
import java.util.Map;

/** SQL解析引擎解析结果，维护占位参数符索引与列名的映射关系 */
public class SQLVisitorResult {
    private Map<String, SQLVisitSingleTableResult> resultsMap = new HashMap<>();

    public Map<String, SQLVisitSingleTableResult> getResultsMap() {
        return resultsMap;
    }

    public void setResultsMap(Map<String, SQLVisitSingleTableResult> resultsMap) {
        this.resultsMap = resultsMap;
    }

    /** 维护单个表占位参数符索引与列名的映射关系 */
    public static class SQLVisitSingleTableResult {
        /** 表名 */
        private String tableName;
        /** 表别名，不为空时有效 */
        private String tableAlias;
        /** 占位参数 与 列名的映射关系 */
        private Map<Integer, ColumnSchema> variantRefIndex2ColumnName = new HashMap<>();

        public String getTableName() {
            return tableName;
        }

        public void setTableName(String tableName) {
            this.tableName = tableName;
        }

        public String getTableAlias() {
            return tableAlias;
        }

        public void setTableAlias(String tableAlias) {
            this.tableAlias = tableAlias;
        }

        public Map<Integer, ColumnSchema> getVariantRefIndex2ColumnName() {
            return variantRefIndex2ColumnName;
        }

        public void setVariantRefIndex2ColumnName(
                Map<Integer, ColumnSchema> variantRefIndex2ColumnName) {
            this.variantRefIndex2ColumnName = variantRefIndex2ColumnName;
        }
    };

    /**
     * @param tableName
     * @return
     */
    public SQLVisitSingleTableResult getResultByTableName(String tableName) {
        return resultsMap.get(tableName);
    }

    /**
     * @param tableName
     * @param variantRefIndex
     * @return
     */
    public ColumnSchema getColumnByTableNameAndVariantRefIndex(
            String tableName, String variantRefIndex) {
        SQLVisitSingleTableResult result = resultsMap.get(tableName);
        if (result != null) {
            return result.getVariantRefIndex2ColumnName().get(variantRefIndex);
        }

        return null;
    }
}
