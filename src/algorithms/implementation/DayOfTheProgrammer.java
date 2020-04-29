package algorithms.implementation;

public class DayOfTheProgrammer {

    private static String leapYear(int year) {
        return String.format("12.09.%s", year);
    }

    private static String notLeapYear(int year) {
        return String.format("13.09.%s", year);
    }

    private static String in1918() {
        return "26.09.1918";
    }

    static String dayOfProgrammer(int year) {

        if (year == 1918) return in1918();
        return (year > 1918) ? (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
                ? leapYear(year) : notLeapYear(year) : (year % 4 == 0) ? leapYear(year) :
                notLeapYear(year);
    }

    static String dayOfProgrammer2(int year) {

        if (year == 1918) return in1918();
        if (year > 1918) return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) ? leapYear(year) : notLeapYear(year);
        else return (year % 4 == 0) ? leapYear(year) : notLeapYear(year);
    }

    public static void main(String[] args) {
        System.out.println(dayOfProgrammer(1800));
        System.out.println(dayOfProgrammer(2016));
        System.out.println(dayOfProgrammer(2017));
        System.out.println(dayOfProgrammer(1918));
    }
}
