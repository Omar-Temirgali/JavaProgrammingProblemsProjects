import java.util.ArrayList;

class ST<Key, Value> {
    private ArrayList<Key> keys;
    private ArrayList<Value> values;

    ST() {
        keys = new ArrayList<>();
        values = new ArrayList<>();
    }
    void put(Key key, Value val) {
        keys.add(key); values.add(val);
        int last = values.size() - 1;
        if (values.get(last) == null) {
            keys.remove(last);
            values.remove(last);
        }
    }
    Value get(Key key) {
        if (!keys.contains(key)) return null;
        return values.get(keys.indexOf(key));
    }
    void delete(Key key) {
        values.remove(keys.indexOf(key));
        keys.remove(key);
    }
    boolean contains(Key key) {
        return keys.contains(key);
    }
    boolean isEmpty() {
        return keys.isEmpty() && values.isEmpty();
    }
    int size() {
        return keys.size();
    }
    Iterable<Key> keys() {
        return keys;
    }
}

