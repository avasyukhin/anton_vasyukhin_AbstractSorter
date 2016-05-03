/**
 * Created by Aphex on 03.05.2016.
 */
public class CoctailInterpolation extends Sorter {

    public CoctailInterpolation (int[] array){
        super(array);
    }

    public  void sorting() {
        int[] array = this.getArray();
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
        this.setArray(array);
    }

    


    public int find( int x) {
        int mid;
        int low = 0;
        int high = this.getArray().length - 1;

        while (this.getArray()[low] < x && this.getArray()[high] > x) {
            mid = low + ((x - this.getArray()[low]) * (high - low)) / (this.getArray()[high] - this.getArray()[low]);

            if (this.getArray()[mid] < x)
                low = mid + 1;
            else if (this.getArray()[mid] > x)
                high = mid - 1;
            else
                return mid;
        }

        if (this.getArray()[low] == x)
            return low;
        else if (this.getArray()[high] == x)
            return high;
        else
            return -1; 
    }
}
