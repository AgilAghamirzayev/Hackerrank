package algorithms.implementation;

import java.util.Arrays;

public class TheHurdleRace {

    static int hurdleRace(int k, int[] height) {


        return Math.max(
                Arrays.stream(height).max()
                .orElseThrow(RuntimeException::new) - k,0
        );
      // return Math.max(Arrays.stream(height).map( i -> i-k ).max().orElseThrow(RuntimeException::new), 0);

    }


    public static void main(String[] args) {
        System.out.println(hurdleRace(4,new int[]{1,6,3,5,2}));
        System.out.println(hurdleRace(7,new int[]{2,5,4,5,2}));

    }
}
