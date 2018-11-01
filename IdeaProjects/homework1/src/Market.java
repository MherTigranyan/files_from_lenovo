import java.util.ArrayList;

public class Market {
    ArrayList<String> list = new ArrayList<String>();
    ArrayList<Integer> priceList = new ArrayList<Integer>();
    public int prices;
    public int count = 0;
    public String name;
    public void add (String n, int p) {
        prices += p;
        count++;
        list.add(n);
        priceList.add(p);
    }

    public void check(){
        System.out.println("");
        System.out.println("general " + prices);
    }

    public void menu() {
        for (int i=0; i<count; i++){
            System.out.println(list.get(i) + "  " + priceList.get(i));
        }
    }

}
