package algorithms.implementation;

import java.util.Arrays;
import java.util.List;

public class BonAppétit {

    static void bonAppetit(List<Integer> bill, int k, int b) {

        int sum = bill.stream().mapToInt(Integer::intValue).sum();
        int b_actual = (sum-bill.get(k)) / 2;
        System.out.println(b_actual == b ? "Bon Appetit" : b-b_actual);

    }

    public static void main(String[] args) {
        bonAppetit(Arrays.asList(3, 10, 2, 9), 1, 12);
        bonAppetit(Arrays.asList(3, 10, 2, 9), 1, 7);

    }
}
