import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = scanner.nextInt();
        System.out.print("Enter y: ");
        int y = scanner.nextInt();
        System.out.print("Enter d: ");
        int d = scanner.nextInt();
        int num = solution(x, y, d);
        System.out.println(num);
    }
        public static int solution(int x, int y, int d) {
        int num = (int) Math.ceil((y - x)/(double)d);
        return num;
    }
}
