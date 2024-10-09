public class Exercises_1 {
    public static void main(String[] args) {

//        Uppgift 1.1:
//        Skapa en klass med en main-metod där du deklarerar och initialiserar följande variabler:
//
//        En heltalsvariabel age med värdet 30.
//        En flyttalsvariabel height med värdet 1.75.
//        En char-variabel initial med värdet 'A'.
//        En strängvariabel name med värdet "Alice".
//        En boolean-variabel isStudent med värdet true.

        int age = 30;
        double height = 1.75;
        char initial = 'A';
        String name = "Alice";
        boolean isStudent = true;


//        Uppgift 1.2:
//        Skriv ut alla variabler och deras typer i konsolen. Använd .getClass().getName() eller instanceof där det är möjligt.

        System.out.println("Min int har värdet "+ age );
        System.out.println("Min double har värdet "+ height );
        System.out.println("Min char har värdet "+ initial );
        System.out.println("Min string har värdet " + name );
        System.out.println("Min bool har värdet "+ isStudent );


        //        Uppgift 2.1:
//        Skapa ett program som beräknar och skriver ut följande:
//
//        Summan av 10 och 20.
//        Skillnaden mellan 100 och 30.
//        Produkten av 5 och 7.
//        Kvoten när 20 delas med 4.
//        Resten när 10 delas med 3.


        int sum = 10 + 20;
        System.out.println("Summan av 10 och 20 är " + sum);

        int difference = 100 - 30;
        System.out.println("Skillnaden mellan 100 och 30 är " + difference);

        int product = 5 * 7;
        System.out.println("Produkten av 5 och 7 är " + product);

        int kvot = 20 / 4;
        System.out.println("Kvoten när 20 delas med 4 är " + kvot);

        int rest = 10 % 3;
        System.out.println("Resten när 10 delas med 3 är " + rest);

    }}
