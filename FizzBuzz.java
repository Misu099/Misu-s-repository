import java.util.Arrays;

public class FizzBuzz {
    private String[] theResult;


    public String[] play(int n) {
        int temp = 1;
        if (n < 1 || n > 1000) {
            System.out.println("null");
            return null;
        }
        theResult = new String[n];
        for (int i = 0; i < theResult.length; i++) {
            if (temp % 15 == 0) {
                theResult[i] = "FizzBuzz";
            } else if (temp % 5 == 0) {
                theResult[i] = "Buzz";
            } else if (temp % 3 == 0) {
                theResult[i] = "Fizz";
            } else {
                theResult[i] = Integer.toString(temp);
            }
            temp++;
        }
        display();
        return theResult;
    }

    public void display() {
        if (theResult != null) {
            System.out.println(Arrays.toString(theResult));
        } else {
            System.out.println("null result");
        }
    }
}
