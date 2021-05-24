import java.util.ArrayList;

public class task1 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("Hello");
        a.add("Hello");
        a.add("How");
        a.add("Are");
        a.add("You");
        ArrayList<String> b = new ArrayList<>();
        b.add("Hello");
        b.add("How");
        b.add("How");
        b.add("I");
        b.add("am");
        b.add("fine");
        ArrayList<String> union = new ArrayList<>();
        a = removeCopies(a);
        b = removeCopies(b);
        union = union(a,b);
        union = removeCopies(union);
        for (String s : union) {
            System.out.println(s);
        }
    }
    public static <E> ArrayList<E> union(ArrayList<E> a, ArrayList<E> b) {
        a.addAll(b);
        return a;
    }
    public static <E> ArrayList<E> removeCopies(ArrayList<E> list) {
        ArrayList<E> union = new ArrayList<>(list.size());
        for (E aList : list) {
            if (!union.contains(aList)) {
                union.add(aList);
            }
        }
        return union;
    }
}
