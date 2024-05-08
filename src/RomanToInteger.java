import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> symbolVals = new HashMap<>();
        symbolVals.put('I', 1);
        symbolVals.put('V', 5);
        symbolVals.put('X', 10);
        symbolVals.put('L', 50);
        symbolVals.put('C', 100);
        symbolVals.put('D', 500);
        symbolVals.put('M', 1000);
        int result = 0;
        for (int i = 0; i < s.length(); i ++) {
            if (i <= s.length() - 2) {
                if (symbolVals.get(s.charAt(i)) < symbolVals.get(s.charAt(i+1))) {
                    result = result + symbolVals.get(s.charAt(i+1)) - symbolVals.get(s.charAt(i));
                    i++;
                } else {
                    result += symbolVals.get(s.charAt(i));
                }
            } else {
                result += symbolVals.get(s.charAt(i));
            }
        }
        return result;
    }
}
