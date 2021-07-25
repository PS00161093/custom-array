package src.medium;

/**
 * https://leetcode.com/problems/jump-game-ii
 */
public class MinJumpToEnd {

    public static void main(String[] args) {
        int[] nums = {2, 3, 1};
        System.out.println(jump(nums));
    }

    private static int jump(int[] nums) {
        int result = 0;
        int currEnd = 0;
        int nextIndex = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            System.out.println("i = " + i);
            nextIndex = Math.max(nextIndex, i + nums[i]);
            if (i == currEnd) {
                result++;
                currEnd = nextIndex;
            }
        }

        return result;
    }
}