import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MaxNumberofKSumPairs {
    public static void main(String[] args) {
        System.out.println(maxOperations(new int[]{1,2,3,4}, 5));
    }
// Solution 1: count frequency of each num
//    public int maxOperations(int[] nums, int k) {
//        int result = 0;
//        Map<Integer, Integer> freq = new HashMap<>();
//        for (int num : nums) {
//            if (!freq.containsKey(num)) {
//                freq.put(num, 1);
//            } else {
//                freq.put(num, freq.get(num) + 1);
//            }
//        }
//        for (int num : nums) {
//            if (!freq.containsKey(num)) continue;
//            int numFreq = freq.get(num) == null ? 0 : freq.get(num);
//            int knumFreq = freq.get(k - num) == null ? 0 : freq.get(k - num);
//            if (k != num * 2) {
//                result += Math.min(numFreq, knumFreq);
//            } else {
//                result += numFreq / 2;
//            }
//            freq.remove(num);
//            freq.remove(k - num);
//        }
//        return result;
//    }

    // Solution 2: sort Array then using two pointers
    public static int maxOperations(int[] nums, int k) {
        int result = 0;
        // ascending order, using Tim sort, O(nlog(n))
        Arrays.sort(nums);
        int left = 0, right = nums.length - 1;
        while (left < right) {
            if (nums[left] + nums[right] == k) {
                result ++;
                left ++;
                right --;
            } else if (nums[left] + nums[right] < k) {
                left ++;
            } else if (nums[left] + nums[right] > k) {
                right --;
            }
        }
        return result;
    }
}
