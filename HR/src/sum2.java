import javax.swing.*;
import java.util.Scanner;
public class sum2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long N, M, i;
        long sum = 0;
        N = in.nextInt();
        M = in.nextInt();
        if (N > M) {
            if (N>=0 && M>=0) {
                for (i = N; i <= M; i++) {
                    sum = sum + i;
                }
                System.out.println(sum);
            }
            else
                System.out.println("blabla");
        }
        else if (N < M) {
            if (N >= 0 && M >=0) {
                for (i = N; i > M; i--) {
                    sum = sum + i;
                }
                System.out.println(sum);
            }
            else
                System.out.println("blabla");
        }
    }
}
