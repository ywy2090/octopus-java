/*
 * MIT License, Copyright (c) 2016 Hendrik Schnepel
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package sharding.sphere.demo.jdbc.wrapper;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.Statement;
import java.util.Properties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StatementWrapper extends BasicWrapper<Statement> implements Statement {

    private static final Logger logger = LoggerFactory.getLogger(StatementWrapper.class);

    private Properties properties;

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public StatementWrapper(final Statement target, Properties properties) {
        super(target);
        setProperties(properties);
    }

    @Override
    public ResultSet executeQuery(final String sql) throws SQLException {
        // TODO: 处理SQL
        logger.info("SQL: {}", sql);
        ResultSet resultSet = target.executeQuery(sql);
        return new ResultSetWrapper(resultSet, properties);
    }

    @Override
    public int executeUpdate(final String sql) throws SQLException {
        // TODO: 处理SQL
        logger.info("SQL: {}", sql);
        return target.executeUpdate(sql);
    }

    @Override
    public void close() throws SQLException {
        target.close();
    }

    @Override
    public int getMaxFieldSize() throws SQLException {
        return target.getMaxFieldSize();
    }

    @Override
    public void setMaxFieldSize(final int max) throws SQLException {
        target.setMaxFieldSize(max);
    }

    @Override
    public int getMaxRows() throws SQLException {
        return target.getMaxRows();
    }

    @Override
    public void setMaxRows(final int max) throws SQLException {
        target.setMaxRows(max);
    }

    @Override
    public void setEscapeProcessing(final boolean enable) throws SQLException {
        target.setEscapeProcessing(enable);
    }

    @Override
    public int getQueryTimeout() throws SQLException {
        return target.getQueryTimeout();
    }

    @Override
    public void setQueryTimeout(final int seconds) throws SQLException {
        target.setQueryTimeout(seconds);
    }

    @Override
    public void cancel() throws SQLException {
        target.cancel();
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
    public void setCursorName(final String name) throws SQLException {
        target.setCursorName(name);
    }

    @Override
    public boolean execute(final String sql) throws SQLException {
        // TODO: 处理SQL
        logger.info("SQL: {}", sql);
        return target.execute(sql);
    }

    @Override
    public ResultSet getResultSet() throws SQLException {
        ResultSet resultSet = target.getResultSet();
        return new ResultSetWrapper(resultSet, properties);
    }

    @Override
    public int getUpdateCount() throws SQLException {
        return target.getUpdateCount();
    }

    @Override
    public boolean getMoreResults() throws SQLException {
        return target.getMoreResults();
    }

    @Override
    public void setFetchDirection(final int direction) throws SQLException {
        target.setFetchDirection(direction);
    }

    @Override
    public int getFetchDirection() throws SQLException {
        return target.getFetchDirection();
    }

    @Override
    public void setFetchSize(final int rows) throws SQLException {
        target.setFetchSize(rows);
    }

    @Override
    public int getFetchSize() throws SQLException {
        return target.getFetchSize();
    }

    @Override
    public int getResultSetConcurrency() throws SQLException {
        return target.getResultSetConcurrency();
    }

    @Override
    public int getResultSetType() throws SQLException {
        return target.getResultSetType();
    }

    @Override
    public void addBatch(final String sql) throws SQLException {
        // TODO: 处理SQL
        logger.info("SQL: {}", sql);
        target.addBatch(sql);
    }

    @Override
    public void clearBatch() throws SQLException {
        target.clearBatch();
    }

    @Override
    public int[] executeBatch() throws SQLException {
        return target.executeBatch();
    }

    @Override
    public Connection getConnection() throws SQLException {
        return target.getConnection();
    }

    @Override
    public boolean getMoreResults(final int current) throws SQLException {
        return target.getMoreResults(current);
    }

    @Override
    public ResultSet getGeneratedKeys() throws SQLException {
        ResultSet generatedKeys = target.getGeneratedKeys();
        return new ResultSetWrapper(generatedKeys, properties);
    }

    @Override
    public int executeUpdate(final String sql, final int autoGeneratedKeys) throws SQLException {
        // TODO: 处理SQL
        logger.info("SQL: {}", sql);
        return target.executeUpdate(sql, autoGeneratedKeys);
    }

    @Override
    public int executeUpdate(final String sql, final int[] columnIndexes) throws SQLException {
        // TODO: 处理SQL
        logger.info("SQL: {}", sql);
        return target.executeUpdate(sql, columnIndexes);
    }

    @Override
    public int executeUpdate(final String sql, final String[] columnNames) throws SQLException {
        // TODO: 处理SQL
        logger.info("SQL: {}", sql);
        return target.executeUpdate(sql, columnNames);
    }

    @Override
    public boolean execute(final String sql, final int autoGeneratedKeys) throws SQLException {
        // TODO: 处理SQL
        logger.info("SQL: {}", sql);
        return target.execute(sql, autoGeneratedKeys);
    }

    @Override
    public boolean execute(final String sql, final int[] columnIndexes) throws SQLException {
        // TODO: 处理SQL
        logger.info("SQL: {}", sql);
        return target.execute(sql, columnIndexes);
    }

    @Override
    public boolean execute(final String sql, final String[] columnNames) throws SQLException {
        // TODO: 处理SQL
        logger.info("SQL: {}", sql);
        return target.execute(sql, columnNames);
    }

    @Override
    public int getResultSetHoldability() throws SQLException {
        return target.getResultSetHoldability();
    }

    @Override
    public boolean isClosed() throws SQLException {
        return target.isClosed();
    }

    @Override
    public void setPoolable(final boolean poolable) throws SQLException {
        target.setPoolable(poolable);
    }

    @Override
    public boolean isPoolable() throws SQLException {
        return target.isPoolable();
    }

    @Override
    public void closeOnCompletion() throws SQLException {
        target.closeOnCompletion();
    }

    @Override
    public boolean isCloseOnCompletion() throws SQLException {
        return target.isCloseOnCompletion();
    }

    @Override
    public long getLargeUpdateCount() throws SQLException {
        return target.getLargeUpdateCount();
    }

    @Override
    public void setLargeMaxRows(final long max) throws SQLException {
        target.setLargeMaxRows(max);
    }

    @Override
    public long getLargeMaxRows() throws SQLException {
        return target.getLargeMaxRows();
    }

    @Override
    public long[] executeLargeBatch() throws SQLException {
        return target.executeLargeBatch();
    }

    @Override
    public long executeLargeUpdate(final String sql) throws SQLException {
        // TODO: 处理SQL
        logger.info("SQL: {}", sql);
        return target.executeLargeUpdate(sql);
    }

    @Override
    public long executeLargeUpdate(final String sql, final int autoGeneratedKeys)
            throws SQLException {
        // TODO: 处理SQL
        logger.info("SQL: {}", sql);
        return target.executeLargeUpdate(sql, autoGeneratedKeys);
    }

    @Override
    public long executeLargeUpdate(final String sql, final int[] columnIndexes)
            throws SQLException {
        // TODO: 处理SQL
        logger.info("SQL: {}", sql);
        return target.executeLargeUpdate(sql, columnIndexes);
    }

    @Override
    public long executeLargeUpdate(final String sql, final String[] columnNames)
            throws SQLException {
        // TODO: 处理SQL
        logger.info("SQL: {}", sql);
        return target.executeLargeUpdate(sql, columnNames);
    }
}
