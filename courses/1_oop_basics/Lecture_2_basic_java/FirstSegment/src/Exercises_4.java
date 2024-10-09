public class Exercises_4 {
    public static void main(String[] args) {

//        Uppgift 1.1:
//        Skapa en klass Person med attributen name, age, och occupation.Skapa ett objekt av klassen och tilldela värden
//        till attributen.
//        Skriv ut informationen om personen.
//
//        Uppgift 1.2:
//        Lägg till en metod introduce() i klassen Person som skriver ut en presentation av personen.Anropa metoden
//        för att presentera objektet.
//
//        Uppgift 2.1:
//        Skapa en konstruktor i klassen Person som tar name, age, och occupation som parametrar.Skapa ett objekt med
//        hjälp av konstruktorn.
//
//        Uppgift 2.2:
//        Lägg till en konstruktor utan parametrar som tilldelar standardvärden till attributen.Skapa ett objekt med
//        denna konstruktor och skriv ut standardvärdena.


        class Person {
            String name;
            int age;
            String occupation;
//
//
//            public Person(String name, int age, String occupation) {
//                this.name = name;
//                this.age = age;
//                this.occupation = occupation;
//            }
//
//            public Person() {
//                this.name = "unknown";
//                this.age = 0;
//                this.occupation = "unknown";
//            }
//            Person defaultPerson = new Person();
//
//
//            Person person = new Person("Bertil", 36, "Tandläkare");
//
            public void introduce() {
                System.out.println("Hej, jag heter " + name + " och jag är " + age + " år gammal och arbetar som " + occupation + ".");
            }
        }
        Person person = new Person();
        person.name = "David";
        person.age = 45;
        person.occupation = "Student";

//        System.out.println("Namn: " + person.name);
//        System.out.println("Ålder: " + person.age);
//        System.out.println("Yrke: " + person.occupation);


        person.introduce();

    }}


