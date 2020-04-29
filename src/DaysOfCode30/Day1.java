package DaysOfCode30;

import java.util.Scanner;

public class Day1 {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        double b = scan.nextDouble();
        scan.nextLine();
        String text = scan.nextLine();

        System.out.println(i+a);
        System.out.println(d+b);
        System.out.printf("%s %s",s,text);

        scan.close();
    }
}
