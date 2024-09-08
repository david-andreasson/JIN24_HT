package Exercises.Uppgift_8;

public class Main {
    public static void main(String[] args) {

Fibby rekursiveFib = new Fibby();

        System.out.println("The first 10 Fibonacci numbers are:");
        for (int i = 0; i < 10; i++) {
            int fib = rekursiveFib.rekursiveFib(i);  // Anropa rekursiv metod
            System.out.println("Fibonacci number " + i + ": " + fib);
        }
    }
}
