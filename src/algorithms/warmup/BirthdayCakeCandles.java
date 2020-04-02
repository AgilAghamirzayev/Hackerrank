package algorithms.warmup;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class BirthdayCakeCandles {

    static int birthdayCakeCandles(int[] ar){
        int x =  Arrays.stream(ar).max().getAsInt();
        return (int) Arrays.stream(ar).filter(s->s==x).count();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("BirthdayCakeCandles.txt"));
        int arrCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[arrCount];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arrCount; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            arr[i] = arItem;
        }

        int result = birthdayCakeCandles(arr);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
        bufferedWriter.close();
        scanner.close();
    }


}
