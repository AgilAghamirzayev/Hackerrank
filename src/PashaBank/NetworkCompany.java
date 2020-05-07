package PashaBank;

import java.util.Arrays;
import java.util.List;

public class NetworkCompany {
    public static int maximumNetworks(List<Integer> speed, int minComps, long speedThreshold) {
        // Write your code here
        Integer sum = speed.stream().reduce(0,Integer::sum);
        if (speedThreshold > sum)  return 0;
        return 0;

    }

    public static void main(String[] args) {
        maximumNetworks(Arrays.asList(5,7,9,12,10,13),2,15);
        maximumNetworks(Arrays.asList(3,3,2,5,3,2,4),2,7);
    }
}
