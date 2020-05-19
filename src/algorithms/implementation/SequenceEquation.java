package algorithms.implementation;

import java.util.Arrays;

public class SequenceEquation {

//    static int[] permutationEquation(int[] p) {
//        int len = p.length;
//        int[] pp = new int[len];
//        int[] ppp = new int[len];
//
//
//        for (int i = 0; i < len; i++)
//            for (int j = 0; j < len; j++)
//                if (p[j] == i + 1) pp[i] = j + 1;
//
//        for (int i = 0; i < len; i++)
//            for (int j = 0; j < len; j++)
//                if (pp[i] == p[j]) ppp[i] = j + 1;
//
//        return ppp;
//    }


    static int[] permutationEquation(int[] p) {
        int[] q = new int[p.length];
        Arrays.stream(p).forEach(i -> q[p[p[i-1]-1]-1] = i);
        return q;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(permutationEquation(new int[]{5, 2, 1, 3, 4})));
        System.out.println(Arrays.toString(permutationEquation(new int[]{2, 3, 1})));
        System.out.println(Arrays.toString(permutationEquation(new int[]{4, 3, 5, 1, 2})));
    }
}
