package Exercises.Uppgift_4;

public class Main {
    public static void main(String[] args) {

        int produkt = enklaTal(5);
        System.out.println("Produkt : " + produkt);


    }

    private static int enklaTal(int count) {

        if (count == 1) {
            return 1;
        }

        return count * enklaTal(count - 1);
    }
}