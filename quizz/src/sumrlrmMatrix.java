import java.util.Scanner;

public class sumrlrmMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] matrix = new int[n][m];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        int row = in.nextInt();
        if (row > n) {
            System.out.println("The maximum row is " + n);
            System.exit(0);
        }
    }
}

