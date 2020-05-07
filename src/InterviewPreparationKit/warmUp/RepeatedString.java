package InterviewPreparationKit.warmUp;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RepeatedString {


    private static long repeatedString(String s, long n){

        long length = s.length();
        long rem =n % length;
        long in = n / length;
        long count = 0;
        long count_rm = 0;

        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == 'a') count++;
        }

        for (int i = 0; i < rem; i++) {
            if (s.charAt(i) == 'a') count_rm++;
        }

        return (count_rm+in*count);


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("file.txt"));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
