public class GreatestCommonDivisorOfStrings {
    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABCDEF", "ABC")); // prints ""
        System.out.println(gcdOfStrings("ABCABC", "ABC")); // prints "ABC"
        System.out.println(gcdOfStrings("ABABAB", "ABAB")); // prints "AB"
        System.out.println(gcdOfStrings("LEET", "CODE")); // prints ""
    }

//    // Tìm ước chung lớn nhất của hai số.
//    int find_gcd(int A, int B)
//    {
//        if (B == 0)
//            return A;
//        else
//            return find_gcd(B, A % B);
//    }
//
//    // Tìm bội chung nhỏ nhất của hai số.
//    int find_lcm(int A, int B)
//    {
//        return A / find_gcd(A, B) * B;
//    }

    // check the algorithm of finding GCD of two numbers
    public static String gcdOfStrings(String str1, String str2) {
        // assume that str1 always > str2
        if (str1.length() < str2.length()) {
            String tmp = str1;
            str1 = str2;
            str2 = tmp;
        }
        if (!str1.substring(0, str2.length()).equals(str2)) {
            return "";
        }
        if (str2.length() == 0) {
            return str1;
        } else {
            String tmp = str1;
            str1 = str2;
            str2 = modTwoString(tmp, str2);
            return gcdOfStrings(str1, str2);
        }
    }

    // assume str1 = a."strX"; str2 == b."strX"
    // find a % b
    public static String modTwoString(String str1, String str2) {
        // assume that str1 always > str2
        if (str1.length() < str2.length()) {
            String tmp = str1;
            str1 = str2;
            str2 = tmp;
        }
        while (str1.length() >= str2.length()) {
            if (!str1.substring(0, str2.length()).equals(str2)) {
                return str1;
            }
            str1 = str1.substring(str2.length(), str1.length());
        }
        return str1;
    }

}
