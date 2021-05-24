// LIFO - last in first out

public class StackOfObjects {
    private Object[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 16;

    public StackOfObjects() {
        this(DEFAULT_CAPACITY);
    }

    public StackOfObjects(int capacity) {
        elements = new Object[capacity];
    }

    public void push(Object value) {
        if (size >= elements.length) {
            Object[] temp = new Object[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }

        elements[size++] = value;
    }

    public Object pop() {
        return elements[--size];
    }

    public Object peek() {
        return elements[size - 1];
    }

    public boolean empty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
}
