package se.davand;

public class Task {

    private static int idCounter = 1;

    private int id;
    private String title;
    private String description;
    private String status;
    private String date;

    public Task(String title, String description, String status, String date) {
        this.id = idCounter++;
        this.title = title;
        this.description = description;
        this.status = status;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return " ID: " + id + ", Title: " + title + ", Description: " + description + ", Status: " + status + ", Date: " + date;
    }
}
