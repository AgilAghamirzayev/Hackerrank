package algorithms.string;

public class SuperReducedString {
    static String superReducedString(String s) {

        String ss = null;

        for (int i = 0; i < s.length()-1; i++) {
            for (int j = 1; j < s.length(); j++) {
                if (s.charAt(i) != s.charAt(j)) ss = String.format("%s%s",ss,s.charAt(i));
                j++;
            }

        }

        return ss == null ? "Empty String" : ss.substring(4);
    }

    public static void main(String[] args) {
        System.out.println(superReducedString("aaabccddd"));
        System.out.println(superReducedString("aa"));
    }
}
