package algorithms.implementation;

import java.util.Arrays;
import java.util.List;

public class BirthdayChocolate {
    static int birthday(List<Integer> s, int d, int m) {

        int count = 0;
        int num = 0;

        for (int i = 0; i <= s.size()-m; i++) {
            for (int j = i; j < m+i; j++) {
                count += s.get(j);
            }
            if (count == d) num ++;
            count = 0;
        }

        return num;
    }

    public static void main(String[] args) {
        System.out.println(birthday(Arrays.asList(1,2,1,3,2),3,2));
        System.out.println(birthday(Arrays.asList(4),4,1));
        System.out.println(birthday(Arrays.asList(1,1,1,1,1),3,2));

    }

}
