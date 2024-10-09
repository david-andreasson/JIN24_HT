package Exercises.Uppgift_7;

import java.util.ArrayList;

public class studentRegister {

    private ArrayList<Student> students;

    public studentRegister() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println(student.getName() + " added to the list");
    }

    public void removeStudentByName(String name) {
        boolean studentFound = false;
        for (Student student : students) {
            if (student.getName().equals(name)) {
                students.remove(student);
                System.out.println(student.getName() + " removed from the list");
                studentFound = true;
                break;  // Avsluta loopen när studenten har hittats och tagits bort
            }
        }
        if (!studentFound) {
            System.out.println("No student found with the name " + name);
        }
    }

    public void showAllStudents() {
        if (students.isEmpty()) {
            System.out.println("There are no students in the list");
        } else {
            for (Student student : students) {
                System.out.println(student.getName());
            }
        }
    }
}

