package se.davand.database;

import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class TransactionManager {
    private final HikariDataSource dataSource;

    public TransactionManager(HikariDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public <T> T executeInTransaction(TransactionCallback<T> action) throws Exception {
        try (Connection conn = dataSource.getConnection()) {
            try {
                conn.setAutoCommit(false);
                T result = action.execute(conn);
                conn.commit();
                return result;
            } catch (Exception e) {
                conn.rollback();
                throw new SQLException("Transaction failed", e);
            }
        }
        catch (SQLException e) {
            throw new Exception("Connection error", e);
        }
    }
}