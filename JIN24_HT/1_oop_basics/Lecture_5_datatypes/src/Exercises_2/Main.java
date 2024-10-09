package Exercises_2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(200);
        numbers.add(130);
        numbers.add(4);
        numbers.add(50);

//        int summa = 0;
//        for (Integer number : numbers) {
//            summa += number;
//        }
//        System.out.println(summa);

//        Methods methods = new Methods();
//        methods.findMax(numbers);
//        methods.findMin(numbers);

        List<String> strings = new ArrayList<>();
        strings.add("Hello 0");
        strings.add("Hello 1");
        strings.add("Hello 2");
        strings.add("Hello 3");
        strings.add("Hello 4");


        System.out.println(strings);
        strings.remove(3);
        System.out.println(strings);
    }
}
