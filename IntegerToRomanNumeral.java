public class IntegerToRomanNumeral {
    private String result = "";
    private int[] milestones={10000, 9000,5000,4000,1000,900,500,100,90,50,40,10,9,5,4,1};
    private String[] milestonepair={"X̅","I̅X̅","V̅","MV̅","M","CM","D","C","XC","L", "XL","X", "IX", "V", "IV", "I" };
 private int temp;


    public String convert(int num){
        if (num < 1 || num >10000){
            return null;
        }
        result = "";
        while (num > 0){
            for (int i =0; i <milestones.length; i++){
                temp = num - milestones[i];
                if(temp >= 0){
                  //  System.out.println("loop:" + i + " returns num:" + num + "and result:" + result);
                    result = result + milestonepair[i];
                    num = num - milestones[i];
                    i--;
                   // System.out.println("loop:" + i + " returns num:" + num + "and result:" + result);
                }
            }
        }
        return result;
    }
}
