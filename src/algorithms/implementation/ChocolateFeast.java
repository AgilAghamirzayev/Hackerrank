package algorithms.implementation;

public class ChocolateFeast {
    static int chocolateFeast(int n, int c, int m) {

        int money = n / c;
        if (money < m ) return money;
        if (money == m) return  money+1;
        int wrappers = money;
        int total_chocolates = money;

        do {
            total_chocolates += wrappers / m;
            wrappers = wrappers / m + wrappers % m;
        } while ( wrappers >= m);

        return total_chocolates;
    }


    public static void main(String[] args) {
        System.out.println(chocolateFeast(10, 2, 5));
        System.out.println(chocolateFeast(12, 4, 4));
        System.out.println(chocolateFeast(6, 2, 2));
        System.out.println(chocolateFeast(16809, 123, 11668));
        System.out.println(chocolateFeast(20373, 18211, 10188));
        System.out.println(chocolateFeast(43203, 60, 5));

    }
}
