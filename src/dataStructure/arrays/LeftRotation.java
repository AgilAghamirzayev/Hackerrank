package dataStructure.arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class LeftRotation {

    public static void leftRotation(int[] arr, int r){
        final int n = arr.length;
        int c = r % n;
        int[] rotArr = new int[n];

        IntStream.range(0,n).forEach(i -> rotArr[(i+n-c)%n] = arr[i]);

        Arrays.stream(rotArr).forEach(x->System.out.printf("%d ",x));
    }



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        leftRotation(a,d);
        scanner.close();
    }
}
