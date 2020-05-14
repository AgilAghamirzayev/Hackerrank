package algorithms.implementation;

public class UtopianTree {

    static int utopianTree(int n) {

        return ((int) Math.pow(2, (int)((n + 3) / 2))) + (((int) Math.pow(-1, n)) - 3) / 2;

    }

    static int utopianTree1(int n) {

        int height = 1;
        for (int i = 0; i < n; i++) {
            height = (i & 1) == 0 ? height * 2 : height + 1;
        }
        return height;

    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(utopianTree(i));
        }
    }
}
