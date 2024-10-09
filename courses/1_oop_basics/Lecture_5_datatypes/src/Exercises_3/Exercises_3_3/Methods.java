package Exercises_3.Exercises_3_3;

import java.util.List;

public class Methods {
    public void printList(List<String> list) {
        System.out.println("Printing List " + list);
    }

    public void modifyList(List<String> list, int index, String value) {
        list.set(index, value);
    }

}
