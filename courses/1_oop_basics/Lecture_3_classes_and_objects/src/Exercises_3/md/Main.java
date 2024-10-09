package Exercises_3.md;

public class Main {
    public static void main(String[] args) {


        Person person1 = new Person("Billy", 22, "billybutt@gmail.com");
        System.out.println(person1.name);
        System.out.println(person1.age);
        System.out.println(person1.email);

        Person person2 = new Person("Tom", 28);
        System.out.println(person2.name);
        System.out.println(person2.age);
        System.out.println(person2.email);

        Person person3 = new Person();
        System.out.println(person3.name);
        System.out.println(person3.age);
        System.out.println(person3.email);

//        Person person4 = new Person("Invalid", -5, "invalid@gmail.com");



    }
}

