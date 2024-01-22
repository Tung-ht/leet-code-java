public class MergeStringsAlternately {
    public static void main(String[] args) {
        mergeAlternately("abcd", "pq");
        System.out.println(mergeAlternately("abcd", "pq"));
    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder tmp = new StringBuilder();
        int minLength = Math.min(word1.length(), word2.length());
        boolean f1 = true;
        int i = 0;
        for (i = 0; i < minLength; i++) {
            tmp.append(word1.charAt(i));
            tmp.append(word2.charAt(i));
        }
        if (minLength == word1.length()) {
            tmp.append(word2.substring(i));
        } else {
            tmp.append(word1.substring(i));
        }
        return tmp.toString();
    }
}
