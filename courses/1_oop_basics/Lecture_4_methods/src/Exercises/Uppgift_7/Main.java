package Exercises.Uppgift_7;

public class Main {
    public static void main(String[] args) {


        studentRegister register = new studentRegister();
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.setName("Jim");
        student2.setName("James");
        student3.setName("John");

        student1.setAge(23);
        student2.setAge(22);
        student3.setAge(23);

        student1.setGrade('B');
        student2.setGrade('E');
        student3.setGrade('C');

        System.out.println("Lägg till student " + student1.getName() + " till registret.");
        register.addStudent(student1);
        System.out.println("Lägg till student " + student2.getName() + " till registret.");
        register.addStudent(student2);
        System.out.println("Lägg till student " + student3.getName() + " till registret.");
        register.addStudent(student3);

        System.out.println("Visa alla studenter i registret:");
        register.showAllStudents();

        System.out.println("Ta bort student " + student1.getName() + " från registret.");
        register.removeStudentByName(student1.getName());

        System.out.println("Visa alla studenter i registret:");
        register.showAllStudents();

        register.removeStudentByName("John");
        register.removeStudentByName("Billy");
        register.showAllStudents();


    }
}
