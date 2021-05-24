import java.util.Arrays;
import java.util.Scanner;

public class Codeforces_6A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = {in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt()};
        Arrays.sort(nums);
        if (nums[0] + nums[1] > nums[2] || nums[1] + nums[2] > nums[3]) {
            System.out.println("TRIANGLE");
        } else if (nums[0] + nums[1] == nums[2] || nums[1] + nums[2] == nums[3]) {
            System.out.println("SEGMENT");
        } else System.out.println("IMPOSSIBLE");
    }
}
