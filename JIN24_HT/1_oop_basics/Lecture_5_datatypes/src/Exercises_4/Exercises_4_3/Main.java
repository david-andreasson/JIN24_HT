package Exercises_4.Exercises_4_3;

public class Main {
    public static void main(String[] args) {



School school = new School(2);
school.addTeacher(new Teacher("Mr. Beng"));
school.addTeacher(new Teacher("Mrs. Beng"));

school.addStudent(new Student("Warren"));
school.addStudent(new Student("Donny"));

school.listStudents();
school.listTeachers();
    }
}
