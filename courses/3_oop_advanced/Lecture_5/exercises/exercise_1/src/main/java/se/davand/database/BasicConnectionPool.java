package se.davand.database;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class BasicConnectionPool {
    private static final HikariDataSource dataSource;

    // Statisk block för att initiera dataSource en gång
    static {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:mysql://localhost:3306/mydatabase"); // Ändra "mydatabase" till din databas
        config.setUsername("David"); // Ändra till ditt MySQL-användarnamn
        config.setPassword("Grodan77##"); // Ändra till ditt MySQL-lösenord

        // Pool-inställningar
        config.setMaximumPoolSize(10); // Max antal connections
        config.setMinimumIdle(5);      // Min antal connections som ska vara redo att använda
        config.setIdleTimeout(300000); // Timeout för idle connections (i millisekunder)

        dataSource = new HikariDataSource(config);
    }

    // Metod för att hämta en connection från poolen
    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }
}
