import java.util.AbstractList;

/**
 * Created by bearg on 5/2/2016.
 * Very simple example. Not supposed to be an actual implementation.
 */
public class CustomArrayList extends AbstractList {

    private Object[] values;

    public CustomArrayList() {

        values = new Object[0];
    }

    public Object get(final int index) {

        return values[index];
    }

    public boolean add(final Object o) {

        Object[] newValues = new Object[size() + 1];
        for (int i = 0; i < this.size() ; i++) {

            newValues[i] =  values[i];
        }

        newValues[size()] = o;
        values = newValues;
        return true;
    }

    public int size() {

        return values.length;
    }
}
