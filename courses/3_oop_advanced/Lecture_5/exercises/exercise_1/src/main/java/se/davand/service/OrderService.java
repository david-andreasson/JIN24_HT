package se.davand.service;

import se.davand.database.TransactionManager;
import se.davand.model.Order;
import se.davand.model.OrderItem;
import se.davand.model.Product;
import se.davand.repository.OrderRepository;
import se.davand.repository.ProductRepository;

import java.sql.Connection;

public class OrderService {
    private final TransactionManager transactionManager;
    private final ProductRepository productRepository;
    private final OrderRepository orderRepository;

    public OrderService(TransactionManager transactionManager, ProductRepository productRepository, OrderRepository orderRepository) {
        this.transactionManager = transactionManager;
        this.productRepository = productRepository;
        this.orderRepository = orderRepository;
    }

    public void placeOrder(Order order) {
        try {
            transactionManager.executeInTransaction(connection -> {
                // 1. Validate stock levels
                for (OrderItem item : order.getItems()) {
                    Product product = productRepository.findById(connection, item.getProductId());
                    if (product.getStock() < item.getQuantity()) {
                        throw new IllegalArgumentException("Not enough stock for product ID " + item.getProductId());
                    }
                }

                // 2. Update stock levels
                for (OrderItem item : order.getItems()) {
                    productRepository.updateStock(connection, item.getProductId(), -item.getQuantity());
                }

                // 3. Create the order and order items
                orderRepository.createOrder(connection, order);

                return null; // No result needed
            });
        } catch (Exception e) {
            // Log the error for debugging or tracking
            System.err.println("Failed to place order: " + e.getMessage());
            e.printStackTrace();

            // Optionally rethrow as a runtime exception
            throw new RuntimeException("Failed to place order", e);
        }
    }
}
