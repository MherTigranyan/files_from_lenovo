public class Second {
    void check (int a, int b) {
        if (a == b) {
            System.out.println(a);
            return;
        }
        if (a < b) {
            b = a + b;
            a = b - a;
            b = b - a;
        }

        check(a-b, b);

    }
}
