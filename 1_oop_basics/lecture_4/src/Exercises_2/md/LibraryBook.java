package Exercises_2.md;

public class LibraryBook {
    private String title;
    private String author;
    private int yearPublished;

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getYearPublished() {
        return yearPublished;
    }
    protected void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }
}

