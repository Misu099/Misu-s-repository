import java.util.HashSet;
import java.util.Set;

//TODO: make a class to demonstrate the functionalities of this class and the other one
public class MyShoppingList {

    private final Set<String> MYSHOPPINGLIST = new HashSet<>();

    public Object add(String item) {
        if (!item.isBlank()) {
            MYSHOPPINGLIST.add(item.toLowerCase());
        }
        return null;
    }

    public void remove(String item) {
        MYSHOPPINGLIST.remove(item.toLowerCase());

    }

    public String toString() {
        return MYSHOPPINGLIST.toString();
    }

    public void print() {
        MYSHOPPINGLIST.forEach(item -> System.out.println(item));
    }
}
