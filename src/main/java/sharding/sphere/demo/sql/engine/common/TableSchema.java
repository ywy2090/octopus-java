package sharding.sphere.demo.sql.engine.common;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class TableSchema {
    /** 表名 */
    String name;
    /** 别名 */
    String alias;
    /** 包含列表 */
    List<ColumnSchema> columnSchemas = new ArrayList<>();

    public void addColumn(ColumnSchema columnSchema) {
        if (columnSchema != null) {
            columnSchemas.add(columnSchema);
        }
    }

    public boolean existColumn(String columnName) {
        return columnSchemas.stream()
                .anyMatch(
                        new Predicate<ColumnSchema>() {
                            @Override
                            public boolean test(ColumnSchema columnSchema) {
                                return columnSchema.getName().equals(columnName);
                            }
                        });
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public List<ColumnSchema> getColumns() {
        return columnSchemas;
    }

    public void setColumns(List<ColumnSchema> columnSchemas) {
        this.columnSchemas = columnSchemas;
    }
}
