import com.sun.org.apache.xerces.internal.xs.StringList;

import java.util.HashSet;
import java.util.Iterator;

public class Demo {
    public static void main(String[] args) {
//        GenericStackArray<String> list = new GenericStackArray<>();
//        list.push("New York");
//        list.push("Tokyo");
//        list.push("Almaty");
//
//        System.out.println(list.getSize());
//        System.out.println(list.isEmpty());
//        System.out.println(list.toString());
//        System.out.println(list.pop());
//        System.out.println(list.toString());
//
//        list.push("Atlanta");
//        list.push("Delhi");
//        list.push("Moscow");
//        list.pop();
//        System.out.println(list.toString());
//        list.push("Astana");
//        list.push("Sydney");
//
//        System.out.println(list.toString());
//        System.out.println(list.peek());
//        GenericStackArrayList<String> list = new GenericStackArrayList<>();
//        list.push("PPP");
//        list.push("OOO");
//        list.push("FFF");
//        list.push("LLL");
////        list.pop();
//        int i = list.size() - 1;
//        while (i >= 0) {
//            System.out.println(list.get(i));
//            i--;
//        }
//        System.out.println();
//        Complex[][] m1 = createMatrix(3);
//        Complex[][] m2 = createMatrix(3);
//
//
//        ComplexMatrix matrix = new ComplexMatrix();
//        ComplexMatrix.printResult(m1, m2, matrix.addMatrix(m1, m2), '+');
//
//    }
//
//    public static Complex[][] createMatrix(int size) {
//        Complex[][] m1 = new Complex[size][size];
//        for (int i = 0; i < m1.length; i++) {
//            for (int j = 0; j < m1[i].length; j++) {
//
//                m1[i][j] = new Complex(Math.random() * 10, Math.random() * 10);
//            }
//        }
//
//        return m1;
//    }

        HashSet<String> setA = new HashSet<String>();
        setA.add("MAMA");
        setA.add("PAPA");
        setA.add("LOLO");
        setA.add("YOYO");
        HashSet<String> setB = new HashSet<String>();
        setB.add("JOJO");
        setB.add("LOLO");
        setB.add("WEWE");
        setB.add("QIQI");
        Iterator<String> iter = setA.iterator();
        System.out.println(iter.next());
    }
}
