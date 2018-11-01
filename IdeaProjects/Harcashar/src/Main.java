import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Harcashar test = new Harcashar();
        test.harcashar();
        Scanner patasxan = new Scanner(System.in);
        int patasxan1 = patasxan.nextInt();
        test.check(patasxan1);

    }
}

