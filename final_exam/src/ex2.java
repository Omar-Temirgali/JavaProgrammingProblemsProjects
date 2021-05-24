import java.util.*;
public class ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long elapsedTime = in.nextLong();
        Date date = new Date(elapsedTime);
        System.out.println(date.toString());
    }
}

