package se.dsve;

import se.dsve.bank.Bank;
import se.dsve.bank.BankAccount;
import se.dsve.bank.Customer;

import java.util.ArrayList;

public class Main {
    // This code is for demonstration purposes and expects the Bank, BankAccount, and Customer classes to be implemented correctly.
    public static void main(String[] args) {
        Bank bank = new Bank();

        // Create some customers
        Customer customer1 = new Customer("John Doe", "123456-7890");
        Customer customer2 = new Customer("Jane Smith", "987654-3210");

        // Create bank accounts for these customers
        BankAccount account1 = new BankAccount(1, customer1);
        BankAccount account2 = new BankAccount(2, customer2);

        // Add accounts to the bank
        bank.addAccount(account1);
        bank.addAccount(account2);

        // Demonstration
        account1.deposit(1000);
        account1.withdraw(500);

        account2.deposit(2000);

        // Show all accounts
        System.out.println("All accounts:");
        bank.showAllAccounts();

        // Search for an account by name
        System.out.println("\nSearching for account by name:");
        BankAccount foundAccount = bank.searchAccount("John Doe");
        if (foundAccount != null) {
            foundAccount.showAccountDetails();
        }

        // Sort accounts by balance
        System.out.println("\nSorting accounts by balance:");
        ArrayList<BankAccount> sortedAccounts = bank.sortAccountsByBalance();
        for (BankAccount account : sortedAccounts) {
            account.showAccountDetails();
            System.out.println("---------------");
        }
    }
}
