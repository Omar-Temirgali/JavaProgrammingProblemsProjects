public class loops18 {
    public static void main(String[] mnb) {
        for (int j = 1; j <= 6; j++) {
            for (int i = 1; i <= j; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        for (int j = 1; j <= 6; j++) {
            for (int i = 1; i <= 6 - j; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
