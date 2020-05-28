package algorithms.string;

public class SpecialStringAgain {


    static long substrCount(int n, String s) {

        int count = n;
        if (n %2 != 0) n = n-1;

        for (int i = 0; i <= n; i++) {
            for (int j = i+2; j <= n; j++) {
                if (s.substring(i, j).equals(rotate(s.substring(i, j)))){
                    count++;
                }
            }
        }

        return count;
    }

    private static String rotate(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length()-1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }

        return sb.toString();
    }


    public static void main(String[] args) {
        System.out.println(substrCount(8,"mnonopoo"));
//        System.out.println(substrCount(5,"asasd"));
//        System.out.println(substrCount(7,"abcbaba"));
//        System.out.println(substrCount(4,"aaaa"));
    }

}