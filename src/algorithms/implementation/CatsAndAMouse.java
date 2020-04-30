package algorithms.implementation;

public class CatsAndAMouse {

    static int cat(int a, int z) {
        return z - a > 0 ? z - a : a - z;
    }

    static String catAndMouse(int x, int y, int z) {
//        int catA = cat(x, z);
//        int catB = cat(y, z);
//        return catA == catB ? "Mouse C" : catA > catB ? "Cat B" : "Cat A";

        return cat(x, z) == cat(y, z) ? "Mouse C" : cat(x, z) > cat(y, z) ? "Cat B" : "Cat A";
    }


    public static void main(String[] args) {


        System.out.println(catAndMouse(1, 2, 3));
        System.out.println(catAndMouse(1, 3, 2));
    }
}
