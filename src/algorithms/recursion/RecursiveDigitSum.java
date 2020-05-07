package algorithms.recursion;

public class RecursiveDigitSum {
static int superDigit(String n, int k) {
    
    String number = String.valueOf(n.chars().mapToLong(Character::getNumericValue).sum() * k);
    return (number.length() > 1) ? superDigit(number, 1) : Character.getNumericValue(number.charAt(0));
    
    }

    public static void main(String[] args) {
        System.out.println(superDigit("148",3));
        System.out.println(superDigit("123",3));
        System.out.println(superDigit("9875",4));
        System.out.println(superDigit("5",1));
        System.out.println(superDigit("12345678",23456543));

    }
}
