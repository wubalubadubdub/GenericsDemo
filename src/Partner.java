/**
 * Created by bearg on 5/1/2016.
 */
public class Partner extends Person {

    public Partner(final String name, final int age) {

        super(name, age);
    }

    @Override
    public String toString() {

        // Partner inherits the getName() and getAge()
        // methods from superclass Person. An instance
        // of Partner is also an employee. They share
        // the name and age fields, even though in the
        // superclass those are private and aren't
        // directly accessible to the subclass

        return "Partner{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                '}';
    }
}
