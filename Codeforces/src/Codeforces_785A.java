import java.util.Scanner;

public class Codeforces_785A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int sum = 0;
        String[] poly = new String[t];
        for (int i = 0; i < t; i++) {
            poly[i] = in.next();
            switch (poly[i].charAt(0)) {
                case 'T': sum += 4; break;
                case 'C': sum += 6; break;
                case 'O': sum += 8; break;
                case 'D': sum += 12;break;
                case 'I': sum += 20;
            }
        }
        System.out.println(sum);
    }
}
