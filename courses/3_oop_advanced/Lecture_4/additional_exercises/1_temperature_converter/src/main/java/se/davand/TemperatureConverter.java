package se.davand;

public class TemperatureConverter {
    public double convertCelsiusToFahrenheit(double celsius){
        return (celsius * 9.0 / 5.0) + 32.0;
    }

    public double convertFahrenheitToCelsius(double fahrenheit){
        return (fahrenheit - 32.0) * 5.0 / 9.0;
    }
}
