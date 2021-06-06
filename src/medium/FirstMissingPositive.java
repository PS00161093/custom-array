package src.medium;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode.com/problems/first-missing-positive/
 */
public class FirstMissingPositive {

    public static void main(String[] args) {

        int[] nums = {3, 4, -1, 1};
        System.out.println(firstMissingPositive(nums));
    }

    public static int firstMissingPositive(int[] nums) {

        List<Integer> list = new LinkedList<>();
        for (int n : nums) if (n > 0) list.add(n);
        Collections.sort(list);

        if (list.isEmpty() || list.get(0) > 1) return 1;

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i + 1) - list.get(i) >= 2) return list.get(i) + 1;
        }

        return list.get(list.size() - 1) + 1;
    }

}