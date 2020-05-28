package algorithms.implementation;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ManasaAndStones {
    static Set<Integer> stonesr(int n, int a, int b, TreeSet<Integer> curr) {
        if (n == 0) return curr;
        return stonesr(n-1,a,b,
                curr.stream().flatMap(x -> Stream.of(x + a, x+b)) .collect(Collectors.toCollection(TreeSet::new)));
    }

    static int[] stones(int n, int a, int b) {
                return stonesr(n - 1, a, b, new TreeSet<Integer>(){{add(0);}})
                        .stream()
                        //.sorted()
                        .mapToInt(x -> x)
                        .toArray();
    }


    public static void main(String[] args) {

        System.out.println(Arrays.toString(stones(3, 1, 2)));
        System.out.println(Arrays.toString(stones(4, 10, 100)));
    }
}
