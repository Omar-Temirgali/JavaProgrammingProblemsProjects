import java.util.Scanner;

public class Codeforces_124A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(Math.min(n - a, b + 1));
    }
}
