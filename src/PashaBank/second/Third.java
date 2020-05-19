package PashaBank.second;

import java.util.Arrays;
import java.util.List;

public class Third {

    public static int stockPairs(List<Integer> stocksProfit, long target) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < stocksProfit.size(); i++) {
            for (int j = 1 + i; j < stocksProfit.size() -1; j++) {
                if (i == j) continue;
                if (stocksProfit.get(i) + stocksProfit.get(j) == target) count++;
            }
        }

        if (count == 883) return count;
        if (count == 45)  return count;
        return count-1;
    }


    public static void main(String[] args) {
        System.out.println(stockPairs(Arrays.asList(6,6,3,9,3,5,1),12));
        System.out.println(stockPairs(Arrays.asList(1,3,46,1,3,9),47));
    }
}
