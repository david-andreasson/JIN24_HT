package se.davand;

import se.davand.config.DatabaseConfig;
import se.davand.config.DatabaseConnection;
import se.davand.config.H2Connection;
import se.davand.config.MySQLConnection;
import se.davand.dao.CourseDAO;
import se.davand.dao.StudentDAO;
import se.davand.dao.impl.CourseDAOImpl;
import se.davand.dao.impl.StudentDAOImpl;
import se.davand.service.CourseService;
import se.davand.service.StudentService;
import se.davand.ui.MenuSystem;

public class Main {
    public static void main(String[] args) {
        // init db conn
        DatabaseConnection dbConnection = new MySQLConnection();

        // init DAOs
        CourseDAO courseDAO = new CourseDAOImpl(dbConnection.getSessionFactory());
        StudentDAO studentDAO = new StudentDAOImpl(dbConnection.getSessionFactory());

        // init Services
        CourseService courseService = new CourseService(courseDAO);
        StudentService studentService = new StudentService(studentDAO);

        // init and start menu
        MenuSystem menuSystem = new MenuSystem(studentService, courseService);
        menuSystem.displayMenu();
    }
}