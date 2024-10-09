public class Exercises_2 {
    public static void main(String[] args) {


//        Uppgift 1.1:
//        Skriv ett program som kontrollerar om ett tal är jämnt eller udda. Använd en if-else-sats för att skriva ut ett meddelande om talet är jämnt eller udda.
        int number = 6;
        if (number % 2 == 0) {
            System.out.println(number + " is even");
        }

//        Uppgift 1.2:
//        Skapa ett program som frågar användaren om deras ålder och avgör om de är en minderårig (under 18 år), en vuxen (18-64 år) eller en senior (65 år och äldre).
        int age = 85;
        if (age < 18) {
            System.out.println("User is not an adult");
        } else if (age >= 65) {
            System.out.println("User is an senior");
        } else if (age >= 18 && age < 65) {
            System.out.println("User is an adult");
        }


//        Uppgift 1.3:
//        Skriv ett program som jämför tre tal och bestämmer vilket som är störst.
        int number1 = 230;
        int number2 = 143;
        int number3 = 99;
        if (number1 > number2 && number1 > number3) {
            System.out.println(number1 + " is the greatest number");
        } else if (number2 > number1 && number2 > number3) {
            System.out.println(number2 + " is the greatest number");
        } else {
            System.out.println(number3 + " is the greatest number");
        }


//        Uppgift 2.1:
//        Skriv ett program som tar en månad (som ett heltal från 1 till 12) och skriver ut motsvarande månads namn. Använd en switch-sats.

        int month = 8;
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid month");
                break;

        }
        //        Uppgift 2.2:
//        Skapa ett program som tar en poäng (0-5) och skriver ut motsvarande betyg (A-F) enligt följande skala:
//
//        5: A
//        4: B
//        3: C
//        2: D
//        1: E
//        0: F


        int point = 3;
        switch (point) {
            case 0:
                System.out.println("Grade F");
                break;
            case 1:
                System.out.println("Grade E");
                break;
            case 2:
                System.out.println("Grade D");
                break;
            case 3:
                System.out.println("Grade C");
                break;
            case 4:
                System.out.println("Grade B");
                break;
            case 5:
                System.out.println("Grade A");
                break;
        }

//        Uppgift 2.3:
//        Skriv ett program som tar en vardagsmåltid som inmatning (t.ex. "frukost", "lunch", "middag") och skriver ut en rekommenderad måltid. Använd en switch-sats.
        String meal = "dinner";
        switch (meal) {
            case "breakfast":
                System.out.println("Smoothie Bowl med frukt och chiafrön");
                break;
            case "lunch":
                System.out.println("Vegetarisk falafelwrap med hummus och grönsaker");
                break;
            case "dinner":
                System.out.println("Spaghetti med räkor i vitlökssås");
                break;
            default:
                System.out.println("Invalid meal");
                break;
        }


    }
}

