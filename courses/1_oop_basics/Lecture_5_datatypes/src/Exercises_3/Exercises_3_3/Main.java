package Exercises_3.Exercises_3_3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        Methods methods = new Methods();
        methods.printList(list);
        methods.modifyList(list, 2, "X");
        methods.printList(list);
    }
}
