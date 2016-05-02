import java.util.List;

/**
 * Created by bearg on 5/2/2016.
 */
public class Erasure<T, B extends Comparable<B>> {

    public void unbounded(T param) {
        // compiles to bytecode that takes java/lang/Object with return type V for void.
        // can be seen by looking at output of descriptor line when
        // running javap, which decompiles the bytecode .class file
        // back into a source code .java file
    }

    public void lists(List<String> param, List<List<T>> param2) {

        String s = param.get(0); // at runtime, List<String> is just a List
        // and a cast String s = (String) param.get(0) will be added

        // compiles to:
        // descriptor: (Ljava/util/List;Ljava/util/List;)V -- takes two raw Lists and returns void

    }

    public void bounded(B param) {

        // compiles to:
        // descriptor: (Ljava/lang/Comparable;)V -- takes a Comparable unparameterized

    }

}


