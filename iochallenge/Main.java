package iochallenge;

public class Main {
    public static void main(String[] args) {
        //When have more related classes put them in a package

        Items test1 = new Items("paine", 1, 1.6);

        TextRW magie = new TextRW();
        magie.add(test1);
        magie.print();
        magie.read("input.txt");
        magie.print();
        magie.write("output.txt");
        magie.print();


    }
}