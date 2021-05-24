import java.util.Scanner;

public class Codeforces_746A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        for (int i = a; i >= 0; i--) {
            if (2 * i <= b && 4 * i <= c) {
                System.out.println(i + 2 * i + 4 * i);
                break;
            }
        }
    }
}
