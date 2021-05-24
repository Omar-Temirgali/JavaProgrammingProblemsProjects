import java.util.Scanner;

public class Codeforces_1047A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a, b, c;
        if (n % 3 == 0) {
            a = 1; b = 1; c = n - a - b;
        } else {
            a = 1; b = 2; c = n - a - b;
        }
        System.out.println(a + " " + b + " " + c);
    }
}
