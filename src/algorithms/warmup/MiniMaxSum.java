package algorithms.warmup;

import java.util.Scanner;

public class MiniMaxSum {
    static void miniMaxSum(int[] arr){
        long MAX = Long.MAX_VALUE;
        long MIN = Long.MIN_VALUE;
        long maxSum = 0;
        long minSum = 0;

        for (int i = 0; i < 5 ; i++) {
            if (MAX > arr[i]) MAX = arr[i];
            maxSum += arr[i];
        }

        for (int i = 0; i < 5; i++) {
            if (MIN<arr[i]) MIN = arr[i];
            minSum +=  arr[i];
        }

        System.out.printf("%d %d",minSum-MIN, maxSum-MAX);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);
        scanner.close();
    }
}
