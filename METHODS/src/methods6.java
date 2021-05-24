import java.util.Scanner;

public class methods6 {
    public static void main(String[] args) {
        System.out.print("Enter the number of lines: ");
        Scanner in = new Scanner(System.in);
        //get the total number of lines n
        int n = in.nextInt();
        displayPattern(n);
    }
    public static void displayPattern(int n) {
        for (int i = 1; i <= n; i++) {
            //printing spaces, 2 at a time from j=1 to j=n-i
            for (int j = 1; j <= (n - i); j++) {
                int numberOfDigit = 0;
                int remainder = n - (j - 1);
                while (remainder != 0) {
                    numberOfDigit++;
                    remainder /= 10;
                }
                for (int k = -1; k < numberOfDigit; k++) {
                    System.out.print(" ");
                }
            }
            for (int j = 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
