package Exercises_3.md;

public class Employee {
    private String name;
    private String position;
    private int salary;

    public Employee() {
        this("Unknown", "Unknown", 0);
    }

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
        this.salary = 0;
    }

    public Employee(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
    void displayEmployee() {
        System.out.println("Name: " + name);
        System.out.println("Position: " + position);
        System.out.println("Salary: " + salary);
    }
}
