public class loops9 {
    public static void main(String[] agsf) {
        int itemcount = 0;
        for (int i = 100; i <= 1000; i++) {
            if (i % 5 == 0 && i % 6 == 0) {
                System.out.print(i + " ");
                itemcount += 1;
                if (itemcount == 10) {
                    System.out.println("\n");
                    itemcount = 0;
                }
            }
        }
    }
}
