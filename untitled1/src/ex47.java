import java.util.*;
public class ex47 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of the bounding circle: ");
        double r = in.nextDouble();
        double a1 = Math.PI / 10;
        double a2 = Math.PI / 2;
        double a3 = Math.PI / 2 + 2 * Math.PI / 5;
        double a4 = Math.PI / 2 + 4 * Math.PI / 5;
        double a5 = Math.PI / 2 + 6 * Math.PI / 5;

        double x1 = r * Math.cos(a1);
        double y1 = r * Math.sin(a1);
        double x2 = r * Math.cos(a2);
        double y2 = r * Math.sin(a2);
        double x3 = r * Math.cos(a3);
        double y3 = r * Math.sin(a3);
        double x4 = r * Math.cos(a4);
        double y4 = r * Math.sin(a4);
        double x5 = r * Math.cos(a5);
        double y5 = r * Math.sin(a5);

        System.out.printf("(%.2f, %.2f)\n", x1, y1);
        System.out.printf("(%.2f, %.2f)\n", x2, y2);
        System.out.printf("(%.2f, %.2f)\n", x3, y3);
        System.out.printf("(%.2f, %.2f)\n", x4, y4);
        System.out.printf("(%.2f, %.2f)\n", x5, y5);
    }
}
