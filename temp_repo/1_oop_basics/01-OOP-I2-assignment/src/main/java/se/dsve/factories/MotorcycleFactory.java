package se.dsve.factories;

import se.dsve.interfaces.Motorcycle;
import se.dsve.models.MotorcycleImpl;

public class MotorcycleFactory {
    // Method to create a new MotorcycleImpl object with specified properties
    public MotorcycleImpl createMotorcycle(String brand, String model, int year, double mileage, String engine) {

        // Print warnings for negative mileage or invalid year and set a default value
        if (mileage < 0) {
            System.out.println("Invalid mileage. Mileage can not be a negative number. Setting mileage to default value of 0.");
            mileage = 0;
        }
        if (year <= 1885) {
            System.out.println("Invalid year. Setting year to default value 1990.");
            year = 1990;
        }

        // Create a new MotorcycleImpl object
        MotorcycleImpl motorcycle = new MotorcycleImpl(brand, model, year, mileage, engine);

        // Set the properties of the motorcycle using the provided parameters
        motorcycle.setBrand(brand);          // Set the motorcycle's brand (e.g., Harley Davidson)
        motorcycle.setModel(model);          // Set the motorcycle's model (e.g., Sportster)
        motorcycle.setYear(year);            // Set the manufacturing year of the motorcycle
        motorcycle.setMileage(mileage);      // Set the motorcycle's mileage (distance traveled)
        motorcycle.setEngineType(engine);    // Set the type of engine (e.g., V-Twin)

        // Return the newly created motorcycle object
        return motorcycle;
    }
}
