package iochallenge;

import java.io.Serializable;

public class Items implements Serializable {

    private String name;
    private int count;
    private double value;


    public Items(String name, int count, double value) {
        this.name = name;
        this.count = count;
        this.value = value;
    }


    public String toString() {
        return this.name + ", " + this.count + ", " + value;
    }

}
