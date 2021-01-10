package src;

public class SortedArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, -10, 100, 111};
        System.out.println(checkIfSorted(arr, arr.length));
    }

    private static boolean checkIfSorted(int[] arr, int n) {

        if (n == 1) return true;
        return (arr[n - 1] >= arr[n - 2] && checkIfSorted(arr, n - 1));
    }
}
