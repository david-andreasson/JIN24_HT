package se.davand;

import java.util.Scanner;

public class Menu {
    private CustomerManager customerManager;
    public Menu(CustomerManager customerManager){
        this.customerManager = customerManager;
    }

    public void showMenu() {
        System.out.println("Customer management menu:");
        System.out.println("1. Add customer");
        System.out.println("2. Remove customer");
        System.out.println("3. List all customers");
        System.out.println("4. Search for a customer");
        System.out.println("0. Exit program");
        System.out.println("");
        System.out.print("Enter your choice: ");
    }


    public void inputHandler() {

        Scanner scanner = new Scanner(System.in);

        int usersChoice;
        do {
            showMenu();
            usersChoice = scanner.nextInt();
            scanner.nextLine();

            switch (usersChoice) {
                case 1:
                    System.out.println("Enter the name of the customer: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter the phone number of the customer: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.println("Enter the email of the customer: ");
                    String email = scanner.nextLine();
                    customerManager.addCustomer(name, phoneNumber, email);
                    break;
                case 2:
                    System.out.println("Enter the name of the customer you want to delete: ");
                    String customerToDelete = scanner.nextLine();
                    customerManager.removeCustomer(customerToDelete);
                    break;
                case 3:
                    customerManager.listCustomers();
                    break;
                case 4:
                    System.out.println("Enter the name of the customer you want to search for: ");
                    String customerToFind = scanner.nextLine();
                    customerManager.findCustomer(customerToFind);
                    break;
                case 0:
                    System.out.println("Exiting program.... Good bye!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (usersChoice != 0);
    }
}
