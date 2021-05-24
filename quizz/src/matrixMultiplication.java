import java.util.Scanner;
public class matrixMultiplication {
    public static void main(String[] args) {
        Scanner  in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] matrixA = new int[n][n];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                matrixA[i][j] = in.nextInt();
            }
        }
        int[][] matrixB = new int[n][n];
        for (int i = 0; i < matrixB.length; i++) {
            for (int j = 0; j < matrixB[i].length; j++) {
                matrixB[i][j] = in.nextInt();
            }
        }
            int[][] matrixC = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrixC[i][j] = 0;
                    for (int k = 0; k < n; k++) {
                        matrixC[i][j] += matrixA[i][k] * matrixB[k][j];
                    }
                    System.out.printf("%-2d%-1s", matrixC[i][j], " ");
                }
                System.out.println();
            }
    }
}
