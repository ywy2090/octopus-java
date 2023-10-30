package sharding.sphere.demo.sql.engine.utils;

public class Utils {
    /**
     * 去除表名或者列名两边的"`"符号
     *
     * @param tableName
     * @return
     */
    public static String trimTableOrColumnName(String tableName) {
        if (tableName == null) {
            return null;
        }
        int start = 0;
        int length = tableName.length();
        if (tableName.startsWith("`")) {
            start += 1;
            length -= 1;
        }

        if (tableName.endsWith("`")) {
            length -= 1;
        }

        return tableName.substring(start, start + length);
    }

    public static class TableNameAndColumnName {
        private String tableName;
        private String columnName;

        public TableNameAndColumnName(String tableName, String columnName) {
            this.tableName = trimTableOrColumnName(tableName);
            this.columnName = trimTableOrColumnName(columnName);
        }

        public String getTableName() {
            return tableName;
        }

        public void setTableName(String tableName) {
            this.tableName = trimTableOrColumnName(tableName);
        }

        public String getColumnName() {
            return columnName;
        }

        public void setColumnName(String columnName) {
            this.columnName = trimTableOrColumnName(columnName);
        }

        @Override
        public String toString() {
            if (tableName == null) {
                return columnName;
            }
            return tableName + "." + columnName;
        }
    }

    /**
     * "a.b" => tableName: a ColumnName:b
     *
     * @param rowString
     * @return
     */
    public static TableNameAndColumnName toTableNameAndColumnName(String rowString) {
        rowString = trimTableOrColumnName(rowString);
        int index = rowString.indexOf(".");
        if (index == -1) {
            // 不包含表名信息，直接返回列名
            return new TableNameAndColumnName(null, rowString);
        }
        String tableName = rowString.substring(0, index);
        String columnName = rowString.substring(index + 1);
        return new TableNameAndColumnName(tableName, columnName);
    }
}
