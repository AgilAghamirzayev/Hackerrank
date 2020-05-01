package InterviewPreparationKit.warmUp;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class JumpOnTheClouds {

    static int jumpingOnClouds(int[] c) {

        int a = 0;

        for (int i = 0; i < c.length - 1; i++) {
            int next = i + 1;
            if (c[i] == 0 && c[next] == 0) {
                a++;
                i++;
            } else if (c[i] == 0 && c[next] == 1) {
                a++;
                i++;
            } else if (c[i] == 1 && c[next] == 0) {
                a++;
            }
        }
        return a;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("file.txt"));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
        bufferedWriter.close();
        scanner.close();


    }
}
