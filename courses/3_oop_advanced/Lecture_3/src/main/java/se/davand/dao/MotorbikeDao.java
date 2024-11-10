package se.davand.dao;

import se.davand.Model.Motorbike;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MotorbikeDao {
    // Skapa connection
    private final Connection connection;

    // initiera den med DI
    public MotorbikeDao(Connection connection) {
        this.connection = connection;
    }

    // createTable
    public void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS motorbike ("
                + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "make VARCHAR(255) NOT NULL,"
                + "model VARCHAR(255) NOT NULL,"
                + "year INTEGER NOT NULL)";

        try (Statement stmt = connection.createStatement()) {
            stmt.execute(sql);
            log.info("Motorbike table created successfully");
        } catch (SQLException e) {
            log.error("Error while creating table", e);
        }
    }

    // insert
    // getById
    // getAll
    // update
    // delete
}