package se.davand.ui;

import se.davand.entity.Course;
import se.davand.entity.Student;
import se.davand.service.CourseService;
import se.davand.service.StudentService;
import se.davand.service.CourseService;
import se.davand.entity.Student;
import se.davand.entity.Course;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class MenuSystem {
    private final Scanner scanner;
    private final StudentService studentService;
    private final CourseService courseService;

    public MenuSystem(StudentService studentService, CourseService courseService) {
        this.scanner = new Scanner(System.in);
        this.studentService = studentService;
        this.courseService = courseService;
    }

    public void displayMenu() {
        while (true) {
            System.out.println("\n--- School Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Add Course");
            System.out.println("6. View All Courses");
            System.out.println("7. Update Course");
            System.out.println("8. Delete Course");
            System.out.println("9. View Students by Course");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> viewAllStudents();
                case 3 -> updateStudent();
                case 4 -> deleteStudent();
                case 5 -> addCourse();
                case 6 -> viewAllCourses();
                case 7 -> updateCourse();
                case 8 -> deleteCourse();
                case 9 -> viewStudentsByCourse();
                case 0 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void addStudent() {
        System.out.println("Adding a new student");
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        System.out.print("Enter course ID: ");
        Long courseId = scanner.nextLong();
        scanner.nextLine(); // Consume newline

        Course course = courseService.getCourseById(courseId)
                .orElseThrow(() -> new IllegalArgumentException("Course not found"));

        Student student = new Student(firstName, lastName, email, course);
        studentService.addStudent(student);
        System.out.println("Student added successfully.");
    }

    private void viewAllStudents() {
        List<Student> students = studentService.getAllStudents();
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            System.out.println("List of all students:");
            for (Student student : students) {
                System.out.println(student.getId() + ": " + student.getFirstName() + " " + student.getLastName() + " (" + student.getEmail() + ")");
            }
        }
    }

    private void updateStudent() {
        viewAllStudents();
        System.out.print("Enter student ID to update: ");
        Long id = scanner.nextLong();
        scanner.nextLine(); // Consume newline

        Optional<Student> optionalStudent = studentService.getStudentById(id);
        if (optionalStudent.isPresent()) {
            Student student = optionalStudent.get();
            System.out.println("Updating student: " + student.getFirstName() + " " + student.getLastName());

            System.out.print("Enter new first name (press enter to keep current): ");
            String firstName = scanner.nextLine();
            if (!firstName.isEmpty()) {
                student.setFirstName(firstName);
            }

            System.out.print("Enter new last name (press enter to keep current): ");
            String lastName = scanner.nextLine();
            if (!lastName.isEmpty()) {
                student.setLastName(lastName);
            }

            System.out.print("Enter new email (press enter to keep current): ");
            String email = scanner.nextLine();
            if (!email.isEmpty()) {
                student.setEmail(email);
            }

            studentService.updateStudent(student);
            System.out.println("Student updated successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    private void deleteStudent() {
        viewAllStudents();
        System.out.print("Enter student ID to delete: ");
        Long id = scanner.nextLong();
        scanner.nextLine(); // Consume newline

        Optional<Student> optionalStudent = studentService.getStudentById(id);
        if (optionalStudent.isPresent()) {
            Student student = optionalStudent.get();
            studentService.deleteStudent(student);
            System.out.println("Student deleted successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    private void addCourse() {
        System.out.println("Adding a new course");
        System.out.print("Enter course code: ");
        String code = scanner.nextLine();
        System.out.print("Enter course name: ");
        String name = scanner.nextLine();
        System.out.print("Enter credits: ");
        int credits = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Course course = new Course(code, name, credits);
        courseService.addCourse(course);
        System.out.println("Course added successfully.");
    }

    private void viewAllCourses() {
        List<Course> courses = courseService.getAllCourses();
        if (courses.isEmpty()) {
            System.out.println("No courses found.");
        } else {
            System.out.println("List of all courses:");
            for (Course course : courses) {
                System.out.println(course.getId() + ": " + course.getCode() + " - " + course.getName() + " (" + course.getCredits() + " credits)");
            }
        }
    }

    private void updateCourse() {
        viewAllCourses();
        System.out.print("Enter course ID to update: ");
        Long id = scanner.nextLong();
        scanner.nextLine(); // Consume newline

        Optional<Course> optionalCourse = courseService.getCourseById(id);
        if (optionalCourse.isPresent()) {
            Course course = optionalCourse.get();
            System.out.println("Updating course: " + course.getCode() + " - " + course.getName());

            System.out.print("Enter new course code (press enter to keep current): ");
            String code = scanner.nextLine();
            if (!code.isEmpty()) {
                course.setCode(code);
            }

            System.out.print("Enter new course name (press enter to keep current): ");
            String name = scanner.nextLine();
            if (!name.isEmpty()) {
                course.setName(name);
            }

            System.out.print("Enter new credits (press enter to keep current): ");
            String creditsStr = scanner.nextLine();
            if (!creditsStr.isEmpty()) {
                course.setCredits(Integer.parseInt(creditsStr));
            }

            courseService.updateCourse(course);
            System.out.println("Course updated successfully.");
        } else {
            System.out.println("Course not found.");
        }
    }

    private void deleteCourse() {
        viewAllCourses();
        System.out.print("Enter course ID to delete: ");
        Long id = scanner.nextLong();
        scanner.nextLine(); // Consume newline

        Optional<Course> optionalCourse = courseService.getCourseById(id);
        if (optionalCourse.isPresent()) {
            Course course = optionalCourse.get();
            courseService.deleteCourse(course);
            System.out.println("Course deleted successfully.");
        } else {
            System.out.println("Course not found.");
        }
    }

    private void viewStudentsByCourse() {
        viewAllCourses();
        System.out.print("Enter department ID: ");
        Long studentId = scanner.nextLong();
        scanner.nextLine(); // Consume newline

        List<Student> students = studentService.getStudentsByCourse(studentId);
        if (students.isEmpty()) {
            System.out.println("No students found in this course.");
        } else {
            students.forEach(student -> System.out.println(student.getId() + ": " + student.getFirstName() + " " + student.getLastName()));
        }
    }
}