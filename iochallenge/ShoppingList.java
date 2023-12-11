package iochallenge;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class ShoppingList implements Serializable {

    private final List<Items> LISTA = new LinkedList<Items>();

    public void add(Items item) {
        LISTA.add(item);
    }


    public void print() {
        System.out.println("LISTA:");
        LISTA.forEach(s -> System.out.println(s));
    }

    public String toString() {
        return LISTA.toString();
    }

}

