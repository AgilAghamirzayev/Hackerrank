package InterviewPreparationKit.warmUp;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CountingValleys {
    static int countingValleys(int n, String s) {

        int count = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            
            if (s.charAt(i) == 'U'){
                count++;
                if (count >= 1){
                    i++;
                    if (s.charAt(i) == 'D') count--;
                    else count++;
                    continue;
                }
            }

            if (count==0) sum++;

        }

        return sum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("file.txt"));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
