import java.util.Scanner;

public class ict_2lab_1ex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();

        if (rookChessCheck(x1, y1, x2, y2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
    public static boolean rookChessCheck(int x1, int y1, int x2, int y2) {
        if (x2 == x1 & y2 > 0 & y2 < 9) {
            return true;
        } else if (x2 > 0 & x2 < 9 & y2 == y1) {
            return true;
        }
        return false;
    }
}
