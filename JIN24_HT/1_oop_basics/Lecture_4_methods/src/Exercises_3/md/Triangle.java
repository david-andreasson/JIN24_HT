package Exercises_3.md;

public class Triangle {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public Triangle() {
        this.base = 1.0;
        this.height = 1.0;
    }
    public double calculateArea() {
        return (base * height) / 2.0;
    }
}
