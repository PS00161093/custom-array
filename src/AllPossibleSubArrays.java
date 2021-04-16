package src;

/**
 * A subbarray is a contiguous part of array.
 * For example, consider the array [1, 2, 3, 4], There are 10 non-empty sub-arrays.
 * The subbarays are (1), (2), (3), (4), (1,2), (2,3), (3,4), (1,2,3), (2,3,4) and (1,2,3,4).
 * <p>
 * In general, for an array/string of size n, there are n*(n+1)/2 non-empty subarrays/subsrings.
 */
public class AllPossibleSubArrays {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4};

        printAllSubArrays(arr);
    }

    public static void printAllSubArrays(int[] arr) {

        int n = arr.length;
        int counter = 0;
        int totalSubArrays = n * (n + 1) / 2;
        System.out.println("Expected number of sub-arrays = " + totalSubArrays);

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                counter++;
                System.out.println();
            }
        }

        System.out.println("Actual number of sub-arrays = " + counter);
    }

}
