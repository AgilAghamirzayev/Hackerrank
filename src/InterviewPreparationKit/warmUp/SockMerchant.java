package InterviewPreparationKit.warmUp;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SockMerchant {
    static int sockMerchant(int n, int[] ar) {

        // Solution 1
//        Set<Integer> set = new HashSet<>();
//        int count = 0;
//        for (int i = 0; i < n; i++) {
//            if (set.contains(ar[i])){
//                set.remove(ar[i]);
//                count++;
//            } else {
//                set.add(ar[i]);
//            }
//        }
//        return count;

        // Solution 2
        Set<Integer> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        Arrays.stream(ar).forEach(s->{
            if (set.contains(s)){ set.remove(s); sb.append(0);}
            else set.add(s);
        });
        return sb.toString().length();

//        My solution
//        HashMap<Integer,Integer> map = new HashMap<>();
//        Arrays.stream(ar).forEach(s->map.merge(s,1,Integer::sum));
//        int sum = 0;
//        for (int i: map.values()) {
//            if (i%2 == 0) sum += i/2;
//            else sum += (i-1)/2;
//        }
//        return sum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("file.txt"));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
