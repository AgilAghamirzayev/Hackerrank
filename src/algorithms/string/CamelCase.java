package algorithms.string;

public class CamelCase {
    static int camelcase(String s) {

        return (int) (s.chars().filter(i -> i < 91).count() + 1);

    }

    public static void main(String[] args) {
        System.out.println(camelcase("saveChangesInTheEditor"));
    }
}
