import java.util.Scanner;

public class Codeforces_1216A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), c = 0;
        StringBuilder s = new StringBuilder(in.next());
        for(int i = 0; i < n; i = i + 2 ){
            if(s.charAt(i) == 'a' && s.charAt(i + 1) == 'a'){
                s.setCharAt(i + 1, 'b');
                c++;
            }
            if(s.charAt(i) == 'b' && s.charAt(i + 1) == 'b'){
                s.setCharAt(i + 1, 'a');
                c++;
            }
        }
        System.out.println(c);
        System.out.println(s);
    }
}
