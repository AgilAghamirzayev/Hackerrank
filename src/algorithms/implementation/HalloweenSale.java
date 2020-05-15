package algorithms.implementation;

public class HalloweenSale {

    static int howManyGames(int p, int d, int m, int s) {
        int max_buys = p;
        int price = p;
        int count = 0;

        while (max_buys <= s){
            price = price - d;
            if (price < m) price = m;
            max_buys += price;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(howManyGames(20,3,6,80));
        System.out.println(howManyGames(20,3,6,85));
    }
}
