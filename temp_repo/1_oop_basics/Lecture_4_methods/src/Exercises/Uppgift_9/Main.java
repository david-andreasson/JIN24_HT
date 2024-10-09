package Exercises.Uppgift_9;

public class Main {
    public static void main(String[] args) {


        Invoice invoice1 = new Invoice(33449, "Arla Foods", 112300.00);
        Invoice invoice2 = new Invoice(33450, "Sibylla", 600000.00);
        Invoice invoice3 = new Invoice(33451, "Kebab House", 9900.00);

        invoice1.showInvoiceDetails();
        invoice2.showInvoiceDetails();
        invoice3.showInvoiceDetails();

        invoice1.applyDiscount(5000.00);
        invoice2.applyDiscount(50000.00);
        invoice3.applyDiscount(500.00);

        invoice1.showInvoiceDetails();
        invoice2.showInvoiceDetails();
        invoice3.showInvoiceDetails();
    }
}
