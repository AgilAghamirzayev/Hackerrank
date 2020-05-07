package algorithms.implementation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CompareTheTriplets {
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int[] score = new int[2];

        for (int i = 0; i < a.size(); i++) {
            int cmp = a.get(i).compareTo(b.get(i));
            if (cmp > 0) score[0]++;
            if (cmp < 0) score[1]++;
        }

        return Arrays.stream(score).boxed().collect(Collectors.toList());
    }


    public static void main(String[] args) {
        System.out.println(compareTriplets(Arrays.asList(5, 6, 7), Arrays.asList(3, 6, 10)));
    }

}
