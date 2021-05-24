import java.util.Scanner;
public class triangular {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, n, j;
        n = input.nextInt();
        if (n > 0) {
            for (i=1; i <= n; i++) {
                for (j=1; j<=n ; j++) {
                    if (j<=n-2)
                        System.out.print("*");
                }
                System.out.println();
            }

        }
        else
    }
}
