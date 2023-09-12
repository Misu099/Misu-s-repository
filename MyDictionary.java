import java.util.HashMap;
import java.util.Map;

public class MyDictionary {

    private final Map<String, String> myDictionary = new HashMap<>();


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
