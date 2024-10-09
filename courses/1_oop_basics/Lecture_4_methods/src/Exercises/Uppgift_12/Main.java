package Exercises.Uppgift_12;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Dean Winchester", "Demon slayer", 9000);
        Employee employee2 = new Employee("Sam Winchester", "Demon slayer", 9500);

        employee1.displayEmployeeInfo("Dean Winchester");
        employee2.displayEmployeeInfo("Sam Winchester");

        employee1.adjustSalary(78000);
        employee2.adjustSalary(78000);

        employee1.displayEmployeeInfo("Sam Winchester");
        employee2.displayEmployeeInfo("Winchester");
    }
}
