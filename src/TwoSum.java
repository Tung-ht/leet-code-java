import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[]{3,2,4}, 6)));
    }

    public static int[] twoSum(int[] nums, int target) {
        Set<Integer> tmpSet = new HashSet<>();
        int id1 = 0, id2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!tmpSet.contains(target - nums[i])) {
                tmpSet.add(nums[i]);
            } else {
                id2 = i;
                break;
            }
        }
        for (int i = 0; i < id2; i++) {
            if (nums[i] == target - nums[id2]) {
                id1 = i;
            }
        }
        return new int[]{id1, id2};
    }
}
