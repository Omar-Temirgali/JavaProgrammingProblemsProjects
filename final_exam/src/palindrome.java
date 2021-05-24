import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int low = 0;
        int high = str.length() - 1;
        boolean palindrome = true;
        while (low < high) {
            if (str.charAt(low) != str.charAt(high)) {
                palindrome = false;
                break;
            }
            low++;
            high--;
        }
        if (palindrome) System.out.println("palindrome");
        else System.out.println("not palindrome");
    }
}
