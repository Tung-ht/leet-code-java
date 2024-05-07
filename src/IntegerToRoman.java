public class IntegerToRoman {
    public String intToRoman(int num) {
        int one = num % 10;
        int ten = (num / 10) % 10;
        int hund = (num / 100) % 10;
        int thou = (num / 1000) % 10;

        return convert1000(thou) + convert100(hund) + convert10(ten) + convert1(one);
    }

    public static String convert1(int a) {
        return switch (a) {
            case 1 -> "I";
            case 2 -> "II";
            case 3 -> "III";
            case 4 -> "IV";
            case 5 -> "V";
            case 6 -> "VI";
            case 7 -> "VII";
            case 8 -> "VIII";
            case 9 -> "IX";
            default -> "";
        };
    }

    public static String convert10(int a) {
        return switch (a) {
            case 1 -> "X";
            case 2 -> "XX";
            case 3 -> "XXX";
            case 4 -> "XL";
            case 5 -> "L";
            case 6 -> "LX";
            case 7 -> "LXX";
            case 8 -> "LXXX";
            case 9 -> "XC";
            default -> "";
        };
    }

    public static String convert100(int a) {
        return switch (a) {
            case 1 -> "C";
            case 2 -> "CC";
            case 3 -> "CCC";
            case 4 -> "CD";
            case 5 -> "D";
            case 6 -> "DC";
            case 7 -> "DCC";
            case 8 -> "DCCC";
            case 9 -> "CM";
            default -> "";
        };
    }

    public static String convert1000(int a) {
        return switch (a) {
            case 1 -> "M";
            case 2 -> "MM";
            case 3 -> "MMM";
            default -> "";
        };
    }
}
