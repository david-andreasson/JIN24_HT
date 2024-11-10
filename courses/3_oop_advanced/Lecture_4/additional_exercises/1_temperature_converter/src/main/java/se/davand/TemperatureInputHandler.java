package se.davand;

public class TemperatureInputHandler {
    private double temperature;
    private String unit;

    public TemperatureInputHandler(double temperature, String unit) {
        this.temperature = temperature;
        this.unit = unit;
    }

    public double getTemperature() {
        return temperature;
    }

    public String getUnit() {
        return unit;
    }
}
