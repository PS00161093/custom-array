package src;

import java.util.HashMap;
import java.util.Map;

public class OptimalPairs {

    public static void main(String[] args) {

        printTargetPairs();
    }

    public static void printTargetPairs() {

        int[][] a = {{1, 3}, {2, 5}, {3, 7}, {4, 10}};
        int[][] b = {{1, 2}, {2, 3}, {3, 4}, {4, 5}};
        int target = 10;

        for (Map.Entry<Integer, Integer> entryA : getKeyToValueMap(a).entrySet()) {
            for (Map.Entry<Integer, Integer> entryB : getKeyToValueMap(b).entrySet())
                if (entryA.getValue() + entryB.getValue() == target)
                    System.out.println("[" + entryA.getKey() + ", " + entryB.getKey() + "]");
        }

    }

    private static Map<Integer, Integer> getKeyToValueMap(int[][] array) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int[] element : array) for (int j = 0; j < element.length; j++) map.put(element[0], element[1]);
        return map;
    }

}
