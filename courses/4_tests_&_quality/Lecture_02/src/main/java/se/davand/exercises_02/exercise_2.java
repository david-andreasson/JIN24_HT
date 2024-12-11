package se.davand.exercises_02;


import java.util.Scanner;

public class exercise_2 {

    public static void main(String[] args) {

        String member = "member";
        double discount = 0;
        System.out.println("Enter price: ");
        Scanner scanner = new Scanner(System.in);
        double price = scanner.nextDouble();
        System.out.println("Enter customer type: ");
        String customerType = scanner.next();
        System.out.println("Is there currently a sale going on?");
        boolean sale = scanner.nextBoolean();

        if (price >= 1000){
            discount += 0.1;
        }
        if (customerType.equals(member)){
            discount += 0.05;
        }
        if (sale){
            discount += 0.2;
        }
        if (discount >= 0.25){
            discount = 0.25;
        }
        System.out.println("The discounted price is: " + (price - (price * discount)));
    }
}
