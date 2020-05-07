package algorithms.implementation;

import java.util.*;
import java.util.stream.Collectors;

public class ClimbingTheLeaderboard {

    static int [] breakingRecords(int[] scores) {
        int[] twoScore = new int[2];
        final int[] max = {scores[0]};
        final int[] min = {scores[0]};
        Arrays.stream(scores).forEach(x->{
            if(x < min[0]) {
                min[0] = x;
                twoScore[0]++;
            }
            if(x > max[0]) {
                max[0] = x;
                twoScore[1]++;
            }
        });
        return twoScore;
    }

    static int[] climbingLeaderboard(int[] scores, int[] alice) {

        Integer[] ever = Arrays.stream(scores).boxed().distinct().toArray(Integer[]::new);

        int len = alice.length;
        int[] rank = new int[len];

        TreeSet<Integer> ranks = (TreeSet<Integer>) Arrays.stream(scores)
                .boxed()
                .collect(Collectors.toCollection(TreeSet::new))
                .descendingSet();

        for (int i = 0; i < len; i++) {
            ranks.add(alice[i]);
            rank[i] = new LinkedList<>(ranks).indexOf(alice[i])+1;
        }

        return rank;
    }



    public static void main(String[] args) {
//        System.out.println(Arrays.toString(climbingLeaderboard(
//                        new int[]{100,100,50,40,20,10},
//                        new int[]{5,25,50,120})
//                ));

        System.out.println(Arrays.toString(climbingLeaderboard(
                new int[]{100,90,90,80,75,60},
                new int[]{50,65,77,90,102})
        ));
    }

    static int[] climbingLeaderboard1(int[] scores, int[] alice) {
        int len = alice.length;
        List<Integer> distinctScores = Arrays.stream(scores).boxed().distinct().collect(Collectors.toList());
        int count = distinctScores.size()-1;

        int[] rank = new int[len];

        for (int i = 0; i < len; i++){
            for (int distinctScore : distinctScores) {
                if (alice[i] >= distinctScore) count--;
                else {
                    rank[i] = count+2;
                    break;
                }
            }
            if (count<0) rank[i] = count;
        }

        return rank;
    }

    static int[] climbingLeaderboard2(int[] scores, int[] alice) {
        int len = alice.length;
        TreeSet<Integer> distinctScores = new TreeSet<>();
        Arrays.stream(scores).forEach(distinctScores::add);
        int[] rank = new int[len];
        List<Integer> ranks = new ArrayList<>(distinctScores);

        for (int i = 0; i < len; i++) {
            ranks.add(alice[i]);
            Collections.sort(ranks);
            Collections.reverse(ranks);
            rank[i] = ranks.indexOf(alice[i])+1;
        }
        return rank;
    }
}
