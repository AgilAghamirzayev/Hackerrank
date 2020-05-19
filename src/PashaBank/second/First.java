package PashaBank.second;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class First {

    public static int getHeight(List<Integer> arr) {

        int size = arr.size();
        int max = arr.stream().max(Comparator.comparingInt(a -> a)).orElseThrow(RuntimeException::new);
        return Math.min(max, size);
    }

    public static void main(String[] args) {
        System.out.println(getHeight(new LinkedList<>(Arrays.asList(3,2,3,5))));
        System.out.println(getHeight(new LinkedList<>(Arrays.asList(1,3,2,2))));
    }


}
