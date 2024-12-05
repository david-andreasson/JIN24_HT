package se.davand;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void isAbbaAPalindrome() {
        assertEquals(true, StringUtils.isStringAPalindrome("abba"));
    }

    @Test
    void isAbcNotAPalindrome() {
        assertEquals(false, StringUtils.isStringAPalindrome("abc"));
    }

    @Test
    void emptyInputThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> StringUtils.isStringAPalindrome(""));
    }

    @Test
    void nullInputThrowsException() {
        assertThrows(NullPointerException.class, () -> StringUtils.isStringAPalindrome(null));
    }
    @Test
    void stringWithSpacesIsAPalindrome() {
        assertEquals(true, StringUtils.isStringAPalindrome("a b c b a"));
    }
    @Test
    void stringWithSpacesIsNotAPalindrome() {
        assertEquals(false, StringUtils.isStringAPalindrome("a b c d a"));
    }
}