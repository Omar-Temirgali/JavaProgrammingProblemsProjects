import java.util.Scanner;

public class Math {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        if (N % 2 != 0)
            System.out.println("Weird");
        else if (N % 2 == 0 && N <= 5)
            System.out.println("Not Weird");
        else if (N % 2 == 0 && N <= 20)
            System.out.println("Weird");
        else
            System.out.println("Not Weird");
    }
}
