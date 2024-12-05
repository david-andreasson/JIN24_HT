package se.davand;

public class StringUtils {

    public static boolean isStringAPalindrome(String string) {
        if (string == null) {
            System.out.println("The string is null.");
            throw new NullPointerException("The string is null.");
        }
        if (string.length() == 0) {
            throw new IllegalArgumentException("The string is empty.");
        }
        StringBuilder stringBuilder = new StringBuilder(string);
        String reverseString = stringBuilder.reverse().toString();

        if (string.equals(reverseString)) {
            System.out.println("Yes, the string is a palindrome.");
            return true;
        } else {
            System.out.println("No, the string is not a palindrome.");
            return false;
        }
    }
}

