package src;

/**
 * Problem URL: https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1#
 */
public class DutchNationFlagAlgo {


    public static void main(String[] args) {

        int[] arr = {0, 2, 1, 2, 0};
        for (int n : sort(arr)) System.out.print(n + " ");

    }

    public static int[] sort(int[] a) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int n1 : a) {
            if (n1 == 0) count0 += 1;
            else if (n1 == 1) count1 += 1;
            else if (n1 == 2) count2 += 1;
        }

        for (int i = 0; i < count0; i++) a[i] = 0;
        for (int i = count0; i < count0 + count1; i++) a[i] = 1;
        for (int i = count0 + count1; i < count0 + count1 + count2; i++) a[i] = 2;

        return a;
    }
}
