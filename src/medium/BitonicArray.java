package src.medium;

/**
 * https://www.geeksforgeeks.org/find-element-bitonic-array/
 * <p>
 * BigO = O(log n)
 */
public class BitonicArray {

    public static void main(String[] args) {

        int[] arr = {-8, 1, 2, 3, 4, 5, -2, -3};
        int key = 5;

        int arrLen = arr.length;
        int leftIndex = 0;
        int rightIndex = arrLen - 1;

        int index;
        index = findBitonicPoint(arr, leftIndex, rightIndex);

        int bitonicIndex = searchBitonic(arr, arrLen, key, index);
        if (bitonicIndex == -1) System.out.println("Element Not Found");
        else System.out.println("Element Found at index " + bitonicIndex);

    }

    static int searchBitonic(int[] arr, int n, int key, int index) {

        if (key > arr[index]) return -1;
        else if (key == arr[index]) return index;
        else {
            int temp = ascendingBinarySearch(arr, 0, index - 1, key);
            if (temp != -1) return temp;

            return descendingBinarySearch(arr, index + 1, n - 1, key);
        }
    }

    static int descendingBinarySearch(int[] arr, int low, int high, int key) {

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) return mid;
            if (arr[mid] < key) high = mid - 1;
            else low = mid + 1;
        }

        return -1;
    }

    static int ascendingBinarySearch(int[] arr, int low, int high, int key) {

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) return mid;
            if (arr[mid] > key) high = mid - 1;
            else low = mid + 1;
        }

        return -1;
    }

    static int findBitonicPoint(int[] arr, int leftIndex, int rightIndex) {

        int bitonicPoint = 0;

        int mid = (rightIndex + leftIndex) / 2;
        int midPrev = mid - 1;
        int midNext = mid + 1;

        if (arr[mid] > arr[midPrev] && arr[mid] > arr[midNext]) return mid;
        else {
            if (arr[mid] > arr[midPrev] && arr[mid] < arr[midNext])
                bitonicPoint = findBitonicPoint(arr, mid, rightIndex);
            else {
                if (arr[mid] < arr[midPrev] && arr[mid] > arr[midNext])
                    bitonicPoint = findBitonicPoint(arr, leftIndex, mid);
            }
        }

        return bitonicPoint;
    }

}