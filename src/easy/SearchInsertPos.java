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
}

