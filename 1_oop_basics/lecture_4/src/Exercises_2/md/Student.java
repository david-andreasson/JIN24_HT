package Exercises_2.md;

public class Student {
    private String name;
    private int age;
    private char grade;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age > 0) this.age = age;
    }
    public char getGrade() {
        return grade;
    }
    public void setGrade(char grade) {
        if (grade > 0) this.grade = grade;
    }
}
