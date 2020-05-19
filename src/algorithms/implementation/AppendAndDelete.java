package algorithms.implementation;

public class AppendAndDelete {

    public static final String YES = "Yes";
    public static final String NO = "No";

    static String appendAndDelete(String s, String t, int k) {

        int len_s = s.length();
        int len_t = t.length();
        int last = 0;
        int len = Math.min(len_s, len_t);

        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == t.charAt(i)) last++;
            else break;
        }

        int max = len_s + len_t;
        int min = max - (2 * last);

        return (k >= min) && (((k - min) & 1) != 1) ? YES : k >= max ? YES : NO;
     // return (k >= min)  & (((k - min) & 1) != 1) ? YES : k >= max ? YES : NO;
    }

    public static void main(String[] args) {

        System.out.println(appendAndDelete("hackerhappy", "hackerrank", 9));
        System.out.println(appendAndDelete("ashley", "ash", 2));
        System.out.println(appendAndDelete("aba", "aba", 9));
        System.out.println(appendAndDelete("qwerty", "zxcvbn", 100));
        System.out.println(appendAndDelete("aaaaaaaaaaaa", "aaaaaaa", 7));
    }
}
