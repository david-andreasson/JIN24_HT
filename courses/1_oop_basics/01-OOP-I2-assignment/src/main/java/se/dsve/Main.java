package se.dsve;

import se.dsve.factories.CarFactory;
import se.dsve.factories.MotorcycleFactory;
import se.dsve.models.CarImpl;
import se.dsve.models.MotorcycleImpl;

public class Main {

    public static void main(String[] args) {
        // Instantiate the specific factories
        CarFactory carFactory = new CarFactory();
        MotorcycleFactory motorcycleFactory = new MotorcycleFactory();

        // Create a car using the CarFactory
        CarImpl car = carFactory.createCar("Toyota", "Corolla", -2020, -15000, -4);

        System.out.println(car);
        car.startEngine();
        System.out.println("Car engine status: " + (car.isEngineOn() ? "On" : "Off"));
        car.stopEngine();
        System.out.println("Car engine status: " + (car.isEngineOn() ? "On" : "Off"));
        System.out.println("Car doors: " + car.getDoors());
        car.setDoors(5);
        System.out.println("Car doors: " + car.getDoors());

        // Create a motorcycle using the MotorcycleFactory
        MotorcycleImpl motorcycle = motorcycleFactory.createMotorcycle("Harley Davidson", "Sportster", -2019, -5000, "V-Twin");
        System.out.println(motorcycle);
        motorcycle.startEngine();
        System.out.println("Motorcycle engine status: " + (motorcycle.isEngineOn() ? "On" : "Off"));
        motorcycle.stopEngine();
        System.out.println("Motorcycle engine status: " + (motorcycle.isEngineOn() ? "On" : "Off"));
        System.out.println("Motorcycle engine type: " + motorcycle.getEngineType());
        motorcycle.setEngineType("Inline-4");
        System.out.println("Motorcycle engine type: " + motorcycle.getEngineType());
    }
}
