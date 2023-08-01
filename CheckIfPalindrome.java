
public class CheckIfPalindrome {
    String theReverseWord = "";

    public boolean checkIfPalindrome(String theWord) {

        for (int i = theWord.length() - 1; i >= 0; i--) {
            theReverseWord = theReverseWord + theWord.charAt(i);
        }

        if (theWord.equals(theReverseWord)) {
            return true;
        } else
            return false;
    }
}

