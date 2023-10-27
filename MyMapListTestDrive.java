public class MyMapListTestDrive {


    public static void main(String args[]) {

        MyShoppingList testList = new MyShoppingList();
        MyDictionary testMap = new MyDictionary();

        testList.add("cal");
        testList.add("caine");
        testList.print();
        System.out.println(testList);
        testList.remove("al");
        testList.print();
        System.out.println(testList);
        testList.remove("cal");
        testList.print();
        System.out.println(testList);
        System.out.println(testList.getClass());


        testMap.add("one", "1");

        System.out.println(testMap);
        testMap.print();
        testMap.add("cal", "hose");
        testMap.print();
        System.out.println(testMap.search("cal"));
        testMap.update("cal", "hOrse");
        testMap.print();
        System.out.println(testMap);
        testMap.search("ol");
        System.out.println(testMap);

    }
}
