package algorithms.implementation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BetweenToSets {

    static class Result {

        public static int gcd(int a, int b) {
            if (a == 0) return b;
            return gcd(b % a, a);
        }

        static int gcd(List<Integer> a, int size) {
            int result = a.get(0);
            for (int i = 1; i < size; i++)
                result = gcd(a.get(i), result);
            return result;
        }

        private static int lcm(int a, int b) {
            return a * (b / gcd(a, b));
        }

        private static int lcm(List<Integer> a, int size) {
            int result = a.get(0);
            for (int i = 1; i < size; i++) {
                result = lcm(result, a.get(i));
            }
            return result;
        }

        public static int getTotalX(List<Integer> a, List<Integer> b) {

            int gcd = gcd(b, b.size());
            int lcm = lcm(a, a.size());

            List<Integer> list = IntStream.rangeClosed(
                    a.stream().max(Integer::compareTo).orElseThrow(RuntimeException::new),
                    b.stream().max(Integer::compareTo).orElseThrow(RuntimeException::new))
                    .boxed().collect(Collectors.toList());

            return (int) list.stream().filter(s -> s % lcm == 0 && gcd % s == 0).count();

        }

        public static void main(String[] args) {
            System.out.println(getTotalX(
                    Arrays.asList(3, 9, 6),
                    Arrays.asList(36, 72)));
        }

    }

}
