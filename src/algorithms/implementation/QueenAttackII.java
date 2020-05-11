package algorithms.implementation;

public class QueenAttackII {
    static int queensAttack(int n, int k, int r_q, int c_q, int[][] obstacles) {

        int[][] chessboard = new int[n][n];
        int r = r_q - 1;
        int c = c_q - 1;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (r - j >= 0 && c +  j < n ) chessboard[r - j][c + j] = 1;
                if (r - j >= 0 && c - j >= 0 ) chessboard[r - j][c - j] = 1;
                if (r + j < n  && c - j >= 0 ) chessboard[r + j][c - j] = 1;
                if (r + j < n  && c +  j < n ) chessboard[r + j][c + j] = 1;
                if (r == i || c == j) chessboard[i][j] = 1;
                   chessboard[r][c] = 9;
                System.out.print(" "+ chessboard[i][j]);

            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (chessboard[i][j] == 1) count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(queensAttack(4,0,4,4,null));
        //System.out.println(queensAttack(5, 3, 4, 3, new int[][]{{5, 5}, {4, 2}, {2, 3}}));
        //System.out.println(queensAttack(1,0,1,1,null));
    }
}
