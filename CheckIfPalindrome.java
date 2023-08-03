
public class CheckIfPalindrome {
    public boolean isPalindrome(String word) {
        word = word.toLowerCase();
        for (int i = 0; i < (word.length() / 2); i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindrome (int x){
        String y = Integer.toString(x);
        for(int i = 0; (i< y.length()/2); i++){
            if (y.charAt(i) != y.charAt(y.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}

