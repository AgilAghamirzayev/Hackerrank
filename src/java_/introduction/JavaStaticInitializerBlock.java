package java_.introduction;

import java.util.Scanner;

public class JavaStaticInitializerBlock {

    private static final Scanner scanner = new Scanner(System.in);

    static boolean flag;
    static int B = scanner.nextInt();
    static int H = scanner.nextInt();

    static{
        if(B>0 && H>0) flag = true;
        else {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }


    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }
}
