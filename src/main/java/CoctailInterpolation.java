/**
 * Created by Aphex on 03.05.2016.
 */
public class CoctailInterpolation extends Sorter {

    public CoctailInterpolation (int[] array){
        super(array);
    }

    public  void sort() {
        int[] array = getArray();
        int left = 0;
        int right = array.length - 1;

        do
        {

            for (int i = left; i < right; i++)
            {
                if(array[i] > array[i+1])
                {
                    array[i] ^= array[i+1];
                    array[i+1] ^= array[i];
                    array[i] ^= array[i+1];
                }
            }
            right--;
            for (int i = right; i > left ; i--)
            {
                if(array[i] < array[i-1])
                {
                    array[i] ^= array[i-1];
                    array[i-1] ^= array[i];
                    array[i] ^= array[i-1];
                }
            }
            left++;
        } while (left <= right);
        setArray(array);
    }

    


    public int find( int x) {
        int mid;
        int low = 0;
        int high = getArray().length - 1;

        while (getArray()[low] < x && getArray()[high] > x) {
            mid = low + ((x - getArray()[low]) * (high - low)) / (getArray()[high] - getArray()[low]);

            if (getArray()[mid] < x)
                low = mid + 1;
            else if (getArray()[mid] > x)
                high = mid - 1;
            else
                return mid;
        }

        if (getArray()[low] == x)
            return low;
        else if (getArray()[high] == x)
            return high;
        else
            return -1; 
    }
}
