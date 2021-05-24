import java.util.Scanner;

public class Codeforces_492A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0, ans = 0;
        for (int i = 0; i <= n; i++) {
            sum += (i + 1) * i / 2;
            if (sum > n) break;
            else ans = i;
        }
        System.out.println(ans);
    }
}
