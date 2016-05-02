import java.util.List;

/**
 * Created by bearg on 5/2/2016.
 * Demonstration that we cannot overload with methods that
 * are differentiable only by generic type parameter, like
 * List<String> and List<Double>
 */
public class Overloading {

    public void print(String param) {

    }

    public void print(Integer param) {

    }

    public void print(List<String> param) {

    }

    /*public void print(List<Integer> param) {

    }*/  // won't compile. both get erased to List at runtime,
    // and these methods will look the same to the compiler.
    // it won't know which method to call.


}
