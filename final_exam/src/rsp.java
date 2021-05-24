import java.util.*;
import java.lang.*;
public class rsp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //int num = in.nextInt();
        //String number = num + "";
        //String str = "Jjjaaavvvaa";
        //System.out.println(str.matches("Ja{3}.*"));
        /*if (number.matches("[\\d]*[02468]")) {
            System.out.println("Number is even");
        } else if (number.matches("[\\d]*[13579]")) {
            System.out.println("Number is odd");
        }*/
        /*String password = in.nextLine();
        if (password.matches("[A-Z][\\w]{3,9}")) {
            System.out.println("The password can be used");
        } else
            System.out.println("The password can't be used");*/
        /*String str1 = str.toLowerCase().replaceAll("(.)\\1+","$1");
        System.out.println(str1);
        String newStr2 = str1.substring(0, 1).toUpperCase() + str1.substring(1);
        System.out.println(newStr2);*/
        /*String word = in.nextLine().toLowerCase();
        String word1 = word.replaceAll("[AaEeOoIiUu]", "");
        String[] word2 = word1.split("");
        for (int i = 0; i < word2.length; i++) {
            word2[i] = "." + word2[i];
        }
        String word3 = String.join("", word2);
        System.out.println(word1);
        System.out.println(word3);*/
        int n = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        //boolean[] div = new boolean[n];
        //boolean div = false;
        boolean DIV = false;
        String[] div = new String[n];
        for (int i = 0; i < n; i++) {
            if (nums[n-1] % nums[i] == 0) {
                DIV = true;
            } else {
                DIV = false;
            }
            if (DIV) {
                div[i] = "1";
            }
        }
        //List<String> diV = new ArrayList<String>(Arrays.asList(div));
        boolean divC = false;
        for (int i = 0; i < div.length; i++) {
            if (div[i] == "1") {
                divC = true;
            }
        }
        if(divC) {
            System.out.println("These numbers are friendly");
        } else {
            System.out.println("These numbers aren't friendly");
        }
    }
}
