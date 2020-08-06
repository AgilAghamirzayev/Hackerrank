package algorithms.string;

public class SuperReducedString {
    static String superReducedString(String s) {

        String result = s;

        for (int i = 1; i < result.length(); i++) {
                if (result.charAt(i) == result.charAt(i-1)) {
                    result = result.substring(0,i-1) + result.substring(i+1);
                    i=0;
                }
        }

        return result.length() == 0 ? "Empty String" : result;
    }

    public static void main(String[] args) {
        System.out.println(superReducedString("aaabccddd"));
        System.out.println(superReducedString("aa"));
    }
}
