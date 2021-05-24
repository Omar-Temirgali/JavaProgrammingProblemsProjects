import java.util.Scanner;

public class Codeforces_932A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] s = in.next().toCharArray();
        for(int i = 0;i < s.length;i++) {
            System.out.printf("%c", s[i]);
        }
        for(int i = s.length - 1; i >= 0; i--) {
            System.out.printf("%c", s[i]);
        }
    }
}
