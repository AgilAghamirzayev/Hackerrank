package algorithms.string;

public class StrongPassword {
    static int minimumNumber(int n, String password) {
        String numbers = "0123456789";
        String lower_case = "abcdefghijklmnopqrstuvwxyz";
        String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String special_characters = "!@#$%^&*()-+";

        int count = 4;
        if (n < 4) return 6 - n;
        if (contain(n, password, numbers)) count -= 1;
        if (contain(n, password, lower_case)) count -= 1;
        if (contain(n, password, upper_case)) count -= 1;
        if (contain(n, password, special_characters)) count -= 1;
        if (n < 6) return Math.max(6-n,count);

        return count;
    }

    private static boolean contain(int n, String password, String strong) {
        for (int i = 0; i < n; i++) {
            if (strong.contains(String.valueOf(password.charAt(i)))) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(minimumNumber(4,"06HL"));
        System.out.println(minimumNumber(4,"AAAA"));
        System.out.println(minimumNumber(4,"+xAu"));
    }
}
