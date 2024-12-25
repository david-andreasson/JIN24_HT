package se.davand;

import java.util.ArrayList;

public class Restaurant {

    //Lista för att lagra bokningar
    ArrayList<String> reservations = new ArrayList<>();

    //Metod för att lägga till bokning
    public void addReservation() {
        reservations.add(reservation);
    }

    //Metod för att ta bort bokning
    public void removeReservation() {
        reservations.remove(reservation);
    }

    //Metod för att lista alla bokningar
    public void listAllReservations() {
        for (String reservation : reservations) {
            System.out.println(reservation);
        }
    }

    //Metod för att söka efter en bokning baserat på namn
    public void searchForReservation() {
        for (String reservation : reservations) {
        if (reservations.contains(nameToSearchFor)){
            System.out.println(reservation);
        }
        else {
            System.out.println("Could not find reservation");
        }

        }
    }
}
