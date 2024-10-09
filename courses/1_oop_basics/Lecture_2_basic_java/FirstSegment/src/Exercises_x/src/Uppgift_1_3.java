import java.util.Scanner;

public class Uppgift_1_3 {
    public static void main(String[] args) {
//        Skapa ett program som beräknar om en person är berättigad till ett lån baserat på deras ålder, inkomst
//        och kredithistorik.Använd logiska operatorer för att kombinera dessa villkor.
//        Skapa en sanningstabell för att demonstrera hur &&, ||och !fungerar.

        Scanner sc = new Scanner(System.in);
        System.out.println("Mata in din ålder:");
        int age = sc.nextInt();

        if (age >= 18 && age <= 65) {
            System.out.println("Mata in din månadsinkomst:");
            int income = sc.nextInt();
            if (income > 20000) {

                System.out.println("Mata in kreditscore (1-5)");
                int score = sc.nextInt();
                if (score >= 4) {
                    System.out.println("Du är beviljad lån på: " + income * 2 * score);
                } else {
                    System.out.println("Du har för låg kreditscore");
                }

            } else {
                System.out.println("Du har för låg inkomst");
            }


        } else {
            System.out.println("Personen är inte mellan 18 och 65 år.");
        }


    }
}
