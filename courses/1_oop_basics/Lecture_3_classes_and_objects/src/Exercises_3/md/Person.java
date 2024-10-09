package Exercises_3.md;

public class Person {
    String name;
    int age;
    String email;
    public Person(String name, int age, String email) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.name = name;
        this.age = age;
        this.email = email;
    }
    public Person(String name, int age) {
        this(name, age, "Unknown");
    }
    public Person() {
        this("Unknown", 0, "Unknown");
    }
}
