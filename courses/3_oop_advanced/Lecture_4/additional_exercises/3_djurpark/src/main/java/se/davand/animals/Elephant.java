package se.davand.animals;

import se.davand.entities.Animal;

public class Elephant extends Animal {
    @Override
    public void eat() {
        System.out.println("Elephant is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Elephant is sleeping");
    }

    @Override
    public void makeSound() {
        System.out.println("Elephant is trumpeting");
    }
}
