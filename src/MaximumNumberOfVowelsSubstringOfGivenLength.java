public class MaximumNumberOfVowelsSubstringOfGivenLength {
    public static void main(String[] args) {
        System.out.println(maxVowels("abciiidef", 3));
    }

    public static int maxVowels(String s, int k) {
        int maxVowels = 0;
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                maxVowels++;
            }
        }

        int curVowels = maxVowels;
        for (int i = k; i < s.length(); i++) {
            if (isVowel(s.charAt(i - k))) {
                curVowels--;
            }
            if (isVowel(s.charAt(i))) {
                curVowels++;
            }
            maxVowels = Math.max(maxVowels, curVowels);
        }
        return maxVowels;
    }

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
