import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        double a, b, c, D, r1, r2;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        D = b * b - (4 * a * c);
        r1 = (-b -  Math.pow(D, 0.5)) / (2*a);
        r2 = (-b + Math.pow(D, 0.5)) / (2*a);

        if (D > 0)
            System.out.println("The equation has two roots: " + r1 + " and " + r2);
        else if (D == 0)
            System.out.println("The equation has one root: " + r1);
        else
            System.out.println("The equation has no real roots");
    }
}
