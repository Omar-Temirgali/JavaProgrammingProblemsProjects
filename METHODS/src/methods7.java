import java.util.Scanner;

public class methods7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("The amount invested: ");
        double ia = in.nextDouble();
        System.out.print("Annual interest rate: ");
        double air = in.nextDouble();
        System.out.print("Years: ");
        double y = in.nextDouble();
        System.out.printf("%-5s%18s\n", "Years", "Future Value");
        for (int i = 1; i <= y; i++) {
            System.out.printf("%-5d", i);
            System.out.printf("%16.2f\n", futureInvestmentValue(ia, air, y));
        }
    }
    public static double futureInvestmentValue(double ia, double air, double y) {
            return ia * Math.pow(1 + ((air / 100) / 12), y * 12);
    }
}

