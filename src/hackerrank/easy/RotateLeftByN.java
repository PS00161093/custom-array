import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://www.hackerrank.com/challenges/array-left-rotation/problem">...</a>
 */
public class RotateLeftByN {

    public static List<Integer> rotateLeft(int rotateLeftBy, List<Integer> arr) {

        int size = arr.size();
        List<Integer> rotArray = new ArrayList<>(arr);

        for (int oldIndex = 0; oldIndex < size; oldIndex++) {
            int newIndex = (oldIndex + size - rotateLeftBy) % size;
            rotArray.set(newIndex, arr.get(oldIndex));
        }

        return rotArray;
    }

}
