import java.util.Scanner;

public class Codeforces_1283A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t > 0) {
            int h = in.nextInt();
            int m = in.nextInt();
            System.out.println((23 - h) * 60 + (60 - m));
            t--;
        }
    }
}
