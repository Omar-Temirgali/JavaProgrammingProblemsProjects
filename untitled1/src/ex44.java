import java.lang.management.MemoryType;
import java.util.*;
public class ex44 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, s;
        System.out.print("Enter the side: ");
        s = in.nextDouble();
        a = (6 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 6));
        System.out.printf("The area of hexagon is %.2f", a);
    }
}
