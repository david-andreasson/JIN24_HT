package se.davand;

import java.util.ArrayList;


public class Library {
    ArrayList<Book> books = new ArrayList<>();

    public void addBook(String title, String author, String isbn) {
        Book newBook = new Book(title, author, isbn);
        books.add(newBook);
    }

    public void listAllBooks() {
        for (Book book : books) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }
    }

    public void findBookByTitle(String title) {
        boolean foundBook = false;
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Found: " + book.getTitle() + " by " + book.getAuthor());
                foundBook = true;
                break;
            }
        }
        if (!foundBook) {
            System.out.println("Could not find book in library");
        }

    }
}
