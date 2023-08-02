public class IntegerToRomanNumeral {

    private int num;
    private String result = "";


    public String convert(int num) {
        if (num < 1 || num > 9999) {
            return null;
        }
        while (num > 0) {
            if (num > 999) {
                num = thousands(num);
            } else if (num > 99) {
                num = hundreds(num);
            } else if (num > 9) {
                num = tens(num);
            } else {
                num = units(num);
            }
        }
        return result;
    }


    private int units(int num) {
        switch (num) {
            case (1):
                result += "I";
                return num - 1;
            case (2):
                result += "II";
                return num - 2;
            case (3):
                result += "III";
                return num - 3;

            case (4):
                result += "IV";
                return num - 4;
            case (5):
                result += "V";
                return num - 5;
            case (6):
                result += "VI";
                return num - 6;
            case (7):
                result += "VII";
                return num - 7;
            case (8):
                result += "VIII";
                return num - 8;
            case (9):
                result += "IX";
                return num - 9;
            default:
                return num;

        }
    }

    private int tens(int num) {
        int temp = num / 10;
        switch (temp) {
            case 1:
                result += "X";
                return num - (temp * 10);

            case 2:
                result += "XX";
                return num - (temp * 10);

            case 3:
                result += "XXX";
                return num - (temp * 10);

            case 4:
                result += "XL";
                return num - (temp * 10);

            case 5:
                result += "L";
                return num - (temp * 10);

            case 6:
                result += "LX";
                return num - (temp * 10);

            case 7:
                result += "LXX";
                return num - (temp * 10);

            case 8:
                result += "LXXX";
                return num - (temp * 10);

            case 9:
                result += "XC";
                return num - (temp * 10);
            default:
                return num;
        }
    }

    private int hundreds(int num) {
        int temp = num / 100;
        switch (temp) {
            case 1:
                result += "C";
                return num - (temp * 100);

            case 2:
                result += "CC";
                return num - (temp * 100);

            case 3:
                result += "CCC";
                return num - (temp * 100);

            case 4:
                result += "CD";
                return num - (temp * 100);

            case 5:
                result += "D";
                return num - (temp * 100);

            case 6:
                result += "DC";
                return num - (temp * 100);

            case 7:
                result += "DCC";
                return num - (temp * 100);

            case 8:
                result += "DCCC";
                return num - (temp * 100);

            case 9:
                result += "CM";
                return num - (temp * 100);
            default:
                return num;
        }
    }

    private int thousands(int num) {
        int temp = num / 1000;
        switch (temp) {
            case 1:
                result += "M";
                return num - (temp * 1000);

            case 2:
                result += "MM";
                return num - (temp * 1000);

            case 3:
                result += "MMM";
                return num - (temp * 1000);

            case 4:
                result += "MV̅";
                return num - (temp * 1000);

            case 5:
                result += "V̅";
                return num - (temp * 1000);

            case 6:
                result += "V̅M";
                return num - (temp * 1000);

            case 7:
                result += "V̅MM";
                return num - (temp * 1000);

            case 8:
                result += "V̅MMMM";
                return num - (temp * 1000);

            case 9:
                result += "I̅X̅";
                return num - (temp * 1000);
            default:
                return num;
        }
    }
}