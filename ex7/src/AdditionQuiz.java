import java.util.Scanner;

public class AdditionQuiz {
    public static void main(String[] args) {
        int num1 = (int)(System.currentTimeMillis() % 10);
        int num2 = (int)(System.currentTimeMillis() / 7 % 10);
        int num3 = (int)(System.currentTimeMillis() / 4 % 10);

        Scanner input = new Scanner(System.in);
        System.out.print("What is " + num1 + " + " + num2 + " + " + num3 + " ? ");
        int num = input.nextInt();

        System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + num + " is " + (num1 + num2 + num3 == num));
    }
}
