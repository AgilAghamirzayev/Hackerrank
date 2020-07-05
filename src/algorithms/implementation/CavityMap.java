package algorithms.implementation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CavityMap {

    static int at(int x, int y, String[] grid) {
        return grid[y].charAt(x);
    }

    static boolean isCavityAt(int x, int y, String[] grid) {
        return x > 0 && y > 0
                && y < grid.length - 1
                && x < grid[y].length() - 1
                && at(x, y, grid) > at(x - 1, y, grid)
                && at(x, y, grid) > at(x, y - 1, grid)
                && at(x, y, grid) > at(x, y + 1, grid)
                && at(x, y, grid) > at(x + 1, y, grid);

    }

    static char solve(int x, int y, String[] grid) {
        return isCavityAt(x, y, grid) ? 'X' : (char) at(x, y, grid);
    }

    static String[] cavityMap(String[] grid) {
        return IntStream.range(0, grid.length).mapToObj(y ->
                IntStream.range(0, grid[y].length())
                        .mapToObj(x -> solve(x, y, grid))
                        .map(String::valueOf)
                        .collect(Collectors.joining())
        ).toArray(String[]::new);
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("file.txt"));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] grid = new String[n];

        for (int i = 0; i < n; i++) {
            String gridItem = scanner.nextLine();
            grid[i] = gridItem;
        }

        String[] result = cavityMap(grid);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(result[i]);

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
