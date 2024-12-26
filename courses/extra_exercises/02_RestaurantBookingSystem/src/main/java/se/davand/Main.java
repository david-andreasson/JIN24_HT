package se.davand;

public class Main {
    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant();
        Menu menu = new Menu(restaurant);

        menu.inputHandler();
    }
}