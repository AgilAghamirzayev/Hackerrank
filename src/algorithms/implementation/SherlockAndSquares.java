package algorithms.implementation;

import java.util.function.BiFunction;

public class SherlockAndSquares {

    static BiFunction<Integer, Integer, Integer> function =
            (a, b) -> (int)Math.sqrt(b)-(int)Math.sqrt(a);

    static int squares(int a, int b) {
        return function.apply(a-1,b);
    }

    public static void main(String[] args) {
        System.out.println(squares(3, 9));
        System.out.println(squares(17, 24));
        System.out.println(squares(35,70));
        System.out.println(squares(100,1000)); //22

    }
}
