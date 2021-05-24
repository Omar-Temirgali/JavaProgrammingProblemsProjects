import java.util.Arrays;
import java.util.Objects;

public class jjj {
    public static void main(String[] args) {
        String[] str = {"1) 20cm pizz Cheese mear + vegetables:1400", "2) 40cm pizz Cheese meat + vegetables:2200", "3) 30cm pizz Cheese meat:1700", "4) 20 cm pizza kknfkesj + sgr:700", null, null};
        int n = str.length;
        int[] totalPrices = new int[n];
        int price = 0;
        int m = 0;
        Arrays.stream(str).filter(Objects::nonNull);
        for (int i = 0; i < str.length; i++) {
            price = Integer.parseInt(str[i].substring(str[i].indexOf(':') + 1));
            totalPrices[i] = price;
        }

        int sum = 0;
        for (int i = 0; i < totalPrices.length; i++) {
            sum += totalPrices[i];
        }
        System.out.println(sum);
    }
}
