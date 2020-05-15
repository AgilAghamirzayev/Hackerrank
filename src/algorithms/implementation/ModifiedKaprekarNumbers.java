package algorithms.implementation;

import java.io.PrintStream;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class ModifiedKaprekarNumbers {


    static void kaprekarNumbers(int p, int q) {

        final PrintStream out = System.out;
        AtomicInteger count = new AtomicInteger();

        IntStream.rangeClosed(p,q).forEach( i -> {
            BigInteger bi = BigInteger.valueOf(i);
            final BigInteger pow = bi.pow(2);
            final int length = bi.toString().length();
            final BigInteger pow1 = BigInteger.TEN.pow(length);
            if (pow.divide(pow1).add(pow.remainder(pow1)).equals(bi)){
                out.printf("%s ", i);
                count.getAndIncrement();
            }
        });

        if (count.get() == 0) out.print("INVALID RANGE");
    }

//    static void kaprekarNumbers(int p, int q) {
//
//        String s;
//        String d;
//        long len;
//        long num;
//        long  rem;
//        long a_rem;
//        int count = 0;
//
//        final PrintStream out = System.out;
//
//        for (long i = p; i <= q ; i++) {
//                d = String.valueOf(i);
//                s = String.valueOf(i * i);
//                len = d.length();
//                num = (int) Math.pow(10, len);
//                rem = Long.parseLong(s) % num;
//                a_rem = Long.parseLong(s) / num;
//                if (rem + a_rem == i){
//                    out.printf("%d ", i);
//                    count++;
//                }
//        }
//
//
//        if (count == 0) out.print("INVALID RANGE");
//
//    }

    public static void main(String[] args) {
//        kaprekarNumbers(1,100);
//        kaprekarNumbers(100,300);
//        kaprekarNumbers(400,700);
        kaprekarNumbers(1,99999);
    }
}
