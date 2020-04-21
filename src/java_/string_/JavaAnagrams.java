package java_.string_;

import java.util.Scanner;

public class JavaAnagrams {
    static boolean isAnagram(String a, String b) {

        String x = a.toLowerCase();
        String y = b.toLowerCase();

        int l = x.length();
        if (l!=y.length()) return false;
        char[] as = new char[l];
        char[] bs = new char[l];
        boolean flag = true;

        for (int i = 0; i < l; i++) {
            as[i] = x.charAt(i);
            bs[i] = y.charAt(i);
        }

        java.util.Arrays.sort(as);
        java.util.Arrays.sort(bs);

        for (int i = 0; i < l; i++) {
            if (as[i] != bs[i]) {
                flag = false;
                break;
            }
        }

        return flag;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
