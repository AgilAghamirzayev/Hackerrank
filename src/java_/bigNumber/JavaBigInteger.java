package java_.bigNumber;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        BigInteger a = scanner.nextBigInteger();
        BigInteger b = scanner.nextBigInteger();

        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}
