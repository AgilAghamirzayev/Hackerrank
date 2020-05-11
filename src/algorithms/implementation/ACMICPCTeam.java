package algorithms.implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ACMICPCTeam {

    static int[] acmTeam(String[] topic) {

        int count = 0;
        List<Integer> counts = new ArrayList<>();
        for (int i = 0; i < topic.length; i++) {
            for (int j = i + 1; j < topic.length; j++) {
                for (int k = 0; k < topic[i].length(); k++) {
                    if (topic[i].charAt(k) == '1' || topic[j].charAt(k) == '1') count++;
                }
                counts.add(count);
                count = 0;
            }
        }

        int maxT = counts.stream().max((a, b) -> a - b).orElseThrow(RuntimeException::new);
        int maxG = (int) counts.stream().filter(n -> n == maxT).count();

        return new int[]{maxT, maxG};
    }

    public static void main(String[] args) {
        String[] ar = new String[]{
                "10101",
                "11100",
                "11010",
                "00101"
        };

        System.out.println(Arrays.toString(acmTeam(ar)));
    }
}
