package algorithms.implementation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppendAndDelete {
    static String appendAndDelete(String s, String t, int k) {

        int diff = 0;

        if (s.length()>t.length()){
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != t.charAt(i)) diff++;
            }
        } else {
            for (int i = 0; i < t.length(); i++) {
                if (t.charAt(i) != s.charAt(i)) diff++;
            }
        }


        return "A";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("file.txt"));

        String s = scanner.nextLine();

        String t = scanner.nextLine();

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = appendAndDelete(s, t, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
