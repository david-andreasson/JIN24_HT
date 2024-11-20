package se.davand.dao;

import se.davand.entity.Course;

import java.util.List;
import java.util.Optional;

public interface CourseDAO {
    void save(Course course);
    Optional<Course> findById(Long id);
    List<Course> findAll();
    void update(Course course);
    void delete(Course course);
}