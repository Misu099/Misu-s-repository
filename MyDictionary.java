import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MyDictionary {

   private Map<String, String> myDictionary = new HashMap<>();
    public MyDictionary() {
    }

    public void add(){
            Scanner sc = new Scanner(System.in);
            String a = sc.nextLine().toLowerCase();
            String b = sc.nextLine().toLowerCase();
        myDictionary.put(a,b);
    }

    public String search(String c){
        if (myDictionary.containsKey(c)){
        return c + "=" + myDictionary.get(c);
        } else if (myDictionary.containsValue(c)){

           return  myDictionary.get(c) + "=" + c;
        }else return null;
    }
}
