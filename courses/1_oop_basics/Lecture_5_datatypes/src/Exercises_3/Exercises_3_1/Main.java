package Exercises_3.Exercises_3_1;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {5, 7, 3, 55, 45, 80, 11};

        System.out.println("Array before sorting:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        bubbleSort(numbers);  // Anropa bubbleSort-metoden
        System.out.println("\nArray after sorting:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    // Bubble sort implementation
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Byt plats
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
