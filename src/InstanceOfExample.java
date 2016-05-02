/**
 * Created by bearg on 5/2/2016.
 */
public class InstanceOfExample<T> {

    public boolean equals(Object o) {

        // illegal to have generic type parameter when using instance of.
        // at runtime, InstanceOfExample<String> looks the same as InstanceOfExample<Integer>

        if (o instanceof InstanceOfExample/*<T>*/) {

            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        /*System.out.println(new InstanceOfExample<>()
        instanceof Integer);*/ // won't compile

        System.out.println(new InstanceOfExample<>()
                instanceof Object); // true. all classes subclass Object implictly.

    }
}
