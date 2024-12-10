package se.davand.exercises_02;

import java.util.Scanner;

public class exercise_1 {

    public void isNumberNegativeOrPositive() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int input = scanner.nextInt();
        if (input <0) {                                     // +1
            System.out.println("Your number is negative");
        } else if (input >0) {                              // +1
            System.out.println("Your number is positive");
        } else {                                            // +1
            System.out.println("Your number is zero");
        }
    }                                                   //3+1=4
}
