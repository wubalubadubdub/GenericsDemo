import java.util.Arrays;

/**
 * Created by bearg on 5/1/2016.
 */
public class TestingGround {

    public static void main(String[] args) {

        int[] intArray = new int[5]; // default values of 0
        String[] strArray = new String[5]; // default values of null
        float[] fArray = new float[5]; // default values of 0.0f
        boolean[] boolArray = new boolean[5]; // default values of false

        char[] charArray = {'a', 'b'}; // creates and initializes char[] of length 2
        System.out.println(charArray.length);

        float[][] floatArray = new float[3][2]; // array of three float arrays that each hold 2 floats
        float value = 1.0f;
        for (int row = 0; row < 3; row++ ) {

            for (int column = 0; column < 2; column++) {

                floatArray[row][column] = value;
                value++;
            }
        }

        // you can also initialize multidimensional arrays when the array is declared:
        double[][] doubleArray =
                {{1.0d, 2.0d, 3.0d},
                {4.0d, 5.0d, 6.0d},
                {7.0d, 8.0d, 9.0d}};

        doubleArray[0][0] = 2.0d;

        for (int i = 0; i < 3; i++) {
            System.out.println(Arrays.toString(doubleArray[i]));
        }
    }
}
