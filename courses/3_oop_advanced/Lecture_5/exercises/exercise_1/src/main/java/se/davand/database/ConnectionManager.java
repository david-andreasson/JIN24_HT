package se.davand.database;

import se.davand.database.BasicConnectionPool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionManager {

    public static ResultSet executeQuery(String query, Object... params) {
        try {
            Connection connection = BasicConnectionPool.getConnection();
            PreparedStatement statement = connection.prepareStatement(query);
            setParameters(statement, params);

            return statement.executeQuery();
        } catch (SQLException e) {
            System.err.println("Query execution failed: " + e.getMessage());
            return null;
        }
    }

    public static int executeUpdate(String query, Object... params) {
        try (Connection connection = BasicConnectionPool.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {

            setParameters(statement, params);
            return statement.executeUpdate();

        } catch (SQLException e) {
            System.err.println("Update execution failed: " + e.getMessage());
            return 0;
        }
    }

    private static void setParameters(PreparedStatement statement, Object... params) throws SQLException {
        for (int i = 0; i < params.length; i++) {
            statement.setObject(i + 1, params[i]);
        }
    }
}
