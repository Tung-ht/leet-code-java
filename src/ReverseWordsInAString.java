import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        System.out.println(reverseWords("example   good a"));
    }

    // two solutions
    // this one is a little bit faster
    public static String reverseWords(String s) {
        String[] wordList = s.trim().split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = wordList.length - 1; i >=0; i--) {
            String trimmed = wordList[i].trim();
            if (!trimmed.isEmpty()) {
                result.append(wordList[i].trim()).append(' ');
            }
        }
        return result.substring(0, result.length() - 1);
    }

//    public static String reverseWords(String s) {
//        List<String> wordList = new ArrayList<>();
//
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < s.length(); i ++) {
//            if (s.charAt(i) == ' ') {
//                if (!sb.isEmpty()) {
//                    wordList.add(sb.toString());
//                    sb.delete(0, sb.length());
//                }
//            } else {
//                sb.append(s.charAt(i));
//                if (i == s.length() - 1) {
//                    wordList.add(sb.toString());
//                    sb.delete(0, sb.length());
//                }
//            }
//        }
//        Collections.reverse(wordList);
//        for (String word: wordList) {
//            sb.append(word).append(' ');
//        }
//        sb.deleteCharAt(sb.length() - 1); // remove the last ' '
//        return sb.toString();
//    }
}
