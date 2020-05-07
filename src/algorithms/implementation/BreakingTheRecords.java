package algorithms.implementation;

import java.util.Arrays;

public class BreakingTheRecords {


    static int[] breakingRecords(int[] scores) {

        final int[] min = {scores[0]};
        final int[] max = {scores[0]};
        int[] twoScore = new int[2];

        Arrays.stream(scores).forEach(score->{
            if (min[0] > score) {
                min[0] = score;
                twoScore[1]++;
            }
            if (max[0] < score) {
                max[0] = score;
                twoScore[0]++;
            }
        });

        return twoScore;
    }

    static int[] breakingRecords1(int[] scores) {

        int min=scores[0];
        int max=scores[0];
        int[] twoScore = new int[2];


        for (int score : scores) {
            if (min > score) {
                min = score;
                twoScore[1]++;
            }
            if (max < score) {
                max = score;
                twoScore[0]++;
            }
        }

        return twoScore;
    }

    public static void main(String[] args) {
        int[] scores = new int[]{10,5,20,20,4,5,2,25,1};
        System.out.println(Arrays.toString(breakingRecords(scores)));

    }
}
