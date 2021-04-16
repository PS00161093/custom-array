package src;

import java.math.BigInteger;

/**
 * Problem URL: https://www.geeksforgeeks.org/sum-of-all-subsequences-of-an-array/
 */
public class SumAllSubSequences {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

        sumAllSubSequences(arr, arr.length);
    }

    private static void sumAllSubSequences(int[] arr, int length) {

        int totalSubSequences = (int) Math.pow(2, length);
        int sum = 0;

        for (int i = 1; i < totalSubSequences; i++) {
            for (int j = 0; j < length; j++) {
                if (BigInteger.valueOf(i).testBit(j)) {
                    sum += arr[j];
                }
            }
        }

        System.out.println("Sum = " + sum);

    }
}
