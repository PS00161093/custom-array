package src.hard;

/**
 * https://leetcode.com/problems/trapping-rain-water/
 */
public class TrapRainWater {

    public static void main(String[] args) {

        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trap(height));
    }

    private static int trap(int[] height) {

        if (height.length == 0) return 0;

        int result = 0;

        int left = 0;
        int right = height.length - 1;

        int leftMax = 0;
        int rightMax = 0;

        while (left < right) {

            int currLeft = height[left];
            int currRight = height[right];

            if (currLeft > leftMax) leftMax = currLeft;
            if (currRight > rightMax) rightMax = currRight;

            if (leftMax < rightMax) {
                result += Math.max(0, leftMax - currLeft);
                left++;
            } else {
                result += Math.max(0, rightMax - currRight);
                right--;
            }
        }

        return result;
    }
}