package se.davand;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello, World!");

        Library library = new Library();
        Menu menu = new Menu(library);

        library.addBook("The Code Breaker", "Walter J. Robbins", "1234567890");
        library.addBook("Shadow of the Compiler", "Elena Bright", "0987654321");
        library.addBook("Algorithmic Dreams", "Maxine Hopper", "1122334455");
        library.addBook("Debugging the Mind", "Sophia Lane", "2233445566");
        library.addBook("Refactor Reality", "Jack Syntax", "3344556677");
        library.addBook("Loops and Legends", "Alice Recursive", "4455667788");
        library.addBook("Variables of Fate", "Daniel Constant", "5566778899");
        library.addBook("Exception Alley", "Grace Catcher", "6677889900");
        library.addBook("Threads of Time", "Liam Parallel", "7788990011");
        library.addBook("Inheritance Game", "Eva Override", "8899001122");


        //library.listAllBooks();
        //library.findBookByTitle("loops and legends");
        //library.findBookByTitle("Jaws 2");

        menu.showMenu();;
        menu.inputHandler();
    }
}