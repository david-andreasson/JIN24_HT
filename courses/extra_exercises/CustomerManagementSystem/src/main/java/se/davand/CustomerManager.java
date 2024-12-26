package se.davand;

import java.util.ArrayList;

public class CustomerManager {

    private ArrayList<Customer> customers = new ArrayList<>();

    public void addCustomer(String name, String phoneNumber, String email) {
        Customer newCustomer = new Customer(name, phoneNumber, email);
        customers.add(newCustomer);
    }

    //Remove customer
    public void removeCustomer() {

    }

    //List all customers
    public void listCustomers() {

    }

    //Search for customer
    public void findCustomer() {


    }
}
