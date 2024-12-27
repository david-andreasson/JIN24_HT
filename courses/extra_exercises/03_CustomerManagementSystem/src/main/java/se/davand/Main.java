package se.davand;

public class Main {
    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager();
        Menu menu = new Menu(customerManager);

        menu.inputHandler();
    }
}