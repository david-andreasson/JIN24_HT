import java.util.Scanner;

public class Uppgift_2_2_B {
    public static void main(String[] args) {

//        Skapa en enkel miniräknare som tar två tal och en operation(addition, subtraktion, multiplikation, division)
//        som input och returnerar resultatet av operationen.Använd en switch -sats för att hantera de olika operationerna.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = sc.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = sc.nextInt();
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter operation : ");
        int operation = sc.nextInt();
        switch (operation) {
            case 1:
                System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
                break;
            case 2:
                System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
                break;
            case 3:
                System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
                break;
            case 4:
                System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }
    }
}
