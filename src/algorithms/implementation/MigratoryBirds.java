package algorithms.implementation;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.List;

public class MigratoryBirds {
    static int migratoryBirds(List<Integer> arr) {

        Hashtable<Integer,Integer> table = new Hashtable<>();
        for (int a: arr){
            table.compute(a,(k,v)->(v== null ? 1 : v+1));
        }

        table.values().forEach(System.out::println);

        return table.get(table.values().stream().max(Comparator.comparingInt(a -> a)).orElseThrow(RuntimeException::new));


    }

    public static void main(String[] args) throws IOException {
        System.out.println(migratoryBirds(Arrays.asList(1,4,4,4,5,3)));
    }
}
