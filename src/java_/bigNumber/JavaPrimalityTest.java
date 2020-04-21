package java_.bigNumber;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaPrimalityTest {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        BigInteger n = scanner.nextBigInteger();
        String isPrime = n.isProbablePrime(n.bitCount()) ? "prime" : "not prime";
        System.out.println(n.bitCount());
        System.out.println(isPrime);
        scanner.close();
    }
}
