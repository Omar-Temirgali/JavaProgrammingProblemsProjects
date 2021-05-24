import java.util.Scanner;

public class Codeforces_1A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n = in.nextInt();
        double m = in.nextInt();
        double a = in.nextInt();
        System.out.println((long)(Math.ceil(n/a) * Math.ceil(m/a)));
    }
}
