package Exercises_4.md;

public class Dog {
    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void bark() {
        System.out.println(name + ", who is " + age + "years old, is barking!");
    }
}
