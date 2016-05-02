import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by bearg on 5/1/2016.
 */
public class PersonSaver {

    private final RandomAccessFile file;

    public PersonSaver(final File file) throws FileNotFoundException {

        this.file = new RandomAccessFile(file, "rw");

    }

    public Person save() throws IOException {
        return null;
    }
}
