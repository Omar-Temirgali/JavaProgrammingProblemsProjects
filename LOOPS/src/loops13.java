import java.util.Scanner;

public class loops13 {
    public static void main(String[] fpw) {
        System.out.print("Enter two integers: ");
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();

        //find the minimum
        if (n2 < n1) {
            int temp = n2;
            n2 = n1;
            n1 = temp;
        }
        for (int d = n1; true; d--) {
            if (n1 % d ==0 && n2 % d == 0) {
                System.out.println("The GCD is: " + d);
                break;
            }
        }
    }
}
