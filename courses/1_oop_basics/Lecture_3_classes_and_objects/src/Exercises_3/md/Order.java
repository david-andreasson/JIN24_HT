package Exercises_3.md;

public class Order {
    int orderID;
    Product product;
    int quantity;
    double totalPrice;

    public Order(int orderID, Product product, int quantity) {

        if (quantity < 1){
            throw new IllegalArgumentException("Quantity must be greater than 0");
        }
        this.orderID = orderID;
        this.product = product;
        this.quantity = quantity;
        this.totalPrice = product.price * quantity;

    }
}
