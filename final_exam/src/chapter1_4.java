import java.util.Scanner;
import java.util.SortedMap;

public class chapter1_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*double sum = 0;
        for (int i = 1; i <= 624; i++) {
            sum = sum + ((1/Math.sqrt(i)) + Math.sqrt(i+1));
        }
        Sstem.out.println((double) Math.round(sum * 100)/100); */

        /*int I = in.nextInt();
        double pi = 0;
        for (int i = 1; i < I; i++) {
            pi += (Math.pow(-1, i + 1)) / (2 * i - 1);
        }
        pi = 4 *pi;
        System.out.println(pi);
        System.out.println(Math.PI);*/
        //exercise 5.18
        /*System.out.println("Patter A");
        for (int col = 1; col <= 6; col++) {
            for (int row = 1; row < col; row++) {
                System.out.print(row + " ");
            }
            System.out.println(col);
        }
        System.out.println("Pattern B");
        for (int col = 0; col < 6; col++) {
            for (int row = 1; row <= 6 - col; row++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
        System.out.println("Pattern C");
        for (int i = 1; i <= 6; i++) {
            for (int s = 6 - i; s >= 1; s--) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("Pattern D");
        for (int i = 0; i < 6; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }*/
        //exercise 5.12 and 5.13
        /*int n = 1;
        while (Math.pow(n, 2) <= 12000) {
            n++;
        }
        System.out.println(n);
        int m = 12000;
        while (Math.pow(m, 3) >= 12000) {
            m--;
        }
        System.out.println(m);*/
        //exercise 5.14
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        //System.out.println(gcd(n1, n2));
        gcd(n1, n2);
    }
    public static void gcd(int n1, int n2) {
        //int d = Math.min(n1, n2);
        for (int i = Math.min(n1, n2); true; i--) {
            if (n1 % i == 0 && n2 % i == 0) {
                System.out.println("The GCD is " + i);
                break;
            }
        }
    }
}
