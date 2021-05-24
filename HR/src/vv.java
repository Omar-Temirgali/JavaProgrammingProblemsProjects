import java.util.Scanner;
public class vv {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (isPalindrome(n))
            System.out.println("YES");
        else
            System.out.println("NO");

    }

    public static boolean isPalindrome(int n) {
        int sum = 0, r;
        int temp = n;
        while (n > 0) {
            r = n % 10;
            sum = (sum*10) + r;
            n = n / 10;
        }
        if (temp == sum)
            return true;
        else
            return false;
    }
}
