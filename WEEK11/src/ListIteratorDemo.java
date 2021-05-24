import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List<String> food = new LinkedList<>();
        food.add("Sushi");
        food.add("Pizza");
        food.add("Ramen");
        food.add("Kimchi");
        food.add("Fried Chicken");
        food.add("Tteokpokki");
        ListIterator<String> iterator = food.listIterator();
        // Traversing the list in forward direction
        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");
        System.out.println();
        //Traversing the list in backward direction
        while (iterator.hasPrevious())
            System.out.print(iterator.previous() + " ");
        System.out.println();
    }
}
