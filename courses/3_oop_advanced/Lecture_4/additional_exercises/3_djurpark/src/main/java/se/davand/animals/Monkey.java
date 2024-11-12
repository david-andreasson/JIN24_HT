package se.davand.animals;

import se.davand.entities.Animal;

public class Monkey extends Animal {
    @Override
    public void eat() {
        System.out.println("Monkey is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Monkey is sleeping");
    }

    @Override
    public void makeSound() {
        System.out.println("Monkey is screaming");
    }
}
