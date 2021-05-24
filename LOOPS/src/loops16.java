import java.util.Scanner;

public class loops16 {
    public static void main(String[] asfe) {
        System.out.print("Enter an integer: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = 2;
        String s = "";
        while (n != 1) {
            if (n % i == 0) {
                s = s + ", " + i;
                n = n / i;
                i = 2;
            } else {
                i++;
            }
        }
        System.out.print("The factors are: " + s.substring(2) + ".");
    }
}
