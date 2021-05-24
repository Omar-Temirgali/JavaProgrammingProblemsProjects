import java.util.*;
public class ex48 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an ASCII code: ");
        int n = in.nextInt();
        if (n >= 0 && n < 128) {
            char ch = (char)n;
            System.out.println("The character for ASCII code " + n + " is " + ch);
        }
        else
            System.out.println("Input is incorrect");

    }
}
