package Exercises.Uppgift_2;

public class Main {
    public static void main(String[] args) {


        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        Person person5 = new Person();

        person1.setName("John");
        person2.setName("Jane");
        person3.setName("Jack");
        person4.setName("Jill");
        person5.setName("James");

        person1.setAge(23);
        person2.setAge(22);
        person3.setAge(23);
        person4.setAge(22);
        person5.setAge(22);

        person1.setCity("Stockholm");
        person2.setCity("Stockholm");
        person3.setCity("Stockholm");
        person4.setCity("Stockholm");
        person5.setCity("Luleå");

        System.out.println(person1.getName() + " är " + person1.getAge() + " år gammal och bor i " + person1.getCity());
        System.out.println(person2.getName() + " är " + person2.getAge() + " år gammal och bor i " + person2.getCity());
        System.out.println(person3.getName() + " är " + person3.getAge() + " år gammal och bor i " + person3.getCity());
        System.out.println(person4.getName() + " är " + person4.getAge() + " år gammal och bor i " + person4.getCity());
        System.out.println(person5.getName() + " är " + person5.getAge() + " år gammal och bor i " + person5.getCity());
    }
}
