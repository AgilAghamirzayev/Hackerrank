package InterviewPreparationKit.arrays;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.stream.IntStream;

public class LeftRotation {

    static int[] rotLeft(int[] a, int d) {

        //case 1
        final int n = a.length;
        int c = d % n;
        int[] rotArr = new int[n];
        IntStream.range(0,n).forEach(i -> rotArr[(i+n-c)%n] = a[i]);
        return rotArr;

        //case 2
//        final int n = a.length;
//        int c = d % n;
//        int[] rotArr = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            int j = (i+n-c)%n;
//            rotArr[j] = a[i];
//        }
//        return rotArr;


        //case 3
//        final int l = a.length;
//        int first, j;
//
//        for (int i = 0; i < d; i++) {
//            first = a[0];
//            for (j = 0; j <l-1; j++) {
//                a[j] = a[j+1];
//            }
//            a[j] = first;
//        }
//
//        return a;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("file.txt"));

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

        int[] result = rotLeft(a, d);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }

}
