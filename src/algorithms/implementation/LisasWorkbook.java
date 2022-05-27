package algorithms.implementation;

import java.util.Arrays;
import java.util.List;

public class LisasWorkbook {

    public static int workbook(int n, int k, List<Integer> arr) {
        int specialProblems = 0;
        int pageNumber = 1;

        for (int chapter = 0; chapter < n; chapter++) {
            for (int problem = 1; problem <= arr.get(chapter); problem++) {
                if (problem == pageNumber) specialProblems++;
                if (problem % k == 0 || arr.get(chapter) == problem) pageNumber++;
            }

        }

        return specialProblems;
    }

    public static void main(String[] args) {
        System.out.println(workbook(15, 20, Arrays.asList(1, 8, 19, 15, 2, 29, 3, 2, 25, 2, 19, 26, 17, 33, 22)));
    }
}
