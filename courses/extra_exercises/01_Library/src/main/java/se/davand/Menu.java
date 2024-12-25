package se.davand;

import java.util.Scanner;

public class Menu {

    public void showMenu() {
        System.out.println("Library menu:");
        System.out.println("1. Add book");
        System.out.println("2. Remove book");
        System.out.println("3. List all books");
        System.out.println("4. Search for a book");
        System.out.println("0. Exit program");
        System.out.println("");
        System.out.print("Enter your choice:");
    }


    public void inputHandler() {

        Scanner scanner = new Scanner(System.in);
        Library library = new Library();


        int usersChoice;
        do {
            usersChoice = scanner.nextInt();
            scanner.nextLine();

            switch (usersChoice) {
                case 1:
                    //method to gets users input to put into addBook
                    addBookByUserInput(scanner, library);
                    break;
                case 2:
                    //method to get users input to put into removeBook
                    break;
                case 3:
                    library.listAllBooks();
                    break;
                case 4:
                    //method to get users input to put into findBookByTitle
                    userSearchBook(scanner, library);
                    break;
                case 0:

                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (usersChoice != 0);

    }

    private static void userSearchBook(Scanner scanner, Library library) {
        System.out.println("Enter the title of the book you are searching for:");
        String bookTitleToSearchFor = scanner.nextLine();
        library.findBookByTitle(bookTitleToSearchFor);
    }

    private static void addBookByUserInput(Scanner scanner, Library library) {
        System.out.println("Type title of book you wish to add:");
        String usersBookTitle = scanner.nextLine();
        System.out.println("What is the name of the author:");
        String usersAuthorName = scanner.nextLine();
        System.out.println("Enter the books isbn:");
        String usersIsbn = scanner.nextLine();
    }
}
