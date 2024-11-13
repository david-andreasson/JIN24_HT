package se.davand;

import se.davand.database.BasicConnectionPool;
import se.davand.database.ConnectionManager;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        // Test basic database connection
        try (Connection connection = BasicConnectionPool.getConnection()) {
            if (connection != null && !connection.isClosed()) {
                System.out.println("Connection successful!");
            }
        } catch (SQLException e) {
            System.err.println("Database connection failed: " + e.getMessage());
        }

        // Additional code to test ConnectionManager
        // Example of a SELECT query
        String selectQuery = "SELECT * FROM users WHERE id = ?";
        try (ResultSet rs = ConnectionManager.executeQuery(selectQuery, 1)) {
            if (rs != null && rs.next()) {
                System.out.println("User ID: " + rs.getInt("id"));
                System.out.println("Username: " + rs.getString("username"));
                System.out.println("Email: " + rs.getString("email"));
            }
        } catch (SQLException e) {
            System.err.println("Failed to read from ResultSet: " + e.getMessage());
        }

        // Example of an UPDATE query
        String updateQuery = "UPDATE users SET email = ? WHERE id = ?";
        int rowsAffected = ConnectionManager.executeUpdate(updateQuery, "newemail@example.com", 1);
        System.out.println("Number of rows updated: " + rowsAffected);

        // Close connection pool when the program finishes
        BasicConnectionPool.shutdown();
    }
}
