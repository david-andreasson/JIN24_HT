package Exercise_1;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        car.make = "VW";
        car.model = "Golf";
        car.year = 2017;

        Motorcycle motorcycle = new Motorcycle();
        motorcycle.make = "Honda";
        motorcycle.model = "X-max";
        motorcycle.year = 2022;

        Truck truck = new Truck();
        truck.make = "Tesla";
        truck.model = "Cybertruck";
        truck.year = 2024;



        car.startEngine();
        car.playRadio();
        motorcycle.startEngine();
        motorcycle.popWheelie();

        truck.startEngine();
        truck.loadCargo();
        truck.stopEngine();
    }
}