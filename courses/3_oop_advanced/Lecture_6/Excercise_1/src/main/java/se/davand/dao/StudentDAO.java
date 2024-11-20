package se.davand.dao;

import se.davand.entity.Course;
import se.davand.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentDAO {
    void save(Student student);
    Optional<Student> findById(Long id);
    List<Student> findAll();
    void update(Student student);
    void delete(Student student);
    List<Student> findByCourseId(Long courseId);
}