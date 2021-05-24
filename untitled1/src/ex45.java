import java.util.*;
public class ex45 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        int n = in.nextInt();
        System.out.print("Enter the side: ");
        double s = in.nextDouble();
        double A = ((double)n * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / n));
        System.out.printf("The area of the polygon is %.2f", A);
    }
}
