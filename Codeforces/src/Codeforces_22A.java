import java.util.Arrays;
import java.util.Scanner;

public class Codeforces_22A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        Arrays.sort(nums);
        if (isAllEqual(nums)) System.out.println("NO");
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                System.out.println(nums[i + 1]);
                break;
            } 
        }
    }
    private static boolean isAllEqual(int[] a){
        for(int i = 1; i<a.length; i++){
            if(a[0] != a[i])return false;
        }
        return true;
    }
}
