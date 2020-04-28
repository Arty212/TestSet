import java.util.ArrayList;

public class ObjectSet {

    private ArrayList tables[];
    private int capacity;

    public ObjectSet(int capacity) {
        this.capacity = capacity;
        tables = new ArrayList[capacity];
        for (int i = 0; i < capacity; i++)
            tables[i] = new ArrayList();
    }

    public boolean add(Object o) {
        boolean result = false;
        int hash = Math.abs(o.hashCode() % capacity);
        if (!tables[hash].contains(o)) {
            tables[hash].add(o);
            result = true;
        }
        return result;
    }

    public boolean contains(Object o) {
        int hash = Math.abs(o.hashCode() % capacity);
        return tables[hash].contains(o);
    }

    public boolean remove(Object o) {
        boolean result = false;
        int hash = Math.abs(o.hashCode() % capacity);
        if (tables[hash].contains(o)) {
            tables[hash].remove(o);
            result = true;
        }
        return result;
    }

    public void clear() {
        for (ArrayList i : tables)
            i.clear();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (ArrayList i : tables)
            result.append(i.toString()).append("\n");
        return result.toString();
    }
}
