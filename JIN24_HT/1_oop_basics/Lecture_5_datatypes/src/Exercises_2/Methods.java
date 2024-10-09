package Exercises_2;

import java.util.List;

public class Methods {

    public void findMax(List<Integer> numbers){
        int max =0;
        for (Integer number : numbers) {
            if (number > max){
                max = number;
            }
        }
        System.out.println(max);
    }

    public void findMin(List<Integer> numbers) {
        int min =1000;
        for (Integer number : numbers) {
            if (number < min){
                min = number;
            }
        }
        System.out.println(min);
    }

}
