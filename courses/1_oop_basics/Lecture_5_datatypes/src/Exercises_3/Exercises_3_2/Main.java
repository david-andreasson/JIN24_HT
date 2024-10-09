package Exercises_3.Exercises_3_2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        int index = linearSearch(numbers, 20);
        System.out.println("Index of 20: " + index);
    }

        public static int linearSearch (List < Integer > list,int key){
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) == key) {
                    return i;
                }
            }
            return -1;
        }

    }

