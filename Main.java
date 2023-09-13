public class Main {
    public static void main(String[] args) {


        MyShoppingList test = new MyShoppingList();
        test.add("cal");
        test.add("   ");
        System.out.println(test);
        test.print();
        test.remove("ca");
        test.print();
        test.remove("caL");
        System.out.println(test);
        test.print();
        test.add("oaie");
        test.print();
    }
}