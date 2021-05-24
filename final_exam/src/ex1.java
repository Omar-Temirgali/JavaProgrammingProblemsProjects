import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double h = in.nextDouble();
        double w = in.nextDouble();
        Rectangle rec1 = new Rectangle(h, w);
        System.out.println("The area is " + rec1.getArea() + " and the perimeter is " + rec1.getPerimeter());
    }
}
class Rectangle {
    double width;
    double height;
    Rectangle() {
        width = 1;
        height = 1;
    }
    Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }
    double getArea() {
        return width*height;
    }
    double getPerimeter() {
        return 2*(width + height);
    }

    void setHeightWidth() {
        this.height = height;
        this.width = width;
    }
}
