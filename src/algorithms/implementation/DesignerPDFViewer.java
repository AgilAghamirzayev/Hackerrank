package algorithms.implementation;

public class DesignerPDFViewer {
    static int designerPdfViewer(int[] h, String word) {

        int len = word.length();
        int location;
        int high_of_tallest_letter = 0;

        for (int i = 0; i < len; i++) {
            location = 26 - ('z' - word.charAt(i)) - 1;
            if (h[location] > high_of_tallest_letter) high_of_tallest_letter = h[location];
        }

        return high_of_tallest_letter * len;
    }

    public static void main(String[] args) {
        System.out.println(designerPdfViewer(new int[]{
                1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7
        },"zaba"));


        System.out.println(designerPdfViewer(new int[]{
                1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5
        },"abc"));
    }
}
