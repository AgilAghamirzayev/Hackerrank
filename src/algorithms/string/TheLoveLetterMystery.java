package algorithms.string;

public class TheLoveLetterMystery {

    static int theLoveLetterMystery(String s) {

        int len = s.length();
        int count= 0;
        for (int i = 0; i < len/2; i++) {
            int left = s.charAt(i);
            int right = s.charAt(len-1-i);
            if (left != right) {
                int min = Math.min(left,right);
                int max = Math.max(left,right);
                count += max-min;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(theLoveLetterMystery("abc"));
        System.out.println(theLoveLetterMystery("abcba"));
        System.out.println(theLoveLetterMystery("abcd"));
        System.out.println(theLoveLetterMystery("cba"));
    }
}
