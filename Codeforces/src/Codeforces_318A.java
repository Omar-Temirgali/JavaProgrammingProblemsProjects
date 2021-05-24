import java.util.Scanner;

public class Codeforces_318A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextInt();
        long k = in.nextInt();
        if (n % 2 == 0) {
            if (k <= n / 2) System.out.println(2 * k - 1);
            else System.out.println(2 * (k - n / 2));
        }
        else {
            if (k <= (n + 1) / 2) System.out.println(2 * k - 1);
            else System.out.println(2 * (k - (n + 1) / 2));
        }
    }
}
