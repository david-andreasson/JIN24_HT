package se.davand;

import java.util.ArrayList;
import java.util.Iterator;

public class CustomerManager {

    private ArrayList<Customer> customers = new ArrayList<>();

    public void addCustomer(String name, String phoneNumber, String email) {
        Customer newCustomer = new Customer(name, phoneNumber, email);
        customers.add(newCustomer);
        System.out.println("Successfully added: " + newCustomer);
    }

    public void removeCustomer(String customerToDelete) {
        boolean foundCustomer = false;
        Iterator<Customer> iterator = customers.iterator();
        while (iterator.hasNext()) {
            Customer customer = iterator.next();
            if (customer.getName().equalsIgnoreCase(customerToDelete)) {
                System.out.println("Removing " + customer.getName());
                iterator.remove();
                foundCustomer = true;
            }
            if (!foundCustomer){
                System.out.println("Customer " + customerToDelete + " was not found in customerlist");
            }
        }
    }

    public void listCustomers() {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

    public void findCustomer(String customerToFind) {
        boolean foundCustomer = false;
        for (Customer customer : customers) {
            if (customer.getName().equalsIgnoreCase(customerToFind)) {
                System.out.println("Found " + customer);
                foundCustomer = true;
            }
        }
        if (!foundCustomer) {
            System.out.println("Can not find customer: " + customerToFind + " in customer list.");
        }
    }
}
