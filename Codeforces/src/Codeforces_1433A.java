import java.util.Scanner;

public class Codeforces_1433A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        String[] nums = new String[t];
        for (int i = 0; i < t; i++) {
            nums[i] = in.next();
        }
        for (String s: nums) {
            int a = s.charAt(0) - '0';
            int b = s.length();
            System.out.println((a - 1) * 10 + b * (b + 1)/2);
        }
    }
}
