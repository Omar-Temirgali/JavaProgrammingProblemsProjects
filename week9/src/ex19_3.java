import java.util.ArrayList;

public class ex19_3 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 10; i++)
            strings.add("Hello");

        strings = removeDuplicates(strings);
        for (String s : strings) {
            System.out.println(s);
        }

    }
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        ArrayList<E> newList = new ArrayList<>(list.size());
        for (E aList : list) {
            if (!newList.contains(aList)) {
                newList.add(aList);
            }
        }
        return newList;
    }
}

