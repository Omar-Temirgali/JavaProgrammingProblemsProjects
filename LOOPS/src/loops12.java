public class loops12 {
    public static void main(String[] gsr) {
        int n = 1;
        while (Math.pow(n, 3) <= 12000) {
            n++;
        }
        n--;
        System.out.println("The n is " + n);
        System.out.println("The n^3 is " + Math.pow(n, 3));
    }
}
