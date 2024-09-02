public class Uppgift_3_1 {
    public static void main(String[] args) {

//        Skriv ett program som använder en for-loop för att skriva ut alla tal mellan 1 och 100 som är delbara med både 3 och 5.

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
