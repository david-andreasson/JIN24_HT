package Exercises.Uppgift_10;

public class stringReverser {
    public static String reverse(String str) {
        if (str.isEmpty()){
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }
    public static void main(String[] args) {

        String original1 = "Hello";
        String original2 = "Sallad";
        String original3 = "Bobby Douglas";

        System.out.println("Original 1: " + original1 + ", Reversed: " + reverse(original1));
        System.out.println("Original 2: " + original2 + ", Reversed: " + reverse(original2));
        System.out.println("Original 3: " + original3 + ", Reversed: " + reverse(original3));
}}
