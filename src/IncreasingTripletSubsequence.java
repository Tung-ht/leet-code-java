public class IncreasingTripletSubsequence {
    public static void main(String[] args) {
        System.out.println(increasingTriplet(new int[]{2,1,5,0,4,6}));
    }
    public static boolean increasingTriplet(int[] nums) {
        int[] dpMin = new int[nums.length];
        int[] dpMax = new int[nums.length];

        if (nums.length < 3) {
            return false;
        }

        // find max from i to end
        dpMax[nums.length - 1] = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            dpMax[i] = Math.max(nums[i], dpMax[i + 1]);
        }

        // find min from 0 to i and then find result
        dpMin[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dpMin[i] = Math.min(nums[i], dpMin[i - 1]);

            if (nums[i] > dpMin[i] && nums[i] < dpMax[i]) {
                return true;
            }
        }

        return false;
    }
}
