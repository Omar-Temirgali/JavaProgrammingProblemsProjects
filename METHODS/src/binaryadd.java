import java.util.Scanner;

public class binaryadd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a 8-digit binary number (first): ");
        String binFirst = in.nextLine();
        check(binFirst);
        System.out.print("Enter a 8-digit binary number (second): ");
        String binSecond = in.nextLine();
        check(binSecond);
        System.out.print("\nThe decimal summation is " +  (binToDec(binFirst) + binToDec(binSecond)));
        System.out.println("\nThe decimal difference is " + (binToDec(binFirst) - binToDec(binSecond)));
    }
    private static void check(String binaryNumber) {
        if (binaryNumber.length() != 8) {
            System.out.println("The entered number is not 8-digit binary number!");
            System.exit(0);
        }
    }
    private static int binToDec(String binaryNumber) {
        int decimal = 0;
        char[] num = binaryNumber.toCharArray();
        int[] binNum = new int[binaryNumber.length()];
        for (int i = 0; i < num.length; i++) {
            binNum[i] = Character.getNumericValue(num[i]);
            decimal += Math.pow(2, 7 - i) * binNum[i];
        }
        return decimal;
    }
}
