package se.dsve.models;

import se.dsve.interfaces.Car;

public class CarImpl implements Car {
    // Fields for storing car attributes
    private int doors; // Number of doors the car has
    private String brand; // Brand of the car (e.g., Toyota)
    private String model; // Model of the car (e.g., Corolla)
    private int year; // Year the car was manufactured
    private double mileage; // Total mileage (distance traveled) by the car
    private boolean engineOn; // Engine status: true if the engine is on, false otherwise

    public CarImpl(String brand, String model, int year, double mileage, int doors) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.doors = doors;
        this.engineOn = false; // Initialize the engine to be off
    }

    @Override
    public int getDoors() {
        // Returns the number of doors the car currently has
        return doors;
    }

    @Override
    public void setDoors(int doors) {
        // Sets the number of doors for the car
        this.doors = doors;
    }

    @Override
    public String drive() {
        // Simulates the car driving if the engine is on, otherwise prompts to start the engine
        if (engineOn) {
            return "The car is driving."; // Car can drive when the engine is on
        } else {
            return "Start the engine first!"; // Cannot drive unless the engine is running
        }
    }

    @Override
    public String getBrand() {
        // Returns the brand of the car
        return brand;
    }

    @Override
    public void setBrand(String brand) {
        // Sets the brand of the car
        this.brand = brand;
    }

    @Override
    public String getModel() {
        // Returns the model of the car
        return model;
    }

    @Override
    public void setModel(String model) {
        // Sets the model of the car
        this.model = model;
    }

    @Override
    public int getYear() {
        // Returns the year the car was manufactured
        return year;
    }

    @Override
    public void setYear(int year) {
        // Sets the year of manufacture for the car
        this.year = year;
    }

    @Override
    public double getMileage() {
        // Returns the current mileage of the car
        return mileage;
    }

    @Override
    public void setMileage(double mileage) {
        // Sets the total mileage for the car
        this.mileage = mileage;
    }

    @Override
    public boolean isEngineOn() {
        // Returns true if the car's engine is on, false if it's off
        return engineOn;
    }

    @Override
    public void startEngine() {
        // Turns the car's engine on
        engineOn = true;
    }

    @Override
    public void stopEngine() {
        // Turns the car's engine off
        engineOn = false;
    }

    @Override
    public String toString() {
        // Returns a formatted string with details about the car (brand, model, year, etc.)
        return "Car: " + brand + " " + model + " (" + year + "), Doors: " + doors + ", Mileage: " + mileage;
    }
}
