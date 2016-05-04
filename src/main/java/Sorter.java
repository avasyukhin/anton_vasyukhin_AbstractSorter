/**
 * Created by Aphex on 03.05.2016.
 */
public abstract class Sorter {

    private int[] array;

    public Sorter(int[] array){
        this.array = array;
    }

    public void setArray(int[] array){
        this.array = array;
    }

    public int[] getArray(){
        return array;
    }

    public abstract void sort();

    public abstract int find(int x);
}
