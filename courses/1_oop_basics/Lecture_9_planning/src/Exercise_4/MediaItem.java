package Exercise_4;

public abstract class MediaItem {
    protected String title;
    protected int publicationYear;

    public MediaItem(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public abstract String getInfo();

    public String getTitle() {
        return title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
}