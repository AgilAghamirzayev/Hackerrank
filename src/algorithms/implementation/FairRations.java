package algorithms.implementation;

import java.util.Arrays;

public class FairRations {

    // Complete the fairRations function below.
    static String fairRations(int[] B) {
        int sum;
        int count = 0;

        sum = Arrays.stream(B).sum();
        if (sum % 2 == 1) return "NO";

        for (int i = 0; i < B.length; i++) {
            if (B[i] % 2 != 0) {
                B[i + 1] = B[i + 1] + 1;
                count += 2;
            }
        }
        return String.valueOf(count);
    }
    public static void main(String[] args) {
        System.out.println(fairRations(new int[]{2, 3, 4, 5, 6}));
        System.out.println(fairRations(new int[]{1,2}));
    }
}
