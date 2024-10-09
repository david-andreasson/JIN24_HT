package se.dsve.interfaces;

public interface VehicleFactory {
    Vehicle createVehicle(String model, int year, double mileage);
}

