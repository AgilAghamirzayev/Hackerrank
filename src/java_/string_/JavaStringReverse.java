package java_.string_;

import java.util.Scanner;
import java.util.stream.IntStream;

public class JavaStringReverse {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String[] a = new String[1];
        IntStream.range(0,A.length()).forEach(i -> a[0]=(A.charAt(i) == A.charAt(A.length()-i-1)) ? "Yes" : "No");
        System.out.println(a[0]);
    }

}
