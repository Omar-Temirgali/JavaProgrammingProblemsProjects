import java.util.Scanner;

public class Codeforces_47A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (check(n)) System.out.println("YES");
        else System.out.println("NO");
    }
    private static boolean check(int n) {
        int[] triangularNums = new int[32];
        for (int i = 0; i < triangularNums.length; i++) {
            triangularNums[i] = (i * (i + 1)) / 2;
        }
        for (int triangularNum : triangularNums) {
            if (triangularNum == n) {
                return true;
            }
        }
        return false;
    }
}
