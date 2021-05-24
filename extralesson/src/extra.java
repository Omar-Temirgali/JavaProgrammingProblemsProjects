import java.util.Scanner;

public class extra {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.nextLine().toLowerCase();

        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == 'a' || a.charAt(i) == 'i' || a.charAt(i) == 'u' || a.charAt(i) == 'e'
                    || a.charAt(i) == 'o' || a.charAt(i) == 'y') {
                //count++;
                //System.out.println(a.charAt(i));
            }
            else
                count++;
        }
        System.out.println(count);

    }
}
