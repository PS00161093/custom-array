package src.medium;

import java.util.Arrays;

/**
 * https://www.geeksforgeeks.org/sort-array-wave-form-2/
 */
public class WaveArray {

    public static void main(String[] args) {

        int[] arr = {10, 90, 49, 2, 1, 5, 23};
        sortInWave(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sortInWave(int[] arr) {

        int len = arr.length;
        for (int i = 0; i < len; i += 2) {
            if (i > 0 && arr[i - 1] > arr[i]) swap(arr, i - 1, i);
            if (i < len - 1 && arr[i] < arr[i + 1]) swap(arr, i, i + 1);
        }
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
