package src.medium;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode.com/problems/combination-sum/
 */
public class CombinationSum {

    public static void main(String[] args) {

        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        combinationSum(candidates, target).forEach(System.out::println);
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new LinkedList<>();
        combinationSum(result, new LinkedList<>(), candidates, target, 0);

        return result;
    }

    private static void combinationSum(List<List<Integer>> result, List<Integer> currCombination,
                                       int[] candidates, int target, int start) {

        if (target > 0) {
            for (int i = start; i < candidates.length && target >= candidates[i]; i++) {
                currCombination.add(candidates[i]);
                combinationSum(result, currCombination, candidates, target - candidates[i], i);
                currCombination.remove(currCombination.size() - 1);
            }
        } else if (target == 0) result.add(new LinkedList<>(currCombination));
    }

}
