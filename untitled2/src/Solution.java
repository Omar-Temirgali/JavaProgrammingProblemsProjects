import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int t = in.nextInt();
        findSum(arr, t);
    }
    public static void findSum(int[] arr, int t) {
        boolean f = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] + arr[j] == t) {
                    System.out.println(i + " " + j);
                    f = true;
                }
            }
        }
        if (!f) {
            System.out.print("Not found");
        }
    }
}