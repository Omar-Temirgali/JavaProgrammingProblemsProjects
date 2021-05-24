import java.util.Scanner;
public class twoSums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int t = in.nextInt();
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == t) {
                    System.out.println(i + " " + j);
                    flag = true;
                }
            }
        }
        if (!flag) {
            System.out.println("Not Found");
        }
    }
}
