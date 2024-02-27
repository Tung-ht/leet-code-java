public class MaximumAverageSubarrayI {
    public double findMaxAverage(int[] nums, int k) {
        double maxAvg;
        double lastSum = 0;
        double curSum = 0;
        for (int i = 0; i < k; i++) {
            curSum += nums[i];
        }
        maxAvg = curSum / k;

        for (int i = k; i < nums.length; i++) {
            lastSum = curSum;
            curSum = lastSum - nums[i-k] + nums[i];
            maxAvg = Math.max(maxAvg, curSum / k);
        }
        return maxAvg;
    }
}
