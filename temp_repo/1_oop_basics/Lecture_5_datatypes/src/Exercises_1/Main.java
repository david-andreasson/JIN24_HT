package Exercises_1;

public class Main {
    public static void main(String[] args) {


        int[] numbers = new int[5];
        numbers[0] = 30;
        numbers[1] = 6;
        numbers[2] = 29;
        numbers[3] = 122;
        numbers[4] = 15;
//
//
//        double sum = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            sum = sum + numbers[i];
//        }
//        System.out.println((sum / numbers.length));


        Methods methods = new Methods();

//methods.findMax(numbers);
//methods.findMin(numbers);
        methods.arrayReverse(numbers);

    }
}
