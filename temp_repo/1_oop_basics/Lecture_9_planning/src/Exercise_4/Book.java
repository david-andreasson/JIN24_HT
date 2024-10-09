package Exercise_4;

public class Book extends MediaItem {
    private String author;
    private int numberOfPages;

    public Book(String title, int publicationYear, String author, int numberOfPages) {
        super(title, publicationYear);
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String getInfo() {
        return "Book: " + title + " by " + author + ", " + publicationYear + ", " + numberOfPages + " pages";
    }
}