package se.davand;

import java.util.ArrayList;

public class CustomerManager {

    private ArrayList<Customer> customers = new ArrayList<>();

    public void addCustomer(String name, String phoneNumber, String email) {
        Customer newCustomer = new Customer(name, phoneNumber, email);
        customers.add(newCustomer);
    }

    //Remove customer
    public void removeCustomer(String customerToDelete) {
        boolean foundCustomer = false;
        for (Customer customer : customers) {
            if (customer.getName().equalsIgnoreCase(customerToDelete)) {
                System.out.println("Removing " + customer.getName());
                customers.remove(customer);
                foundCustomer = true;
            }
        }
        if (!foundCustomer) {
            System.out.println("Can not find customer: " + customerToDelete + "in customer list.");
        }
    }

    //List all customers
    public void listCustomers() {

    }

    //Search for customer
    public void findCustomer() {


    }
}
