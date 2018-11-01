import java.util.ArrayList;
import java.util.List;

public class Apranq {
    int sum = 0;
    List<String> names = new ArrayList<String>();
    ;
    List<Integer> prices = new ArrayList<Integer>();
    int pivot = 0;

    public void add(String n, int p) {
        if (names.contains(n)) {
            prices.set(names.indexOf(n), prices.get(names.indexOf(n)) + p);
        } else {
            names.add(n);
            prices.add(p);
        }
    }

    public void remove(int r) {
        names.remove(r);
        prices.remove(r);
    }

    public void check() {
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i) + " - " + prices.get(i));
        }
        for (Integer s : prices) {
            sum += (int) Integer.parseInt(String.valueOf(s));
        }
        System.out.println("");
        System.out.println("Sumary " + sum);
    }
}
