package se.davand;

import se.davand.animals.Lion;
import se.davand.animals.Monkey;
import se.davand.animals.Elephant;
import se.davand.entities.Animal;

import java.util.List;

public class Zoo {
    public static void main(String[] args) {
        List<Animal> animals = List.of(new Lion(), new Monkey(), new Elephant());
        animals.forEach(animal -> {
            animal.eat();
            animal.sleep();
            animal.makeSound();
        });
    }
}
