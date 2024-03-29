package src.medium;

import java.util.*;

/**
 * https://leetcode.com/problems/first-missing-positive/
 */
public class FirstMissingPositive {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7,8,9,10,11,12,23,20};
        System.out.println(firstMissingPositive(nums));
    }

    public static int firstMissingPositive(int[] nums) {

        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int n : nums) if (n > 0) treeSet.add(n);
        if (treeSet.isEmpty() || treeSet.first() > 1) return 1;
        Iterator<Integer> it = treeSet.iterator();
        int x = it.next();
        int y;
        while(it.hasNext()){
            y = it.next();
            if(y - x >= 2) return x + 1;
            x = y;
        }

        return treeSet.last() + 1;
    }

}