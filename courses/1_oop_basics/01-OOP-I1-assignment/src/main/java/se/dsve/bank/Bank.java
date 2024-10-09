package se.dsve.bank;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    ArrayList<BankAccount> accounts; // List to store all accounts

    // Constructor initializes the accounts list
    public Bank() {
        accounts = new ArrayList<>();
    }

    // Add a new account to the list
    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public ArrayList<BankAccount> getAccounts() {
        return accounts;
    }

    // Search for an account by customer name or social security number
    public BankAccount searchAccount(String identifier) {
        for (BankAccount account : accounts) {
            // Get the Customer object
            Customer customer = account.getAccountHolder();

            // Check if the customers name or SSN matches the identifier
            if (customer.getName().equals(identifier) || customer.getSocialSecurityNumber().equals(identifier)) {

                System.out.println("Match found!");
                System.out.println("Account Number: " + account.getAccountNumber());
                System.out.println("Customer Name: " + customer.getName());
                return account; // Return the matched account
            }
        }
        //Return if no match found
        System.out.println("Match not found!");
        return null;
    }

    // Show information of all accounts
    public void showAllAccounts() {
        for (BankAccount account : accounts) {
            System.out.println("Account number: " + account.getAccountNumber());
            System.out.println("Balance: " + account.getBalance());
            System.out.println("Customer name: " + account.getAccountHolder().getName());
        }
    }

    // Sort the accounts by balance (high to low) using Bubble Sort
    public ArrayList<BankAccount> sortAccountsByBalance() {
        // Create a copy of the original accounts list to avoid modifying the original list
        ArrayList<BankAccount> sortedAccounts = new ArrayList<>(accounts);

        // use Bubble Sort to sort the list
        for (int i = 0; i < sortedAccounts.size() - 1; i++) {
            for (int j = 0; j < sortedAccounts.size() - 1 - i; j++) {

                // If an account has a higher balance than the next account, swap position
                if (sortedAccounts.get(j).getBalance() < sortedAccounts.get(j + 1).getBalance()) {
                    BankAccount temp = sortedAccounts.get(j);
                    sortedAccounts.set(j, sortedAccounts.get(j + 1));
                    sortedAccounts.set(j + 1, temp);
                }
            }
        }
        return sortedAccounts;
    }
}