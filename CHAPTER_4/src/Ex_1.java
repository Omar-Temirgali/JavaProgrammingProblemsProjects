import java.util.Scanner;

public class Ex_1 {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length from the center to a vertex: ");
        double length = in.nextDouble();
        double s = 2 * length * Math.sin(Math.PI / 5);
        double area = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI/5));
        System.out.println("The area of the pentagon is " + Math.round(area * 100.0) / 100.0);
    }
}
