package se.davand.animals;

import se.davand.entities.Animal;

public class Lion extends Animal {
    @Override
    public void eat() {
        System.out.println("Lion is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Lion is sleeping");
    }

    @Override
    public void makeSound() {
        System.out.println("Lion is roaring");
    }
}
