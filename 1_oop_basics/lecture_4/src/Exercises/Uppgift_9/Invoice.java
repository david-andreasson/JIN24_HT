package Exercises.Uppgift_9;

public class Invoice {
    private int invoiceNumber;
    private String customerName;
    private double totalInvoiceAmount;
    public Invoice(int invoiceNumber, String customerName, double totalInvoiceAmount) {
        this.invoiceNumber = invoiceNumber;
        this.customerName = customerName;
        this.totalInvoiceAmount = totalInvoiceAmount;
    }
    public void applyDiscount(double discount) {
        totalInvoiceAmount -= discount;
    }
    public void showInvoiceDetails() {
        System.out.println("Invoice Number: " + invoiceNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Total Invoice Amount: " + totalInvoiceAmount);
    }
}
