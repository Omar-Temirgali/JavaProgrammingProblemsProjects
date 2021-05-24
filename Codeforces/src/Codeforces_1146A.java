import java.util.Scanner;

public class Codeforces_1146A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int l = s.length();
        int c = 0;
        for(int i = 0; i < s.length(); i++)
            if(s.charAt(i) == 'a')
                c++;
        while(c * 2 <= l) {
            l--;
        }
        System.out.println(l);
    }
}
