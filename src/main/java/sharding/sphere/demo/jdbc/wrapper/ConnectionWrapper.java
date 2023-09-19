package sharding.sphere.demo.jdbc.wrapper;

import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Struct;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConnectionWrapper extends BasicWrapper<Connection> implements Connection {

    private Properties properties;

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void doNothing() {
        System.out.println("==>");
    }

    private static final Logger logger = LoggerFactory.getLogger(ConnectionWrapper.class);

    public ConnectionWrapper(Connection target, Properties properties) {
        super(target);
        setProperties(properties);
    }

    @Override
    public Statement createStatement() throws SQLException {
        Statement statement = target.createStatement();
        return new StatementWrapper(statement, properties);
    }

    @Override
    public PreparedStatement prepareStatement(String sql) throws SQLException {
        // TODO: 处理SQL
        logger.info("SQL: {}", sql);
        PreparedStatement preparedStatement = target.prepareStatement(sql);
        return new PreparedStatementWrapper(preparedStatement, properties);
    }

    @Override
    public CallableStatement prepareCall(String sql) throws SQLException {
        // TODO: 处理SQL
        logger.info("SQL: {}", sql);
        CallableStatement callableStatement = target.prepareCall(sql);
        return new CallableStatementWrapper(callableStatement);
    }

    @Override
    public String nativeSQL(String sql) throws SQLException {
        logger.info("SQL: {}", sql);
        return target.nativeSQL(sql);
    }

    @Override
    public void setAutoCommit(boolean autoCommit) throws SQLException {
        target.setAutoCommit(autoCommit);
    }

    @Override
    public boolean getAutoCommit() throws SQLException {
        return target.getAutoCommit();
    }

    @Override
    public void commit() throws SQLException {
        target.commit();
    }

    @Override
    public void rollback() throws SQLException {
        target.rollback();
    }

    @Override
    public void close() throws SQLException {
        target.close();
    }

    @Override
    public boolean isClosed() throws SQLException {
        return target.isClosed();
    }

    @Override
    public DatabaseMetaData getMetaData() throws SQLException {
        return target.getMetaData();
    }

    @Override
    public void setReadOnly(boolean readOnly) throws SQLException {
        target.setReadOnly(readOnly);
    }

    @Override
    public boolean isReadOnly() throws SQLException {
        return target.isReadOnly();
    }

    @Override
    public void setCatalog(String catalog) throws SQLException {
        target.setCatalog(catalog);
    }

    @Override
    public String getCatalog() throws SQLException {
        return target.getCatalog();
    }

    @Override
    public void setTransactionIsolation(int level) throws SQLException {
        target.setTransactionIsolation(level);
    }

    @Override
    public int getTransactionIsolation() throws SQLException {
        return target.getTransactionIsolation();
    }

    @Override
    public SQLWarning getWarnings() throws SQLException {
        return target.getWarnings();
    }

    @Override
    public void clearWarnings() throws SQLException {
        target.clearWarnings();
    }

    @Override
    public Statement createStatement(int resultSetType, int resultSetConcurrency)
            throws SQLException {
        Statement statement = target.createStatement(resultSetType, resultSetConcurrency);
        return new StatementWrapper(statement, properties);
    }

    @Override
    public PreparedStatement prepareStatement(
            String sql, int resultSetType, int resultSetConcurrency) throws SQLException {
        // TODO: 处理SQL
        logger.info("SQL: {}", sql);
        PreparedStatement preparedStatement =
                target.prepareStatement(sql, resultSetType, resultSetConcurrency);
        return new PreparedStatementWrapper(preparedStatement, properties);
    }

    @Override
    public CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency)
            throws SQLException {
        // TODO: 处理SQL
        logger.info("SQL: {}", sql);
        CallableStatement callableStatement =
                target.prepareCall(sql, resultSetType, resultSetConcurrency);
        return new CallableStatementWrapper(callableStatement);
    }

    @Override
    public Map<String, Class<?>> getTypeMap() throws SQLException {
        return target.getTypeMap();
    }

    @Override
    public void setTypeMap(Map<String, Class<?>> map) throws SQLException {
        target.setTypeMap(map);
    }

    @Override
    public void setHoldability(int holdability) throws SQLException {
        target.setHoldability(holdability);
    }

    @Override
    public int getHoldability() throws SQLException {
        return target.getHoldability();
    }

    @Override
    public Savepoint setSavepoint() throws SQLException {
        return target.setSavepoint();
    }

    @Override
    public Savepoint setSavepoint(String name) throws SQLException {
        return target.setSavepoint(name);
    }

    @Override
    public void rollback(Savepoint savepoint) throws SQLException {
        target.rollback(savepoint);
    }

    @Override
    public void releaseSavepoint(Savepoint savepoint) throws SQLException {
        target.releaseSavepoint(savepoint);
    }

    @Override
    public Statement createStatement(
            int resultSetType, int resultSetConcurrency, int resultSetHoldability)
            throws SQLException {
        Statement statement =
                target.createStatement(resultSetType, resultSetConcurrency, resultSetHoldability);
        return new StatementWrapper(statement, properties);
    }

    @Override
    public PreparedStatement prepareStatement(
            String sql, int resultSetType, int resultSetConcurrency, int resultSetHoldability)
            throws SQLException {
        logger.info("SQL: {}", sql);
        // TODO: 处理SQL
        PreparedStatement preparedStatement =
                target.prepareStatement(
                        sql, resultSetType, resultSetConcurrency, resultSetHoldability);
        return new PreparedStatementWrapper(preparedStatement, properties);
    }

    @Override
    public CallableStatement prepareCall(
            String sql, int resultSetType, int resultSetConcurrency, int resultSetHoldability)
            throws SQLException {
        logger.info("SQL: {}", sql);
        // TODO: 处理SQL
        CallableStatement callableStatement =
                target.prepareCall(sql, resultSetType, resultSetConcurrency);
        return new CallableStatementWrapper(callableStatement);
    }

    @Override
    public PreparedStatement prepareStatement(String sql, int autoGeneratedKeys)
            throws SQLException {
        logger.info("SQL: {}", sql);
        // TODO: 处理SQL
        PreparedStatement preparedStatement = prepareStatement(sql, autoGeneratedKeys);
        return new PreparedStatementWrapper(preparedStatement, properties);
    }

    @Override
    public PreparedStatement prepareStatement(String sql, int[] columnIndexes) throws SQLException {
        // TODO: 处理SQL
        PreparedStatement preparedStatement = target.prepareStatement(sql, columnIndexes);
        return new PreparedStatementWrapper(preparedStatement, properties);
    }

    @Override
    public PreparedStatement prepareStatement(String sql, String[] columnNames)
            throws SQLException {
        logger.info("SQL: {}", sql);
        // TODO: 处理SQL
        PreparedStatement preparedStatement = target.prepareStatement(sql, columnNames);
        return new PreparedStatementWrapper(preparedStatement, properties);
    }

    @Override
    public Clob createClob() throws SQLException {
        return target.createClob();
    }

    @Override
    public Blob createBlob() throws SQLException {
        return target.createBlob();
    }

    @Override
    public NClob createNClob() throws SQLException {
        return target.createNClob();
    }

    @Override
    public SQLXML createSQLXML() throws SQLException {
        return target.createSQLXML();
    }

    @Override
    public boolean isValid(int timeout) throws SQLException {
        return target.isValid(timeout);
    }

    @Override
    public void setClientInfo(String name, String value) throws SQLClientInfoException {
        target.setClientInfo(name, value);
    }

    @Override
    public void setClientInfo(Properties properties) throws SQLClientInfoException {
        target.setClientInfo(properties);
    }

    @Override
    public String getClientInfo(String name) throws SQLException {
        return target.getClientInfo(name);
    }

    @Override
    public Properties getClientInfo() throws SQLException {
        return target.getClientInfo();
    }

    @Override
    public Array createArrayOf(String typeName, Object[] elements) throws SQLException {
        return createArrayOf(typeName, elements);
    }

    @Override
    public Struct createStruct(String typeName, Object[] attributes) throws SQLException {
        return createStruct(typeName, attributes);
    }

    @Override
    public void setSchema(String schema) throws SQLException {
        target.setSchema(schema);
    }

    @Override
    public String getSchema() throws SQLException {
        return target.getSchema();
    }

    @Override
    public void abort(Executor executor) throws SQLException {
        target.abort(executor);
    }

    @Override
    public void setNetworkTimeout(Executor executor, int milliseconds) throws SQLException {
        target.setNetworkTimeout(executor, milliseconds);
    }

    @Override
    public int getNetworkTimeout() throws SQLException {
        return target.getNetworkTimeout();
    }
}
