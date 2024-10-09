package Exercises.One;

public class Methods {


    public int addUp(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }

    public int howManyEvens(int[] numbers) {
        int sumEven = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sumEven++;
            }
        }
        return sumEven;
    }

    public int findMin(int[] numbers) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];

            }
        }
        return min;
    }
}