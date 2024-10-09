package Exercises.Uppgift_3;

public class Car {
    private String make;
    private String model;
    private int year;
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
        this.year = 0;
    }
    public Car(){
        this.make = "";
        this.model = "";
        this.year = 0;
    }
    void displayCarInfo() {
        System.out.println("Make : " + make);
        System.out.println("Model : " + model);
        System.out.println("Year : " + year);
    }
}
