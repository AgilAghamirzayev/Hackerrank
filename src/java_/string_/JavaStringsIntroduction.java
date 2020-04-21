package java_.string_;

import java.util.Scanner;

public class JavaStringsIntroduction {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        String U_A = A.substring(0,1).toUpperCase() + A.substring(1);
        String U_B = B.substring(0,1).toUpperCase() + B.substring(1);

        String chosen = A.charAt(1)<B.charAt(1) ? "Yes" : "No";

        System.out.println((A+B).length());
        System.out.println(chosen);
        System.out.printf("%s %s",U_A,U_B);


    }
}
