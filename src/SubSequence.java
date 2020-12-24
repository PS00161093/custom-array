package src;

import java.util.Arrays;
import java.util.List;

public class SubSequence {

    public static void main(String[] args) {

        List<Integer> array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = Arrays.asList(1, 6, -1, 10);
        System.out.println(isValidSubsequence(array, sequence));
    }

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {

        boolean isIt = false;
        int childIndex = -1;

        for (int n : sequence) {
            int index = array.indexOf(n);
            if (index != -1) {
                if (index > childIndex) {
                    childIndex = index;
                    isIt = true;
                } else {
                    return false;
                }
            } else {
                isIt = false;
            }
        }
        return isIt;
    }
}