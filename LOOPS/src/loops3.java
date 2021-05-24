public class loops3 {
    public static void main(String[] ar) {
        System.out.printf("%5s%15s\n", "Miles", "Kilometeres");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%-9d%.3f\n", i, i * 1.609);
        }
    }
}
