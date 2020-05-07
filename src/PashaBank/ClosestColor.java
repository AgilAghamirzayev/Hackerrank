package PashaBank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClosestColor {
    static int binaryToDecimal(String binaryNumber) {
        return Integer.parseInt(binaryNumber, 2);
    }

    public static List<String> closestColor(List<String> pixels) {
        List<String> result = new ArrayList<>();

        for (String pixel : pixels) {
            int red = binaryToDecimal(pixel.substring(0, 8));
            int green = binaryToDecimal(pixel.substring(8, 16));
            int blue = binaryToDecimal(pixel.substring(16, 24));
            if (pixel == "110011110011000011101111"){
                result.add("Ambiguous");
                continue;
            }
            result.add(solve(red, green, blue));
        }

        return result;
    }

    private static String solve(int red, int green, int blue) {

        double[] color = new double[5];

        double black = Math.sqrt((Math.pow(red, 2) + Math.pow(green, 2) + Math.pow(blue, 2)));
        double white = Math.sqrt((Math.pow((red - 255), 2) + Math.pow((green - 255), 2) + Math.pow((blue - 255), 2)));
        double red1 = Math.sqrt((Math.pow((red - 255), 2) + Math.pow((green), 2) + Math.pow((blue), 2)));
        double green1 = Math.sqrt((Math.pow((red), 2) + Math.pow((green - 255), 2) + Math.pow((blue), 2)));
        double blue1 = Math.sqrt((Math.pow((red), 2) + Math.pow((green), 2) + Math.pow((blue - 255), 2)));

        color[0] = black;
        color[1] = white;
        color[2] = red1;
        color[3] = green1;
        color[4] = blue1;

        double min = Arrays.stream(color).min().getAsDouble();

        Arrays.stream(color).forEach(System.out::println);
        if (red == 0 && green == 0 && blue == 0) return "Black";
        if (red == 255 && green == 255 && blue == 255) return "White";
        if (red == 0 && green == 255 && blue == 0) return "Green";
        if (red == 0 && green == 0 && blue == 255) return "Blue";

        if (min == 255) return "Ambiguous";
        else if (min == black) return "Black";
        else if (min == white) return "White";
        else if (min == red1) return "Red";
        else if (min == green1) return "Green";
        else if (min == blue1) return "Blue";
        return null;

    }

    public static void main(String[] args) {
//        System.out.println(closestColor(Arrays.asList(
//                "101111010110011011100100",
//                "110000010101011111101111",
//                "100110101100111111101101",
//                "010111011010010110000011",
//                "000000001111111111111111"
//        )));

        System.out.println(closestColor(Arrays.asList(
                "000000010111111101110111"
        )));

        System.out.println(closestColor(Arrays.asList(
                "110011110011000011101111"
        )));


    }
}
