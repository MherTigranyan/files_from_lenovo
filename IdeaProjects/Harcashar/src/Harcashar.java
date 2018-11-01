import java.util.Random;

public class Harcashar {

    public int harcer1 = 4;
    public int n;
    public int p;
    public String harc0 = "qani tipi phophoxakanner kan java -um\n 1. 3\n 2. 4\n 3. 7\n 4. 8 ";
    public String harc1 = "qani bit e mek int@\n 1. 4 \n 2. 8 \n 3. 16 \n 4. 32";
    public String harc2 = "vor tvakanin e javan steghcvel\n 1. 1991 \n 2. 2005 \n 3. 1995 \n 4. 2003";

    public void harcashar(){
        n = generateRandomInt(3);
        if (n==0) {
            System.out.println(harc0);
            p=2;
        }
        if (n==1) {
            System.out.println(harc1);
            p=2;
        }
        if (n==2) {
            System.out.println(harc2);
            p=3;
        }
    }
        public static int generateRandomInt(int upperRange){
            Random random = new Random();
            return random.nextInt(upperRange);
        }
        public void check (int i){
            if (i == p) System.out.println("jisht e");
                else System.out.println("sxal e");
        }
    }