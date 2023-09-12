import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
//TODO: make a class to demonstrate the functionalities of this class and the other one
public class MyShoppingList {

    Set<String> myShoppingList = new HashSet<>(); //TODO: make this private and final

    public void addInput() { //TODO: no console
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

    public void print() {
        myShoppingList.forEach(item -> System.out.println(item)); //Nice lambda :)
    }
}
