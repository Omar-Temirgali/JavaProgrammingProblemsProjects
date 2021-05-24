// LIFO - last in first out

public class Stack<E> {
    private E[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 16;

    public Stack() {
        this(DEFAULT_CAPACITY);
    }

    public Stack(int capacity) {
        elements = (E[]) new Object[capacity];
    }

    public void push(E value) {
        if (size >= elements.length) {
            E[] temp = (E[]) new Object[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }

        elements[size++] = value;
    }

    public E pop() {
        return elements[--size];
    }

    public E peek() {
        return elements[size - 1];
    }

    public boolean empty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
}
