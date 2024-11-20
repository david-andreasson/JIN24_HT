package se.davand.service;

import se.davand.dao.StudentDAO;
import se.davand.entity.Student;

import java.util.List;
import java.util.Optional;

public class StudentService {
    private final StudentDAO studentDAO;

    public StudentService(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    public void addStudent(Student student) {
        studentDAO.save(student);
    }

    public Optional<Student> getStudentById(Long id) {
        return studentDAO.findById(id);
    }

    public List<Student> getAllStudents() {
        return studentDAO.findAll();
    }
    public void updateStudent(Student student) {
        studentDAO.update(student);
    }

    public void deleteStudent(Student student) {
        studentDAO.delete(student);
    }

    public List<Student> getStudentsByCourse(Long courseId) {
        return studentDAO.findByCourseId(courseId);
    }
}