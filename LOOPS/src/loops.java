import java.util.Scanner;
public class loops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer, the input ends if it is 0: ");
        int countNeg = 0, countPos = 0;
        double total = 0.0;
        int data;
        while ((data = in.nextInt()) != 0) {
            total += data;
            if (data < 0)
                countNeg++;
            else if (data > 0)
                countPos++;
        }
        if (countNeg + countPos == 0) {
            System.out.println("No numbers are intered except 0");
            System.exit(0);
        }
        System.out.println("The number of positives is " + countPos);
        System.out.println("The number of negatives is " + countNeg);
        System.out.println("The total is " + total);
        System.out.println("The average is " + (total) / (countNeg + countPos) );
    }
}