package se.davand.service;

import se.davand.dao.CourseDAO;
import se.davand.entity.Course;

import java.util.List;
import java.util.Optional;

public class CourseService {
    private final CourseDAO courseDAO;

    public CourseService(CourseDAO courseDAO) {
        this.courseDAO = courseDAO;
    }

    public void addCourse(Course course) {
        courseDAO.save(course);
    }

    public Optional<Course> getCourseById(Long id) {
        return courseDAO.findById(id);
    }

    public List<Course> getAllCourses() {
        return courseDAO.findAll();
    }

    public void updateCourse(Course course) {
        courseDAO.update(course);
    }

    public void deleteCourse(Course course) {
        courseDAO.delete(course);
    }
}