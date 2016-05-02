/**
 * Created by bearg on 5/2/2016.
 * UncompileException won't compile if we uncomment the <T>.
 * Since the type gets erased, there's no way to do an instanceof,
 * which is what is used to determine if the exception type thrown
 * matches the exception type in the catch parameter.
 * Generic classes cannot extend java.lang.Throwable -- anything that
 * you can do a throw new of.
 */
public class UncompilableException/*<T> */ extends Exception {

    public static void throwIt() {

        try {

            throw new UncompilableException();
        }

        catch (UncompilableException/*<T>*/ e) {

            e.printStackTrace();
        }
    }
}
