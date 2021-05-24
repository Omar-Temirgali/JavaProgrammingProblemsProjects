import java.util.Scanner;

public class Classwork {
    public static void main(String [] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();
        Thread printO = new Thread(new printLetterO(n));
        Thread printNum = new Thread(new printNumber(n));

        long start = System.nanoTime();
        printNum.start();
        printO.start();
        printNum.join();
        printO.join();
        long end = System.nanoTime();

        if (!(printNum.isAlive() && printO.isAlive())) System.out.println("\n" + (end - start));
    }
}
