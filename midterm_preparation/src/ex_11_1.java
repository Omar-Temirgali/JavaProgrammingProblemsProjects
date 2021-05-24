import java.util.Scanner;

public class ex_11_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three sides of triangle, its color, and true/false if it is filled: ");
        Triangle triangle = new Triangle(input.nextDouble(), input.nextDouble(), input.nextDouble());
        triangle.setColor(input.nextLine());
        String isFilled = input.nextLine();
        if (isFilled.equals("true")) triangle.setFilled(true);
        System.out.println(triangle.toString() + " with color " + triangle.getColor() + " and filled: " + triangle.isFilled());
        System.out.println("Area is " + triangle.getArea() + " and perimeter is " + triangle.getPerimeter());
    }
}
