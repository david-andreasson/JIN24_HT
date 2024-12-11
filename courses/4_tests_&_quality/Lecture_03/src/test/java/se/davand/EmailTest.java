package se.davand;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EmailTest {

    @Test
    void testIsEmailValid() {
        Emailchecker emailchecker = new Emailchecker();
        assertEquals(true, emailchecker.isEmailValid("Sven@email.com"));
    }
@Test
    void isEmailwithoutAtValid() {
        Emailchecker emailchecker = new Emailchecker();
        assertEquals(false, emailchecker.isEmailValid("Svenemail.com"));
    }
    @Test
    void isEmailwithoutDotValid() {
        Emailchecker emailchecker = new Emailchecker();
        assertEquals(false, emailchecker.isEmailValid("Sven@email"));
    }
}