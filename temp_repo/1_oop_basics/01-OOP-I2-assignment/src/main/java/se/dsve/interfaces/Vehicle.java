package se.dsve.interfaces;

public interface Vehicle {
    // Getters och setters för att hantera attribut
    String getBrand();

    void setBrand(String brand);

    String getModel();

    void setModel(String model);

    int getYear();

    void setYear(int year);

    double getMileage();

    void setMileage(double mileage);

    // Metoder för att hantera motorstatus
    boolean isEngineOn();  // Kollar om motorn är igång

    void startEngine();    // Startar motorn

    void stopEngine();     // Stänger av motorn
}

