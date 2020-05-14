package algorithms.implementation;

public class BeautifulDaysAtTheMovies {

    static int beautifulDays(int i, int j, int k) {

        int count = 0;

        for (float l = i; l <= j; l++) {
            float i1 = (l - reverse(l)) / k;
            if (i1 == Math.round(i1)) count++;
        }

        return count;
    }

    private static float reverse(float l) {

        int num = (int) l;
        float curr = 0;

        while (num > 0) {
            l = num % 10;
            curr = curr * 10 + l ;
            num = num / 10;
        }

        return curr;
    }

    public static void main(String[] args) {
        System.out.println(beautifulDays(20,23,6));
    }
}
