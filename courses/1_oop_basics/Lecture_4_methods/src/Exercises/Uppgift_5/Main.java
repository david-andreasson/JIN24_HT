package Exercises.Uppgift_5;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Blues","Jimmy Keegan", 29.95);
        Book book2 = new Book("Pills","Ernest Duug", 29.95);
        Book book3 = new Book("Jams","Cameron Smacky", 29.95);

        System.out.println(book1.displayBookInfo());
        System.out.println(book1.displayBookInfoWithDiscount(10));

        System.out.println(book2.displayBookInfo());
        System.out.println(book2.displayBookInfoWithDiscount(20));

        System.out.println(book3.displayBookInfo());
        System.out.println(book3.displayBookInfoWithDiscount(5.50));

    }
}
