public class loops6 {
    public static void main(String[] afe) {
        double tuition = 10000;
        for (int i = 1; i <= 10; i++) {
            tuition += tuition*0.05;
        }
        System.out.println("The tuition in ten years will be $" + Math.round(tuition*100) / 100.0);
        int fee = 10000;
        int total = 0;
        for (int i = 1; i <= 14; i++) {
            fee += fee*.05;
            if (i > 10) {
                total += fee;
            }
        }
        System.out.println("The total cost of 4 years is $" + total);
    }
}
