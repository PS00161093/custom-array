package src.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/circular-array-rotation/problem
 */
public class ArrayRotation {

    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {

        List<Integer> res = new ArrayList<>();
        int size = a.size();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            int idx = i + k;
            if (idx >= size) idx = (i + k) - size;
            arr[idx] = a.get(i);
        }

        for (int n : queries) res.add(arr[n]);

        return res;
    }
}
