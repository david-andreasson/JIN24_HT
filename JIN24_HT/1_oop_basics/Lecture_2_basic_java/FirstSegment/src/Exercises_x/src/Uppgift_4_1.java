public class Uppgift_4_1 {
    public static void main(String[] args) {
//        Skapa en klass Bil med attributen märke, modell, år, och hastighet.Skapa metoder för att
//        starta bilen, accelerera, och bromsa.Testa att skapa olika objekt av klassen Bil och interagera med dem.

        // Kom ihåg! I normala fall skapar men en fil per klass, det är standard.

        class Car {
           String brand;
           String model;
           int year;
           int speed;

            public Car(String brand, String model, int year, int speed) {
                this.brand = brand;
                this.model = model;
                this.year = year;
                this.speed = 0;
            }

            public void start() {
                System.out.println(brand + " " + model + " starts.");
            }
            public void accelerate() {
                speed += 10;
                System.out.println(brand + " " + model + " accelerates to " + speed + " km/h.");
            }
            public void brake() {
                speed -= 10;
                System.out.println(brand + " " + model + " slows down to " + speed + " km/h.");
            }
        }

        Car Volvo = new Car("Volvo", "x70", 2014, 0 );
        Car Saab = new Car("Saab", "9-3", 2008, 0 );
        Car VW = new Car("Volkswagen", "Type 1", 1960, 0 );

        Volvo.start();
        Saab.start();
        VW.start();
        Volvo.accelerate();
        Saab.accelerate();
        VW.accelerate();
        Volvo.accelerate();
        Saab.accelerate();
        VW.accelerate();
        Volvo.accelerate();
        Saab.accelerate();
        VW.accelerate();

       Volvo.brake();
       Saab.brake();
       VW.brake();
        System.out.println("VW WINS!!!");
    }
}
