package java_.string_;

import java.util.Scanner;
import java.util.StringTokenizer;

public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        StringTokenizer st = new StringTokenizer(s,("[_\\@!?.', ]"));
        int x = st.countTokens();
        System.out.println(x);
        while(st.hasMoreTokens()) System.out.println(st.nextToken());







        scan.close();

    }}
