import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Map<K, V> {
    private ArrayList<K> keys;
    private ArrayList<V> values;

    public Map() {
    }

    public void set(K key, V value) {

    }

    public V get(K key) {

    }

    public boolean contains(K key) {
        return keys.contains(key);
    }

    public int size() {
        return keys.size();
    }

    public ArrayList<K> getKeys() {
        return keys;
    }

    public ArrayList<V> getValues() {
        return values;
    }

    public void clear() {
        keys.clear();
        values.clear();
    }

    public boolean isEmpty() {
        return keys.isEmpty();
    }

    public String toString() {

    }
}
