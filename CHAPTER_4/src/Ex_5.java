import java.util.Scanner;

public class Ex_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        int n = in.nextInt();
        System.out.print("Enter the side: ");
        double s = in.nextDouble();
        double area = ((double)(n) * s * s) / (4 * Math.tan(Math.PI / n));
//        System.out.println("The area of the polygon is " + area);
        switch (n) {
            case 3:
                System.out.println("The area of the equilateral triangle is " + area); break;
            case 4:
                System.out.println("The area of the square is " + area); break;
            case 5:
                System.out.println("The area of the regular pentagon is " + area); break;
            case 6:
                System.out.println("The area of the regular hexagon is " + area); break;
            case 7:
                System.out.println("The area of the regular heptagon is " + area); break;
            case 8:
                System.out.println("The area of the regular octagon is " + area); break;
            case 9:
                System.out.println("The area of the regular nonagon is " + area); break;
            case 10:
                System.out.println("The area of the regular decagon is " + area); break;
            default:
                System.out.println("The area of the regular " + n + "-gon is " + area);
        }
    }
}
