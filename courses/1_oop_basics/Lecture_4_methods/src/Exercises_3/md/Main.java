package Exercises_3.md;

public class Main {
    public static void main(String[] args) {

//        Book book = new Book("Where Eagles dare", "Glenn Danzig", 86);
//        book.displayInfo();


//        Triangle triangle = new Triangle();
//        Triangle triangle2 = new Triangle(2.0,2.0);
//
//        System.out.println(triangle.calculateArea());
//        System.out.println(triangle2.calculateArea());

//        Student student = new Student("Billy Butte", 'B');
//        student.printDetails();
        Employee employee = new Employee();
        Employee employee2 = new Employee("James", "Driver");
        Employee employee3 = new Employee("Frank", "Clerk", 6000);


        employee.displayEmployee();
        employee2.displayEmployee();
        employee3.displayEmployee();





    }
}
