package Exercises.One;

public class Main {
    public static void main(String[] args) {

        int[] numbers = new int[5];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        Methods methods = new Methods();

        int sum = methods.addUp(numbers);
        System.out.println("Summan av alla tal i arryen är: " + sum);

        int sumEven = methods.howManyEvens(numbers);
        System.out.println("Antal jämna tal i arryen är: " + sumEven);

        int min = methods.findMin(numbers);
        System.out.println("Minsta talet i arryen är: " + min);

    }
}
