import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        int[] arr = {2, 3, 65, 98, 5};
        Dinamic dinamic = new Dinamic();
        dinamic.reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}
