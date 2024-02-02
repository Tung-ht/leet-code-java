import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

    // O(n) time complexity
//    public static int[] productExceptSelf(int[] nums) {
//        int[] result = new int[nums.length];
//
//        // product from 0 to i
//        int[] headProducts = new int[nums.length];
//
//        // product from i to end (nums.length - 1)
//        int[] tailProducts = new int[nums.length];
//
//        headProducts[0] = nums[0];
//        tailProducts[nums.length-1] = nums[nums.length-1];
//        for (int i = 1; i < nums.length; i++) {
//            headProducts[i] = headProducts[i-1] * nums[i];
//        }
//
//        for (int i = nums.length - 2; i >= 0; i--) {
//            tailProducts[i] = tailProducts[i+1] * nums[i];
//        }
//
//        for (int i = 0; i < nums.length; i++) {
//            if (nums.length == 1) {
//                result[0] = headProducts[0];
//                break;
//            }
//            if (i == 0) {
//                result[i] = tailProducts[i+1];
//            } else if (i == nums.length - 1) {
//                result[i] = headProducts[i-1];
//            } else {
//                result[i] = headProducts[i-1] * tailProducts[i+1];
//            }
//        }
//        return result;
//    }

    // O(1) space complexity and O(n) time complexity
    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int prefix = 1;
        int suffix = 1;

        for (int i = 0; i < nums.length; i++) {
            result[i] = prefix;
            prefix *= nums[i];
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] *= suffix;
            suffix *= nums[i];
        }

        return result;
    }
}
