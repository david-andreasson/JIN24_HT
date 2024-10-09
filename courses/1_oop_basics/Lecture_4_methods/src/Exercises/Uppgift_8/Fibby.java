package Exercises.Uppgift_8;

public class Fibby {

    public int rekursiveFib(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 0) {
            return 0;
        } else
            return rekursiveFib(n - 1) + rekursiveFib(n - 2);
    }
    }
