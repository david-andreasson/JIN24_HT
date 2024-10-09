package Exercises_3.md;

public class Product {

    String id;
    String name;
    double price;
    int quantity;

    public Product(String id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public Product(String id, String name){
        this.id = id;
        this.name = name;
        this.price = 0;
        this.quantity = 0;
    }

}
