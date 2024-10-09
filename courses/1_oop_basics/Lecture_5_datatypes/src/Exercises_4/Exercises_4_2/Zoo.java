package Exercises_4.Exercises_4_2;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private List<Animal> animals;

    public Zoo(){
        animals = new ArrayList<>();
    }
    public void addAnimal(Animal animal){
        animals.add(animal);
    }
    public void listAnimals(){
        for(Animal animal : animals){
            System.out.println(animal.getSpecies());
        }
    }
}
