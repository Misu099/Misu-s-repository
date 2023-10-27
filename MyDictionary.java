import java.util.HashMap;
import java.util.Map;

public class MyDictionary {

    private final Map<String, String> MYDICTIONARY = new HashMap<>();


    public void add(String keyWord, String valWord) {
        MYDICTIONARY.put(keyWord.toLowerCase(), valWord.toLowerCase());
    }

    public String search(String keyToSearch) {
        if (MYDICTIONARY.containsKey(keyToSearch)) {
            return "Search: " + keyToSearch + "=" + MYDICTIONARY.get(keyToSearch);
        }
        return null;
    }

    public void update(String keyWord, String valWord) {
        MYDICTIONARY.replace(keyWord.toLowerCase(), valWord.toLowerCase());
    }


    public void remove(String keyWord) {
        MYDICTIONARY.remove(keyWord);
    }

    public String toString() {
        return MYDICTIONARY.toString();
    }

    public void print() {
        for (String key : MYDICTIONARY.keySet()) {
            System.out.println(key + "=" + MYDICTIONARY.get(key));

        }
    }
}
