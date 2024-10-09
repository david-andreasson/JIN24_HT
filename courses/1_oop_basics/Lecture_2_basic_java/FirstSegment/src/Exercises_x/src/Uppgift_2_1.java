import java.util.Scanner;

public class Uppgift_2_1 {
    public static void main(String[] args) {

//        Skapa ett program som beräknar studentbetyg baserat på poäng.Använd if -else-satser för att bestämma vilket
//        betyg en student ska få(A, B, C, D, eller F) baserat på deras poäng (t.ex.över 90 är A, mellan 80 - 89 är B, osv.).

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of points (0-100) the student accumulated on the test: ");
        int points = sc.nextInt();
        if (points >= 90) {
            System.out.println("The student got the grade A on the test");
        } else if (points >= 80) {
            System.out.println("The student got the grade B on the test");
        } else if (points >= 70) {
            System.out.println("The student got the grade C on the test");
        } else if (points >= 60) {
            System.out.println("The student got the grade D on the test");
        } else if (points >= 50) {
            System.out.println("The student got the grade E on the test");
        } else {
            System.out.println("The student got the grade F on the test");
        }
        sc.close();

    }
}
