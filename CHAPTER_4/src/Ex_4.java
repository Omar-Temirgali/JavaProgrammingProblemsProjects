import java.util.Scanner;

public class Ex_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the side: ");
        double side = in.nextDouble();
        double area = (6 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 6));
        System.out.println("The area of hexagon is " + Math.round(area * 100.0) / 100.0);
    }
}
