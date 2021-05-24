import java.util.Scanner;

public class bracket {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 2; i <= n - i; i++)
            if (isPrime(i) && isPrime(n - i)) {
                System.out.println(i + " " + (n - i));
                break;
            }
    }
    private static boolean isPrime(int n){
        int factors = 0;
        for(int i = 1; i <= n; i++) if(n % i == 0) factors++;
        return factors == 2;
    }
}
