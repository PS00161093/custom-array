package src.medium;

/**
 * Problem URL: https://leetcode.com/problems/search-in-rotated-sorted-array/
 * <p>
 * Time Complexity = O(log n)
 */
public class RotatedArraySearch {

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 5;
        System.out.println(search(arr, target));
    }

    public static int search(int[] arr, int target) {
        int lowerIndex = 0;
        int higherIndex = arr.length - 1;
        while (lowerIndex < higherIndex) {
            int midIndex = (lowerIndex + higherIndex) / 2;
            int currItem = arr[midIndex];
            int leftMostItem = arr[lowerIndex];
            int rightMostItem = arr[higherIndex];

            if (currItem == target) return midIndex;
            if (leftMostItem <= currItem) {
                if (target >= leftMostItem && target < currItem) higherIndex = midIndex - 1;
                else lowerIndex = midIndex + 1;
            } else {
                if (target > currItem && target <= rightMostItem) lowerIndex = midIndex + 1;
                else higherIndex = midIndex - 1;
            }
        }

        return arr[lowerIndex] == target ? lowerIndex : -1;
    }

}