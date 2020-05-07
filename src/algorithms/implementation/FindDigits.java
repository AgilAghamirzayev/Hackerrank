package algorithms.implementation;

public class FindDigits {
    static int findDigits(int n) {
        int num = n;
        int curr;
        int count = 0;

        while (num > 0) {
            curr = num % 10;
            if (curr != 0 && n % curr == 0) count++;
            num = num / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(findDigits(12));
        System.out.println(findDigits(1012));
    }
}
