package algorithms.implementation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.stream.IntStream;

public class EmaSupercomputer {

    private final static int FREE = 0;
    private final static int OCCUPIED = 1;
    private final static int BUSY = 9;

    static int[][] convert(String[] grid) {
        int dimY = grid.length;
        int dimX = grid[0].length();
        int[][] data = new int[dimY][dimX];

        IntStream.range(0, dimY).forEach(y ->
                IntStream.range(0, dimX).forEach(x ->
                        data[y][x] = grid[y].charAt(x) == 'G' ? FREE : BUSY));

        return data;
    }

    static boolean isFreeHorAt(int x, int y, int len, int[][] data) {
        return IntStream.range(0, len).allMatch(i -> data[y][x + i] == FREE);
    }

    static boolean isFreeVerAt(int x, int y, int len, int[][] data) {
        return IntStream.range(0, len).allMatch(i -> data[y + i][x] == FREE);
    }

    static boolean isPossibleAt(int x, int y, int size, int[][] data) {
        return isFreeHorAt(x, y + size / 2, size, data)
                && isFreeVerAt(x + size / 2, y, size, data);
    }

    static void occupyHorAt(int x, int y, int len, int[][] data) {
        IntStream.range(0, len).forEach(i -> data[y][x + i] = OCCUPIED);
    }

    static void occupyVerAt(int x, int y, int len, int[][] data) {
        IntStream.range(0, len).forEach(i -> data[y + i][x] = OCCUPIED);
    }

    static void occupyAt(int x, int y, int size, int[][] data) {
        occupyHorAt(x, y + size / 2, size, data);
        occupyVerAt(x + size / 2, y, size, data);
    }

    static void releaseHorAt(int x, int y, int len, int[][] data) {
        IntStream.range(0, len).forEach(i -> data[y][x + i] = FREE);
    }

    static void releaseVerAt(int x, int y, int len, int[][] data) {
        IntStream.range(0, len).forEach(i -> data[y + i][x] = FREE);
    }

    static void releaseAt(int x, int y, int size, int[][] data) {
        releaseHorAt(x, y + size / 2, size, data);
        releaseVerAt(x + size / 2, y, size, data);
    }

    static class PlusesAt {
        final int x1;
        final int y1;
        final int x2;
        final int y2;
        final int size1;
        final int size2;

        PlusesAt(int x1, int y1, int x2, int y2, int size1, int size2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
            this.size1 = size1;
            this.size2 = size2;
        }
    }

    static class PlusesRes {
        public final int size1;
        public final int size2;
        public final boolean fit;

        PlusesRes(int size1, int size2, boolean fit) {
            this.size1 = size1;
            this.size2 = size2;
            this.fit = fit;
        }

        public static PlusesRes yes(int size1, int size2) {
            return new PlusesRes(size1, size2, true);
        }

        public static PlusesRes no(int size1, int size2) {
            return new PlusesRes(size1, size2, false);
        }
    }

    static PlusesRes tryToFit(PlusesAt ps, int[][] data) {
        if (isPossibleAt(ps.x1, ps.y1, ps.size1, data)) {
            occupyAt(ps.x1, ps.y1, ps.size1, data);
            if (isPossibleAt(ps.x2, ps.y2, ps.size2, data)) {
                releaseAt(ps.x1, ps.y1, ps.size1, data);
                return PlusesRes.yes(ps.size1, ps.size2);
            }
            releaseAt(ps.x1, ps.y1, ps.size1, data);
        }
        return PlusesRes.no(ps.size1, ps.size2);
    }

    static int area(PlusesRes pr) {
        int s1 = pr.size1 * 2 - 1;
        int s2 = pr.size2 * 2 - 1;
        return s1 * s2;
    }

    static int twoPluses(String[] grid) {
        final int[][] data = convert(grid);
        int w = data[0].length;
        int h = data.length;
        int max_w = (w & 1) == 0 ? w - 1 : w;
        int max_h = (h & 1) == 0 ? h - 1 : h;
        int max_size = Math.min(max_h, max_w);

        return IntStream.rangeClosed(1, max_size)
                .filter(s -> (s & 1) != 0)
                .map(x -> max_size + 1 - x)
                .boxed().flatMap(size1 ->
                        IntStream.rangeClosed(1, max_size)
                                .filter(s -> (s & 1) != 0)
                                .map(x -> max_size + 1 - x)
                                .boxed().flatMap(size2 ->
                                IntStream.rangeClosed(0, w - size1).boxed().flatMap(x1 ->
                                        IntStream.rangeClosed(0, h - size1).boxed().flatMap(y1 ->
                                                IntStream.rangeClosed(0, w - size2).boxed().flatMap(x2 ->
                                                        IntStream.rangeClosed(0, h - size2).boxed().map(y2 ->
                                                                new PlusesAt(x1, y1, x2, y2, size1, size2)
                                                        )
                                                )
                                        )
                                ))
                ).map(ps -> tryToFit(ps, data))
                .filter(pr -> pr.fit)
                .mapToInt(EmaSupercomputer::area)
                .max()
                .orElseThrow(RuntimeException::new);
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("file.txt"));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        String[] grid = new String[n];

        for (int i = 0; i < n; i++) {
            String gridItem = scanner.nextLine();
            grid[i] = gridItem;
        }

        int result = twoPluses(grid);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
