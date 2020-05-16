package algorithms.implementation;

public class SaveThePrisoner {

    static int saveThePrisoner(int n, int m, int s) {

        int result =  (m - 1) % n + s;
        return result > n ? result - n : result;

    }


    public static void main(String[] args) {
        System.out.println(saveThePrisoner(7,19,2)); // 6
        System.out.println(saveThePrisoner(5,2,1)); // 2
        System.out.println(saveThePrisoner(5,2,2)); // 3
        System.out.println(saveThePrisoner(352926151,380324688,94730870)); // 3
        System.out.println(saveThePrisoner(499999999,999999997,2)); // 3
        System.out.println(saveThePrisoner(499999999,999999998,2)); // 3
        System.out.println(saveThePrisoner(999999999,999999999,1)); // 3
    }
}
