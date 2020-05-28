package algorithms.string;

import java.util.stream.IntStream;

public class AlternatingCharacters {

    static int alternatingCharacters(String s) {

        return (int) IntStream.range(1, s.length())
                .filter(i -> s.charAt(i - 1) == s.charAt(i))
                .count();

    }

    public static void main(String[] args) {
        System.out.println(alternatingCharacters("AAAA"));
        System.out.println(alternatingCharacters("BBBBB"));
        System.out.println(alternatingCharacters("ABABABAB"));
        System.out.println(alternatingCharacters("AAABBB"));
    }
}
