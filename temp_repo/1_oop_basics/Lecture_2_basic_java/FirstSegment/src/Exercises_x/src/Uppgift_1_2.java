import java.util.Scanner;

public class Uppgift_1_2 {
    public static void main(String[] args) {
//        Skapa ett program som utför följande beräkningar:
//        Beräkna arean och omkretsen av en rektangel baserat på användarinmatade längder och bredder.
//        Omvandla en temperatur från Celsius till Fahrenheit.
//        Beräkna hur många minuter och sekunder det finns i en given tidslängd (i sekunder).

        Scanner sc = new Scanner(System.in);
        System.out.println("Gör ditt val:");
        System.out.println("1. Beräkna area och omkrets");
        System.out.println("2. Omvandla temperatur");
        System.out.println("3. Beräkna tid");

        int choice = sc.nextInt();
if (choice == 1) {
    System.out.print("Skriv in längd:");
    int lenght = sc.nextInt();
    System.out.print("Skriv in bredd:");
    int width = sc.nextInt();
    System.out.println("Din rektangel har arean " + lenght * width + " och omkretsen " + ((lenght * 2) + (width * 2)));
}

   else if (choice == 2) {
        System.out.print("Skriv in temperatur i Celsius:");
        int temp = sc.nextInt();
        System.out.print("Din temperatur i Celsius:"+temp+ " är "+ (temp * 1.8 + 32) +"grader i Fahrenheit");
    }
else if (choice == 3) {
    System.out.print("Skriv in tidslängd i sekunder:");
    int tid = sc.nextInt();
    int timmar = tid / 3600; // Dela antalet sekunder med 3600 för att få antalet timmar
    int minuter = (tid % 3600) / 60; // Resten från timmarnas beräkning, delad med 60 för att få minuter
    int sekunder = tid % 60; // Resten från minuternas beräkning är sekunderna

    System.out.println(tid + " sekunder är " + timmar + " timmar, " + minuter + " minuter och " + sekunder + " sekunder.");
}
else {
    System.out.println("Ogiltigt val");
}

        }
    }

