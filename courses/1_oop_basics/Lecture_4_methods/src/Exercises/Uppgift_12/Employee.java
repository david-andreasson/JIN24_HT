package Exercises.Uppgift_12;

public class Employee {
    private String name;
    private String jobTitle;
    private int salary;
    public Employee(String name, String jobTitle, int salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
    public void displayEmployeeInfo(String name) {
        System.out.println("Name: " + name + ", Job Title: " + jobTitle + ", Salary: " + salary);
    }
    public void adjustSalary(int amount) {
        salary += amount;
        System.out.println("Name: " + name + ", Job Title: " + jobTitle + ", has a new salary, the new salary is: " + salary);

    }
}
