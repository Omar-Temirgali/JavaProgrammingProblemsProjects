public class oop {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        System.out.println("The area of rectangle: " + rec.getArea());
        System.out.println("The perimeter fo rectangle: " + rec.getPerim());
        rec.width = 24;
        System.out.println("The area with " + rec.width + " width is " + rec.getArea());
    }
}
class Rectangle {
    double heigth = 20;
    double width = 30;

    Rectangle() {
    }
    Rectangle(double newWidth) {
        width = newWidth;
    }

    double getArea() {
        return heigth * width;
    }
    double getPerim() {
        return 2 * (heigth + width);
    }
    void setWidth(double newWidth) {
        width = newWidth;
    }
}
