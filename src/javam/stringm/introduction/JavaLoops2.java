package javam.stringm.introduction;

import java.util.Scanner;
import java.util.stream.IntStream;

public class JavaLoops2 {

    //case 1
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        IntStream.range(0,t).forEach(x->{
            final int[] a = {in.nextInt()};
            int b = in.nextInt();
            int n = in.nextInt();
            IntStream.range(0,n).forEach(y-> {
                a[0] += (int) Math.pow(2, y) * b;
                System.out.printf("%d ", a[0]);
            }
            );
            System.out.println();
        });
        in.close();
    }

    //case 2
    public static void main1(String []args){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for (int j = 0; j < n; j++) {
                a +=(int)Math.pow(2,j)*b;
                System.out.printf("%d ",a);
            }
            System.out.println();
        }
        in.close();
    }
}
