package sharding.sphere.demo.jdbc.wrapper;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverPropertyInfo;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.Properties;
import java.util.logging.Logger;
import sharding.sphere.demo.jdbc.DataSourceProxyConfig;

public class DriverWrapper implements Driver {

    public DriverWrapper(Driver driver) {
        this.driver = driver;
    }

    private DataSourceProxyConfig dataSourceProxyConfig;
    private Driver driver;

    private Properties properties;

    private String dbType;

    public DataSourceProxyConfig getDataSourceProxyConfig() {
        return dataSourceProxyConfig;
    }

    public void setDataSourceProxyConfig(DataSourceProxyConfig dataSourceProxyConfig) {
        this.dataSourceProxyConfig = dataSourceProxyConfig;
    }

    public Driver getRawDriver() {
        return driver;
    }

    public void setRawDriver(Driver rawDriver) {
        this.driver = rawDriver;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public String getDbType() {
        return dbType;
    }

    public void setDbType(String dbType) {
        this.dbType = dbType;
    }

    public ConnectionWrapper connect(String url, Properties properties) throws SQLException {
        Connection connection = driver.connect(url, properties);
        // TODO:
        return new ConnectionWrapper(connection, properties);
    }

    @Override
    public boolean acceptsURL(String url) throws SQLException {
        return driver.acceptsURL(url);
    }

    @Override
    public DriverPropertyInfo[] getPropertyInfo(String url, Properties info) throws SQLException {
        return driver.getPropertyInfo(url, info);
    }

    @Override
    public int getMajorVersion() {
        return driver.getMajorVersion();
    }

    @Override
    public int getMinorVersion() {
        return driver.getMinorVersion();
    }

    @Override
    public boolean jdbcCompliant() {
        return driver.jdbcCompliant();
    }

    @Override
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        return driver.getParentLogger();
    }
}
