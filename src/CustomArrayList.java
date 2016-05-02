import java.util.AbstractList;

/**
 * Created by bearg on 5/2/2016.
 * Very simple example. Not supposed to be an actual implementation.
 */
public class CustomArrayList<T> extends AbstractList<T> {

    private Object[] values;

    public CustomArrayList() {

        // can't do new T[0]. At runtime, don't know what T is. It gets erased at
        // compile time, so we can't instantiate reified array based on that.
        // one approach to interoperability between generics and arrays: use a cast.
        // values = (T[]) new Object[0]
        values = new Object[0];
    }

    public T get(final int index) {

        return (T) values[index];
    }

    public boolean add(final T t) {

        Object[] newValues = new Object[size() + 1];
        for (int i = 0; i < this.size() ; i++) {

            newValues[i] =  values[i];
        }

        newValues[size()] = t;
        values = newValues;
        return true;
    }

    public int size() {

        return values.length;
    }
}
