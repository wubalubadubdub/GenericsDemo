import java.util.Comparator;

/**
 * Created by bearg on 5/1/2016.
 */
public class AgeComparator implements Comparator<Person> {

    @Override
    public int compare(final Person left, final Person right) {

        return Integer.compare(left.getAge(), right.getAge()); // pass the job off to Integer class
    }

}
