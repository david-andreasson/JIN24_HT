package se.davand.extra_exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPasswordValidation {

    @Test
    public void testPasswordValidation() {
        PasswordValidation passwordValidation = new PasswordValidation();
        assertEquals(true, passwordValidation.isPasswordValid("password1"));
    }
}