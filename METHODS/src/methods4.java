import java.util.Scanner;

public class methods4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        System.out.println(reverse(number));
    }
    private static int reverse(int number) {
        int reverse = 0;
        int digit;
        do {
            digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        } while (number != 0);
        return reverse;
    }
}
