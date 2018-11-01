public class MyCart{

    public String hashvehamar;
    public String name;
    public String password;
    public int hashiv;

    public MyCart(String hashvehamar, String name, String password) {
        this.hashvehamar = hashvehamar;
        this.name = name;
        this.password = password;
    }

    public void hashviHamalrum (String hashvehamar, int gumar){
        if (this.hashvehamar == hashvehamar)  {
            if (gumar <= 0){
                System.out.println("wrong amount");
            }else {
                hashiv += gumar;
            }
        } else {
            System.out.println("incorrect account number\n");

        }
    }

    public void getMoney (String password, int gumar){
        if (this.password == password) {
            if (gumar > hashiv){
                System.out.println("insufficient money");
            }else {
                if (gumar <= 0){
                    System.out.println("wrong amount");
                }else {
                    hashiv -= gumar;
                }
            }
        } else {
            System.out.println("incorrect password");
        }
    }
}
