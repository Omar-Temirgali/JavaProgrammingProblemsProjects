import java.util.*;
public class ex411 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the decimal value (0 to 15): ");
        int n = in.nextInt();

        if (n < 10)
            System.out.println(n);
        else if (n > 15 && n < 0)
            System.out.println("Invalid");
        switch (n) {
            case 10:
                System.out.println("A"); break;
            case 11:
                System.out.println("B"); break;
            case 12:
                System.out.println("C"); break;
            case 13:
                System.out.println("D"); break;
            case 14:
                System.out.println("E"); break;
            case 15:
                System.out.println("F");
        }
    }
}
