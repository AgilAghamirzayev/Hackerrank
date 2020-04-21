package java_.string_;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.IntStream;

public class JavaSubstringComparisons {

    public static String getSmallestAndLargest1(String s, int k) {
        String smallest = "";
        String largest = "";

        SortedSet<String> sets = new TreeSet<>();
        IntStream.rangeClosed(0,s.length()-k).forEach(i -> sets.add(s.substring(i,k+i)));
        smallest = sets.first();
        largest  = sets.last();

        return smallest + "\n" + largest;
    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";


        String[] arr = new String[s.length()-k+1];

        for(int i=0; i<s.length()-k+1; i++){
            arr[i] = s.substring(i,k+i);
        }

        smallest = arr[0];
        largest  = arr[0];

        for(int i=0; i<s.length()-k+1; i++){
            if(arr[i].compareTo(smallest) < 0) smallest = arr[i];
            if(arr[i].compareTo(largest ) > 0) largest  = arr[i];
        }

        return smallest + "\n" + largest;
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest1(s, k));
    }
}
