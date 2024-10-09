package se.dsve.factories;

import se.dsve.models.CarImpl;

public class CarFactory {
    // Method to create a new CarImpl object with specified properties
    public CarImpl createCar(String brand, String model, int year, double mileage, int doors) {

        // Print warnings for negative mileage, negative number of doors, invalid year and set a default value
         if (mileage < 0) {
            System.out.println("Invalid mileage. Mileage can not be a negative number. Setting mileage to default value of 0.");
            mileage = 0;
        }
        if (year <= 1885) {
            System.out.println("Invalid year. Setting year to default value 1990.");
            year = 1990;
        }
        if (doors <= 0) {
            System.out.println("Invalid number of doors. Setting to default 4 doors.");
            doors = 4;
        }
        CarImpl car = new CarImpl(brand, model, year, mileage, doors); // Create a new CarImpl object (a car)

        // Set properties of the car using the provided parameters
        car.setBrand(brand);         // Set the car's brand (e.g., Toyota)
        car.setModel(model);         // Set the car's model (e.g., Corolla)
        car.setYear(year);           // Set the car's manufacturing year
        car.setMileage(mileage);     // Set the car's mileage (distance traveled)
        car.setDoors(doors);         // Set the number of doors the car has

        return car;                  // Return the newly created car object
    }
}
