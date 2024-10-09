package Exercise_4;

public class DVD extends MediaItem {
    private String director;
    private int duration;

    public DVD(String title, int publicationYear, String director, int duration) {
        super(title, publicationYear);
        this.director = director;
        this.duration = duration;
    }

    @Override
    public String getInfo() {
        return "DVD: " + title + " directed by " + director + ", " + publicationYear + ", " + duration + " minutes";
    }
}