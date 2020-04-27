package algorithms.implementation;

public class DivisibleSumPairs {
    static int divisibleSumPairs(int n, int k, int[] ar) {

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i>j && (ar[i]+ar[j])%k==0) count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,2,6,1,2};
        System.out.println(divisibleSumPairs(6,3,arr));
    }
}
