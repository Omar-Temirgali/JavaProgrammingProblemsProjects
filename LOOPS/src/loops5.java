public class loops5 {
    public static void main(String[] args) {
        System.out.printf("%-9s%-12s%-3s%-14s%-6s\n", "Miles", "Kilometers", "|", "Kilometers", "Miles");
        System.out.printf("%-9d%-12.3f%-3s%-14d%-6.3f\n", 1, 1.609, "|", 20, 12.430);
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%-9d%-12.3f%-3s%-14d%-6.3f\n", i + 1, (i + 1) * 1.609, "|",25 + 5*(i - 1), (25 + 5*(i - 1)) / (1.609));
        }
    }
}
