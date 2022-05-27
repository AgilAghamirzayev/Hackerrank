package algorithms;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;


public class UnexpectedDemand {
    public static void main(String[] args) {

    }

    public static int filledOrders(List<Integer> order, int k) {

        int widget = k;
        int count = 0;
        List<Integer> collect = order.stream().sorted().collect(Collectors.toList());
        for (Integer o : collect) {
            if (o <= widget) {
                count++;
                widget -= o;
            }
        }

        return count;
    }

    public static int filledfgvfdOrders(List<Integer> order, int k) {

        int widget = k;
        int count = 0;
        List<Integer> collect = order.stream().sorted().collect(Collectors.toList());
        for (Integer o : collect) {
            if (o <= widget) {
                count++;
                widget -= o;
            }
        }

        return count;
    }
}
