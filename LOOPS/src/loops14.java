public class loops14 {
    public static void main(String[] low) {
        System.out.println("        ASCII character table\n");
        int count = 0;
        for (int i = 32; i <= 126; i++) {
            char cht = (char)i;
            System.out.print(cht + "  ");
            count += 1;
            if (count == 10) {
                System.out.println("");
                count = 0;
            }
        }
    }
}
