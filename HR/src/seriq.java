import java.util.Scanner;

public class seriq {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine() + "1";
        String output = "";
        for (int i = 0; i < input.length()-1; i++) {
            for (int j = 0; j < output.length()-1; j++) {
                if (input.charAt(i) != input.charAt(i)) {
                    output = output + input.charAt(i);
                }
            }
        }
        System.out.println(output);

    }
}
