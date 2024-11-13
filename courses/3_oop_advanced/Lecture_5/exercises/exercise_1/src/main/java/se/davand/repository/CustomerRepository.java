package se.davand.repository;

import se.davand.model.Customer;
import se.davand.database.ConnectionManager;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CustomerRepository {
    private final ConnectionManager connectionManager;

    public CustomerRepository(ConnectionManager connectionManager) {
        this.connectionManager = connectionManager;
    }

    // Finds a customer by ID
    public Optional<Customer> findById(Long id) {
        String sql = "SELECT * FROM customers WHERE id = ?";
        try (Connection conn = connectionManager.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setLong(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return Optional.of(mapResultSetToCustomer(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

    // Returns a list of all customers
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();
        String sql = "SELECT * FROM customers";
        try (Connection conn = connectionManager.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                customers.add(mapResultSetToCustomer(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customers;
    }

    // Saves a new customer or updates an existing one
    public boolean save(Customer customer) {
        String sql = customer.getId() == null ?
                "INSERT INTO customers (name, email) VALUES (?, ?)" :
                "UPDATE customers SET name = ?, email = ? WHERE id = ?";

        try (Connection conn = connectionManager.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            stmt.setString(1, customer.getName());
            stmt.setString(2, customer.getEmail());
            if (customer.getId() != null) {
                stmt.setLong(3, customer.getId());
            }

            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0 && customer.getId() == null) {
                ResultSet generatedKeys = stmt.getGeneratedKeys();
                if (generatedKeys.next()) {
                    customer.setId(generatedKeys.getLong(1));
                }
            }
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    // Deletes a customer by ID
    public boolean delete(Long id) {
        String sql = "DELETE FROM customers WHERE id = ?";
        try (Connection conn = connectionManager.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setLong(1, id);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    // Maps a ResultSet to a Customer object
    private Customer mapResultSetToCustomer(ResultSet rs) throws SQLException {
        Long id = rs.getLong("id");
        String name = rs.getString("name");
        String email = rs.getString("email");
        return new Customer(id, name, email);
    }
}
