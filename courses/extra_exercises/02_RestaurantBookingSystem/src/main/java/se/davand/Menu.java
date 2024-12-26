package se.davand;

import java.util.Scanner;

public class Menu {

    private Restaurant restaurant;

    public Menu(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public void showMenu() {
        System.out.println("");
        System.out.println("----------------------------");
        System.out.println("1. Add reservation");
        System.out.println("2. Remove reservation");
        System.out.println("3. List all reservations");
        System.out.println("4. Find reservation by name");
        System.out.println("0. Exit program");
        System.out.println("----------------------------");
    }

    public void inputHandler() {

        Scanner scanner = new Scanner(System.in);
        int userChoice;
        do {
            showMenu();
            System.out.println("Enter your choice: ");
            userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1:
                    //add reservation
                    System.out.println("Enter the name of reservation: ");
                    String name = scanner.next();
                    System.out.println("Enter the number of people: ");
                    int numberOfPeople = scanner.nextInt();
                    System.out.println("Enter the date :");
                    String date = scanner.next();
                    restaurant.addReservation(name, numberOfPeople, date);
                    break;
                case 2:
                    //remove reservation
                    System.out.println("Enter the name of reservation: ");
                    String reservationToDelete = scanner.next();
                    restaurant.removeReservation(reservationToDelete);
                    break;
                case 3:
                    //list all reservations
                    restaurant.listAllReservations();
                    break;
                case 4:
                    //find reservation by name
                    System.out.println("Enter the name of reservation: ");
                    String nameToSearchFor = scanner.next();
                    restaurant.searchForReservation(nameToSearchFor);
                    break;
                case 0:
                    //Quit the program
                    System.out.println("Exiting program.... Good bye!");
                    scanner.close();
                    System.exit(0);
                    break;
            }
        }
        while (userChoice != 0);
    }
}