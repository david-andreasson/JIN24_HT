import java.util.Scanner;

public class Uppgift_2_1_B {
    public static void main(String[] args) {
//        Skapa ett program som frågar användaren efter ett årtal och sedan bestämmer om det är ett skottår eller inte.

        Scanner sc = new Scanner(System.in);
        System.out.println("Skriv in årtal för att ta reda på om det är ett skottår eller ej: ");
        int year = sc.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Året är ett skottår!");
        }
            else {
                System.out.println("Året är inte ett skottår!");
            }
            sc.close();
        }
    }

