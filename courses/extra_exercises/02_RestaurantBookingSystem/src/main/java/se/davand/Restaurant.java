package se.davand;

import java.util.ArrayList;

public class Restaurant {


    //Lista för att lagra bokningar
    ArrayList<Reservation> reservations = new ArrayList<>();

    //Metod för att lägga till bokning
    public void addReservation(String name, int numberOfPeople, String date) {
        Reservation newReservation = new Reservation(name, numberOfPeople, date);
        reservations.add(newReservation);
    }

    //Metod för att ta bort bokning
    public void removeReservation(String reservationToDelete) {
        boolean foundReservation = false;
        for (Reservation reservation : reservations) {
            if (reservation.getName().equalsIgnoreCase(reservationToDelete)) {
                System.out.println("Removing: " + reservation.getName() + "-reservation");
                reservations.remove(reservation);
                foundReservation = true;
                break;
            }
        }
        if (!foundReservation) {
            System.out.println("Could not find reservation in booking system");
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
                System.out.println("Found: " + reservation.getName() + "-reservation");
                foundReservation = true;
                break;
            }
        }
        if (!foundReservation) {
            System.out.println("Could not find reservation in booking system");
        }
    }
}

