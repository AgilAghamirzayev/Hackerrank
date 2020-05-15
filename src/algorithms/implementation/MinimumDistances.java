package algorithms.implementation;

import java.util.stream.IntStream;

public class MinimumDistances {
//    static int minimumDistances(int[] a) {
//
//        HashMap<Integer, Integer> map = new HashMap<>();
//        int index = 0;
//        int[] arr = new int[2];
//
//        for (int value : a) {
//            if (!map.containsKey(value)) map.put(value, 1);
//            else map.put(value, map.get(value) + 1);
//        }
//
//        final List<Integer> collect = map.keySet().stream().filter(i -> map.get(i) == 2).collect(Collectors.toList());
//        int[] dis = new int[collect.size()];
//        if (collect.size() == 0) return -1;
//
//        for (int i = 0; i < collect.size(); i++) {
//            for (int j = 0; j < a.length; j++) {
//                if (collect.get(i) == a[j]) {
//                    arr[index] = j;
//                    index++;
//                }
//            }
//            dis[i] = arr[1] - arr[0];
//            index = 0;
//        }
//
//        return Arrays.stream(dis).min().orElseThrow(RuntimeException::new);
//    }


    static int minimumDistances(int[] a) {
        final int[] min = {a.length};
        int len = a.length;

        IntStream.range(0, len - 1).forEach(i ->
                IntStream.range(i + 1, len).forEach(j -> {
                    if (a[i] == a[j])
                        if (min[0] > (j - i))
                            min[0] = j - i;
                }));

        return min[0] == len ? -1 : min[0];
    }


    public static void main(String[] args) {
        final int[] ints = {7, 1, 3, 4, 1, 7};
        System.out.println(minimumDistances(ints));
    }
}
