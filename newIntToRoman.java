public class newIntToRoman {

    private String result ="";


    public String convert(int num) {
        if (num < 1 || num > 9999) {
            return null;
        }
        int[] milestones = {9000, 5000, 4000, 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] milestonesCorrespondingRomanSymbol = {"I̅X̅", "V̅", "MV̅", "M", "CM", "D", "CD", "C",
                "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        while (num > 0) {
            for (int i = 0; i < milestones.length; i++) {
                int temp = num -milestones[i];
                if (temp >= 0) {
                    result = result + milestonesCorrespondingRomanSymbol[i];
                    num -= milestones[i];
                    continue;
                }
            }
        }
        return result;
    }
}
