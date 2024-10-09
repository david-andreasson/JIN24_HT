package Exercises_1;

public class Methods {

    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    public void findMax(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Det största talet i din array är: " + max);
    }

    public void findMin(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Det minsta talet i din array är: " + min);
    }

    public void arrayReverse(int[] numbers) {
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}

