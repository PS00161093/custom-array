package src.easy;

/**
 * https://leetcode.com/problems/search-insert-position/
 */
public class SearchInsertPos {

    public static void main(String[] args) {

        int[] arr = {3, 4, 5, 6, 7, 8};
        int t = 6;
        System.out.println(searchInsert(arr, t));
    }

    /**
     * Time complexity: O(log n)
     *
     * @param nums
     * @param target
     * @return
     */
    public static int searchInsert(int[] nums, int target) {

        if (nums.length == 1) return nums[0] == target || nums[0] > target ? 0 : 1;

        if (nums.length == 2) {
            if (nums[0] == target || nums[0] > target) return 0;
            else if (nums[1] == target || nums[1] > target) return 1;
            else return 2;
        }

        int index = binarySearch(nums, target, 0, nums.length - 1);

        if (index == -1) {

            int i = 1;
            while (i < nums.length - 1) {

                int pre = nums[i - 1];
                int curr = nums[i];
                int next = nums[i + 1];

                if (target <= pre && target < curr) {
                    index = i - 1;
                    break;
                } else if (target > pre && target <= curr) {
                    index = i;
                    break;
                } else if (target > curr && target <= next) {
                    index = i + 1;
                    break;
                }

                i++;
            }
        }

        return index == -1 ? nums.length : index;
    }

    private static int binarySearch(int[] nums, int target, int low, int high) {

        int mid;

        while (low <= high) {
            mid = low + (high - low) / 2;
            if (nums[mid] == target) return mid;
            if (target < nums[mid]) high = mid - 1;
            else low = mid + 1;
        }

        return -1;
    }

    public int searchInsertLinear(int[] nums, int target) {
        int len = nums.length;
        if (len == 0) return 0;
        if (len == 1) if (target == nums[0]) return 0;
        if (len == 1) return target > nums[0] ? 1 : 0;
        for (int i = 0; i < len; i++) {
            if (target == nums[i] || target < nums[i]) return i;
            if (i + 1 < len && target > nums[i] && target < nums[i + 1]) return i + 1;
        }
        return len;
    }
}

