public class MyStack {
    int[] arr =new int[10];
    int p;
    int lenght = 0;
    void push(int a){
        if (lenght==arr.length){
            int[] secondarr = new int[arr.length+1];
            for (int i = 0; i < arr.length; i++) {
                secondarr[i] = arr[i];
            }
            arr = secondarr;
        }
        arr[lenght++] = a;
    }
    int pop(){
        p = arr[lenght-1];
        arr[lenght-1] = arr[lenght];
        lenght--;
        return p;
    }
}
