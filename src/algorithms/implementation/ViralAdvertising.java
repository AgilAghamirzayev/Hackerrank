package algorithms.implementation;

public class ViralAdvertising {

    static int viralAdvertising(int n) {


        int shared = 5;
        int liked = shared/2;
        int result = liked;

        for (int i = 1; i < n; i++) {
            shared = liked * 3;
            liked = shared / 2;
            result += liked;
        }

        return result;

    }

    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            System.out.println(viralAdvertising(i));

        }
    }
}
