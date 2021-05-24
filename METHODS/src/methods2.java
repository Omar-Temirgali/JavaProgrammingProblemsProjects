import java.util.Scanner;

public class methods2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an enteger: ");
        long n = scanner.nextLong();
        System.out.println("The sum is " + sumDigits(n));
    }
    public static int sumDigits(long n) {
        int sum = 0;
        do {
            sum += n % 10;
        } while ((n = n / 10) != 0);
        return sum;
    }
}
