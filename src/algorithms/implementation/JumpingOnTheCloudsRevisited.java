package algorithms.implementation;

public class JumpingOnTheCloudsRevisited {

    static int jumpingOnClouds(int[] c, int k) {
        int len = c.length;
        int energy = 100;
        int i = 0;

        do {
            energy = c[(i + k) % len] == 1 ? energy - 1 - 2 : energy - 1;
            i += k;
        } while (i % len != 0);

        return energy;
    }

    public static void main(String[] args) {

        System.out.println(jumpingOnClouds(new int[]{0, 0, 1, 0}, 2));
        System.out.println(jumpingOnClouds(new int[]{0, 0, 1, 0, 0, 1, 1, 0}, 2));
        System.out.println(jumpingOnClouds(new int[]{1, 1, 1, 0, 1, 1, 0, 0, 0, 0}, 3));
        System.out.println(jumpingOnClouds(new int[]{1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1}, 19));
    }
}
