package se.davand.repository;

import se.davand.database.ConnectionManager;
import se.davand.model.Product;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    private final ConnectionManager connectionManager;

    public ProductRepository(ConnectionManager connectionManager) {
        this.connectionManager = connectionManager;
    }

    /**
     * Finds products within a specified price range.
     * @param min the minimum price.
     * @param max the maximum price.
     * @return a list of products within the price range.
     */
    public List<Product> findByPriceRange(BigDecimal min, BigDecimal max) {
        String sql = "SELECT * FROM products WHERE price BETWEEN ? AND ?";
        List<Product> products = new ArrayList<>();

        try (Connection connection = connectionManager.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {

            stmt.setBigDecimal(1, min);
            stmt.setBigDecimal(2, max);

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Product product = mapResultSetToProduct(rs);
                    products.add(product);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return products;
    }

    /**
     * Finds products whose names match a given pattern.
     * @param pattern the pattern to search for (use '%' as a wildcard).
     * @return a list of products matching the pattern.
     */
    public List<Product> findByNameLike(String pattern) {
        String sql = "SELECT * FROM products WHERE name LIKE ?";
        List<Product> products = new ArrayList<>();

        try (Connection connection = connectionManager.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {

            stmt.setString(1, pattern);

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Product product = mapResultSetToProduct(rs);
                    products.add(product);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return products;
    }

    public boolean updateStock(Connection connection, Long id, int quantity) throws SQLException {
        String sql = "UPDATE products SET stock = stock + ? WHERE id = ? AND stock + ? >= 0";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, quantity);
            stmt.setLong(2, id);
            stmt.setInt(3, quantity);
            int rowsUpdated = stmt.executeUpdate();
            return rowsUpdated > 0;
        }
    }


    /**
     * Helper method to map a ResultSet row to a Product object.
     * @param rs the ResultSet containing the product data.
     * @return a Product object with data from the current row of the ResultSet.
     * @throws SQLException if an SQL error occurs while accessing the ResultSet.
     */
    private Product mapResultSetToProduct(ResultSet rs) throws SQLException {
        Long id = rs.getLong("id");
        String name = rs.getString("name");
        BigDecimal price = rs.getBigDecimal("price");
        int stock = rs.getInt("stock");
        return new Product(id, name, price, stock);
    }

    public Product findById(Connection connection, Long productId) {
            return null;
    }
}
