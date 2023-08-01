public class Fibonacci {

    private int[] theSequence;


    public int[] fibb(int n) {
        if (n < 1 || n > 46) {
            return null;
        }
        theSequence = new int[n];
        theSequence[0] = 1;
        theSequence[1] = 1;
        for (int i = 2; i < n; i++) {
            theSequence[i] = theSequence[i - 2] + theSequence[i - 1];
        }
        return theSequence;
    }

    public void display() {
        if (theSequence == null) {
            System.out.println("null sequence");
        } else
            for (int i = 0; i < theSequence.length; i++) {
                System.out.print(theSequence[i] + " ");
            }
        System.out.println();
    }
}
