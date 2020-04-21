package java_.introduction;

import java.util.Scanner;

public class JavaEndOfFile {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int i = 0;

        while(scanner.hasNext()){
            i++;
            System.out.printf("%d %s\n",i,scanner.nextLine());
        }

    }
}