package Exercises_2.md;

public class Book {
    private String title;
    private String author;
    private int pages;
    private String genre;

    public Book(String title, String author, int pages, String genre) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.genre = genre;
    }

    public void info() {
        System.out.println(title + " " + author);
    }

    public void readtime() {
        System.out.println("Reading time :" + pages / 50);
    }

    public boolean isInGenre(String genreToCheck) {
        return genre.equalsIgnoreCase(genreToCheck);
    }

    public void morePages(Book otherBook) {
        if (this.pages > otherBook.pages) {
            System.out.println(this.title + " har fler sidor.");
        } else if (this.pages < otherBook.pages) {
            System.out.println(otherBook.title + " har fler sidor.");
        } else System.out.println("Båda böckerna har lika många sidor.");

    }
}


