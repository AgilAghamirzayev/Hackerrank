package algorithms.string;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SherlockAndTheValidString {

    static class Pair<A,B> {
        final A a;
        final B b;

        Pair(A a, B b) {
            this.a = a;
            this.b = b;
        }
    }
    static List<Pair<Long, List<Character>>> prepareData(String s) {

        return s.chars().mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(c -> c,Collectors.counting()))
                .entrySet().stream()
                .collect(Collectors.groupingBy(
                        Map.Entry::getValue,
                        Collectors.mapping(
                                Map.Entry::getKey,
                                Collectors.toList()
                        )
                ))
                .entrySet().stream()
                .sorted((o1,o2)-> Long.compare(o1.getKey(),o2.getKey()))
                .map(e -> new Pair<>(e.getKey(),e.getValue()))
                .collect(Collectors.toList());



//        final Map<Character, Long> collect = s.chars().mapToObj(c -> (char) c)
//                .collect(Collectors.groupingBy(a -> a, Collectors.counting()));
//        final Long[] integers = collect.values().toArray(new Long[0]);
//        final long count = Arrays.stream(integers).filter(i -> !i.equals(integers[0])).count();
//        return count > 1 ? "NO" : "YES";


//        int count = 0;
//        HashMap<Character,Integer> res = new HashMap<>();

//        for (int i = 0; i < s.length(); i++) {
//            if (!res.containsKey(s.charAt(i))) res.put(s.charAt(i),1);
//            else res.put(s.charAt(i),res.get(s.charAt(i))+1);
//        }

//        final Integer[] objects = res.values().toArray(new Integer[0]);
//        int num = objects[0];
//
//        for (Integer object : objects) {
//            if (num != object) count++;
//        }
//
//        return count > 1 ? "NO" :"YES";
    }


    private static String isValid(String s) {
        final List<Pair<Long, List<Character>>> m = prepareData(s);
        boolean solved = solve(m);
        return represent(solved);
    }

    private static boolean solve(List<Pair<Long, List<Character>>> m) {
        if (m.size() == 1) return true;
        if (m.size() > 2) return  false;
        if (m.get(1).a - m.get(0).a == 1 && m.get(1).b.size() == 1) return true;
        if (m.get(0).a == 1 && m.get(0).b.size() == 1) return true;
        return false;
    }

    private static String represent(boolean solution) {
        return solution ? "YES" : "NO";
    }



    public static void main(String[] args) {
        System.out.println(isValid("abcdefghhgfedecba"));
        System.out.println(isValid("aabbccddeefghi"));
        System.out.println(isValid("aabbcd"));
        System.out.println(isValid("abc"));
    }

}
