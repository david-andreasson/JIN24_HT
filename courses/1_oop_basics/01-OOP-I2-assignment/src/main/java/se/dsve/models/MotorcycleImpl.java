package se.dsve.models;

import se.dsve.interfaces.Motorcycle;

public class MotorcycleImpl implements Motorcycle {
    // Fields for storing motorcycle attributes
    private String engineType; // Type of engine (e.g., V-twin, Inline-4)
    private String brand; // Brand of the motorcycle (e.g., Harley Davidson)
    private String model; // Model of the motorcycle (e.g., Sportster)
    private int year; // Year the motorcycle was manufactured
    private double mileage; // Total mileage (distance traveled) by the motorcycle
    private boolean engineOn; // Engine status: true if the engine is on, false otherwise

    public MotorcycleImpl(String brand, String model, int year, double mileage, String engineType) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.engineType = engineType;
        this.engineOn = false; // Initialize the engine to be off
    }

    @Override
    public String getEngineType() {
        // Returns the type of engine in the motorcycle
        return engineType;
    }

    @Override
    public void setEngineType(String engineType) {
        // Sets the engine type of the motorcycle
        this.engineType = engineType;
    }

    @Override
    public String getBrand() {
        // Returns the brand of the motorcycle
        return brand;
    }

    @Override
    public void setBrand(String brand) {
        // Sets the brand of the motorcycle
        this.brand = brand;
    }

    @Override
    public String getModel() {
        // Returns the model of the motorcycle
        return model;
    }

    @Override
    public void setModel(String model) {
        // Sets the model of the motorcycle
        this.model = model;
    }

    @Override
    public int getYear() {
        // Returns the year the motorcycle was manufactured
        return year;
    }

    @Override
    public void setYear(int year) {
        // Sets the year of manufacture for the motorcycle
        this.year = year;
    }

    @Override
    public double getMileage() {
        // Returns the current mileage of the motorcycle
        return mileage;
    }

    @Override
    public void setMileage(double mileage) {
        // Sets the total mileage for the motorcycle
        this.mileage = mileage;
    }

    @Override
    public boolean isEngineOn() {
        // Returns true if the motorcycle's engine is on, false if it's off
        return engineOn;
    }

    @Override
    public void startEngine() {
        // Turns the motorcycle's engine on
        engineOn = true;
    }

    @Override
    public void stopEngine() {
        // Turns the motorcycle's engine off
        engineOn = false;
    }

    @Override
    public String toString() {
        // Returns a formatted string with details about the motorcycle (brand, model, year, etc.)
        return "Motorcycle: " + brand + " " + model + " (" + year + "), Engine: " + engineType + ", Mileage: " + mileage;
    }
}
