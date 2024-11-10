package se.davand;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TemperatureConverter temperatureConverter = new TemperatureConverter();

        boolean continueConversion = true;

        while (continueConversion) {
            try {
                System.out.println("What temperature do you want to convert?");
                System.out.print("Enter a number: ");
                double temperature = scanner.nextDouble();

                System.out.print("Enter the unit of the temperature (C/F): ");
                String unit = scanner.next();

                if (unit.equalsIgnoreCase("C")) {
                    System.out.println("The temperature in Fahrenheit is: " + temperatureConverter.convertCelsiusToFahrenheit(temperature));
                } else if (unit.equalsIgnoreCase("F")) {
                    System.out.println("The temperature in Celsius is: " + temperatureConverter.convertFahrenheitToCelsius(temperature));
                } else {
                    System.out.println("Invalid unit. Please enter C for Celsius or F for Fahrenheit.");
                }

                // Ask if the user wants to continue
                System.out.print("Do you want to convert another temperature? (Y/N): ");
                String userChoice = scanner.next();
                if (userChoice.equalsIgnoreCase("N")) {
                    continueConversion = false;
                    System.out.println("Thank you for using the temperature converter!");
                }

            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine(); // Clear the buffer
            }
        }

        scanner.close(); // Close the scanner when done
    }
}
