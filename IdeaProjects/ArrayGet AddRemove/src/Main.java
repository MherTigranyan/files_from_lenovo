public class Main {
    public static void main(String[] args) {
       MyArray array = new MyArray() ;

       array.add(0);
       array.add(1);
       array.add(2);
       array.add(3);
       array.add(4);
       array.add(5);
       array.add(6);
       array.add(7);

       array.remove(6);

        for (int i = 0; i < array.length() ; i++) {
            System.out.println(array.get(i));
        }
    }
}
