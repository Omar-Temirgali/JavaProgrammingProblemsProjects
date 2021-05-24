import java.util.Scanner;

public class Codeforces_758A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max = 0, ans = 0;
        int t = in.nextInt();
        int[] nums = new int[t];
        for (int i = 0; i < t; i++) {
            nums[i] = in.nextInt();
            if (max < nums[i]) max = nums[i];
        }
        for(int i = 0; i < t; i++) {
            ans += max - nums[i];
        }
        System.out.println(ans);
    }
}
