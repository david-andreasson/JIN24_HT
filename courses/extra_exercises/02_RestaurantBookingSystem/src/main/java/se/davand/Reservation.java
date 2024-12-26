package se.davand;

public class Reservation {

    private String name;
    private int numberOfPeople;
    private String date;

    public Reservation(String name, int numberOfPeople, String date) {
        this.name = name;
        this.numberOfPeople = numberOfPeople;
        this.date = date;
    }

    public Reservation() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "Name: " + name + ", Guests: " + numberOfPeople + ", Date: " + date;
    }
}
