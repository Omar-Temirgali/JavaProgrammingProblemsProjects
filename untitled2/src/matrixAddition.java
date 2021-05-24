import java.util.Scanner;

public class matrixAddition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] matrixA = new int[n][m];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                matrixA[i][j] = in.nextInt();
            }
        }
        int[][] matrixB = new int[n][m];
        for (int i = 0; i < matrixB.length; i++) {
            for (int j = 0; j < matrixB[i].length; j++) {
                matrixB[i][j] = in.nextInt();
            }
        }
        int[][] matrixC = new int[n][m];
        for (int i = 0; i < matrixC.length; i++) {
            for (int j = 0; j < matrixC[i].length; j++) {
                matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
                System.out.println(matrixC[i][j] + " ");
            }
            System.out.println();
        }

    }
}
