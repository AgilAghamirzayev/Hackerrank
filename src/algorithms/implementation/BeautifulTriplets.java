package algorithms.implementation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BeautifulTriplets {

    static int beautifulTriplets(int d, int[] arr) {

        HashSet<Integer> set = IntStream.of(arr).boxed()
                .collect(Collectors.toCollection(HashSet::new));

        return (int) Arrays.stream(arr).filter(value ->
                        set.contains(value - d) &&
                        set.contains(value - 2 * d)).count();
    }

    static int beautifulTriplets1(int d, int[] arr) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] - arr[i] != d) continue;
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[k] - arr[j] == d) count++;
                }
            }
        }

        return count;

    }

    public static void main(String[] args) {
        System.out.println(beautifulTriplets(3, new int[]{1, 2, 4, 5, 7, 8, 10}));
    }
}
