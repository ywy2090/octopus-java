package sharding.sphere.demo.sql.engine.common;

import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TableSchemaManager {
    private static final Logger logger = LoggerFactory.getLogger(TableSchemaManager.class);

    private Map<String, TableSchema> tables = new HashMap();

    public Map<String, TableSchema> getTables() {
        return tables;
    }

    public void setTables(Map<String, TableSchema> tables) {
        this.tables = tables;
    }
}
