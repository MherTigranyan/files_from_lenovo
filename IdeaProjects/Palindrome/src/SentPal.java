import java.util.Arrays;

public class SentPal {

    public static void main(String[] args) {
            String sentence = "Hello how are you are how Hello";
            String strArray[] = sentence.split(" ");
            int n = strArray.length;
        }

//        public void palindrome (String strArray[], int n) {
//            if (strArray[0].equals(strArray[n+1])){
//                strArray = Arrays.copyOfRange(strArray, 1, strArray.length);
//
//            }
//        }
public boolean palindrome (String[] strArray, int n) {
            if (strArray[0].equals(strArray[n+1])){
                strArray = Arrays.copyOfRange(strArray, 1, strArray.length);
                Arrays.copyOf(strArray, strArray.length-1);
                return true;

            }else {
                return false;
            }
       }


}
