import java.util.Scanner;

public class Uppgift_2_2 {
    public static void main(String[] args) {

//        Skapa ett program som tar en veckodag som input(måndag, tisdag, osv.) och returnerar en plan för den
//        dagen(t.ex." Måndag: Studera Java", "Tisdag: Träna", osv.).

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weekday : ");

        String weekday = sc.nextLine();
        switch (weekday) {
            case "Monday":
                System.out.println("Legs-day");
                break;
            case "Tuesday":
                System.out.println("Cardio");
                break;
            case "Wednesday":
                System.out.println("Push-day");
                break;
            case "Thursday":
                System.out.println("Cardio");
                break;
            case "Friday":
                System.out.println("Pull-day");
                break;
            case "Saturday":
                System.out.println("Cardio");
                break;
            case "Sunday":
                System.out.println("Rest-day");
                break;
            default:
                System.out.println("Wrong input");
        }
//Om du får tid över, utöka denna med kod för stor/liten bokstav

    }
}
