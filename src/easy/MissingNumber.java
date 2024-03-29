package src.easy;

/**
 * https://leetcode.com/problems/missing-number/
 */
public class MissingNumber {

    public int missingNumber(int[] nums) {
        int sum = 0;
        for (int num : nums) sum += num;
        return (nums.length * (nums.length + 1)) / 2 - sum;
    }
}
