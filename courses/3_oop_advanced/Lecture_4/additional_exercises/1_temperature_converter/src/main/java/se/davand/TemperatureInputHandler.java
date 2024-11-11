package se.davand;

import java.util.Scanner;

public class TemperatureInputHandler {
    private Scanner scanner = new Scanner(System.in);

    public double getInputTemperature() {
        System.out.println("Enter a temperature: ");
        return scanner.nextDouble();
    }
    public String getInputUnit() {
        System.out.println("Enter the unit of the temperature (C/F): ");
        return scanner.next();
    }
    public boolean askIfContinue() {
        System.out.println("Do you want to convert another temperature? (Y/N): ");
        return scanner.next().equalsIgnoreCase("Y");
    }
    public void closeScanner() {
        scanner.close();
    }
}
