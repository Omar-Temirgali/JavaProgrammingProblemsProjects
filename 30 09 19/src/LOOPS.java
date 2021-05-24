public class LOOPS {
    public static void main(String [] args) {
        final int NUM = 50; // number of primes
        final int NUMLINE = 10; // number of primes per line
        int count = 0;
        int number = 2;
        System.out.println("The first 50 prime number are \n");

        while (count < NUM) {
            boolean isPrime = true;

            for (int divisor = 2; divisor <= number / 2; divisor++) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;

                if (count % NUMLINE == 0) {
                    System.out.println(number);
                }
                else
                    System.out.println(number + " ");
            }
            number++;
        }
    }
}
