package Exercises.Uppgift_7;

public class Student {
    private String name;
    private int age;
    private char grade;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 100) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }

    public int getAge() {
        return age;
    }

    public void setGrade(char grade) {
        if (grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'E' || grade == 'F')
            this.grade = grade;
    }

    public char getGrade() {
        return grade;
    }
}

