package algorithms.implementation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GradingStudents {

    private static int adjust(int g) {
        return g < 38 ? g : g % 5 > 2 ? (g / 5 + 1) * 5 : g;
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        return grades.stream().map(GradingStudents::adjust).collect(Collectors.toList());
    }


    public static void main(String[] args) {
        System.out.println(gradingStudents(Arrays.asList(73, 67, 38, 33)));
        System.out.println(gradingStudents(Arrays.asList(
                80, 96, 18, 73, 78, 60, 60, 15, 45, 15, 10, 5, 46, 87, 33, 60, 14, 71
        )));
    }

}
