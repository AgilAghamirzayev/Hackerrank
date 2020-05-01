package algorithms.implementation;

import java.util.Arrays;
import java.util.List;

public class PickingNumbers {
    public static int pickingNumbers(List<Integer> a) {
        return 2;
    }

    public static void main(String[] args) {
        System.out.println(pickingNumbers(Arrays.asList(4, 6, 5, 3, 3, 1))); // 4,3,3
        System.out.println(pickingNumbers(Arrays.asList(1, 2, 2, 3, 1, 2)));
        System.out.println(pickingNumbers(Arrays.asList(4,
                2, 3, 4 , 4 ,9, 98,
                98 ,
                3 ,3 ,
                3 ,4,
                2 ,
                98 ,
                1 ,98,
                98 ,1 , 1 ,4 ,98, 2 ,98, 3 ,
                9 ,9 ,3 ,1 ,
                4, 1, 98, 9 ,
                9 ,2, 9, 4, 2 ,2, 9, 98, 4 ,98, 1 ,
                3 ,4, 9, 1 ,98, 98, 4 ,2, 3, 98 ,98, 1, 99, 9 ,98, 98, 3 ,98, 98, 4 ,98 ,2 ,98, 4 ,2 ,1, 1 ,9, 2, 4)));
    }
}
