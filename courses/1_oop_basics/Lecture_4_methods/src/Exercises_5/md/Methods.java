package Exercises_5.md;

public class Methods {
    public int sumArray(int[] arr, int n) {
        if (n <= 0) {
            return 0;
        } else {
            return arr[n - 1] + sumArray(arr, n - 1);
        }
    }
    public static int gcd(int a, int b) {
        if (b==0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
