import java.util.Scanner;

public class Codeforces_1369A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] nums = new int[t];
        for (int i = 0; i < t; i++) {
            nums[i] = in.nextInt();
        }
        for (int i = 0; i < t; i++) {
            if (nums[i] % 4 == 0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
