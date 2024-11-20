package se.davand.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import se.davand.entity.Course;

import java.util.List;

@Entity
@Table(name = "students")
@Data
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String email;

    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    private Course course;

    public Student(String firstName, String lastName, String email, Course course) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.course = course;
    }

/*    public void addCourse(Course course) {
        courses.add(course);
        course.getStudents().add(this);
    }

    public void removeCourse(Course course) {
        courses.remove(course);
        course.getStudents().remove(this);
    }*/
}