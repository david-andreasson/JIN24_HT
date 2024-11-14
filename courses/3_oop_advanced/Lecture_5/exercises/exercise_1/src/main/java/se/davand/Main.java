package se.davand;

import se.davand.database.ConnectionManager;
import se.davand.database.TransactionManager;
import se.davand.repository.ProductRepository;
import se.davand.model.Product;

import java.math.BigDecimal;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create instances of ProductRepository and TransactionManager
        ProductRepository productRepository = new ProductRepository(new ConnectionManager());
        TransactionManager transactionManager = new TransactionManager(ConnectionManager.getDataSource());

        // Test the findByPriceRange method
        System.out.println("Testing findByPriceRange...");
        BigDecimal minPrice = new BigDecimal("10.00");
        BigDecimal maxPrice = new BigDecimal("50.00");
        List<Product> productsInRange = productRepository.findByPriceRange(minPrice, maxPrice);
        for (Product product : productsInRange) {
            System.out.println(product);
        }

        // Test the findByNameLike method
        System.out.println("Testing findByNameLike...");
        String namePattern = "%example%";  // Using SQL wildcard pattern, % means "any characters"
        List<Product> productsByName = productRepository.findByNameLike(namePattern);
        for (Product product : productsByName) {
            System.out.println(product);
        }

        // Test the updateStock method using TransactionManager
        System.out.println("Testing updateStock...");
        Long productId = 1L;  // Assumes a product with ID 1 exists in the database
        int quantityChange = 20;

        try {
            boolean stockUpdated = transactionManager.executeInTransaction(connection -> {
                return productRepository.updateStock(connection, productId, quantityChange);
            });

            if (stockUpdated) {
                System.out.println("Stock successfully updated for product ID: " + productId);
            } else {
                System.out.println("Failed to update stock for product ID: " + productId);
            }
        } catch (Exception e) {
            System.out.println("Error during transaction: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
