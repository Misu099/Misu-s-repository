package genericschallange;

public class Main {
    public static void main(String[] args) {


        Team testt1 = new Team("castorii", 22);
        Team testt2 = new Team("dihorii", 20);
        Team testt3 = new Team("babuinii", 4);
        Teams test1 = new Teams();
        test1.add(testt1);
        test1.add(testt2);
        test1.add(testt3);
        System.out.println(test1);
        test1.sort();
        System.out.println(test1);


    }
}
