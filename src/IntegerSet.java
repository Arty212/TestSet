import java.util.Arrays;

public class IntegerSet {
    private boolean values[];

    public IntegerSet(int n) {
        this.values = new boolean[n+1];
    }

    public boolean add(int f) {
        boolean result = false;
        if (f >= 0 && f < values.length && !values[f]) {
            values[f] = true;
            result = true;
        }
        return result;
    }

    public boolean contains(int f) {
        boolean result = false;
        if (f >= 0 && f < values.length)
            result = values[f];
        return result;
    }

    public boolean remove(int f){
        boolean result = false;
        if (f >= 0 && f < values.length){
            values[f] = false;
            result = true;
        }
        return result;
    }

    public void clear(){
        Arrays.fill(values, false);
    }


}
