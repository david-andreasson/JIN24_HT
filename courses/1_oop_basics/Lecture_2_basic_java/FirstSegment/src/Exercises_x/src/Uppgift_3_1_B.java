import java.util.Scanner;

public class Uppgift_3_1_B {
    public static void main(String[] args) {

//        Skapa ett program som beräknar fakulteten (n!) av ett tal som användaren anger. Använd en for-loop för att beräkna resultatet.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = sc.nextInt();
        int sum = 1;
        for (int i = 1; i <= number; i++) {
            sum = sum * i;
        }
        System.out.println(sum);
    }
}
