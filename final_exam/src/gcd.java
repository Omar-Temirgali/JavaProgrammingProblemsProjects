import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int l = GCD(n, m);
        System.out.println(l);
    }
    private static int GCD(int n, int m) {
        int gcd = 1;
        for (int i = Math.min(n, m); true; i--) {
            if (n % i == 0 && m % i == 0) {
                gcd = i;
                break;
            }
        }
        return gcd;
    }
}
