/*
 * Copyright 1999-2018 Alibaba Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package sharding.sphere.demo.jdbc;

import com.alibaba.druid.proxy.jdbc.DataSourceProxyImpl;
import com.alibaba.druid.util.JdbcUtils;
import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.DriverPropertyInfo;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.Properties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sharding.sphere.demo.jdbc.wrapper.ConnectionWrapper;
import sharding.sphere.demo.jdbc.wrapper.DriverWrapper;

public class MyDriver implements Driver {

    private static final Logger logger = LoggerFactory.getLogger(MyDriver.class);
    public static final String DEFAULT_PREFIX = "jdbc:mysql";

    private DriverWrapper driverWrapper;

    private String acceptPrefix = DEFAULT_PREFIX;

    private int majorVersion = 4;

    private int minorVersion = 1;

    static {
        // Register ourselves with the DriverManager.
        try {
            DriverManager.registerDriver(new MyDriver());
            logger.info("registerDriver, class: {}", MyDriver.class.getSimpleName());
        } catch (Exception e) {
            logger.error("registerDriver error", e);
        }
    }

    public MyDriver() {}

    @Override
    public boolean acceptsURL(String url) throws SQLException {
        if (url == null) {
            return false;
        }

        if (url.startsWith(acceptPrefix)) {
            return true;
        }

        return false;
    }

    @Override
    public Connection connect(String url, Properties properties) throws SQLException {
        if (!acceptsURL(url)) {
            return null;
        }

        DriverWrapper driverWrapper = getDataSource(url, properties);
        Connection connect = driverWrapper.connect(url, properties);
        return new ConnectionWrapper(connect);
    }

    private DriverWrapper getDataSource(String url, Properties info) throws SQLException {
        if (driverWrapper == null) {
            synchronized (DataSourceProxyImpl.class) {
                if (driverWrapper == null) {
                    DataSourceProxyConfig config = parseConfig(url, info);
                    Driver rawDriver = createDriver(config.getRawDriverClassName());
                    driverWrapper = new DriverWrapper(rawDriver);
                    driverWrapper.setDataSourceProxyConfig(config);
                }
            }
        }
        return driverWrapper;
    }

    public static DataSourceProxyConfig parseConfig(String url, Properties properties)
            throws SQLException {
        DataSourceProxyConfig config = new DataSourceProxyConfig();

        /*
        if (restUrl.startsWith(DRIVER_PREFIX)) {
            int pos = restUrl.indexOf(':', DRIVER_PREFIX.length());
            String driverText = restUrl.substring(DRIVER_PREFIX.length(), pos);
            if (driverText.length() > 0) {
                config.setRawDriverClassName(driverText.trim());
            }
            restUrl = restUrl.substring(pos + 1);
        }

        if (restUrl.startsWith(NAME_PREFIX)) {
            int pos = restUrl.indexOf(':', NAME_PREFIX.length());
            String name = restUrl.substring(NAME_PREFIX.length(), pos);
            config.setName(name);
            restUrl = restUrl.substring(pos + 1);
        }
        */

        if (config.getRawDriverClassName() == null) {
            String rawDriverClassname = JdbcUtils.getDriverClassName(url);
            config.setRawDriverClassName(rawDriverClassname);
        }

        config.setUrl(url);
        config.setRawUrl(url);

        return config;
    }

    public static Class<?> loadClass(String className) {
        Class<?> clazz = null;

        if (className == null) {
            return null;
        }

        try {
            return Class.forName(className);
        } catch (ClassNotFoundException e) {
            // skip
        }

        ClassLoader ctxClassLoader = Thread.currentThread().getContextClassLoader();
        if (ctxClassLoader != null) {
            try {
                clazz = ctxClassLoader.loadClass(className);
            } catch (ClassNotFoundException e) {
                // skip
            }
        }

        return clazz;
    }

    public Driver createDriver(String className) throws SQLException {
        Class<?> rawDriverClass = loadClass(className);

        if (rawDriverClass == null) {
            throw new SQLException("jdbc-driver's class not found. '" + className + "'");
        }

        Driver rawDriver;
        try {
            rawDriver = (Driver) rawDriverClass.getDeclaredConstructor().newInstance();
        } catch (InstantiationException e) {
            throw new SQLException(
                    "create driver instance error, driver className '" + className + "'", e);
        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw new SQLException(
                    "create driver instance error, driver className '" + className + "'", e);
        }

        logger.info("createDriver, className: {}", className);

        return rawDriver;
    }

    @Override
    public int getMajorVersion() {
        return this.majorVersion;
    }

    @Override
    public int getMinorVersion() {
        return this.minorVersion;
    }

    @Override
    public DriverPropertyInfo[] getPropertyInfo(String url, Properties info) throws SQLException {
        DriverWrapper driverWrapper = getDataSource(url, info);
        return driverWrapper
                .getRawDriver()
                .getPropertyInfo(driverWrapper.getDataSourceProxyConfig().getRawUrl(), info);
    }

    @Override
    public boolean jdbcCompliant() {
        return true;
    }

    public java.util.logging.Logger getParentLogger() throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }
}
