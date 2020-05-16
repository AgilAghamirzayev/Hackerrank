package algorithms.implementation;

import java.util.Arrays;

public class CircularArrayRotation {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int len = a.length;
        int l = k % len;
        int[] res = new int[queries.length];


        for (int i = 0; i < l; i++) {
            int j, last;
            last = a[len-1];
            for (j = len - 1; j > 0; j--) {
                a[j] = a[j-1];
            }
            a[0] = last;
        }

        for (int i = 0; i < queries.length; i++) {
            res[i] = a[queries[i]];
        }

        return res;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(circularArrayRotation(new int[]{1, 2, 3}, 2, new int[]{0, 1, 2})));
    }
}
