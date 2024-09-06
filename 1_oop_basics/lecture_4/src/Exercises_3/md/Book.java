package Exercises_3.md;

public class Book {
    private String title;
    private String author;
    private int price;
    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    void displayInfo(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}
