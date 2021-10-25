package src;

import static java.util.Arrays.stream;

/**
 * https://leetcode.com/problems/merge-sorted-array/
 */

public class MergeSortedArray {

    public static void main(String[] args) {

        int[] firstArray = {3, 6, 9, 11, 13, 0, 0, 0, 0};
        int[] secondArray = {1, 3, 9, 10};
        mergeAndSort(firstArray, 5, secondArray, secondArray.length);
        stream(firstArray).mapToObj(i -> i + ", ").forEach(System.out::print);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int tail1 = m - 1;
        int tail2 = n - 1;
        int finished = m + n - 1;

        while (tail1 >= 0 && tail2 >= 0) {
            if ((nums1[tail1] > nums2[tail2])) {
                nums1[finished] = nums1[tail1];
                tail1--;
            } else {
                nums1[finished] = nums2[tail2--];
            }

            finished--;
        }

        while (tail2 >= 0) {
            nums1[finished] = nums2[tail2];
            tail2--;
            finished--;
        }

    }

    public static void mergeAndSort(int[] firstArray, int m, int[] secondArray, int n) {
        int mi = n - 1;
        int ni = m - 1;
        for (int i = m + n - 1; i >= 0; i--) {
            if (mi == -1)
                break;
            else if (ni == -1 || secondArray[mi] >= firstArray[ni])
                firstArray[i] = secondArray[mi--];
            else
                firstArray[i] = firstArray[ni--];
        }
    }

}