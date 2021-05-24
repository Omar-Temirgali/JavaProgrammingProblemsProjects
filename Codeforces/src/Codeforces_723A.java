import java.util.Scanner;

public class Codeforces_723A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum1, sum2, sum3;
        int x1 = in.nextInt();
        int x2 = in.nextInt();
        int x3 = in.nextInt();
        sum1 = Math.abs(x1 - x2) + Math.abs(x1 - x3);
        sum2 = Math.abs(x1 - x2) + Math.abs(x2 - x3);
        sum3 = Math.abs(x1 - x3) + Math.abs(x2 - x3);
        int sum = Math.min(sum1, Math.min(sum2, sum3));
        System.out.println(sum);
    }
}
