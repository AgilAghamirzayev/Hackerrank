package algorithms.warmup;

import java.util.Scanner;

public class PlusMinus {

    static void plusMinus(int[] arr){

        int size = arr.length;
        double minus = 0;
        double plyus = 0;
        double zero = 0;

        for (int value : arr) {
            if (value > 0) plyus++;
            else if (value < 0) minus++;
            else zero++;
        }

        System.out.printf("%f%n", plyus/size);
        System.out.printf("%f%n", minus/size);
        System.out.printf("%f%n", zero/size);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
