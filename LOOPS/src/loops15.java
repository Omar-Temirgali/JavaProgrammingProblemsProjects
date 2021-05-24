public class loops15 {
    public static void main(String[] pwoe) {
        for (char i = '!'; i <= '~'; i++) {
            System.out.print(i + " ");
            if ((i-32) % 10 == 0) {
                System.out.println("");
            }
        }
    }
}
