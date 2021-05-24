import java.util.Scanner;

public class Codeforces_935A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) ans++;
        }
        System.out.println(ans - 1);
    }
}
