public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        int maxArea = 0, left = 0, right = height.length - 1;
        boolean breakFlag = false;
        while (left < right && !breakFlag) {
            maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left));
            if (height[left] < height[left + 1]) {
                left ++;
                continue;
            }
            if (height[right] < height[right - 1]) {
                right --;
                continue;
            }
            breakFlag = true;
        }
        return maxArea;
    }
}
