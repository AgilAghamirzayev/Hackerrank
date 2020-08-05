package algorithms.implementation;

import java.util.Collections;

public class ServiceLane {

    static int[] serviceLane(int n, int[][] cases) {

        for (int i = 0; i < cases.length; i++) {
            for (int j = 0; j < cases[i].length; j++) {
                System.out.println(cases[i][j]);
            }
        }
        return new int[]{};

    }

    public static void main(String[] args) {
        int[] ints = serviceLane(8, new int[][]{{0, 3}, {4, 6}, {6, 7}, {3, 5}, {0, 7}});
        System.out.println(Collections.singletonList(ints));
    }
}
