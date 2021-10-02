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
        stream(firstArray).forEach(System.out::print);
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