package algorithms.implementation;

import java.io.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class BetweenToSets {

    static class Result {
        public static int gcd(int a, int b){
            if (a==0) return b;
            return gcd(b % a , a);
        }


        static int gcdX(List<Integer> a, int n){
            int result = a.get(0);
            for (int i = 1; i<n; i++)
                result = gcd(a.get(i),result);
            return result;
        }

        public static int getTotalX(List<Integer> a, List<Integer> b) {


            int z=1;
            int y = gcdX(b,b.size());
            for (Integer integer : a) {
                z = z * integer;
            }
            int x = z/gcdX(a,a.size());

            List<Integer> list = IntStream.rangeClosed(a.stream().max(Integer::compareTo).get(),b.stream().max(Integer::compareTo).get()).boxed().collect(Collectors.toList());

            return (int) list.stream().filter(s-> s%x==0 && y%s==0).count();


        }

    }

    public static class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("file.txt"));

            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            int n = Integer.parseInt(firstMultipleInput[0]);

            int m = Integer.parseInt(firstMultipleInput[1]);

            List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

            List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

            int total = Result.getTotalX(arr, brr);

            bufferedWriter.write(String.valueOf(total));
            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();
        }
    }
}
