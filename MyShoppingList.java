import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MyShoppingList {

    Set<String> myShoppingList = new HashSet<>();

    public void addInput() {
        Scanner sc = new Scanner(System.in);
        String item = "";
        while (item.isBlank()) {
            System.out.println("Add next:");
            item = sc.nextLine();
        }
        myShoppingList.add(item);
    }

    public String toString() {
        return myShoppingList.toString();
    }
}
