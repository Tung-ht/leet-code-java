import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        char[] sChars = s.toCharArray();
        List<Integer> vowelIndexes = new ArrayList<>();
        List<Character> vowels = new ArrayList<>();
        for (int i = 0; i < sChars.length; i++) {
            char c = sChars[i];
            if (c == 'a' || c == 'A'
                    || c == 'e' || c == 'E'
                    || c == 'i' || c == 'I'
                    || c == 'o' || c == 'O'
                    || c == 'u' || c == 'U') {
                vowelIndexes.add(i);
                vowels.add(c);
            }
        }
        Collections.reverse(vowels);
        for (int i = 0; i < vowelIndexes.size(); i++) {
            sChars[vowelIndexes.get(i)] = vowels.get(i);
        }
        return String.copyValueOf(sChars);
    }
}
