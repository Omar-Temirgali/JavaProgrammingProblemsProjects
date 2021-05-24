import java. util.Scanner;

public class fact {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        long n;
        n = input.nextInt();
            if (n == 0 )
                System.out.println("1");
            else if (n == 1)
                System.out.println("1");
            else if (n == 2)
                System.out.println("2");
            else if (n == 3)
                System.out.println("6");
            else if (n == 4)
                System.out.println("4");
            else
                System.out.println("0");
    }
}
