public class GenericStackArrayList<E> extends java.util.ArrayList<E> {

    public E peek() {
        return get(size() - 1);
    }
    public void push(E o) {
        add(o);
    }
    public E pop() {
        E o = get(size() - 1);
        remove(size() - 1);
        return o;
    }
    public boolean isEmpty() {
        return super.isEmpty();
    }
    @Override
    public String toString() {
        return "stack: " + super.toString();
    }
}
