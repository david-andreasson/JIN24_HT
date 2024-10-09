package Exercises_2.md;


public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "Ben Tilly", 1500, "fact");
        book1.info();
        book1.readtime();
        System.out.println(book1.isInGenre("fact"));

        Book book2 = new Book("Blues", "Jim Bean", 3000, "music");
        book2.info();
        book2.readtime();
        System.out.println(book2.isInGenre("fact"));

        Book book3 = new Book("Fiske", "David Crowe", 450, "fact");
        book3.info();
        book3.readtime();
        System.out.println(book3.isInGenre("fact"));

        book1.morePages(book2);
    }
}

