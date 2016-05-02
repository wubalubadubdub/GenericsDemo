import java.util.SortedSet;

/**
 * Created by bearg on 5/1/2016.
 * SortedPair should take a pair of objects and set its fields so that
 * their values are determined by the sort order we provide, regardless
 * of the order in which we pass the values to its ctor. type parameter T
 * needs to know its sort order, b/c we'll call compareTo method of Comparable<T>
 * interface. With <T extends Comparable<T>>, compiler knows anything being passed
 * in as a left or right is a class that implements Comparable<T>, or in other words
 * elements passed in will be comparable to themselves.
 * NB: When "extends" is used to create a bounded type parameter, it's used in the
 * general sense of "extends" (as in classes) or "implements" (as in interfaces)
 * Having just SortedPair<T extends Comparable> would not guarantee us type saftey,
 * as we could change left.compareTo(right) to left.compareTo(new Object()), and
 * you couldn't compare Object to anything but an Object, so something like
 * SortedPair<Integer> pair = new SortedPair<>(1, 2) would throw a ClassCastException
 * as the 2 would be replaced with an Object and you'd be trying to compare 1 and some Object
 * that might not be an Integer.
 * Changing it to Comparable<T> fixes this problem as Object does not implement Comparable<T>.
 * (Or any interface. Object is the most generic Object possible, so it promising to behave
 * a certain way wouldn't make any sense.) Things passed in must be Comparable to themselves and
 * of the same type T, so they must be comparable to each other, as well.
 */
public class SortedPair<T extends Comparable<T>> {

    private final T first;
    private final T second;

    public SortedPair(T left, T right) {

        // since we can be sure T will be a class that implements Comparable,
        // we can use its compareTo method to sort the inputs into left and right.
        if (left.compareTo(right) < 0) { // left is lower in sort order
            first = left;
            second = right;
        }

        else {
            first = right;
            second = left;
        }
    }

    public T getSecond() {
        return second;
    }

    public T getFirst() {
        return first;
    }
}
