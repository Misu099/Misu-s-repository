import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MyDictionary {

    private Map<String, String> myDictionary = new HashMap<>();

    public MyDictionary() {
    }

    public void addInput() {
        Scanner sc = new Scanner(System.in);
        String firstWord = "";
        while (firstWord.isBlank()) {
            System.out.println("First word:");
            firstWord = sc.nextLine();
        }
        String secondWord = "";
        while (secondWord.isBlank()) {
            System.out.println("Second word:");
            secondWord = sc.nextLine();
        }
        add(firstWord, secondWord);
    }

    public void add(String firstWord, String secondWord) {
        myDictionary.put(firstWord.toLowerCase(), secondWord.toLowerCase());
    }

    public String search(String keyToSearch) {
        if (myDictionary.containsKey(keyToSearch)) {
            return keyToSearch + "=" + myDictionary.get(keyToSearch);
        }
        return null;
    }

    public String toString() {
        return myDictionary.toString();
    }
}
