package algorithms.implementation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MatrixLayerRotation {
    static void matrixRotation(List<List<Integer>> matrix, int r) {

        int row = matrix.size();
        int col = matrix.get(0).size();

        String collect = IntStream.range(0, row * col).map(i -> {
            int ro = i / row;
            int co = i % col;
            return matrix.get(ro).get(co);
        }).mapToObj(String::valueOf).collect(Collectors.joining(" "));

        System.out.println(collect);
    }

    public static void main(String[] args) {
        matrixRotation(Arrays.asList(
                Arrays.asList(1, 2, 3, 4),
                Arrays.asList(5, 6, 7, 8),
                Arrays.asList(9, 10, 11, 12),
                Arrays.asList(13, 14, 15, 16)
        ), 2);

//
//        matrixRotation(Arrays.asList(
//                Arrays.asList(1, 2, 3, 4),
//                Arrays.asList(7, 8, 9, 10),
//                Arrays.asList(13, 14, 15, 16),
//                Arrays.asList(19, 20, 21, 22),
//                Arrays.asList(25, 26, 27, 28)
//        ), 7);
//
//
//        matrixRotation(Arrays.asList(
//                Arrays.asList(1, 1),
//                Arrays.asList(1, 1)
//        ), 3);
    }


}
