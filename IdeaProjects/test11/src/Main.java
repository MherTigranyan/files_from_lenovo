import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\Q1+1=2\\E");
        Matcher m = p.matcher("Jack 1+1=2");
        while (m.find()){
            System.out.print(m.start() + " " + m.group() + " ");
        }
        System.out.println("");
    }


}