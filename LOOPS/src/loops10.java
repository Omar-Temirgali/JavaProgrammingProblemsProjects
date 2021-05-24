public class loops10 {
    public static void main(String[] afss) {
        int count = 0;
        for (int i = 100; i <= 200; i++) {
            if (i % 5 == 0 || i % 6 == 0) {
                System.out.print(i + " ");
                count += 1;
            }
            if (count == 10) {
                System.out.println("\n");
                count = 0;
            }
        }
    }
}
