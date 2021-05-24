import java.util.Scanner;

public class Codeforces_1371A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] nums = new int[t];
        for (int i = 0; i < t; i++) {
            nums[i] = in.nextInt();
        }
        for (int i = 0; i < t; i++) {
            int ans = 1;
            nums[i]--;
            ans += nums[i] / 2;
            System.out.println(ans);
        }
    }
}
