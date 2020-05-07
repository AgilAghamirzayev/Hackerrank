package algorithms.implementation;

import java.math.BigInteger;

public class ExtraLongFactorials {
    static void extraLongFactorials(int n) {
        BigInteger factorial = new BigInteger("1");
        for (int i = 1; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println(factorial);
    }

    public static void main(String[] args) {
        extraLongFactorials(25);
    }
}
