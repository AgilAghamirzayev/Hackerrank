package algorithms.implementation;

import java.util.Arrays;

public class TheTimeInWords {
    static String timeInWords(int h, int m) {

        String[] word = {
                "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen",
                "twenty", "twenty one", "twenty two", "twenty three", "twenty four", "twenty five", "twenty six", "twenty seven", "twenty eight", "twenty nine"
        };


        return m == 0  ? connect(word[h] , "o' clock")     :
               m == 15 ? connect("quarter past" , word[h]) :
               m == 30 ? connect("half past"    , word[h]) :
               m == 45 ? connect("quarter to"   , word[h + 1]) :
               m == 1  ? connect(word[m] , "minute past"  , word[h]) :
               m  < 30 ? connect(word[m] , "minutes past" , word[h]) :
                         connect(word[60 - m] , "minutes to"   , word[h + 1]);

    }

    private static String connect(String... s) {
        return Arrays.toString(s).replace("[", "").replace("]","").replace(",","");
    }


    public static void main(String[] args) {
        System.out.println(timeInWords(5,47));
        System.out.println(timeInWords(3, 0));
        System.out.println(timeInWords(7,15));
    }
}
