package se.davand;

public class StringUtils {

    public static String IsStringAPalindrome(String string) {
        StringBuilder stringBuilder = new StringBuilder(string);
        String reverseString = stringBuilder.reverse().toString();
        if (string.equals(reverseString)) {
            return "Yes, the string is a palindrome.";
        } else {
            return "No, the string is not a palindrome.";
        }
    }
}
