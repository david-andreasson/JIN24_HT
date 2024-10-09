package Exercises_3.md;

public class Student {
    private String name;
    private char grade;
    public Student(String name, char grade) {
        this.name = name;
        this.grade = grade;
    }
    void printDetails(){
        System.out.println("Name: " + this.name);
        System.out.println("Grade: " + this.grade);
    }
}
