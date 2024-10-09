package se.dsve.bank;

public class Customer {
    private String name;
    private String socialSecurityNumber;

    // Constructor to set the customer's name and social security number
    public Customer(String name, String socialSecurityNumber) {
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    // Returns the customer's name
    public String getName() {
        return name;
    }

    // Returns the customer's social security number
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
}



