package algorithms.implementation;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class MigratoryBirds {
    static int migratoryBirds(List<Integer> arr) {

        Map<Integer, Long> types = arr.stream()
                .collect(Collectors.groupingBy(a -> a, Collectors.counting()));

        long max_size = types.values().stream()
                .max(Comparator.comparingLong(a -> a))
                .orElseThrow(RuntimeException::new);

        return types.entrySet().stream()
                .filter(e -> e.getValue() == max_size)
                .map(Map.Entry::getKey)
                .min(Comparator.comparingInt(a -> a))
                .orElseThrow(RuntimeException::new);
    }

    public static void main(String[] args) throws IOException {
        System.out.println(migratoryBirds(Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4)));
    }
}
