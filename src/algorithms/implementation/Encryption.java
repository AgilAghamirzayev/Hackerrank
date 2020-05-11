package algorithms.implementation;

public class Encryption {

    static String encryption(String s) {

        int len = s.length();
        int col = len == sqrt(len) ?  (int) Math.sqrt(len) : (int) (Math.sqrt(len)+1);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < col; i++) {
            for (int j = i; j < len; j = j + col) {
                sb.append(s.charAt(j));
            }
            sb.append(" ");
        }

        return sb.toString();
    }


    private static int sqrt(int num) {
        int a = (int) Math.sqrt(num);
        return pow(a);
    }

    private static int pow(int a) {
        return a*a;
    }

    public static void main(String[] args) {
        System.out.println(encryption("haveaniceday"));
    }
}
