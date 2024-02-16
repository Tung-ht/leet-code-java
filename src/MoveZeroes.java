public class MoveZeroes {
    public static void main(String[] args) {
        int[] inputs = new int[]{0, 1, 0, 3, 12};
        moveZeroes(inputs);
        System.out.println(java.util.Arrays.toString(inputs));
    }

    // dp solution
//    public static void moveZeroes(int[] nums) {
//        // count how many zeroes from 0 to i, including zero at i
//        // then move element nums[i] to the left by that count
//        int[] dp = new int[nums.length];
//        int lastNonZeroIndex = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != 0) {
//                lastNonZeroIndex = i;
//            }
//            if (i == 0) {
//                dp[i] = nums[i] == 0 ? 1 : 0;
//            } else {
//                dp[i] = dp[i-1] + (nums[i] == 0 ? 1 : 0);
//            }
//        }
//
//        for (int i = 0; i <= lastNonZeroIndex; i ++) {
//            if (nums[i] != 0) {
//                nums[i - dp[i]] = nums[i];
//            }
//        }
//        for (int i = lastNonZeroIndex - dp[lastNonZeroIndex] + 1; i < nums.length; i++) {
//            nums[i] = 0;
//        }
//    }

//    int[] inputs = new int[]{0,1,0,3,12};
    public static void moveZeroes(int[] nums) {
        int nonZeroIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }
        for (int i = nonZeroIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
