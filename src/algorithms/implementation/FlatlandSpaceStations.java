package algorithms.implementation;

import java.util.*;

public class FlatlandSpaceStations {
    static int flatlandSpaceStations(int n, int[] c) {

        if (n == c.length) return  0;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int max = Integer.MAX_VALUE;
            for (int k : c) {
                int distance = Math.abs(i - k);
                if (max > distance) max = distance;
                if (distance == 0) break;
            }
            list.add(max);
        }

        return Collections.max(list);

    }

    public static void main(String[] args) {
        System.out.println(flatlandSpaceStations(5, new int[]{0, 4}));
    }
}
