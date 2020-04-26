package PashaBank;

public class FizzBuzz {

    public static void main(String[] args) {
        fizzBuzz(15);
    }
    public static void fizzBuzz(int n) {
        String  word = null;
            for (int i = 1; i <= n; i++) {
                if (i % 3 == 0 && i % 5 == 0) word = "FizzBuzz";
                else if (i % 3 == 0) word = "Fizz";
                else if (i % 5 == 0) word = "Buzz";
                if (i % 3 != 0 && i % 5 != 0) word = String.valueOf(i);
                System.out.println(word);
            }


    }

}
