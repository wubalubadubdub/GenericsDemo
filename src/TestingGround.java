import java.util.*;

/**
 * Created by bearg on 5/1/2016.
 */
public class TestingGround {

    public static void main(String[] args) {

        /*CircularBuffer<String> buffer = new CircularBuffer<>(10);

        buffer.offer("a");
        buffer.offer("bc");
        buffer.offer("d");

        String value = concatenate(buffer);
        System.out.println(value);

        String[] someStrings = {"a", "b", "c", "d"};

        Set<String> testSet = new HashSet<>();
       testSet.addAll(Arrays.asList(someStrings));

        testSet.forEach(System.out::println); // forEach is a default method of Iterable interface
        // any class that implements Iterable or an interface that extends Iterable
        // (e.g. any Collection) will have access to this method.*/

        Person donDraper = new Person("Don Draper", 89);
        Person peggyOlson = new Person("Peggy Olson", 65);
        Person bertCooper = new Person("Bert Cooper", 100);

        List<Person> madMen = new ArrayList<>();
        madMen.add(donDraper);
        madMen.add(peggyOlson);
        madMen.add(bertCooper);


        final Person youngestCastMember = min(madMen, new AgeComparator());
        System.out.println(youngestCastMember);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // System.out.println(min(numbers, (n1, n2) -> Integer.compare(n1, n2))); // option 1
        // compareTo is called on one Integer, takes another as a parameter, and returns
        // another Integer, so it fits the (n1, n2) -> n1.compare(n2) type seen above

        System.out.println(min(numbers, Integer::compare)); // java 8 version
        // Integer.compare is an implementation of Comparator interface's compare method



        // want to write the min method generically, so it can find min age of
        // People, or min number of some Number class, or whatever.

        System.out.println(madMen);

        // Collections.sort(madMen, new AgeComparator()); // can pass instance of class implementing Comparator
        // we can use create a ReverseComparator using our AgeComparator to sort the people by
        // decreasing age

        Collections.sort(madMen, new ReverseComparator<>(new AgeComparator()));
        // since AgeComparator implements Comparator<Person> we pass it into the
        // ctor of ReverseComparator<T>, Person gets set as the type T for
        // the Comparator<T> field of ReverseComparator<T>. Whatever T is in that
        // Comparator<T>, it will be the same T in ReverseComparator<T>.
        // That's how the type for ReverseComparator<T> can be inferred, and we can
        // just write ReverseComparator<> instead of ReverseComparator<Person> in the
        // line above.

        System.out.println(madMen);

        SortedPair<Integer> pair = new SortedPair<>(1, 2);
        // valid since Integer implements Comparable<Integer>


    }

    // type parameter goes between method modifier declarations and before return type
    // this type parameter T is limited to this one method, since we didn't declare it with class name
    // the <T> declaration for the method means that we will use generic type parameter T in the
    // method. It does not mean that the returns type T. public static <T> Object returns an Object,
    // not a T. However public static <T> T is both parameterized by type T and returns type T.

    // the List and Comparator passed in must now be of the same type. above, we pass in a
    // List<Person> and a Comparator<Person>, so this is fine.
    public static <T> T min(List<T> values, Comparator<T> comparator) {

        if (values.isEmpty()) {

            throw new IllegalArgumentException("List is empty. Cannot find min.");
        }

        T lowestElement = values.get(0);

        for (int i = 1; i < values.size(); i++) {
            final T element = values.get(i);

            if (comparator.compare(element, lowestElement) < 0) { // current element is less than previous low
                lowestElement = element;
            }
        }

        return lowestElement;
    }

    private static String concatenate(final CircularBuffer<String> buffer) {

        StringBuilder result = new StringBuilder();

        String value;
        while ((value = (String) buffer.poll()) != null) {

            result.append(value);
        }

        return result.toString();
    }
}
