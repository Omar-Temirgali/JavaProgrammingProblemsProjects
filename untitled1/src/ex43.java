import java.util.*;
public class ex43 {
    public static void main(String[] args) {
        final double radius = 6371.01;
        Scanner in = new Scanner(System.in);
        double d1, d2, d3, d4, d5, p1, p2, s1, s2;
        d2 = radius * Math.acos(Math.sin(Math.toRadians(33.7490)) * Math.sin(Math.toRadians(35.2271)) + Math.cos(Math.toRadians(33.7490))
        * Math.cos(Math.toRadians(35.2271)) * Math.cos(Math.toRadians(84.3880 - 80.8431)));
        d1 = radius * Math.acos(Math.sin(Math.toRadians(33.7490)) * Math.sin(Math.toRadians(28.5383)) + Math.cos(Math.toRadians(33.7490))
                * Math.cos(Math.toRadians(28.5383)) * Math.cos(Math.toRadians(84.3880 - 81.3792)));
        d3 = radius * Math.acos(Math.sin(Math.toRadians(35.2271)) * Math.sin(Math.toRadians(32.0809)) + Math.cos(Math.toRadians(35.2271))
                * Math.cos(Math.toRadians(32.0809)) * Math.cos(Math.toRadians(80.8431 - 81.0912)));
        d4 = radius * Math.acos(Math.sin(Math.toRadians(32.0809)) * Math.sin(Math.toRadians(28.5383)) + Math.cos(Math.toRadians(32.0809))
                * Math.cos(Math.toRadians(28.5383)) * Math.cos(Math.toRadians(81.0912 - 81.3792)));
        d5 = radius * Math.acos(Math.sin(Math.toRadians(33.7490)) * Math.sin(Math.toRadians(32.0809)) + Math.cos(Math.toRadians(33.7490))
                * Math.cos(Math.toRadians(32.0809)) * Math.cos(Math.toRadians(84.3880 - 81.0912)));
        p1 = (d2 + d3 + d5) / 2;
        p2 = (d5 + d1 + d4) / 2;
        s1 = Math.pow((p1 * (p1 - d2) * (p1 - d3) * (p1 - d5)), 0.5);
        s2 = Math.pow((p2 * (p2 - d5) * (p2 - d1) * (p2 - d4)), 0.5);
        System.out.println(s1 + s2 + " km^2");

    }
}
