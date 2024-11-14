package se.davand.repository;

import se.davand.model.Order;
import se.davand.model.OrderItem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OrderRepository {

    public void createOrder(Connection connection, Order order) throws SQLException {
        String orderSql = "INSERT INTO orders (id) VALUES (?)";
        try (PreparedStatement orderStmt = connection.prepareStatement(orderSql)) {
            orderStmt.setLong(1, order.getId());
            orderStmt.executeUpdate();
        }

        String orderItemSql = "INSERT INTO order_items (order_id, product_id, quantity) VALUES (?, ?, ?)";
        try (PreparedStatement itemStmt = connection.prepareStatement(orderItemSql)) {
            for (OrderItem item : order.getItems()) {
                itemStmt.setLong(1, order.getId());
                itemStmt.setLong(2, item.getProductId());
                itemStmt.setInt(3, item.getQuantity());
                itemStmt.addBatch();
            }
            itemStmt.executeBatch();
        }
    }
}
