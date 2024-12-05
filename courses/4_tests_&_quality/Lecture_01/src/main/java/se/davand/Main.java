package se.davand;

public class Main {
    public static void main(String[] args) {

        StringUtils stringUtils = new StringUtils();
        System.out.println(stringUtils.isStringAPalindrome("a b c b a"));
        System.out.println(stringUtils.isStringAPalindrome("a b c d e"));

    }
}