import java.util.Scanner;

public class mult {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(mult(a, b));
    }
    public static int mult(int i1, int i2) {

        int result;
        result = i1 * i2;

        return result;
    }
}
