public class loops4 {
    public static void main(String[] args) {
        System.out.printf("%9s%9s%5s%10s%15s\n", "Kilograms", "Pounds", "|", "Pounds", "Kilograms");
        System.out.printf("%-9d%9.1f%5s%4s%-5d%16.2f\n", 1, 2.2, "|", " ",20, 9.09);
        for (int i = 1; i <= 99; i++) {
            System.out.printf("%-9d%9.1f%5s%4s%-5d%16.2f\n", 2*i +1, (2*i + 1) * 2.2, "|", " ", 25 + 5*(i-1), (25 +5*(i-1))/(2.2));
        }
    }
}
