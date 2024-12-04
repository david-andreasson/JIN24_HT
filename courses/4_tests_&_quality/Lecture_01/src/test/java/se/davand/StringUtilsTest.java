package se.davand;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void isAbbaAPalindrome() {
        assertEquals("Yes, the string is a palindrome.", StringUtils.IsStringAPalindrome("abba"));
    }

    @Test
    void isAbcNotAPalindrome() {
        assertEquals("No, the string is not a palindrome.", StringUtils.IsStringAPalindrome("abc"));
    }

    @Test
    void isNull() {
        assertNull(StringUtils.IsStringAPalindrome(null));
    }
}