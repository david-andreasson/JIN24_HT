package Exercises_4.md;

public class House {
    String address;
    String color;


    public House(String color) {
        this.color = color;
        this.address = "";
    }

    void showColor() {
        System.out.println("The house color is " + color);
    }
}
