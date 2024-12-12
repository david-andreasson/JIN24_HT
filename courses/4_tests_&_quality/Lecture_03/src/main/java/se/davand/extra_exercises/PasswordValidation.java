package se.davand.extra_exercises;

public class PasswordValidation {
    public boolean isPasswordValid(String password) {
     return password.length() >= 8 && password.matches(".*\\d.*");
    }
}

