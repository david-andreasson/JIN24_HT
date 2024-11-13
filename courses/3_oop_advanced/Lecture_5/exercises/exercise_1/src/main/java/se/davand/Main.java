package se.davand;

import se.davand.model.Customer;
import se.davand.repository.CustomerRepository;
import se.davand.database.ConnectionManager;

public class Main {
    public static void main(String[] args) {
        ConnectionManager connectionManager = new ConnectionManager();
        CustomerRepository customerRepository = new CustomerRepository(connectionManager);

        // Create and save a new customer
        Customer newCustomer = new Customer(null, "John Doe", "johndoe@example.com");
        boolean saved = customerRepository.save(newCustomer);
        System.out.println("Customer saved: " + saved + ", ID: " + newCustomer.getId());

        // Retrieve all customers
        customerRepository.findAll().forEach(System.out::println);

        // Retrieve a customer by ID
        customerRepository.findById(newCustomer.getId()).ifPresent(System.out::println);

        // Update the customer's name
        newCustomer.setName("John Updated");
        customerRepository.save(newCustomer);

        // Verify the update
        customerRepository.findById(newCustomer.getId()).ifPresent(System.out::println);

        // Delete the customer
        boolean deleted = customerRepository.delete(newCustomer.getId());
        System.out.println("Customer deleted: " + deleted);

        // Verify deletion by retrieving all customers
        customerRepository.findAll().forEach(System.out::println);
    }
}
