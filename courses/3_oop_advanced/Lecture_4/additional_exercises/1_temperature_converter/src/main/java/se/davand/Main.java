package se.davand;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TemperatureInputHandler inputHandler = new TemperatureInputHandler();
        TemperatureConverter temperatureConverter = new TemperatureConverter();

        boolean continueConversion = true;
        while (continueConversion) {
            double temperature = inputHandler.getInputTemperature();
            String unit = inputHandler.getInputUnit();

            if (unit.equalsIgnoreCase("C")) {
                double fahrenheit = temperatureConverter.convertCelsiusToFahrenheit(temperature);
                System.out.println("The temperature in Fahrenheit is: " + fahrenheit);
            } else if (unit.equalsIgnoreCase("F")) {
                double celsius = temperatureConverter.convertFahrenheitToCelsius(temperature);
                System.out.println("The temperature in Celsius is: " + celsius);
            } else {
                System.out.println("Invalid unit. Please enter C or F.");
            }
            continueConversion = inputHandler.askIfContinue();
        }
                inputHandler.closeScanner();
                System.out.println("Goodbye!");
            }
        }
