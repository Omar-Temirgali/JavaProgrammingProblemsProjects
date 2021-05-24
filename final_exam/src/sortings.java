import java.util.*;
public class sortings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        insertionSort(nums);
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }
    private static int[] insertionSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int currentElement = nums[i];
            int k;
            for (k = i - 1; k >= 0 && nums[k] > currentElement; k--) {
                nums[k + 1] = nums[k];
            }
            nums[k + 1] = currentElement;
        }
        return nums;
    }
    private static int[] bubbleSort(int[] nums) {
        boolean needNextPass = true;
        for (int k = 1; k < nums.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                    needNextPass = true;
                }
            }
        }
        return nums;
    }
    private static void mergeSort(int[] nums) {
        if (nums.length > 1) {
            int[] _1stHalf = new int[nums.length / 2];
            System.arraycopy(nums,0, _1stHalf, 0, nums.length/2);
            mergeSort(_1stHalf);

            int[] _2ndHalf = new int[nums.length - (nums.length / 2)];
            System.arraycopy(nums, nums.length/2, _2ndHalf, 0, nums.length - (nums.length/2));
            mergeSort(_2ndHalf);
            merge(_1stHalf, _2ndHalf, nums);
        }
    }
    private static void merge(int[] nums1, int[] nums2, int[] temp) {
        int current1 = 0;
        int current2 = 0;
        int current3 = 0;
        while (current1 < nums1.length && current2 < nums2.length) {
            if (nums1[current1] < nums2[current2])
                temp[current3++] = nums1[current1++];
            else
                temp[current3++] = nums2[current2++];
        }
        while (current1 < nums1.length) {
            temp[current3++] = nums1[current1++];
        }
        while (current2 < nums2.length) {
            temp[current3++] = nums2[current2++];
        }
    }
}
