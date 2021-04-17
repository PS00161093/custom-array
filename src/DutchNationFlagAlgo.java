package src;

/**
 * Problem URL: https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1#
 */
public class DutchNationFlagAlgo {


    public static void main(String[] args) {

        int[] arr = {0, 2, 1, 2, 0};
        for (int n : sort(arr)) System.out.print(n + " ");

    }

    public static int[] sort(int[] arr) {

        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for (int num : arr) {
            if (num == 0) count0++;
            else if (num == 1) count1++;
            else if (num == 2) count2++;
        }


        int index = 0;
        for (int i = 0; i < count0; i++) {
            arr[index] = 0;
            index++;
        }
        for (int i = 0; i < count1; i++) {
            arr[index] = 1;
            index++;
        }
        for (int i = 0; i < count2; i++) {
            arr[index] = 2;
            index++;
        }

        return arr;
    }


}
