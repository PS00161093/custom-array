package src;

import java.math.BigInteger;

/**
 * A subsequence is a sequence that can be derived from another sequence by zero or more elements,
 * without changing the order of the remaining elements.
 * <p>
 * For example, consider the array [1, 2, 3, 4] there are 15 sub-sequences.
 * They are (1), (2), (3), (4), (1,2), (1,3),(1,4), (2,3), (2,4), (3,4), (1,2,3), (1,2,4), (1,3,4), (2,3,4), (1,2,3,4).
 * we can have (2n-1) non-empty sub-sequences in total
 */
public class AllSubSequence {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};

        allSubSequences(arr, arr.length);
    }

    private static void allSubSequences(int[] arr, int n) {

        int totalSubSequence = (int) Math.pow(2, n) - 1;
        int counter = 1;
        System.out.println("Expected count = " + totalSubSequence);

        for (int i = 1; i < totalSubSequence; i++) {
            for (int j = 0; j < n; j++) {
                if (BigInteger.valueOf(i).testBit(j)) {
                    System.out.print(arr[j] + " ");
                }
            }
            counter++;
            System.out.println();
        }

        System.out.println("Actual count = " + counter);
    }
}
