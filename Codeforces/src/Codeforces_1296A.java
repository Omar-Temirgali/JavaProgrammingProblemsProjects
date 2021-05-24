import java.util.Scanner;
import java.util.stream.IntStream;

public class Codeforces_1296A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int sum, e, o;
        for (int i = 0; i < t; i++) {
            sum = 0; e = 0; o = 0;
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = in.nextInt();
                if (arr[j] % 2 != 0 || arr[j] == 1) o++;
                else e++;
                sum += arr[j];
            }
            if (sum % 2 != 0) System.out.println("YES");
            else {
                if(o != 0 && e != 0) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}
