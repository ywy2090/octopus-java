package sharding.sphere.demo.sql.engine.common;

public class ColumnSchema {
    /** 所属表 */
    TableSchema owner;
    /** 列名 */
    String name;
    /** 别名 */
    String alias;
    /** 列类型 */
    String type;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Column{"
                + "owner="
                + owner
                + ", name='"
                + name
                + '\''
                + ", alias='"
                + alias
                + '\''
                + ", type='"
                + type
                + '\''
                + '}';
    }
}
