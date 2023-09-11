
import javax.swing.SwingUtilities;
public class Main {
    public static void main(String[] args) {


        MyDictionary test = new MyDictionary();
        test.add();
        test.add();
        System.out.println(test.search("cal"));
        System.out.println(test.search("horsee"));
    }
}