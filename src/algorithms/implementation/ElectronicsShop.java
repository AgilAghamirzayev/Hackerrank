package algorithms.implementation;

public class ElectronicsShop {
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int result = -1;
        for (int keyboard : keyboards) {
            for (int drive : drives) {
                if (keyboard + drive <= b)
                if (result < keyboard + drive)
                    result = keyboard + drive;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getMoneySpent(new int[]{3, 1}, new int[]{5, 2, 8}, 10));
        System.out.println(getMoneySpent(new int[]{4}, new int[]{5}, 5));
    }
}
