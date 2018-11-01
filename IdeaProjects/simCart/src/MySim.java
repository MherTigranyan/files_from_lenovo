public class MySim {
    public int hashiv = 0;
    public int contLength = 0;
    public String[] contact = new String[2];
    public String[] number = new String[2];

    public void addContact(String name, String num){
        if (contLength == contact.length) {
            String[] secondArray = new String[contact.length + 100];
            String[] secondNumber = new String[number.length + 100];
            for (int i = 0; i < contact.length; i++) {
                secondArray[i] = contact[i];
                secondNumber[i] = number[i];
            }
            contact = secondArray;
            number = secondNumber;

        }
        contact[contLength] = name;
        number[contLength++] = num;
    }
    public void  contactList(){
        for (int j = 0; j < contLength; j++){
            System.out.println(contact[j] + "  " + number[j]);
        }
    }

    public  void deleteContact(int i){
        for (int i1 = i; i1 < contLength-1; i1++){
            contact[i1] = contact[i1 + 1];
            number[i1] = number[i1 + 1];
        }
        contLength--;
    }

    public void licqavorel(int l){
        hashiv += l;
    }

    public void xoselCancum(int r){
        hashiv -= r * 5;
    }
    public void xoselCancicDurs(int d){
        hashiv -= d * 15;
    }

}
