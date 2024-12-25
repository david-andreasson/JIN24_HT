package se.davand;

import java.util.Scanner;

public class Menu {

    private Library library;
    public Menu(Library library){
        this.library = library;
    }

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

        int usersChoice;
        do {
            usersChoice = scanner.nextInt();
            scanner.nextLine();

            switch (usersChoice) {
                case 1:
                    addBookByUserInput(scanner, library);
                    break;
                case 2:
                    removeBookByUserInput(scanner);
                    break;
                case 3:
                    library.listAllBooks();
                    break;
                case 4:
                    userSearchBook(scanner, library);
                    break;
                case 0:

                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            if (usersChoice !=0){
                showMenu();
            }

        } while (usersChoice != 0);

    }

    private void removeBookByUserInput(Scanner scanner) {
        System.out.println("Title of the book you want to remove: ");
        String bookToDelete = scanner.nextLine();
        library.removeBookByTitle(bookToDelete);
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
        library.addBook(usersBookTitle, usersAuthorName, usersIsbn);
    }
}
