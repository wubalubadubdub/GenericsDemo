/**
 * Created by bearg on 5/1/2016.
 */
public class CircularBuffer {

    private Object[] buffer;
    private int readCursor = 0;
    private int writeCursor = 0;

    public CircularBuffer(int size) {

        buffer = new Object[size];
    }

    public boolean offer(Object value) {

        if (buffer[writeCursor] != null) {

            return false;
        }

        buffer[writeCursor] = value;
        writeCursor = next(writeCursor);

        return true;
    }

    public Object poll() {

        final Object value = buffer[readCursor];
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
