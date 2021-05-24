import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                sum = sum + i;
            }
            System.out.println(sum);
        }
        else if (n <= 0) {
            for (int u = 1; u >= n; u--) {
                sum = sum + u;
            }
            System.out.println(sum);
        }
    }
}
