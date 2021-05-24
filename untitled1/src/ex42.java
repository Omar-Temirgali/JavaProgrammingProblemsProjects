import java.util.*;
public class ex42 {
    public static void main(String[] args) {
        final double radius = 6371.01;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();
        double d = radius * Math.acos(Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2)) +
        Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(y1 - y2)));
        System.out.println("The distance between the two points is " + d + " km");
    }
}
