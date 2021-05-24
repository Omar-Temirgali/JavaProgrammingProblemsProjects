import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = in.nextInt();
        int m = in.nextInt();
        for (int i = 0; i < m; i++) {
            int x, y;
            x = in.nextInt();
            y = in.nextInt();
            for (int j = x - 1; j < y; j++) {
                System.out.println(a[j] + " ");
            }
        }
    }
}
//    public static boolean isPrime(int n) {
//        boolean isPrime = false;
//        int number = 2; //a number to be tested for primeness
//        while (number <= n) {
//            isPrime = true;  // Is the current number prime?
//            for (int divisor = 2; divisor <= (int)(Math.sqrt(number)); divisor++) {
//                if (number % divisor == 0) { // If true, number is not
//                    isPrime = false; // Set isPrime to false
//                    break; // Exit the for loop
//                }
//            }
//            number++;
//        }
//        return isPrime;
//    }