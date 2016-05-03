/**
 * Created by Aphex on 03.05.2016.
 */
public class QuickBinary extends Sorter {

    public QuickBinary (int[] array){
        super(array);
    }

    public  void sorting() {
        int[] array = this.getArray();
        int startIndex = 0;
        int endIndex = array.length - 1;
        doSort(startIndex, endIndex,array);
        this.setArray(array);
    }

    private  void doSort(int start, int end, int[] array) {
        if (start >= end)
            return;
        int i = start, j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && (array[i] <= array[cur])) {
                i++;
            }
            while (j > cur && (array[cur] <= array[j])) {
                j--;
            }
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
            }
        }
        doSort(start, cur, array);
        doSort(cur+1, end, array);
    }

    public int find(int x) {
        int i = -1;
        if (this.getArray() != null) {
            int low = 0, high = this.getArray().length, mid;
            while (low < high) {
                mid = (low + high) >>> 1;
                if (x == this.getArray()[mid]) {
                    i = mid;
                    break;
                } else {
                    if (x < this.getArray()[mid]) {
                        high = mid;
                    } else {
                        low = mid + 1;
                    }
                }
            }
        }
        return i;
    }
}
