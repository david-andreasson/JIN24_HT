package se.davand.database;

import lombok.extern.slf4j.Slf4j;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Slf4j
public class DatabaseManager {
    private static final String DB_URL = "jdbc:h2:mem:cardb;DB_CLOSE_DELAY=-1";
    private static final String DB_USER = "sa";
    private static final String DB_PASSWORD = "";

    public static Connection getConnection() {
        try {
            log.info("Connecting to database...");
            return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        } catch (SQLException e){
            log.error("Could not connect to database", e);
            throw new RuntimeException("Unable to connect to database", e);
        }
    }
}