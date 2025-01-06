package se.davand;

import java.util.ArrayList;
import java.util.Iterator;

public class Restaurant {


    //Lista för att lagra bokningar
    ArrayList<Reservation> reservations = new ArrayList<>();

    //Metod för att lägga till bokning
    public void addReservation(String name, int numberOfPeople, String date) {
        Reservation newReservation = new Reservation(name, numberOfPeople, date);
        reservations.add(newReservation);
        System.out.println("Successfully added the reservation: " + newReservation);
    }

    //Metod för att ta bort bokning
    public void removeReservation(String reservationToDelete) {
        boolean foundReservation = false;
        Iterator<Reservation> iterator = reservations.iterator();
        while (iterator.hasNext()) {
            Reservation reservation = iterator.next();
            if (reservation.getName().equalsIgnoreCase(reservationToDelete)) {
                System.out.println("Removing " + reservation.getName());
                iterator.remove();
                foundReservation = true;
            }
            if (!foundReservation) {
                System.out.println("Reservation " + reservationToDelete + " was not found in reservation-list");
            }
        }
    }

    //Metod för att lista alla bokningar
    public void listAllReservations() {
        for (Reservation reservation : reservations) {
            System.out.println(reservation);
        }
    }

    //Metod för att söka efter en bokning baserat på namn
    public void searchForReservation(String nameToSearchFor) {
        boolean foundReservation = false;
        for (Reservation reservation : reservations) {
            if (reservation.getName().equalsIgnoreCase(nameToSearchFor)) {
                System.out.println("Found: " + reservation);
                foundReservation = true;
            }
        }
        if (!foundReservation) {
            System.out.println("Could not find reservation in booking system");
        }
    }
}

