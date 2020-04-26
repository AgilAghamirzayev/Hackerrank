package dataStructure.arrays;

import java.util.Scanner;

public class Java1dArraysPart2 {

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        boolean flag = true;

        int i = 0;

        while (i <= game.length) {
            if (i+leap >= game.length || i + 1 >= game.length) break;
            if (game[i + 1] == 0){ i = i + 1;  continue;}
            if (game[i + leap] == 0){ i = i + leap;  continue;}
            if (i != 0 && game[i - 1] == 0){
                i = i-1;
                if (game[i + leap] == 0){ i = i + leap; continue;}
                else {flag = false; break;}
            }
            flag = false;
            break;
        }
        return flag;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println((canWin(leap, game)) ? "YES" : "NO");
        }
        scan.close();
    }

}
