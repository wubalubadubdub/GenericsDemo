import java.util.Objects;

/**
 * Created by bearg on 5/1/2016.
 */
public class Person {

    private final String name;
    private final int age;

    public Person(String name, int age) {

        Objects.requireNonNull(name);

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {

        return "Person{name=" +
                "'" + name + "', " +
                "age=" + age + "}";
    }
}
