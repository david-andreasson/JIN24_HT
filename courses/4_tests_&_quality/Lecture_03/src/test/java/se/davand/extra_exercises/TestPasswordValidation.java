package se.davand.extra_exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPasswordValidation {

    @Test
    public void testPasswordValidation() {
        PasswordValidation passwordValidation = new PasswordValidation();
        assertEquals(true, passwordValidation.isPasswordValid("password1"));
    }

    @Test
    public void testPasswordWithLessThenEightChars() {
        PasswordValidation passwordValidation = new PasswordValidation();
        assertEquals(false, passwordValidation.isPasswordValid("passwo1"));
    }

    @Test
    public void testPasswordWithoutNumber() {
        PasswordValidation passwordValidation = new PasswordValidation();
        assertEquals(false, passwordValidation.isPasswordValid("password"));
    }
}