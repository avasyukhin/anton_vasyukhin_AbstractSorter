import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

/**
 * Created by Aphex on 03.05.2016.
 */
public class RandArray {
    public static int[] initArray(int array_length) {
        int[] array = new int[array_length];
        Random generator = new Random();
        for (int i=0; i<array_length; i++) {
            array[i] = generator.nextInt();
        }
        return array;
    }
    public static void printArray(int array_length) {
        ArrayList array = new ArrayList();
        Collections.addAll(array, initArray(array_length));
        Iterator iter = array.iterator();
        while (iter.hasNext()){
            System.out.print(iter.next());
            if (iter.hasNext()){
                System.out.print(", ");
            }else {
                System.out.print("\n");
            }

        }



    }
}
