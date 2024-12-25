package se.davand;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello, World!");

        Reservation reservation = new Reservation();
        Menu menu = new Menu(reservation);

        menu.showMenu();
    }
}