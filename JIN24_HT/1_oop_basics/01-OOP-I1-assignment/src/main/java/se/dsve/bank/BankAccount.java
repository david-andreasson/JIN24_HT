package se.dsve.bank;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private Customer accountHolder;

    // Constructor to set the account number and owner
    public BankAccount(int accountNumber, Customer accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0; // Initial balance is set to zero
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        this.balance += amount;
    }

    // Method to withdraw money from account
    public void withdraw(double amount) {
        // Check if the amount is negative
        if (amount <= 0) {
            System.out.println("Invalid amount. Amount must be greater than zero.");
        }
        // Check if there are enough money in account
        else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            this.balance -= amount;
        }
    }

    // Display the account details
    public void showAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public Customer getAccountHolder() {
        return accountHolder;
    }
}
