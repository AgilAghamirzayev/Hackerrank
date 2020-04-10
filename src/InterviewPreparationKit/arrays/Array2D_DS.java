package InterviewPreparationKit.arrays;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Array2D_DS {
    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {

        //case 2
        int[] ar = new int[16];
        int j = 0;
        int i = 0;

        for (int k = 0; k < 16; k++) {
            if (k%4==0 && k!=0)i++;
            if (k%4==0 && k!=0)j=0;
            ar[k] = arr[i][j]+arr[i][j+1]+arr[i][j+2]+
                    arr[i+1][j+1] +
                    arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
            j++;
        }

        System.out.print(Arrays.toString(ar));
        return Arrays.stream(ar).max().getAsInt();


//        //case 2
//        int[] ar = new int[16];
//        int a = 0;
//
//
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 4; j++) {
//                ar[a]=arr[i][j]+arr[i][j+1]+arr[i][j+2]+
//                        arr[i+1][j+1] +
//                        arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
//                a++;
//            }
//        }
//
//        return Arrays.stream(ar).max().getAsInt();

    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("file.txt"));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}