package algorithms.implementation;

import java.util.Arrays;
import java.util.List;

public class NonDivisibleSubset {

    public static int nonDivisibleSubset(int k, List<Integer> s) {

        int[] subset = new int[k];
        int result = 0;

        s.forEach(integer -> subset [integer % k]++);

        if (k % 2 == 0) result++;

        result += Math.min(subset[0], 1);

        for (int j = 1; j <= k / 2; j++)
            if (j != k - j)
                result += Math.max(subset[j], subset[k - j]);

        return result;
    }

    public static void main(String[] args) {
        System.out.println(nonDivisibleSubset(3, Arrays.asList(1, 7, 2, 4)));
        System.out.println(nonDivisibleSubset(9, Arrays.asList(422346306,
                940894801, 696810740, 862741861, 85835055, 313720373)));
    }
}

