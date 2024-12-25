package se.davand;

import java.util.Scanner;

public class Menu {

    void showMenu() {
        System.out.println("1. Add reservation");
        System.out.println("2. Remove reservation");
        System.out.println("3. List all reservations");
        System.out.println("4. Find reservation by name");
        System.out.println("0. Exit program");

        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();

        do {
            switch (userChoice) {
                case 1:
                    //add reservation
                    break;
                case 2:
                    //remove reservation
                    break;
                case 3:
                    //list all reservations
                    break;
                case 4:
                    //find reservation by name
                    break;
                case 0:
                    //Quit the program
                    break;
            }

        }
        while (userChoice != 0);
    }
}