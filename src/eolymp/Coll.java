package eolymp;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Coll {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(4);
        hashSet.add(3);
        hashSet.add(1);
        hashSet.add(5);
        hashSet.add(7);

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(1);
        linkedHashSet.add(4);
        linkedHashSet.add(3);
        linkedHashSet.add(1);
        linkedHashSet.add(5);
        linkedHashSet.add(7);


        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(4);
        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(5);
        treeSet.add(7);

        hashSet.forEach(System.out::print);
        System.out.println();
        linkedHashSet.forEach(System.out::print);
        System.out.println();
        treeSet.forEach(System.out::print);
    }
}
