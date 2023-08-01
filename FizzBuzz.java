public class FizzBuzz {
    private String[] theResult;


    public String[] play(int n) {
        if (n < 1 || n > 1000) {
            System.out.println("null");
            return null;
        }
        theResult = new String[n];
        for (int i = 0; i < theResult.length; i++) {
            if (((i + 1) % 3 == 0) && ((i + 1) % 5 == 0)) {
                theResult[i] = "FizzBuzz";
            } else if ((i + 1) % 5 == 0) {
                theResult[i] = "Buzz";
            } else if ((i + 1) % 3 == 0) {
                theResult[i] = "Fizz";
            } else
                theResult[i] = Integer.toString(i + 1);
        }
        display();
        return theResult;
    }

    public void display() {
        if (theResult != null) {
            for (int i = 0; i < theResult.length; i++) {
                System.out.print(theResult[i] + " ");
            }
        } else {
            System.out.println("null result");
        }
    }
}
