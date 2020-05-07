package PashaBank;

import java.util.Arrays;
import java.util.List;

public class GapsInTraffic {

    public static int widestGap(int n, List<Integer> start, List<Integer> finish) {

        int[] arr = new int[n];

        for (int i = 0; i < n ; i++) {
            arr[i] = i+1;
        }



        return 2;
    }

    public static void main(String[] args) {

        System.out.println(widestGap(10, Arrays.asList(3, 8), Arrays.asList(4, 9)));
        System.out.println(widestGap(10, Arrays.asList(1, 2, 6, 6), Arrays.asList(4, 4, 10, 8)));
    }
}
