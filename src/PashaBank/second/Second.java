package PashaBank.second;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Second {

    public static List<Integer> frequencyOfMaxValue(List<Integer> numbers, List<Integer> q) {

        ArrayList<Integer> list = new ArrayList<>(numbers);
        List<Integer> list1 = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            final Integer max = list.stream().max((a, b) -> a - b).orElseThrow(RuntimeException::new);
            final int count = (int) list.stream().filter(a -> a.equals(max)).count();
            list1.add(count);
            list.remove(max);
        }

        return list1;
    }


    public static void main(String[] args) {
        System.out.println(frequencyOfMaxValue(Arrays.asList(2,2,2),Arrays.asList(1,2,3)));
        System.out.println(frequencyOfMaxValue(Arrays.asList(2,1,2),Arrays.asList(1,2,3)));
        System.out.println(frequencyOfMaxValue(Arrays.asList(5,4,5,3,2),Arrays.asList(1,2,3,4,5)));
    }
}
