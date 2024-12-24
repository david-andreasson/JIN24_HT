package se.davand;

import java.util.ArrayList;


public class Library {
    ArrayList<Book> books = new ArrayList<>();

    public void addBook(String title, String author, String isbn) {
        Book newBook = new Book(title, author, isbn);
        books.add(newBook);
    }

    public void listAllBooks() {

    }

    public void findBookByTitle() {

    }
}
