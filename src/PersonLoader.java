import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

/**
 * Created by bearg on 5/1/2016.
 */
public class PersonLoader {

    private final RandomAccessFile file;

    public PersonLoader(final File file) throws FileNotFoundException {

        this.file = new RandomAccessFile(file, "rw");

    }

    public Person load() throws ClassNotFoundException {
        return null;
    }
}
