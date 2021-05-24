import java.util.Scanner;

public class closestNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < list.length; i++) {
            list[i] = in.nextInt();
        }
        sort(list);
        difference(list, n);
    }
    public static int[] sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
    public static void difference(int[] arr, int n) {
        if (n <= 1)
            return;

        // Compare differences of adjacent
        // pairs to find the minimum difference.
        int minDiff = arr[1] - arr[0];
        for (int i = 2; i < n; i++)
            minDiff = Math.min(minDiff, arr[i] - arr[i-1]);

        // Traverse array again and print all pairs
        // with difference as minDiff.
        for ( int i = 1; i < n; i++)
        {
            if ((arr[i] - arr[i-1]) == minDiff)
            {
                System.out.print(arr[i-1] + " " + arr[i] + " ");
            }
        }
    }
}
