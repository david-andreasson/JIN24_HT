package Exercises.Uppgift_5;

public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String displayBookInfo() {
        return "Title: " + this.title + "\nAuthor: " + this.author + "\nPrice: " + this.price;
    }
    public String displayBookInfoWithDiscount(double discount) {
        return "Title: " + this.title + "\nAuthor: " + this.author + "\nPrice with discount: " + (price - discount);

    }
}
