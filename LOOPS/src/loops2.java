public class loops2 {
    public static void main(String[] afd) {
        final int end = 199;
        //printing table header
        System.out.printf("%9s%15s\n", "Kilograms", "Pounds");
        System.out.printf("%-9d%15.1f\n", 1, 2.2);
        for (int i = 1; i <= 99; i++) {
            System.out.printf("%-9d%15.1f\n", 2*i+1, (2*i+1)*2.2);
        }
    }
}
