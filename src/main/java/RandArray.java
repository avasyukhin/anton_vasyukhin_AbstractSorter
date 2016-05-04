import java.util.Random;

/**
 * Created by Aphex on 03.05.2016.
 */
public class RandArray {
    public static int[] initArray(int ARRAY_LENGTH) {
        int[] array = new int[ARRAY_LENGTH];
        Random generator = new Random();
        for (int i=0; i<ARRAY_LENGTH; i++) {
            array[i] = generator.nextInt();
        }
        return array;
    }
    public static void printArray(int ARRAY_LENGTH) {
        int [] array = initArray(ARRAY_LENGTH);
        for (int i=0; i<ARRAY_LENGTH-1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[ARRAY_LENGTH-1]);
    }
}
