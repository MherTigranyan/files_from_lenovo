import java.util.Arrays;

public class MyArray {
    int[] array = new int[5];
    int length = 0;

    public void add(int a) {
        if (length == array.length) {
            int[] secondArray = new int[array.length + 5];
            for (int i = 0; i < array.length; i++) {
                secondArray[i] = array[i];
            }
            array = secondArray;

        }
        array[length++] = a;
    }


    public void remove(int i) {

        for (int i1 = i; i1 < length-1; i1++) {
            array[i] = array[i+1];
        }
        length--;
    }


    public int get(int i) {
        return array[i];
    }


    public int length(){
        return length;
    }

}
