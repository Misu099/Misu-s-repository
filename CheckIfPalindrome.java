
public class CheckIfPalindrome {
    public boolean ifPalindrome(String word) {
        word = word.toLowerCase();
        for (int i = 0; i < (word.length() / 2); i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}

