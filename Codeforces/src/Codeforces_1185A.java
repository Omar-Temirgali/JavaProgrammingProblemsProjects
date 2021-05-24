import java.util.Arrays;
import java.util.Scanner;

public class Codeforces_1185A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] places = {in.nextInt(), in.nextInt(), in.nextInt()};
        int d = in.nextInt(), c = 0;
        Arrays.sort(places);
        if (places[1] - places[0] < d) c = c + d - (places[1] - places[0]);
        if (places[2] - places[1] < d) c = c + d - (places[2] - places[1]);
        System.out.println(c);
    }
}
