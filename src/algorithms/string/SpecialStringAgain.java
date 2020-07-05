package algorithms.string;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SpecialStringAgain {

    static class Pair<A, B>{
        final A a;
        final B b;
        public Pair(A a, B b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public String toString() {
            return String.format("[%s : %s]",a,b);
        }
    }

//    static long substrCount(int n, String s) {
//        long palindromeCount = 0L;
//        long equalCounter = 1L;
//
//        List<Pair<Character, Long>> countList = new ArrayList<>();
//
//        for (int i = 1; i < n; i++) {
//            if (s.charAt(i - 1) == s.charAt(i)) equalCounter++;
//            else {
//                countList.add(new Pair<>(s.charAt(i - 1), equalCounter));
//                equalCounter = 1L;
//            }
//        }
//        countList.add(new Pair<>(s.charAt(n - 1), equalCounter));
//
//        for (Pair<Character, Long> characterLongPair : countList) {
//            palindromeCount += (characterLongPair.b + 1) * characterLongPair.b / 2;
//        }
//
//            for (int i = 1; i < countList.size() - 1; i++) {
//                if (countList.get(i).b == 1 && countList.get(i - 1).a == countList.get(i + 1).a)
//                    palindromeCount += Math.min(countList.get(i - 1).b, countList.get(i + 1).b);
//            }
//
//            return palindromeCount;
//        }

    static List<Pair<Character, Long>> pairList(int n, String s){
        long[] counter={1};
        List<Pair<Character, Long>> pairList = new ArrayList<>();

        IntStream.range(1,n).forEach(idx -> {
            if (s.charAt(idx-1) == s.charAt(idx)) counter[0]++;
            else {
                pairList.add(new Pair<>(s.charAt(idx - 1), counter[0]));
                counter[0] = 1;
            }
        });

        pairList.add(new Pair<>(s.charAt(n-1),counter[0]));

        pairList.forEach(a-> System.out.println(a.toString()));

        return pairList;
    }

    static long substrCount(int n, String s) {
        long palindromeCount;
        long[] counter={1};

        List<Pair<Character, Long>> pairList = new ArrayList<>();

        final Stream<Boolean> booleanStream = IntStream.range(1, n).mapToObj(idx -> {
            if (s.charAt(idx - 1) == s.charAt(idx)) counter[0]++;
            else {
                pairList.add(new Pair<>(s.charAt(idx - 1), counter[0]));
                counter[0] = 1;
            }
            return pairList.add(new Pair<>(s.charAt(n - 1), counter[0]));
        });

        pairList.add(new Pair<>(s.charAt(n-1),counter[0]));

        palindromeCount =
                pairList.stream()
                        .mapToLong(characterAtomicLongPair ->
                                (characterAtomicLongPair.b.intValue() + 1) * characterAtomicLongPair.b.intValue() / 2).sum();

        palindromeCount += IntStream.range(1, pairList.size() - 1)
                .filter(i -> pairList.get(i).b.intValue() == 1 && pairList.get(i - 1).a == pairList.get(i + 1).a)
                .mapToLong(i -> Math.min(pairList.get(i - 1).b.intValue(), pairList.get(i + 1).b.intValue())).sum();

        return palindromeCount;
    }

    public static void main (String[]args){
        System.out.println(substrCount(8, "mnonopoo"));
        System.out.println(substrCount(5, "asasd"));
        System.out.println(substrCount(7, "abcbaba"));
        System.out.println(substrCount(4, "abba"));
        System.out.println(substrCount(10,"aaaaaaaaaa"));
    }
    }
