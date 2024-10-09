package Exercises_4.md;

public class Main {
    public static void main(String[] args) {
//
//        Dog dog = new Dog("Kato", 5);
//        Dog dog2 = dog;
//
//        dog2.bark();
//        dog.bark();
//
//        dog2.age = 9;
//
//        dog2.bark();
//        dog.bark();


        House myHouse = new House("Red");

        myHouse.showColor();
        anotherClass manager = new anotherClass();

        manager.changeColor(myHouse, "Blue");

        myHouse.showColor();
    }
}
