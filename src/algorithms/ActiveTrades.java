package algorithms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ActiveTrades {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("A", "A", "A", "A", "A", "A", "A", "A", "A", "B", "C", "D", "D", "D", "D", "D", "D", "D", "D", "D");
        List<String> strings1 = mostActive(strings);

        System.out.println(strings1);
    }

    public static List<String> mostActive(List<String> customers) {
        int size = customers.size();
        return customers.stream()
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet().stream()
                .filter(nameAndCount -> ((nameAndCount.getValue() * 100) / size >= 5))
                .map(Map.Entry::getKey)
                .sorted()
                .collect(Collectors.toList());
    }
}
