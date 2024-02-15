public class StringCompression {
    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        System.out.println(compress(chars));
    }

    // this problem description is too stupid,
    // my result is ok as problem description but the test case result is in a different format
    public static int compress(char[] chars) {
        int result = 0;
        int counter = 0;
        char curChar = chars[0];
        for (char aChar : chars) {
            if (aChar == curChar) {
                counter++;
            } else {
                curChar = aChar;
                if (counter == 1) {
                    result++;
                } else if (counter > 1) {
                    result = result + 1 + (counter / 10 + 1);
                }
                counter = 1;
            }
        }
        if (counter == 1) {
            result++;
        } else if (counter > 1) {
            result = result + 1 + (counter / 10 + 1);
        }
        return result;
    }
}
