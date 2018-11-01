public class Main {
    public static void main(String[] args) {
        Market buyer = new Market();
        buyer.add("apple", 150);
        buyer.add("bread", 180);
        buyer.add("pen", 50);
        buyer.add("book", 2000);

        buyer.menu();
        buyer.check();
    }
}
