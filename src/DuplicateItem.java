package src;

import java.util.HashSet;
import java.util.Set;

public class DuplicateItem {

    public static void main(String[] args) {

        int[] input = {1, 1, 1, 3, 3, 4, 3, 2, 4};
        System.out.println(haveDuplicateElements(input));
    }

    private static boolean haveDuplicateElements(int[] input) {
        Set<Integer> set = new HashSet<>();
        for (int i : input) {
            if (set.contains(i)) {
                return true;
            } else {
                set.add(i);
            }
        }
        return false;
    }
}
