package se.davand;

public class DiscountCalculator {

    //Customertype VIP = 20% discount
    //Customertype Regular = 10% discount
    //Customertype Guest = no discount

    public static double calculateDiscount(double price, String customerType) {
        double discount = 0;
        if (customerType.equals("VIP")) {
            discount = 0.2;
        } else if (customerType.equals("Regular")) {
            discount = 0.1;
        } else if (customerType.equals("Guest")) {
            discount = 0;
        }
        return price * (1 - discount);
    }
}
