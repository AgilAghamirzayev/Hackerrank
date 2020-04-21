package java_.bigNumber;

import java.math.BigInteger;

public class ChesseProblem {
    public static void main(String[] args) {
        BigInteger b = new BigInteger("2");
        for (int i = 0; i < 4; i++) {
            b=b.multiply(b);
        }

        System.out.println(b);
    }
}
