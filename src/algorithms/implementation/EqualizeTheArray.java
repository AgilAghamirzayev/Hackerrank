package algorithms.implementation;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.stream.Collectors;

public class EqualizeTheArray {

    static int equalizeArray1(int[] arr) {
        HashMap<Integer,Integer> count = new HashMap<>();

        for (int value : arr) {
            if (!count.containsKey(value)) count.put(value,1);
            else count.put(value, count.get(value)+1);
        }

        return arr.length - count.values()
                .stream()
                .max(Comparator.comparingInt(i->i))
                .orElseThrow(RuntimeException::new);
    }
    static int equalizeArray(int[] arr) {



       return (int) (arr.length - Arrays.stream(arr)
               .boxed()
               .collect(Collectors.groupingBy(i->i,Collectors.counting()))
               .values()
               .stream()
               .max(Comparator.comparingLong(i->i))
               .orElseThrow(RuntimeException::new));

    }

    public static void main(String[] args) {
        System.out.println(equalizeArray(new int[]{3,3,2,1,3}));
    }
}
