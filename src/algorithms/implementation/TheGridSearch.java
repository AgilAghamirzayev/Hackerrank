package algorithms.implementation;

import java.util.Arrays;
import java.util.List;

public class TheGridSearch {

    private static final String YES = "YES";
    private static final String NO = "NO";

    public static String gridSearch(List<String> G, List<String> P) {

        int rowSizeOfG = G.size();
        int rowSizeOfP = P.size();
        int columnSizeOfG = G.get(0).length();
        int columnSizeOfP = P.get(0).length();

        for (int i = 0; i < rowSizeOfG - rowSizeOfP + 1; i++) {
            for (int j = 0; j < columnSizeOfG - columnSizeOfP + 1; j++) {
                boolean found = true;
                for (int k = 0; k < rowSizeOfP; k++) {
                    for (int l = 0; l < columnSizeOfP; l++) {
                        if (G.get(i + k).charAt(j + l) != P.get(k).charAt(l)) {
                            found = false;
                            break;
                        }
                    }
                }
                if (found) return YES;
            }
        }

        return NO;
    }

    public static void main(String[] args) {
        List<String> G = Arrays.asList(
                "1234567890",
                "0987654321",
                "1111111111",
                "1111111111",
                "2222222222"
        );

        List<String> P = Arrays.asList(
                "876543",
                "111111",
                "111111"
        );

        System.out.println(gridSearch(G, P));
    }

}
