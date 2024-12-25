package se.davand;

public class Reservation {

    private String Name;
    private int numberOfPeople;
    private String date;

    public Reservation(String name, int numberOfPeople, String date) {
        Name = name;
        this.numberOfPeople = numberOfPeople;
        this.date = date;
    }

    public Reservation() {

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
