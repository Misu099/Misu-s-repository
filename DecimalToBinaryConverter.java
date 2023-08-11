public class DecimalToBinaryConverter {
    private String result = "";
    private int[] milestone = {4096, 2048, 1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1};


    public String turn(int n) {
        if (n > 8000 || n < 0) {
            return null;
        }
        for (int i = 0; i < milestone.length; i++) {
            if (n - milestone[i] >= 0) {
                result += "1";
                n -= milestone[i];
            } else {
                result += "0";
            }
        }
        return result;
    }
/*    private String clear(String s) {
        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(j) == 0) {
                 ceva
                          ceva
                         ceva
                                 ceva
            }
        }
        return result;
    }*/

}
