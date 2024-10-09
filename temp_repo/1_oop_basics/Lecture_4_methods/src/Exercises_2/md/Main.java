package Exercises_2.md;

public class Main {
    public static void main(String[] args) {
//Student student = new Student();
//student.setName("James");
//student.setAge(23);
//student.setGrade('B');
//System.out.println(student.getName() +" "+ student.getAge() +" "+ student.getGrade());


        Ebook ebook = new Ebook();
        ebook.setTitle("Where eagles dare");
        ebook.setAuthor("Glenn Danzig");
        ebook.setPubYear(1986);

        System.out.println(ebook.getTitle());
        System.out.println(ebook.getAuthor());
        System.out.println(ebook.getYearPublished());


    }
}
