package src;

import java.util.HashSet;
import java.util.Set;

class ArrayUtils {


    public static boolean isPairWithSumPresent(int[] array, int sum) {

        Set<Integer> complements = new HashSet<>();

        for (int element : array) {
            if (complements.contains(element)) {
                return true;
            } else {
                complements.add(sum - element);
            }
        }

        return false;
    }
}

class UtilsTestClient {

    public static void main(String[] args) {

        int sum = 8;
        int[] array = {3, 12, 5, 1};
        System.out.println(ArrayUtils.isPairWithSumPresent(array, sum));
    }
}
