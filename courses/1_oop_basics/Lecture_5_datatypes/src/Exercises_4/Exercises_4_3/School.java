package Exercises_4.Exercises_4_3;

import java.util.ArrayList;
import java.util.List;

public class School {
    private Teacher[] teachers;
    private List<Student> students;
    private int teacherCount;

    public School(int teacherSize){
        teachers = new Teacher[teacherSize];
        students = new ArrayList<Student>();
        teacherCount = 0;
    }

    public void addTeacher(Teacher teacher){
if (teacherCount < teachers.length){
teachers[teacherCount] = teacher;
teacherCount++;
}
    }
    public void addStudent(Student student){
        students.add(student);
    }
    public void listTeachers(){
        for (int i = 0; i < teacherCount; i++){
            System.out.println(teachers[i].getName());
        }
    }
    public void listStudents(){
        for (Student student : students){
            System.out.println(student.getName());
        }
    }
}
