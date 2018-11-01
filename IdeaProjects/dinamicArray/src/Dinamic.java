public class Dinamic {

    public void reverse(int[] a){
        for(int i = 0; i < a.length / 2; i++)
        {
            int temp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = temp;
        }
    }

    public int size(int[] s){
        return s.length;
    }

    public

}
