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

        System.out.println(madMen);

        Collections.sort(madMen, new AgeComparator()); // can pass instance of class implementing Comparator

        System.out.println(madMen);

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
