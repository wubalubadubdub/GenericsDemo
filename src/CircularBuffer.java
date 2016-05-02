/**
 * Created by bearg on 5/1/2016.
 * T is type parameter. It stands for a type like Integer, String,
 * Person, Horse, etc.
 */
public class CircularBuffer<T> {

    private T[] buffer;
    private int readCursor = 0;
    private int writeCursor = 0;

    public CircularBuffer(int size) {

        buffer = (T[]) new Object[size]; // casting Object array to T array
    }

    public boolean offer(T value) {

        if (buffer[writeCursor] != null) {

            return false;
        }

        buffer[writeCursor] = value;
        writeCursor = next(writeCursor);

        return true;
    }

    public T poll() {

        final T value = buffer[readCursor];
        if (value != null) {

            buffer[readCursor] = null;
            readCursor = next(readCursor);
        }

        return value; // if there's no element to get, return null
    }

    private int next(int index) {

        return (index + 1) % buffer.length; // loop back to the beginning when end is reached

    }
}
