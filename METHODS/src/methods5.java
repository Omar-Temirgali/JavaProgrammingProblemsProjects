import java.util.Scanner;

public class methods5 {
    public static void main(String[] args) {
        System.out.print("Enter three numbers: ");
        Scanner in = new Scanner(System.in);
        double num1 = in.nextDouble();
        double num2 = in.nextDouble();
        double num3 = in.nextDouble();
        displaySortedNumbers(num1, num2, num3);
    }
    public static void displaySortedNumbers(double num1, double num2, double num3) {
        if (num3 > num2) {
            double temp = num2;
            num2 = num3;
            num3 = temp;
        }
        if (num2 > num1) {
            double temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num3 > num2) {
            double temp = num2;
            num2 = num3;
            num3 = temp;
        }
        System.out.println("The numbers is increasing order is " + num3 + " " + num2 + " " + num1);
    }
}
