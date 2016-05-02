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

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final Person person = (Person) o;

        if (getAge() != person.getAge()) return false;
        return getName().equals(person.getName());

    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getAge();
        return result;
    }
}
