public class GenericStackArray<E> {
    private E[] array = (E[])(new Object[5]);
    private int size;

    public int getSize() {
        return size;
    }
    public E peek() {
        if (size == 0)
            return null;
        else
            return array[size - 1];
    }
    public void push(E o) {
        array[size++] = o;
        if (size >= array.length) {
            E[] temp = (E[])(new Object[array.length * 2]);
            System.arraycopy(array, 0, temp, 0, array.length);
            array = temp;
        }
    }
    public E pop() {
        E o = array[--size];
        return o;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    @Override
    public String toString(){
        return "stack: " + java.util.Arrays.toString(array);
    }
}
