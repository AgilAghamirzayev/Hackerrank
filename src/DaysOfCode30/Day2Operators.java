package DaysOfCode30;

public class Day2Operators {

    static void solve(double meal_cost, int tip_percent, int tax_percent) {

        double tip =  meal_cost * tip_percent * 0.01;
        double tax =  meal_cost * tax_percent * 0.01;
        int result = (int) Math.round(meal_cost + tip + tax);

        System.out.println(result);
    }

    public static void main(String[] args) {
        solve(12.00, 20, 8);
        solve(12.00, 1, 1);
        solve(12.60, 20, 8);
        solve(15.50, 15, 10);
    }
}
