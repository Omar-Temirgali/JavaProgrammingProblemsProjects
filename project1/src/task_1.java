import java.math.BigInteger;
import java.util.ArrayList;
public class task_1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Complex a = new Complex(2, 3);
        Complex b = new Complex(4, -5);
        Complex d = a.divide(b);
        //System.out.println(d);
        //System.out.println(a.abs());
        //System.out.println(b);
        //System.out.println(c);
        Complex[] complexes = {new Complex(-3, 5), new Complex(2, 9), new Complex(1, 4), new Complex(0, 8), new Complex(4, 0)};
        java.util.Arrays.sort(complexes);
        for (Complex complex: complexes) {
            System.out.println(complex);
        }
        Complex c = (Complex)a.clone();
        System.out.println(a.equals(c));

        Integer num1 = 125;
        Integer num2 = 1397;
        Double numD1 = 46.0616;
        Double numD2 = -546.579;
        BigInteger bigNum1 = new BigInteger("16461265764");
        BigInteger bigNum2 = new BigInteger("8789846515166465465465");
        ArrayList<Object> array = new ArrayList<Object>();
        array.add(num1);
        array.add(num2);
        array.add(numD1);
        array.add(numD2);
        array.add(bigNum1);
        array.add(bigNum2);
        array.add(a);
        array.add(b);
        //Object[] newArr = array.toArray();
        for (int i = 0; i < array.size(); i++) {
            //System.out.println(array.doubleValue());
        }
    }
}
