import java.util.Comparator;

/**
 * Created by bearg on 5/1/2016.
 * We have a class called ReverseComparator and it's generic, because it
 * has type parameter T. It implements a generic interface called Comparator<T>
 * and we pass the same T up the chain. When we create a ReverseComparator<T>,
 * we will pass a Comparator<T> in the ctor that will be reversed, called
 * delegateComparator. We're using the compare method delegateComparator, which is the one
 * pass in, except that we multiply the return value by -1. The reverses the sense
 * of the comparison, so that if we had left < right before, we now have left > right,
 * and so on.
 */
public class ReverseComparator<T> implements Comparator<T> {

    private final Comparator<T> delegateComparator;

    public ReverseComparator(final Comparator<T> delegateComparator) {
        this.delegateComparator = delegateComparator;
    }

    @Override
    public int compare(final T left, final T right) {

        return -1 * delegateComparator.compare(left, right);
    }
}

