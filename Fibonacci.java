public class Fibonacci {

    private int[] theSequence;


    public int[] fibb(int n) {
        if (n < 2 || n > 46 ) {
            return null;
        }
        theSequence = new int[n];
        theSequence[0] = 0;
        theSequence[1] = 1;
        for (int i = 2; i < n; i++) {
            theSequence[i] = theSequence[i - 2] + theSequence[i - 1];
        }
        display();
        return theSequence;
    }

    public void display() {
        if (theSequence == null) {
            System.out.println("null sequence");
        } else
            for (int i : theSequence) {
                System.out.print(i + " ");
            }
        System.out.println();
    }
}

